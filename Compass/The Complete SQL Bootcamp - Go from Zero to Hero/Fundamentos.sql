-- Exemplo SELECT
SELECT * FROM actor;
SELECT last_name, first_name FROM actor;
SELECT first_name, last_name, email FROM customer;

-- Exemplo DISTINCT
SELECT * FROM film;
SELECT DISTINCT (release_year) FROM film; -- todos os filmes foram lancados em 2006, pode ou nao utilizar os ()
SELECT DISTINCT rating FROM film; -- todas as categorias que possuem de filmes nesse BD
SELECT DISTINCT amount FROM payment;

-- Exemplo COUNT
SELECT * FROM payment;
SELECT COUNT (*) FROM payment; --verifica a quantidade de linhas q possui nessa tabela, pode ser por exemplo a quantidade de dados
SELECT COUNT(DISTINCT amount) FROM payment; --faz a conta de quantos tipos diferentes possui, e entrega um numero inteiro do valor

-- Exemplo WHERE
SELECT * FROM customer
WHERE first_name = 'Jared';

SELECT COUNT(*) FROM film
WHERE rental_rate > 4 AND replacement_cost >= 19.99 AND rating = 'R';

SELECT COUNT(*) FROM film
WHERE rating != 'R';

SELECT * FROM staff WHERE active = true;

SELECT email FROM customer WHERE first_name = 'Nancy' AND last_name = 'Thomas';

SELECT description FROM film WHERE title = 'Outlaw Hanky';

SELECT phone FROM address WHERE address = '259 Ipoh Drive';

-- Exemplo ORDER BY
SELECT * FROM customer ORDER BY first_name; -- use ASC para ler de a-z e DESC para ler de z-a
SELECT store_id, first_name, last_name FROM customer ORDER BY store_id, first_name;

-- Exemplo LIMIT
SELECT * FROM payment WHERE amount != 0 ORDER BY payment_date DESC LIMIT 10; -- define quantidade limite de dados retornados
SELECT customer_id FROM payment ORDER BY payment_date ASC LIMIT 10;
SELECT title, length FROM film ORDER BY length ASC LIMIT 5;
SELECT COUNT(title) FROM film WHERE length <= 50;

-- Exemplo BETWEEN
SELECT COUNT(*) FROM payment WHERE amount BETWEEN 8 AND 9; -- voce quer saber a quantidade de pagamentos que foram feitos entre 8 e 9 dol
SELECT COUNT(*) FROM payment WHERE amount NOT BETWEEN 8 AND 9; -- o NOT sao os valores q nao estao dentro da busca de cima

SELECT * FROM payment WHERE payment_date BETWEEN '2007-02-01' AND '2007-02-15';

-- Exemplo IN
SELECT COUNT(*) FROM payment WHERE amount IN (0.99, 1.98, 1.99); -- conta a quantidade de pagamentos que sao equivalentes a esses valores
SELECT * FROM customer WHERE first_name IN ('John', 'Jake', 'Julie');

-- Exemplo LIKE and ILIKE
SELECT COUNT(*) FROM customer WHERE first_name LIKE 'J%' AND last_name LIKE 'S%'; -- se voce tentar com 'j' ou 's' minuscula, ira retornar erro
SELECT COUNT(*) FROM customer WHERE first_name ILIKE 'j%' AND last_name ILIKE 's%'; -- o ILIKE ignora essa verificacao de lower ou upper

SELECT COUNT(*) FROM customer WHERE first_name ILIKE '%er%';

SELECT COUNT(*) FROM customer WHERE first_name NOT LIKE '_her%' -- apenas um caracter antes da minha definicao

-- General Challenge 1
SELECT COUNT(*) FROM payment WHERE amount > 5;
SELECT COUNT(*) FROM actor WHERE first_name LIKE 'P%';
SELECT COUNT(DISTINCT district) FROM address;
SELECT DISTINCT(district) FROM address;
SELECT COUNT(*) FROM film WHERE rating = 'R' AND replacement_cost BETWEEN 5 AND 15;
SELECT COUNT(*) FROM film WHERE title LIKE '%Truman%';