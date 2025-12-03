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

