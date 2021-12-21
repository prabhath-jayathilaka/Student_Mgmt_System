package control.database;

import database.controller.students.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Validation {

     public static Student Validate(String StuID) {
     Student S = new Student();

   Loging l=new Loging();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(l.url,l.uname,l.pass);
            Statement stmt = con.createStatement();
            String sql = "select * from student Where sid ='"+StuID+"'";
            ResultSet rs = stmt.executeQuery(sql);

       //     System.out.println("Check1");
/*
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
*/
            if(rs.next()) {

                S.StId = rs.getString(1);
                S.FirstName = rs.getString(2);
                S.LastName = rs.getString(3);
                S.Address = rs.getString(4);
                S.Coursepath = rs.getString(5);
            }

        }

        catch (Exception e) {
            e.printStackTrace();
                       }
         return S;}


}