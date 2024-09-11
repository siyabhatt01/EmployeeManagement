package com.EmployeeDB;

public class Employee {

        private String name;
        private int id;
        private String designation;
        private double salary;
        private long phoneNo;

        //default constructor
        Employee()
        {
        }
        //constructor
        public Employee(int id, String name, String designation, double salary, long phoneNo) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.salary = salary;
            this.phoneNo = phoneNo;
        }
        //getter and setter methods

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }
    }

