-- AS
SELECT COUNT(*) AS num_transactions -- renomeia a coluna
FROM payment;

SELECT customer_id, SUM(amount) AS total_spent
FROM payment
GROUP BY customer_id
HAVING SUM( amount) > 100;

-- INNER JOIN
SELECT payment_id, payment.customer_id, first_name
FROM payment
INNER JOIN customer
ON payment.customer_id = customer.customer_id;

-- FULL JOIN / FULL OUTER JOIN
SELECT * FROM customer
FULL OUTER JOIN payment
ON customer.customer_id = payment.customer_id
WHERE customer.customer_id IS null
OR payment.payment_id IS null;

-- LEFT JOIN / LEFT OUTER JOIN
SELECT film.film_id, film.title, inventory_id, store_id
FROM film
LEFT JOIN inventory
ON inventory.film_id = film.film_id
WHERE inventory.film_id IS null;

-- RIGHT JOIN / RIGHT OUTER JOIN
-- mesma coisa que LEFT JOIN, porem muda  ordem das tabelas, voce pega tudo q tem na tabela da direita

-- UNION
-- é utilizada para combinar os resultados de duas ou mais consultas em um único conjunto de resultados

-- Challenge JOINs
SELECT district, email
FROM customer
INNER JOIN address
ON customer.address_id = address.address_id
WHERE district = 'California';

SELECT title, first_name, last_name
FROM actor
INNER JOIN film_actor
ON actor.actor_id = film_actor.actor_id
INNER JOIN film
ON film_actor.film_id = film.film_id
WHERE first_name = 'Nick' AND last_name = 'Wahlberg';
