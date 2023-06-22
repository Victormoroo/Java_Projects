-- Desafios
-- Retorne os IDs dos clientes que gastaram pelo menos US$ 110 com o membro da equipe com ID 2.
SELECT customer_id, SUM(amount) FROM payment
WHERE staff_id = 2
GROUP BY customer_id
HAVING SUM(amount) > 110;

-- Quantos filmes começam com a letra J?
SELECT COUNT(title) FROM film
WHERE title ILIKE 'J%';

-- Qual cliente tem o maior número de ID de cliente cujo nome começa com um 'E' e tem um ID de endereço menor que 500?
SELECT * FROM customer;
SELECT first_name, last_name FROM customer
WHERE first_name ILIKE 'E%'
AND address_id < 500
ORDER BY customer_id DESC
LIMIT 1;