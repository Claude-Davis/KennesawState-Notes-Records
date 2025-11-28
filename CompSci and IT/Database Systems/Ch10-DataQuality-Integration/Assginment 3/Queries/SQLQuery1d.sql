

ALTER TABLE patient_visit
ALTER COLUMN cost DECIMAL (6, 2);

SELECT cost FROM patient_visit;