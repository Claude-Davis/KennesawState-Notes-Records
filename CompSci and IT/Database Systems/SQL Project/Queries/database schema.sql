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
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `service_date` DATE NOT NULL COMMENT 'FK of Service(service_date)',
    `due_date` DATE NOT NULL,
    `amount` DECIMAL(6, 2) NOT NULL
);
CREATE TABLE `Service`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `service_date` DATE NOT NULL,
    `company_unit` VARCHAR(50) NOT NULL,
    `service_type` VARCHAR(50) NOT NULL
);
CREATE TABLE `Purchase`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `offering_id` INT NOT NULL COMMENT 'FK of Offering(id)',
    `product_id` INT NOT NULL COMMENT 'FK of Product(id)',
    `service_id` INT NOT NULL COMMENT 'FK of Service(id)',
    `client_id` INT NULL,
    `price` DECIMAL(8, 2) NOT NULL,
    `date_purchased` DATE NOT NULL
);
CREATE TABLE `Product`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `first_release_date` DATE NOT NULL
);
CREATE TABLE `Offering`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `contact_person` VARCHAR(50) NOT NULL,
    `description` LONGTEXT NOT NULL
);
CREATE TABLE `Repair`(
    `service_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `cost` DECIMAL(8, 2) NOT NULL
);
CREATE TABLE `Maintenance`(
    `service_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `hourly_rate` DECIMAL(2, 2) NOT NULL
);
ALTER TABLE
    `Service` ADD CONSTRAINT `service_id_foreign` FOREIGN KEY(`id`) REFERENCES `Repair`(`service_id`);
ALTER TABLE
    `Billing` ADD CONSTRAINT `billing_service_date_foreign` FOREIGN KEY(`service_date`) REFERENCES `Service`(`service_date`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_offering_id_foreign` FOREIGN KEY(`offering_id`) REFERENCES `Offering`(`id`);
ALTER TABLE
    `Customer` ADD CONSTRAINT `customer_id_foreign` FOREIGN KEY(`id`) REFERENCES `Billing`(`id`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_service_id_foreign` FOREIGN KEY(`service_id`) REFERENCES `Service`(`id`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_product_id_foreign` FOREIGN KEY(`product_id`) REFERENCES `Product`(`id`);
ALTER TABLE
    `Service` ADD CONSTRAINT `service_id_foreign` FOREIGN KEY(`id`) REFERENCES `Maintenance`(`service_id`);
ALTER TABLE
    `Purchase` ADD CONSTRAINT `purchase_id_foreign` FOREIGN KEY(`id`) REFERENCES `Customer`(`id`);