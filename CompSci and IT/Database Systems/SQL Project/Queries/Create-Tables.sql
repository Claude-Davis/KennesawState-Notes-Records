
--@block
CREATE TABLE Customer(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    phone BIGINT,
    email VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    age BIGINT
);

--@block
CREATE TABLE Service(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    service_date DATE NOT NULL,
    company_unit VARCHAR(50) NOT NULL,
    service_type VARCHAR(50) NOT NULL
);

CREATE TABLE Product(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(50) NOT NULL,
    first_release_date DATE NOT NULL
);
CREATE TABLE Offering(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    contact_person VARCHAR(50) NOT NULL,
    offering_description TEXT NOT NULL
);

--@block
CREATE TABLE Repair(
    service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (service_id) REFERENCES Service(id),
    cost DECIMAL(8, 2) NOT NULL
);
CREATE TABLE Maintenance(
    service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    FOREIGN KEY (service_id) REFERENCES Service(id),
    hourly_rate DECIMAL(2, 2) NOT NULL
);

--@block
CREATE TABLE Purchase(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    offering_id INT NOT NULL,
    FOREIGN KEY (offering_id) REFERENCES Offering(id),
    product_id INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES Product(id),
    service_id INT NOT NULL,
    FOREIGN KEY (service_id) REFERENCES Service(id),
    client_id INT,
    price DECIMAL(8, 2) NOT NULL,
    date_purchased DATE NOT NULL
);

--@block
CREATE TABLE Billing(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    service_id INT NOT NULL,                        --now references Service's id column, instead of Service's date column
    FOREIGN KEY (service_id) REFERENCES Service(id),
    due_date DATE NOT NULL,
    amount DECIMAL(6, 2) NOT NULL
);
