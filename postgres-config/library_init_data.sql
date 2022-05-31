--
-- PostgreSQL port of the MySQL "World" database.
--
-- The sample data used in the world database is Copyright Statistics 
-- Finland, http://www.stat.fi/worldinfigures.
--

BEGIN;

SET client_encoding = 'LATIN1';

CREATE SEQUENCE book_id_seq start 1000;
CREATE SEQUENCE author_id_seq start 1000;

CREATE TABLE book(
  pk_book_id BIGINT not null default nextval('book_id_seq') PRIMARY KEY,
  isbn no null varchar(16) unique,
  title VARCHAR(150) NOT NULL,
  short_desc varchar(2048) NOT NULL,
  published_date DATE,
  uploaded_date DATE,
  modified_date DATE
);


CREATE TABLE author(
  pk_author_id BIGINT not null default nextval('author_id_seq') PRIMARY KEY,
  firstname VARCHAR(150) NOT NULL,
  lastname varchar(150) NOT NULL
);

CREATE TABLE genre(
  genre varchar(50) NOT null unique primary KEY
);

CREATE TABLE author_books(
    fk_author_id BIGINT not null,
    fk_book_id BIGINT not null
);

CREATE TABLE book_genre_joins(
    genre varchar(50) not null,
    fk_book_id BIGINT not null
);

COMMIT;

ANALYZE book;
ANALYZE author;

