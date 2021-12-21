package control.database;

import course.department.Course;
import database.controller.students.Results;
import database.controller.students.Student;
import calculatio.gpa.Calculation;
import calculatio.gpa.Sgrading;
import stmgmt.systemclass.main.Display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class FindGrades {


    public static Results Fresult(Student st, Course cu){

             Sgrading R1 = Rgrade(cu.Subject01, st.StId);
             Sgrading R2 = Rgrade(cu.Subject02, st.StId);
             Sgrading R3 = Rgrade(cu.Subject03, st.StId);
             Sgrading R4 = Rgrade(cu.Subject04, st.StId);
             Sgrading R5 = Rgrade(cu.Subject05, st.StId);
             Sgrading R6 = Rgrade(cu.Subject06, st.StId);

        Results r = new Results();
        r.S1=R1; r.S2= R2; r.S3 = R3; r.S4=R4; r.S5=R5; r.S6=R6;  r.gpa = Calculation.getgrade(R1,R2,R3,R4,R5,R6);

        return r;
    }

        static Sgrading Rgrade(String tablename, String sid)
        {
            Sgrading ga =new Sgrading();
            Loging l = new Loging();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(l.url, l.uname, l.pass);
                Statement stmt = con.createStatement();
                String sql = " select *from " + tablename + " Where sid ='" + sid + "'";
                ResultSet rs = stmt.executeQuery(sql);


                if (rs.next()) {
                  //  System.out.println(rs.getString(1) + " " + rs.getString(2));
                   ga.Grade = rs.getString(2);
                   ga.CCode =tablename;

                } else {
                             Display.dberror1();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

           return ga;
        }

    }
