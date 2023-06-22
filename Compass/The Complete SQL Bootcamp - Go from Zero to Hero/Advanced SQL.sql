-- TIME - contem somente hora
-- DATE - contem somente data
-- TIMESTAMP - contem data e hora
-- TIMESTAMPTZ - contem data, hora e fuso horario

SELECT EXTRACT(YEAR FROM payment_date) AS year -- no lugar de YEAR, pode ser MONTH, DAY, WEEK, QUARTER
FROM payment;

SELECT AGE(payment_date)
FROM payment;

SELECT TO_CHAR(payment_date, 'dd/mon/YYYY')
FROM payment;

-- Outros tipos de formatacao (https://www.postgresql.org/docs/15/functions-formatting.html)

-- Challenge
SELECT DISTINCT(TO_CHAR(payment_date, 'MONTH'))
FROM payment;

-- quantos pagamento ocorrem na segunda-feira
SELECT COUNT(*)
FROM payment
WHERE EXTRACT(dow FROM payment_date) = 1;

-- MATEMATICA
-- Outras funcoes matematicas (https://www.postgresql.org/docs/current/functions-math.html)

SELECT ROUND(rental_rate/replacement_cost, 2)*100 AS percent_cost -- *100 para descobrir a porcentagem
FROM film;

-- String functions e Operadores
-- Outras funcoes (https://www.postgresql.org/docs/current/functions-string.html)

SELECT LENGTH(first_name)
FROM customer;

SELECT upper(first_name) || ' ' || upper(last_name) AS complete_name
FROM customer;

SELECT LOWER(LEFT(first_name,1)) || LOWER(last_name) || '@gmail.com'
AS custom_email
FROM customer;

-- SubQuery
SELECT title, rental_rate
FROM film
WHERE rental_rate >
(SELECT AVG(rental_rate)
FROM film);

SELECT film_id, title
FROM film
WHERE film_id IN
(SELECT inventory.film_id
FROM rental
INNER JOIN inventory
ON inventory.inventory_id = rental.inventory_id
WHERE return_date BETWEEN '2005-05-29' AND '2005-05-30');

SELECT first_name, last_name
FROM customer AS c
WHERE EXISTS -- para verificar o contrario disso, basta colocar o NOT entre o WHERE e EXISTS
(SELECT * FROM payment AS p
WHERE p.customer_id = c.customer_id
AND amount > 11);

-- Self-Join
SELECT title, length FROM film
WHERE length = 117;

SELECT f1.title, f2.title, f1.length
FROM film AS f1
INNER JOIN film AS f2 ON
f1.film_id = f2.film_id
AND f1.length = f2.length;