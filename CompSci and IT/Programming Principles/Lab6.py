# Starlan Davis
# Lab #6
# Due: 24 June 2025
# Purpose: a class intended to be utilized in future labs
# Resources:


class Worker:
    def __init__(self):
        self.employeeNum = 0
        self.officeNum = 0
        self.name = "First Last"
        self.birthdate = "00/00/0000"
        self.hoursTotal = 0
        self.overtimeTotal = 0


    def get_employee_number(self):
        return self.employeeNum
    def set_employee_number(self, x):
        self.employeeNum = x

    def get_office_number(self):
        return self.officeNum
    def set_office_number(self, x):
        self.officeNum = x
        if (self.officeNum <100) or (self.officeNum>500):
            return False
        return True


    def get_name(self):
        return self.name
    def set_name(self, x):
        self.name = x

    def set_birthdate(self, d, m, y):
        if (d<1):
            d = 1
            return False
        elif (d>31):
            d = 31
            return False
        if (m<1):
            m = 1
            return False
        elif (m>12):
            m = 12
            return False
        self.birthdate = str(d)+"/"+str(m)+"/"+str(y)
        return True

    def get_hours_worked(self):
        return self.hoursTotal
    def add_hours(self, x):
        if (x<=9):
            self.hoursTotal += x
        elif (x>9):
            self.hoursTotal += 9
            self.overtimeTotal += (x-9)
    def get_hours_overtime(self):
        return self.overtimeTotal