-- liquibase formatted sql

--changeset mt:init_1
--preconditions onFail:MARK_RAN
--precondition-sql-check expectedResult:0 select count(*) from pg_tables where schemaname= 'my_schema' and tablename = 'products';
create table products
(
    "id"   integer      not null,
    "name" varchar(128) not null,
    constraint products_pk primary key (id),
    constraint products_uk unique (name)
);

--changeset mt:init_2
--preconditions onFail:MARK_RAN
--precondition-sql-check expectedResult:0 select count(*) from pg_sequences where schemaname= 'my_schema' and sequencename = 'products_seq';
create sequence products_seq increment by 1 start with 1 maxvalue 999999999 minvalue 1;