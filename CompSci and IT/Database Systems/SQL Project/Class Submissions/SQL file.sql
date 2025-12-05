--@block
CREATE TABLE `Customer`(
    `id` INT NOT NULL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50) NOT NULL,
    `phone` BIGINT NULL,
    `email` VARCHAR(50) NOT NULL,
    `birthdate` DATE NOT NULL,
    `age` BIGINT NULL
);

--@block
CREATE TABLE `Offering`(
    `id` INT NOT NULL PRIMARY KEY,
    `description` VARCHAR(100) NOT NULL 
);
--description as subtype discriminator

--@block
CREATE TABLE `Product`(
    `offering_id` INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (offering_id) REFERENCES `Offering`(id),
    `name` VARCHAR(50) NOT NULL,
    `first_release_date` DATE NOT NULL,
    `standard_price` DECIMAL(8, 2) NOT NULL
);

--@block
CREATE TABLE `Service`(
    `offering_id` INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (offering_id) REFERENCES `Offering`(id),
    `company_unit` VARCHAR(50) NOT NULL,
    `service_condition` VARCHAR(100) NOT NULL  
);


--@block
CREATE TABLE `Repair`(
    `service_id` INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (service_id) REFERENCES `Service`(offering_id),
    `cost` DECIMAL(8, 2) NOT NULL
);
CREATE TABLE `Maintenance`(
    `service_id` INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (service_id) REFERENCES `Service`(offering_id),
    `hourly_rate` DECIMAL(4, 2) NOT NULL
);

--@block
CREATE TABLE `Purchase`(
    `offering_id` INT NOT NULL,
    FOREIGN KEY (offering_id) REFERENCES `Offering`(id),
    `customer_id` INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES `Customer`(id),
    PRIMARY KEY (customer_id, offering_id),
    `date_purchased` DATE NOT NULL,
    `contact_person` VARCHAR(50) NOT NULL
);

--@block
CREATE TABLE `Bill`(
    `service_id` INT NOT NULL,
    FOREIGN KEY (service_id) REFERENCES `Service`(offering_id),
    `customer_id` INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES `Customer`(id),
    PRIMARY KEY(service_id, customer_id),
    `service_date` DATE NOT NULL,
    `amount_due` DECIMAL(8,2) NOT NULL,
    `date_due` DATE NOT NULL,
    `client_id` INT NULL
);

--@block
INSERT INTO customer (id, name, address, phone, email, birthdate, age)
VALUES (1, 'Hanson Jekyll', 'Atlanta, GA', 4705456789, 'hHodge@companyname.com','1976-08-15', 49),
(2, 'Joanna Perl', 'Alpharetta, GA', 4047349991, 'jPerl@company-name.com', '1992-07-23', 33),
(3, 'Areli Castro', 'Sacramento, CA', 3419095522, 'areliC@company-name2.com', '1998-11-03', 27),
(4, 'Chase Dereks', 'Dallas, TX', 8066752342, 'chase6@companyname.net', '1994-05-30', 31),
(5, 'Julie Evans', 'Richmond, VA', 6863412390, 'julieE@companyname2.com', '1981-12-17', 43),
(6, 'John Russo', 'Brooklyn, NY', NULL, 'russoJ@co-name.com', '1998-05-27', 27),
(7, 'Sandy Martinez', 'Jonesboro, GA', NULL, 'sandyM@companyname2.net','2000-04-04', 25)
;

INSERT INTO offering(id, description)
VALUES (1, 'Product'),
(2, 'Product'),
(3, 'Service'),
(4, 'Product'),
(5, 'Service'),
(6, 'Service'),
(7, 'Service'),
(8, 'Product')
;

INSERT INTO product(offering_id, name, first_release_date, standard_price)
VALUES (1, 'Laptop', '2000-02-02', 2599.00),
(2, 'Desktop Computer', '1990-07-07', 850.00),
(4, 'Solid State Drive', '2016-09-09', 90.00),
(8, 'Wi-Fi Router', '2003-04-04', 45.99)
;

