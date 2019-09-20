drop table if exists exchange_value;
create table exchange_value(
id INT AUTO_INCREMENT  PRIMARY KEY,
currency_from VARCHAR(25),
currency_to VARCHAR(25),
conversion_multiple DECIMAL,
port INT
);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10002,'EUR','INR',75,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port)
values(10003,'AUD','INR',25,0);