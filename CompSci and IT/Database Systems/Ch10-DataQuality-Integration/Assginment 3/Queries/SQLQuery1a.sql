SELECT p.patient_id, p.patient_name, p.birthdate, pa.age
FROM patient p
LEFT JOIN patient_age pa ON pa.patient_id = p.patient_id;


SELECT * FROM employee;