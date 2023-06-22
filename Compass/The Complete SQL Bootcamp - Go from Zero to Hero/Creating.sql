-- tipos de dados: https://www.postgresql.org/docs/current/datatype.html

-- Boolean = True ou False
-- Character = char, varchar e text
-- Numeric = integer, floating
-- Temporal = date, time, timestamp e interval

-- NOT NULL = esse dado nao pode ser nulo
-- UNIQUE = esse dado eh unico (por exemplo id)

-- PRIMARY KEY = chave primaria
-- FOREIGN KEY = chave estrangeira

--CREATE TABLE
CREATE TABLE account(
	user_id		SERIAL			PRIMARY KEY,
	username	VARCHAR(20)		UNIQUE			NOT NULL,
	password	VARCHAR(50)		NOT NULL,
	email		VARCHAR(250)	UNIQUE			NOT NULL,
	created_on	TIMESTAMP		NOT NULL,
	last_login	TIMESTAMP
);

CREATE TABLE job(
	job_id		SERIAL			PRIMARY KEY,
	job_name	VARCHAR(200)	UNIQUE			NOT NULL
);

CREATE TABLE account_job(
	user_id		INTEGER		REFERENCES account(user_id),
	job_id		INTEGER		REFERENCES job(job_id),
	hire_date	TIMESTAMP
);

-- INSERT
INSERT INTO account(username, password, email, created_on)
VALUES ('Toruguim', 'senha123', 'victor@mail.com', CURRENT_TIMESTAMP);
SELECT * FROM account;

-----------------------------------

INSERT INTO job(job_name)
VALUES ('Desenvolvedor');

INSERT INTO job(job_name)
VALUES ('Astronauta');

INSERT INTO job(job_name)
VALUES ('Mecânico');
SELECT * FROM job;

-----------------------------------

INSERT INTO account_job(user_id, job_id, hire_date)
VALUES (1, 2, CURRENT_TIMESTAMP);
SELECT * FROM account_job;

-- UPDATE
UPDATE account
SET last_login = CURRENT_TIMESTAMP;

UPDATE account_job
SET hire_date = account.created_on
FROM account
WHERE account_job.user_id = account.user_id;

UPDATE account
SET last_login = CURRENT_TIMESTAMP
RETURNING email, created_on, last_login;

-- DELETE
DELETE FROM job
WHERE job_name = 'Mecânico'
RETURNING job_id, job_name;

-- ALTER
CREATE TABLE information(
	info_id		SERIAL			PRIMARY KEY,
	title		VARCHAR(500)	NOT NULL,
	person		VARCHAR(50)		NOT NULL		UNIQUE
);

ALTER TABLE information
RENAME TO info;

ALTER TABLE info
RENAME COLUMN person TO people;

SELECT * FROM info;

-----------------------------------

ALTER TABLE info
ALTER COLUMN people DROP NOT NULL; -- se utiliza o SET para adiconar algo a mais

INSERT INTO info(title)
VALUES ('some new title');

-- DROP
ALTER TABLE info
DROP COLUMN IF EXISTS people;

-- CHECK
CREATE TABLE employees(
	emp_id		SERIAL		PRIMARY KEY,
	first_name	VARCHAR(50)	NOT NULL,
	last_name	VARCHAR(50)	NOT NULL,
	birthdate	DATE		CHECK (birthdate > '1900-01-01'),
	hire_date	DATE		CHECK (hire_date > birthdate),
	salary		INTEGER		CHECK (salary > 0)
);

INSERT INTO employees (
	first_name,
	last_name,
	birthdate,
	hire_date,
	salary
)
VALUES (
	'Lucas',
	'Moro',
	'1990-11-03',
	'2010-01-01',
	2000
);

SELECT * FROM employees;