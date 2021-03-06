-- The Shawshank Redemption
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Tim', 'Robbins', '1958-10-16', 'MALE', 'instagram.com/tim');
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Morgan', 'Freeman', '1937-06-01', 'MALE', null);
INSERT INTO directors (first_name, last_name, birthday, gender, instagram) VALUES ('Frank', 'Darabont', '1959-01-28', 'MALE', null);
INSERT INTO movies (name, year_of_creation, genre, directors_id) VALUES ('The Shawshank Redemption', 1994, 'Drama', (select id from directors where last_name='Darabont'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Robbins'), (select id from movies where name='The Shawshank Redemption'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Freeman'), (select id from movies where name='The Shawshank Redemption'));

-- Fight Club
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Brad', 'Pitt', '1963-12-18', 'MALE', 'instagram.com/pittb');
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Edward', 'Norton', '1969-08-18', 'MALE', 'instagram.com/ednort');
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Meat', 'Loaf', '1947-09-27', 'MALE', null);
INSERT INTO directors (first_name, last_name, birthday, gender, instagram) VALUES ('David', 'Fincher', '1962-08-28', 'MALE', 'instagram.com/dfit');
INSERT INTO movies (name, year_of_creation, genre, directors_id) VALUES ('Fight Club', 1999, 'Drama', (select id from directors where last_name='Fincher'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Pitt'), (select id from movies where name='Fight Club'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Norton'), (select id from movies where name='Fight Club'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Loaf'), (select id from movies where name='Fight Club'));

-- Kill Bill: Vol. 1
INSERT INTO actors (first_name, last_name, birthday, gender, instagram) VALUES ('Uma', 'Thurman', '1970-04-29', 'FEMALE', 'instagram.com/umma');
INSERT INTO directors (first_name, last_name, birthday, gender, instagram) VALUES ('Quentin', 'Tarantino', '1963-03-27', 'MALE', 'instagram.com/qwerty');
INSERT INTO movies (name, year_of_creation, genre, directors_id) VALUES ('Kill Bill: Vol. 1', 2003, 'Action', (select id from directors where last_name='Tarantino'));
INSERT INTO actors_movies (actors_id, movies_id) VALUES ((select id from actors where last_name='Thurman'), (select id from movies where name='Kill Bill: Vol. 1'));


INSERT INTO directors VALUES
        (4, 'Akira', 'Kurosawa', '1936-09-06', 'MALE', NULL),
        (5, 'Ingmar', 'Bergman', '1918-07-14', 'MALE', NULL);
