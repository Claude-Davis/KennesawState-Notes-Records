# Lab10.py
# IT1114/Section W01
# Starlan Davis
# Lab #10
# Due: 15 July 2025
# Purpose: Modifications to lab 7; improve getter and setter methods by adding exception handlers
# Resources: module 9-1 slides, https://docs.python.org/3/library/exceptions.html



# CHANGES!
 # exceptions included in add_hours(), set_employee_number(), set_office_number(), set_name(),and set_birthdate()
 #  

class DayValueError(Exception):
    """Thrown when the value of the day in set_birthdate is outside of theh 1-31 range."""
    pass

class Worker:
    def __init__(self):
        self.numOfEmployees = 0
        self.officeNum = 0
        self.name = "First Last"
        self.birthdate = "00/00/0000"
        self.hours_worked = 0                # total number of hours that the employee worked
        self.overtime_hours = 0              # total number of hours of overtime that the employee worked
        self.hourly_salary = 0               # the amount of money the employee is paid per hour
        self.overtime_hourly_salary = 0      # the amount of money the employee is paid per hour of overtime


    def get_employee_number(self):
        return self.numOfEmployees
    def set_employee_number(self, x):
        if not isinstance(x, int):
            raise TypeError("Employee number must be a positive number.")
        self.numOfEmployees = x

    def get_office_number(self):
        return self.officeNum
    def set_office_number(self, x):
        self.officeNum = x
        if (self.officeNum<100) or (self.officeNum>500):
            raise ValueError("Office number must be between 100 and 500.")
        return True


    def get_name(self):
        return self.name
    def set_name(self, x):
        if (x=="" or x==" "):
            raise ValueError("Must enter a name.")
        for i in x:
            if (i=="_") or (i==".") or (i=="-"):
                x = x.replace(i, "")
        self.name = x

    def set_birthdate(self, d, m, y):
        if (d<1 or d>31):
            raise
        if (m<1 or m>12):
            raise ValueError("The month must be between 1 and 12.")
        self.birthdate = str(d)+"/"+str(m)+"/"+str(y)
        return True

    def get_hours_worked(self):
        return self.hours_worked
    def add_hours(self, x):
        if (x<0):
            raise DayValueError("Hours worked must be a postive number.")

        if (x<=9):
            self.hours_worked += x
        elif (x>9):
            self.hours_worked += 9
            self.overtime_hours += (x-9)
    def get_hours_overtime(self):
        return self.overtime_hours
    
    def set_hourly_salary(self, x):
        if (x<0):
            #self.hourly_salary = 0
            return False
        elif (x>=0):
            self.hourly_salary = x
            return True
        
    def set_overtime_salary(self, x):
        if(x<0):
            #self.overtime_hourly_salary = 0
            return False
        elif (x>=0):
            self.overtime_hourly_salary = x
            return True
        
    def get_hourly_salary(self):
        return self.hourly_salary
    
    def get_overtime_salary(self):
        return self.overtime_hourly_salary
    
    def get_pay(self):
        return (self.hours_worked * self.hourly_salary) + (self.overtime_hours * self.overtime_hourly_salary)