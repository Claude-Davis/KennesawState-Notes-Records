

SELECT e.employee_id, e.employee_name, p.patient_id, p.patient_name
FROM employee e
JOIN patient p ON e.home_address = p.home_address


SELECT e.employee_id, e.employee_name, p.patient_id, p.patient_name, e.home_address
FROM employee e
JOIN patient p ON e.home_address = p.home_address