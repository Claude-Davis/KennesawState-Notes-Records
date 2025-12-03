INSERT INTO Customer(name, address, phone, email, birthdate, age)
VALUES ('Hanson Hodge', 'Atlanta, GA', 4705456789, 'hHodge@companyname.com', 1976-08-15, 49),
('Joanna Perl', 'Alpharetta, GA', 4047349991, 'itzJo@gmail.com', 1992-07-23, 33),
('Areli Castro', 'Sacramento, CA', 3419095522, 'areliC98@gmail.com', 1998-11-03, 27),
('Chase Dereks', 'Dallas, TX', 8066752342, 'chase94@outlook.com', 1994-05-30, 31),
('Julie Evans', 'Richmond, VA', 6863412390, 'julieE@companyname2.com', 1981-12-17, 43)
;

INSERT INTO Customer(name, address, email, birthdate, age)
VALUES ('John Russo', 'Brooklyn, NY', 'russoJ@gmail.com', 1998-05-27, 27),
('Sandy Martinez', 'Jonesboro, GA', 'sandyM@companyname.net', 2000-04-04, 25),
;

INSERT INTO Service(service_date, company_unit, service_type)
VALUES (2020-06-30, 'Repair Dept', 'Network Equipment Repair'),
(2020-07-31, 'Maintenance Dept', 'Software Update'),
(2021-01-21, 'Maintenance Dept', 'System Performance Optimization'),
(2021-08-19, 'Maintenance Dept', 'Database Maintenance'),
(2022-01-21, 'Repair Dept', 'Data Recovery'),
(2023-09-25, 'Repair Dept', 'Device Component Replacement'),
(2023-10-23, 'Maintenance Dept', 'System Performance Optimization'),
(2024-10-05, 'Repair Dept', 'Device Component Replacement'),
(2024-11-11, 'Maintenance Dept', 'Database Maintenance'),
(2025-01-21, 'Maintenance Dept', 'Software Update'),
(2025-03-28, 'Repair Dept', 'Data Recovery')
(2025-05-15, 'Repair Dept', 'Network Equipment Repair'),
(2025-12-01, 'Maintenance Dept', 'Software Update')
;

INSERT INTO Repair(cost)
VALUES (650.78),
(320.56),
(325.45),
(332.80),
(342.50),
(671.93)
;

INSERT INTO Maintenance(hourly_rate)
VALUES (82.45),
(115.22),
(123.50),
(120.89),
(136.80),
(80.90),
(80.68)
;


INSERT INTO Product(product_name, first_release_date)
VALUES ('Desktop Computer', 1990-05-05),
('Laptop Computer', 2000-02-02)
('Server', 2003-07-07),
('NAS Storage Unit', 2016-09-09),
('Network Router', 2003-04-04)
;

INSERT INTO Offering(contact_person, offering_description)
VALUES ('Jeff Dodges', 'Replace cooling fans, clear debris from airflow pathways'),
('Lina Sanchez', 'On-site security vulnerability remediation'),
('Lina Sanchez', 'Network traffic analysis and optimization'),
('Michael Huang', 'Backup database across company servers'),
('Emily Kim', 'Recover configuration files, operating system images, and log data from failed solid-state drives'),
('Jeff Dodges', 'Replace damaged RJ45 connector housing'),
('Lina Sanchez', 'Spanning tree and redundancy protocol tuning'),
('Jeff Dodges', 'Preventative replacement of optical trancievers in core routers and office routers'),
('Michael Huang', 'Analyze and optimize database query performance and index structures'),
('Lina Sanchez', 'On-site configuration of software synchronization across network devices'),
('Emily Kim'. 'Emergency recovery of corrupted business-critical data from Oracle database'),
('Jeff Dodges', 'Replace damaged PCIe slots, replace failed RAM modules'),
('Lina Sanchez', 'Remote firmware update and patch management')
;
--Jeff Dodges: hardware repair services
--Lina Sanchez: software and optimization maintenance services
--Michael Huang: database maintenance services
--Emily Kim: data recovery repair services
--Jackie Rodricks: laptop and desktop products
--Ulysses Taylor: server, network router, and storage unit products
