package com.EmployeeDB;



import java.sql.SQLOutput;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            EmployeeImplementation imp= new EmployeeImplementation();
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t *********   EMPLOYEE DATA APPLICATION   *********");
            System.out.println();
            System.out.println();
            System.out.println("Select any of the given options : ");
            System.out.println();

            do {
                System.out.println();
                System.out.println("1.Add Employee \n"
                        + "2.Show all Employee \n"
                        + "3.Show all Employee based on ID \n"
                        + "4.Update Employee details \n"
                        + "5.Delete Employee \n"
                        + "6.Exit from Application \n");

                System.out.println("Enter your choice :  ");
                Scanner s1 = new Scanner(System.in);
                int choice = s1.nextInt();
                switch (choice)
                {
                    case 1 : Employee emp = new Employee();
                        System.out.println("Enter ID          : ");
                        int id=s1.nextInt();
                        System.out.println("Enter Name        : ");
                        String name=s1.next();
                        System.out.println("Enter Designation : ");
                        String designation=s1.next();
                        System.out.println("Enter Salary      : ");
                        double salary=s1.nextDouble();
                        System.out.println("Enter PhoneNo.    : ");
                        long phoneNo=s1.nextLong();
                        emp.setId(id);
                        emp.setName(name);
                        emp.setDesignation(designation);
                        emp.setSalary(salary);
                        emp.setPhoneNo(phoneNo);
                        imp.createEmployee(emp);
                        break;
                    case 2 :imp.showAllEmployee();
                            break;
                    case 3: System.out.println("Enter ID");
                            id = s1.nextInt();
                            imp.showEmployeeBasedOnId(id);
                            break;

                    case 4:
                        System.out.println("Choose an option : \n 1.Update Name \n 2.Designation \n 3.Update Salary \n 4.Phone No. \n 5.Exit \n");
                        System.out.println("Enter your choice : ");
                        int updateChoice= s1.nextInt();

                        switch(updateChoice) {
                            case 1:
                                System.out.println("Enter the ID where you want to change the name : ");
                                id = s1.nextInt();
                                System.out.println("Enter the new name :");
                                name = s1.next();
                                imp.updateEmployeeName(id, name);
                                break;

                            case 2:
                                System.out.println("Enter the ID where you want to change the designation : ");
                                id = s1.nextInt();
                                System.out.println("Enter new designation :");
                                designation = s1.next();
                                imp.updateEmployeeDesignation(id, designation);
                                break;
                            case 3:
                                System.out.println("Enter the ID where you want to change the salary : ");
                                id= s1.nextInt();
                                System.out.println("Enter the new salary :");
                                salary = s1.nextDouble();
                                imp.updateEmployeeSalary(id, salary);
                                break;
                            case 4 : System.out.println("Enter the ID where you want to change the Phone no. : ");
                                id= s1.nextInt();
                                System.out.println("Enter the new phoneNumber  :");
                                phoneNo= s1.nextLong();
                                imp.updateEmployeePhoneNo(id, phoneNo);
                                break;
                            case 5: System.exit(0);
                            default:System.out.println("Enter a valid choice !!");
                        }

                        break;
                    case 5:System.out.println("Enter the ID of employee whose data you want to delete : ");
                        int idDel=s1.nextInt();
                        imp.deleteEmployee(idDel);
                        break;
                    case 6:System.out.println("            *****Thank you for choosing our application !! *********");
                        System.exit(0);
                    default: System.out.println("Enter a valid  choice !!!!!");
                }
            }while(true);
        }





    }


