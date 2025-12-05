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
