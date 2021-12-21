package course.department;

import control.database.Loging;
import stmgmt.systemclass.main.Display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class EnterResult {
    String Grade;

    public EnterResult() {
        Scanner NewStudent = new Scanner(System.in);
        System.out.println("Enter Student grade ");
        this.Grade= NewStudent.nextLine();
    }


 public static void  InsertResult(Course C, String SID){

         System.out.println("Enter The SID  " +SID+ "  " +C.Subject01+  "  Course rade ");
         EnterResult e1 = new EnterResult();
         System.out.println("Enter The SID  " +SID+ "  " +C.Subject02+  "  Course rade ");
         EnterResult e2 = new EnterResult();
         System.out.println("Enter The SID  " +SID+ "  " +C.Subject03+  "  Course rade ");
         EnterResult e3 = new EnterResult();
           System.out.println("Enter The SID  " +SID+ "  " +C.Subject04+  "  Course rade ");
           EnterResult e4 = new EnterResult();
           System.out.println("Enter The SID  " +SID+ "  " +C.Subject05+  "  Course rade ");
           EnterResult e5 = new EnterResult();
           System.out.println("Enter The SID  " +SID+ "  " +C.Subject06+  "  Course rade ");
           EnterResult e6 = new EnterResult();


            senddata(C.Subject01, e1.Grade, SID);
            senddata(C.Subject02, e2.Grade, SID);
            senddata(C.Subject03,e3.Grade,SID);
            senddata(C.Subject04, e4.Grade, SID);
            senddata(C.Subject05, e5.Grade, SID);
            senddata(C.Subject06,e6.Grade,SID);


 }
static void senddata(String table,String grade,String sid ) {
        boolean isSuccess= false;
    Loging l = new Loging();
          try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(l.url, l.uname, l.pass);
              Statement stmt = con.createStatement();
              String sql = "insert into " + table + " values ('" + sid + "','" + grade + "')";
              int rs = stmt.executeUpdate(sql);

              if (rs == 1) {
                  Display.dberror3();
                  isSuccess = true;
              }
              else {
                  Display.dberror2();
                  isSuccess = false;
              }

          } catch (Exception e) {
              e.printStackTrace();

          }
      }



}