--@block
ALTER TABLE service
ADD COLUMN `id` INT NOT NULL, 
DROP PRIMARY KEY,
ADD PRIMARY KEY (offering_id, id)
;

--@block 
SHOW CREATE TABLE Repair;
--@block
SHOW CREATE TABLE Maintenance;
--@block
CREATE INDEX idx_service_id ON service(id);
--@block
ALTER TABLE repair
DROP FOREIGN KEY `repair_ibfk_1`,
ADD FOREIGN KEY (service_id) REFERENCES service(id)
;

ALTER TABLE maintenance
DROP FOREIGN KEY `maintenance_ibfk_1`,
ADD FOREIGN KEY (service_id) REFERENCES service(id)
;

--@block
INSERT INTO service(offering_id, id, company_unit, service_condition)
VALUES (3, 1, 'Maintenance', 'Remote security patch installations and software updates for Company-Name2 laptops and desktops.'),
(5, 2, 'Repair', 'Upgrade of RAM module for laptops at CompanyName.'),
(6, 3, 'Repair', 'Data recovery from 2 failed drives at Co-Name.'),
(7, 4, 'Maintenance', 'Routine cleaning of ventilation ports of routers for CompanyName2.')
;

INSERT INTO offering()
VALUES (9, 'Service'),
(10, 'Service'),
(11, 'Service'),
(12, 'Service'),
(13, 'Service')
;

--@block
SELECT service_condition, id
FROM service
WHERE company_unit='Repair'
;
--@block
UPDATE service
SET service_condition='Data recovery from 2 failed SSDs at Co-Name'
WHERE id=3
;
--@block
UPDATE service
SET service_condition='Replace PSU of 4 desktops at Company-Name.'
WHERE id=6
;

--@block
SELECT service_condition, id
FROM service
WHERE company_unit='Maintenance'
;
--@block
UPDATE service
SET service_condition='Replace power adapter of 2 routers for CompanyName2.'
WHERE id=4
;

--@block
INSERT INTO Repair
VALUES (2, 40963.78),
(3, 4320.56),
(6, 105.88),
(8, 250.45)
;
INSERT INTO Maintenance
VALUES (1, 92.50),
(4, 85.00),
(5, 95.00),
(7, 80.00),
(9, 92.50)
;

--@block
Insert into Customer(id, name, address, phone, email, birthdate, age) Values 
(8, 'Emial James', 'Atlanta, GA', 4701238973, 'Ejames@gmail.com', '1990-02-23', 35),
(9, 'Name Phoenix', 'Phoenix, Arizona', 4808939291, 'Namephoenix@gmail.com', '1995-03-12', 30),
(10, 'Burna Boy', 'Lagos, Nigeria', 2341029945,'burna@gmail.com', '1991-07-02', 34),
(11, 'Hikari Mitsushima', 'Brooklyn, New York', 2120981234, 'hikariM@gmail.com', '1985-11-30',40),
(12, 'Jason Derulo', 'Miramar, Florida', 4219801821, 'derulo@gmail.com', '1989-11-21', 36),
(13, 'Lonnie Rashid Lynn', 'Chicago, Illinois', 2138930321, 'lonnierashid@gmail.com', '1972-03-13', 53)
;

INSERT INTO purchase(offering_id, customer_id, date_purchased, contact_person)
VALUES (1, 1, '2025-03-12', 'Lilly Smith'),
(2, 2, '2025-02-21', 'Jeffery Lewis' ),
(3,3, '2025-10-09', 'John Thomas'),
(4, 4, '2025-07-18', 'Layla Jackson'),
(5, 5, '2024-12-26', 'Lebron James'),
(6,7, '2010-09-23', 'Black Panther'),
(7,6, '2012-08-12', 'Celine Dion'),
(8,8, '2025-10-09', 'Denzel Washington'),
(9,9, '2016-05-10', 'Starlan Treadwell'),
(10,10, '2018-04-23', 'Kaydence Sartorius'),
(11,11, '2024-11-07', 'Vlasta Burian'),
(12,12, '2023-10-18', 'Silvio Santos'),
(13,13, '2022-03-26', 'Lee Jae-Yong')
;
