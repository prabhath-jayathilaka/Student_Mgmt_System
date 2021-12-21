package control.database;

import course.department.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FindPath {

     // creating tem object

    public static Course FindSubjects(String PNO)   // PNO Path Number

    {  Course C = new Course();
    Loging l=new Loging();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(l.url,l.uname, l.pass);
            Statement stmt = con.createStatement();
            String sql = "select *from course where couid='"+PNO+"'";

            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
              //  System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                C.PatNo = rs.getString(1);
                C.Subject01 = rs.getString(2);
                C.Subject02 = rs.getString(3);
                C.Subject03 = rs.getString(4);
                C.Subject04 = rs.getString(5);
                C.Subject05 = rs.getString(6);
                C.Subject06 = rs.getString(7);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return C;
    }
}












