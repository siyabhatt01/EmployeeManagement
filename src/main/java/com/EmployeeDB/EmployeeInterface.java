package com.EmployeeDB;

public interface EmployeeInterface {

        // create employee
        public void createEmployee(Employee emp);

        //show all employee
        public void showAllEmployee();

        //show employee based on id
        public void showEmployeeBasedOnId(int id);

        //update employee
        public void updateEmployeeName(int id,String name);
        public void updateEmployeeSalary(int id,double salary);
        public void updateEmployeeDesignation(int id,String designation);
        public void updateEmployeePhoneNo(int id,long phoneNo);

        // delete employee
        public void deleteEmployee(int id);
    }


