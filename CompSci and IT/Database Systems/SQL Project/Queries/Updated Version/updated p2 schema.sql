CREATE TABLE `Customer`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50) NOT NULL,
    `phone` BIGINT NULL,
    `email` VARCHAR(50) NOT NULL,
    `birthdate` DATE NOT NULL,
    `age` BIGINT NULL
);
CREATE TABLE `Billing`(
    `composite_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `service_id` BIGINT NOT NULL,
    `service_date` DATE NOT NULL COMMENT 'FK of Service(service_date)',
    `due_date` DATE NOT NULL,
    `amount` DECIMAL(6, 2) NOT NULL,
    `client_id` INT NULL,
    PRIMARY KEY(`service_id`)
);
CREATE TABLE `Service`(
    `offering_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `company_unit` VARCHAR(50) NOT NULL,
    `service_condition` BIGINT NOT NULL
);
CREATE TABLE `Purchase`(
    `offering_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `customer_id` INT NOT NULL,
    `date_purchased` DATE NOT NULL,
    `contact_person` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`customer_id`)
);
CREATE TABLE `Product`(
    `offering_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `first_release_date` DATE NOT NULL,
    `standard_price` DECIMAL(8, 2) NOT NULL
);
CREATE TABLE `Offering`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `description` VARCHAR(100) NOT NULL
);
CREATE TABLE `Repair`(
    `service_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `cost` DECIMAL(8, 2) NOT NULL
);
CREATE TABLE `Maintenance`(
    `service_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `hourly_rate` DECIMAL(4, 2) NOT NULL
);
ALTER TABLE
    `Service` ADD CONSTRAINT `service_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Repair`(`service_id`);
ALTER TABLE
    `Offering` ADD CONSTRAINT `offering_id_foreign` FOREIGN KEY(`id`) REFERENCES `Product`(`offering_id`);
ALTER TABLE
    `Customer` ADD CONSTRAINT `customer_id_foreign` FOREIGN KEY(`id`) REFERENCES `Billing`(`composite_id`);
ALTER TABLE
    `Service` ADD CONSTRAINT `service_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Billing`(`composite_id`);
ALTER TABLE
    `Service` ADD CONSTRAINT `service_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Maintenance`(`service_id`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Customer`(`id`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Offering`(`id`);
ALTER TABLE
    `Offering` ADD CONSTRAINT `offering_id_foreign` FOREIGN KEY(`id`) REFERENCES `Service`(`offering_id`);