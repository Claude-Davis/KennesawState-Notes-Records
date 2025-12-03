
--@block
ALTER TABLE Service
MODIFY COLUMN service_type VARCHAR(100) NOT NULL;

--@block
ALTER TABLE Product
ADD FOREIGN KEY (id) REFERENCES Offering(id)
;

ALTER TABLE Service
ADD FOREIGN KEY (id) REFERENCES Offering(id)
;

--@block
ALTER TABLE Offering
ADD offering_type VARCHAR(50) NOT NULL;

--@block
ALTER TABLE maintenance
MODIFY hourly_rate DECIMAL(3,2) NOT NULL;
