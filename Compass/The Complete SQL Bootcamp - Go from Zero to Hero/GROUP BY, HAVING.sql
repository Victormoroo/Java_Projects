-- AVG() > retorna valor medio
-- COUNT() > retorna numero de valores
-- MAX() > retorna valor maximo
-- MIN() > retorna valor minimo
-- SUM() > retorna soma dos valores

SELECT * FROM film;
SELECT MIN(replacement_cost) FROM film;
SELECT MAX(replacement_cost), MIN(replacement_cost) FROM film;

SELECT AVG(replacement_cost) FROM film;
SELECT ROUND(AVG(replacement_cost),2) FROM film; -- arredonda as casas decimais para quantidade de digitos apos a virgula

SELECT SUM(replacement_cost) FROM film;

-- GROUP BY
SELECT * FROM payment;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
ORDER BY customer_id;

SELECT customer_id, staff_id, SUM(amount) FROM payment
GROUP BY staff_id, customer_id
ORDER BY customer_id;

SELECT DATE(payment_date), SUM(amount) FROM payment
GROUP BY DATE(payment_date)
ORDER BY SUM(amount) DESC;

-- Challenge GROUP BY
SELECT * FROM payment;

SELECT staff_id, COUNT(amount) FROM payment
GROUP BY staff_id;

SELECT * FROM film;

SELECT rating, ROUND(AVG(replacement_cost), 2) FROM film
GROUP BY rating;

SELECT * FROM payment;

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
ORDER BY SUM(amount) DESC
LIMIT 5;

-- HAVING
SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM (amount) > 100;

SELECT * FROM customer;

SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id
HAVING COUNT(*) > 300;

-- Challenge HAVING
SELECT * FROM payment;

SELECT customer_id, COUNT(*) FROM payment
GROUP BY customer_id
HAVING COUNT(*) >= 40;

SELECT customer_id, SUM(amount) FROM payment
WHERE staff_id = 2
GROUP BY customer_id
HAVING SUM(amount) > 100;