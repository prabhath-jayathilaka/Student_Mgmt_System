package control.database;

import database.controller.students.EnterStudent;
import database.controller.students.Student;
import stmgmt.systemclass.main.Display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertion {
    public static Student Insert() {
        boolean isSuccess = false;
        Student S = EnterStudent.Enroll();

        Loging l = new Loging();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(l.url, l.uname, l.pass);
            Statement stmt = con.createStatement();
            String sql = "insert into student values ('" + S.StId + "','" + S.FirstName + "','" + S.LastName + "','" + S.Address + "','" + S.Coursepath + "')";
            int rs = stmt.executeUpdate(sql);

            if(rs == 1) {
                Display.dberror3();
                isSuccess = true; }
            else {
                Display.dberror2();
                isSuccess = false; }

        } catch (Exception e) {
            e.printStackTrace();
        }

   return S; }


}
