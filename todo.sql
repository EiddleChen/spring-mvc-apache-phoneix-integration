CREATE TABLE IF NOT EXISTS todos (
  id bigint NOT NULL PRIMARY KEY,
  creation_time date,
  description varchar,
  modification_time date,
  title varchar,
  version bigint
);

upsert INTO todos values (1, '2012-01-01', '3', '2010-01-01', '5', 6)
