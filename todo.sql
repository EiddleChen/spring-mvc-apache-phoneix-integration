CREATE TABLE IF NOT EXISTS todos (
  id bigint PRIMARY KEY,
  creation_time date,
  description varchar,
  modification_time date,
  title varchar,
  version bigint
);

CREATE SEQUENCE my_sequence INCREMENT BY 1;

upsert into todos values (NEXT VALUE FOR my_sequence, '2012-01-01', '3', '2010-01-01', '5', 6);

