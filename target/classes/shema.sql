CREATE TABLE public.courses
(
    id serial NOT NULL,
    name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.courses
    OWNER to postgres;

CREATE TABLE public.students
(
    id serial NOT NULL,
    first_name text,
    last_name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.students
    OWNER to postgres;

CREATE TABLE public.teachers
(
    id serial NOT NULL,
    first_name text,
    last_name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.teachers
    OWNER to postgres;

CREATE TABLE public.lectures
(
    id serial NOT NULL,
    name text,
    description text,
    teacher serial NOT NULL,
    PRIMARY KEY (id, teacher)
);

ALTER TABLE IF EXISTS public.lectures
    OWNER to postgres;

CREATE TABLE public.add_materials
(
    id serial NOT NULL,
    name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.add_materials
    OWNER to postgres;

ALTER TABLE IF EXISTS public.lectures DROP COLUMN IF EXISTS teacher;

ALTER TABLE IF EXISTS public.lectures
    ADD COLUMN teacher serial;
ALTER TABLE IF EXISTS public.lectures DROP CONSTRAINT IF EXISTS f_teacher;

ALTER TABLE IF EXISTS public.lectures
    ADD CONSTRAINT f_teacher FOREIGN KEY (teacher)
    REFERENCES public.teachers (id) MATCH SIMPLE
    ON UPDATE NO ACTION
       ON DELETE NO ACTION
    NOT VALID;

ALTER TABLE IF EXISTS public.add_materials
    ADD COLUMN count integer DEFAULT 0;

SELECT * FROM add_materials

UPDATE add_materials
SET name = 'Nax9'
WHERE id = 2;

SELECT * FROM lectures WHERE id > 1


-------------------------------------------

SELECT * FROM students
ORDER BY last_name

SELECT name FROM lectures AS adm
ORDER BY date DESC LIMIT 34

SELECT min(date) AS c
FROM lectures

SELECT COUNT(video),
       COUNT(url),
       COUNT(BOOK)
FROM add_materials

SELECT last_name FROM teachers
WHERE last_name LIKE 'N%'

SELECT first_name, last_name FROM students
WHERE courses > 3
ORDER BY last_name

-------------------------------------------

SELECT
    full_name,
    teachers.teacher_code
FROM
    teachers
        INNER JOIN lectures
                   ON teachers.teacher_code = lectures.teacher_code
ORDER BY time

SELECT full_name, lectures_count FROM teachers

SELECT
    lectures.time,
    l_name
FROM
    lectures
        INNER JOIN teachers
                   ON teachers.teacher_code = lectures.teacher_code
ORDER BY time

SELECT name, COUNT(lecture), COUNT(teacher), COUNT(student), COUNT(add_m), COUNT(homework)

SELECT time
FROM lectures
UNION
SELECT date
FROM courses

SELECT max(l_name) FROM lectures
                            INNER JOIN teachers
                                       ON teachers.teacher_code = lectures.teacher_code



