--@block
INSERT INTO Customer(name, address, phone, email, birthdate, age)
VALUES ('Hanson Hodge', 'Atlanta, GA', 4705456789, 'hHodge@companyname.com','1976-08-15', 49),
('Joanna Perl', 'Alpharetta, GA', 4047349991, 'jPerl@company-name.com', '1992-07-23', 33),
('Areli Castro', 'Sacramento, CA', 3419095522, 'areliC@company-name2.com', '1998-11-03', 27),
('Chase Dereks', 'Dallas, TX', 8066752342, 'chase6@companyname.net', '1994-05-30', 31),
('Julie Evans', 'Richmond, VA', 6863412390, 'julieE@companyname2.com', '1981-12-17', 43),
('John Russo', 'Brooklyn, NY', NULL, 'russoJ@co-name.com', '1998-05-27', 27),
('Sandy Martinez', 'Jonesboro, GA', NULL, 'sandyM@companyname2.net','2000-04-04', 25)
;

--@block
INSERT INTO Offering(contact_person, offering_description, offering_type)
VALUES ('Jeff Dodges', 'Replace cooling fans, clear debris from airflow pathways', 'Service'),
('Lina Sanchez', 'On-site security vulnerability remediation', 'Service'),
('Lina Sanchez', 'Network traffic analysis and optimization', 'Service'),
('Michael Huang', 'Backup database across company servers', 'Service'),
('Emily Kim', 'Recover configuration files, operating system images, and log data from failed solid-state drives', 'Service'),
('Jeff Dodges', 'Replace damaged RJ45 connector housing', 'Service'),
('Lina Sanchez', 'Spanning tree and redundancy protocol tuning', 'Service'),
('Jeff Dodges', 'Preventative replacement of optical trancievers in core routers and office routers', 'Service'),
('Michael Huang', 'Analyze and optimize database query performance and index structures', 'Service'),
('Lina Sanchez', 'On-site configuration of software synchronization across network devices', 'Service'),
('Emily Kim', 'Emergency recovery of corrupted business-critical data from Oracle database', 'Service'),
('Jeff Dodges', 'Replace damaged PCIe slots, replace failed RAM modules', 'Service'),
('Lina Sanchez', 'Remote firmware update and patch management', 'Service')
;
--Jeff Dodges: hardware repair services
--Lina Sanchez: software and optimization maintenance services
--Michael Huang: database maintenance services
--Emily Kim: data recovery repair services

INSERT INTO Offering(contact_person, offering_description, offering_type)
VALUES ('Jackie Rodricks', 'Sale of 80 laptops and 120 desktops', 'Product'),
('Ulysses Taylor', 'Sale of 20 network routers', 'Product'),
('Jackie Rodricks', 'Sale of 200 desktops', 'Product'),
('Jackie Rodricks', 'Sale of 160 desktops and 95 laptops', 'Product'),
('Ulysses Taylor', 'Sale of 3 servers and 15 NAS storage units', 'Product'),
('Ulysses Taylor', 'Sale of 20 servers and 30 network routers', 'Product')
;
--Jackie Rodricks: laptop and desktop products
--Ulysses Taylor: server, network router, and storage unit products

--@block
INSERT INTO Service(id, service_date, company_unit, service_type)
VALUES (1, '2020-06-30', 'Repair Dept', 'Network Equipment Repair'),
(2, '2020-07-31', 'Maintenance Dept', 'Software Update'),
(3, '2021-01-21', 'Maintenance Dept', 'System Performance Optimization'),
(4, '2021-08-19', 'Maintenance Dept', 'Database Maintenance'),
(5, '2022-01-21', 'Repair Dept', 'Data Recovery'),
(6, '2023-09-25', 'Repair Dept', 'Device Component Replacement'),
(7, '2023-10-23', 'Maintenance Dept', 'System Performance Optimization'),
(8, '2024-10-05', 'Repair Dept', 'Device Component Replacement'),
(9, '2024-11-11', 'Maintenance Dept', 'Database Maintenance'),
(10, '2025-01-21', 'Maintenance Dept', 'Software Update'),
(11, '2025-03-28', 'Repair Dept', 'Data Recovery'),
(12, '2025-05-15', 'Repair Dept', 'Network Equipment Repair'),
(13, '2025-12-01', 'Maintenance Dept', 'Software Update')
;


--@block
INSERT INTO Repair(service_id, cost)
VALUES (14, 650.78),
(18, 320.56),
(19, 325.45),
(21, 332.80),
(24, 342.50),
(25, 671.93)
;

INSERT INTO Maintenance(service_id, hourly_rate)
VALUES (15, 82.45),
(16, 115.22),
(17, 123.50),
(20, 120.89),
(22, 136.80),
(23, 80.90),
(26, 80.68)
;


INSERT INTO Product(product_name, first_release_date)
VALUES ('Desktop Computer', 1990-05-05),
('Laptop Computer', 2000-02-02)
('Server', 2003-07-07),
('NAS Storage Unit', 2016-09-09),
('Network Router', 2003-04-04)
;


