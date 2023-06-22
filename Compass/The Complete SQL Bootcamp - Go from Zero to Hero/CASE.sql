SELECT customer_id,
CASE
	WHEN (customer_id <= 100) THEN 'Premium'
	WHEN (customer_id BETWEEN 100 AND 200) THEN 'Plus'
	ELSE 'Normal'
END AS customer_class
FROM customer;

----------------------------

SELECT customer_id,
CASE customer_id
	WHEN 2 THEN 'Winner'
	WHEN 5 THEN 'Second Place'
	ELSE 'Normal'
END AS raffle_results
FROM customer;

----------------------------

SELECT
SUM(CASE rental_rate
	WHEN 0.99 THEN 1
	ELSE 0
END) AS bargains,
SUM(CASE rental_rate
   WHEN 2.99 THEN 1
   ELSE 0
END) AS regular,
SUM(CASE rental_rate
   WHEN 4.99 THEN 1
   ELSE 0
END) AS premium
FROM film;

-- Challenge
SELECT
SUM(
CASE rating
	WHEN 'R' THEN 1
	ELSE 0
END) AS r,
SUM(
CASE rating
	WHEN 'PG' THEN 1
	ELSE 0
END) AS pg,
SUM(
CASE rating
	WHEN 'PG-13' THEN 1
	ELSE 0
END) AS pg13
FROM film;

-- CAST
SELECT CAST('5' AS INTEGER) AS new_int;
SELECT '5'::INTEGER; -- outra forma de declarar a mesma expressao que em cima

SELECT CHAR_LENGTH(CAST(inventory_id AS VARCHAR)) FROM rental;

-- NULLIF
CREATE TABLE depts(
	first_name		VARCHAR(50),
	department		VARCHAR(50)
);

INSERT INTO depts(first_name, department)
VALUES
('Victor', 'A'),
('Lucas', 'A'),
('Marcio', 'B');

----------------------------

SELECT (
SUM(CASE WHEN department = 'A' THEN 1 ELSE 0 END) /
SUM(CASE WHEN department = 'B' THEN 1 ELSE 0 END)
) AS department_ratio
FROM depts;

DELETE FROM depts
WHERE department = 'B'; -- se retirar todas as pessoas do departamento B, o SELECT acima ira tentar fazer uma divisao por 0, e retorna um erro

-- Forma utilizando o NULLIF
SELECT (
SUM(CASE WHEN department = 'A' THEN 1 ELSE 0 END) /
	NULLIF(SUM(CASE WHEN department = 'B' THEN 1 ELSE 0 END), 0)
) AS department_ratio
FROM depts;

-- VIEWS
-- cria
CREATE VIEW customer_info AS
SELECT first_name, last_name, address
FROM customer
INNER JOIN address
ON customer.address_id = address.address_id;

SELECT * FROM customer_info; -- digitei customer errado

-- modifica
CREATE OR REPLACE VIEW customer_info AS
SELECT first_name, last_name, address, district
FROM customer
INNER JOIN address
ON customer.address_id = address.address_id;

-- exclui
DROP VIEW IF EXISTS customer_info;

-- renomeia
ALTER VIEW customer_info RENAME TO c_info;