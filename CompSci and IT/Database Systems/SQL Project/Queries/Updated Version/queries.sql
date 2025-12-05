--@block
SELECT o.*, p.name, p.standard_price
FROM offering o
RIGHT JOIN product p
ON o.id=p.offering_id
;

--@block
SELECT id, name, email
FROM customer c
WHERE c.age>40
;
