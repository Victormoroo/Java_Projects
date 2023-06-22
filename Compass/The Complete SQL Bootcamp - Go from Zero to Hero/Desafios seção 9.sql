CREATE TABLE students(
	student_id			SERIAL			PRIMARY KEY,
	first_name			VARCHAR(50)		NOT NULL,
	last_name			VARCHAR(50)		NOT NULL,
	homeroom_number		INTEGER,
	phone				VARCHAR(12)		NOT NULL		UNIQUE,
	email				VARCHAR(50)		UNIQUE,
	graduation_year		INTEGER
);

CREATE TABLE teachers(
	teacher_id			SERIAL			PRIMARY KEY,
	first_name			VARCHAR(50)		NOT NULL,
	last_name			VARCHAR(50)		NOT NULL,
	homeroom_number		INTEGER,
	department			VARCHAR(50),
	email				VARCHAR(50)		NOT NULL		UNIQUE,
	phone				VARCHAR(12)		NOT NULL		UNIQUE
);

INSERT INTO students(
	first_name,
	last_name,
	homeroom_number,
	phone,
	graduation_year
)
VALUES(
	'Mark',
	'Watney',
	5,
	'777-555-1234',
	2035
);

INSERT INTO teachers(
	first_name,
	last_name,
	homeroom_number,
	department,
	email,
	phone
)
VALUES(
	'Jonas',
	'Salk',
	5,
	'Biology',
	'jsalk@school.org',
	'777-555-4321'
);

SELECT * FROM students;
SELECT * FROM teachers;