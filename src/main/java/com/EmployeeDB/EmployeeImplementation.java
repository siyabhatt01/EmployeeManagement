package com.EmployeeDB;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

    public class EmployeeImplementation implements EmployeeInterface
    {
        //   Connection con;

        Connection con;




        @Override
        public void createEmployee(Employee emp) {
            try {
                con = DBConnection.createConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String query ="insert into employeetable values (?,?,?,?,?)";
            try {
                PreparedStatement pstmt= con.prepareStatement(query);
                pstmt.setInt(1, emp.getId());
                pstmt.setString (2,emp.getName());
                pstmt.setString(3, emp.getDesignation());
                pstmt.setDouble(4, emp.getSalary());
                pstmt.setDouble(5, emp.getPhoneNo());

                int count = pstmt.executeUpdate();
                if(count ==0)
                {
                    System.out.println("Error Occured !!");;
                }
                else
                {
                    System.out.println("Data entered successfully !! ");
                    System.out.println();
                    System.out.println();
                }

            }
            catch (Exception e )
            {
                System.out.println("Some error occured !!! please try again ..");
                System.out.println();
            }
        }

        @Override
        public void showAllEmployee()
        {

            con = DBConnection.createConnection();
            String query ="SELECT * FROM employeeTable;";
            System.out.println("Employee Details :");
            System.out.println();
            System.out.println();
            System.out.print("-----------------------------------------------");

            try {
                Statement stmt =con.createStatement();
                ResultSet result = stmt.executeQuery(query);
                while(result.next()) {
                    System.out.println();
                    System.out.println("Employee ID : "+result.getInt(1));
                    System.out.println("*********************");
                    System.out.println("                Name         :"+result.getString(2));
                    System.out.println("                Designation  :"+result.getString(3));
                    System.out.println("                Salary       :"+result.getDouble(4));
                    System.out.println("                Phone No.    :"+result.getLong(5));

                    System.out.println("------------------------------------------------");

                }

            }catch(Exception e) {
                e.printStackTrace();
            }
        }


        @Override
        public void showEmployeeBasedOnId(int id) {
            con = DBConnection.createConnection();
            String query ="select * from employeeTable where id ="+id;


            try {
                Statement stmt =con.createStatement();
                ResultSet result = stmt.executeQuery(query);
                while(result.next()) {

                    System.out.println("Employee ID : "+result.getInt(1));
                    System.out.println("*********************************************************");
                    System.out.println("                Name         :"+result.getString(2));
                    System.out.println("                Designation  :"+result.getString(3));
                    System.out.println("                Salary       :"+result.getDouble(4));
                    System.out.println("                Phone No.    :"+result.getLong(5));
                    System.out.println("*********************************************************");


                }

            }catch(Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void updateEmployeeName(int id, String name) {
            con = DBConnection.createConnection();
            String query= ("update employeeTable set name = ? where id =?");
            try {
                PreparedStatement pstmt =con.prepareStatement(query);
                pstmt.setString(1,name);
                pstmt.setInt(2,id);

                int result = pstmt.executeUpdate();
                if(result!=0) {
                    System.out.println("Name updated successfully !!!!");
                }
                else {
                    System.out.println("unable to update data.....");

                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Override
        public void updateEmployeeSalary(int id, double salary) {
            con = DBConnection.createConnection();
            String query= ("update employeeTable set salary = ? where id =?");
            try {
                PreparedStatement pstmt =con.prepareStatement(query);
                pstmt.setDouble(1,salary);
                pstmt.setInt(2,id);

                int result = pstmt.executeUpdate();
                if(result!=0) {
                    System.out.println("Salary updated successfully !!!!");
                }
                else {
                    System.out.println("unable to update data.....");

                }

            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void updateEmployeeDesignation(int id, String designation) {
            con = DBConnection.createConnection();
            String query= ("update employeeTable set designation = ? where id =?");
            try {
                PreparedStatement pstmt =con.prepareStatement(query);
                pstmt.setString(1,designation);
                pstmt.setInt(2,id);

                int result = pstmt.executeUpdate();
                if(result!=0) {
                    System.out.println("Designation updated successfully !!!!");
                }
                else {
                    System.out.println("unable to update data.....");

                }

            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void updateEmployeePhoneNo(int id, long phoneNo) {
            con = DBConnection.createConnection();
            String query= ("update employeeTable set phoneNo = ? where id =?");
            try {
                PreparedStatement pstmt =con.prepareStatement(query);
                pstmt.setLong(1,phoneNo);
                pstmt.setInt(2,id);

                int result = pstmt.executeUpdate();
                if(result!=0) {
                    System.out.println("Phone Number updated successfully !!!!");
                }
                else {
                    System.out.println("unable to update data.....");

                }

            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void deleteEmployee(int id) {
            con = DBConnection.createConnection();
            String query ="delete from employeeTable where id = "+id;

            try {
                Statement stmt =con.createStatement();
                int result = stmt.executeUpdate(query);
                if(result!=0) {
                    System.out.println("Data deleted successfully !!!!");
                }
                else {
                    System.out.println("unable to delete data.....");

                }

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


