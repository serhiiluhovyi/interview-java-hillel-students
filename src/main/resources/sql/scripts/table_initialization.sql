DROP TABLE IF EXISTS actors CASCADE;
DROP TABLE IF EXISTS directors CASCADE;
DROP TABLE IF EXISTS movies CASCADE;
DROP TABLE IF EXISTS actors_movies;

CREATE TABLE actors (
  id BIGINT AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birthday DATE NOT NULL,
  gender VARCHAR(6) NOT NULL,
  instagram VARCHAR(255),
  CONSTRAINT actors_PK PRIMARY KEY (id),
  CONSTRAINT actors_instagram_AK UNIQUE (instagram)
);

CREATE TABLE directors (
  id BIGINT AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  birthday DATE NOT NULL,
  gender VARCHAR(6) NOT NULL,
  instagram VARCHAR(255),
  CONSTRAINT directors_PK PRIMARY KEY (id),
  CONSTRAINT directors_instagram_AK UNIQUE (instagram)
);

CREATE TABLE movies (
  id BIGINT AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  year_of_creation SMALLINT NOT NULL,
  genre VARCHAR(255) NOT NULL,
  directors_id BIGINT NOT NULL,
  CONSTRAINT movies_PK PRIMARY KEY (id),
  CONSTRAINT movies_directors_FK FOREIGN KEY (directors_id) REFERENCES directors (id)
);

CREATE TABLE actors_movies (
  actors_id BIGINT,
  movies_id BIGINT,
  CONSTRAINT actors_movies_PK PRIMARY KEY (actors_id, movies_id),
  CONSTRAINT actors_movies_actors_FK FOREIGN KEY (actors_id) REFERENCES actors (id) ON DELETE CASCADE,
  CONSTRAINT actors_movies_movies_FK FOREIGN KEY (movies_id) REFERENCES movies (id)
);


