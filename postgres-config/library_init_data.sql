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
  title VARCHAR(150) NOT NULL,
  short_desc varchar(2048) NOT NULL,
  fk_author_id BIGINT NOT NULL,
  genre CHAR(15) NOT NULL,
  published_date DATE,
  uploaded_date DATE,
  modified_date DATE
);

CREATE TABLE author(
  pk_author_id BIGINT not null default nextval('author_id_seq') PRIMARY KEY,
  firstname VARCHAR(150) NOT NULL,
  lastname varchar(150) NOT NULL
);

COMMIT;

ANALYZE book;
ANALYZE author;

