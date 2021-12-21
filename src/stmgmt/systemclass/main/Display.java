package stmgmt.systemclass.main;

// Display Main outputs And Error outputs;

import course.department.Course;
import database.controller.students.Results;
import database.controller.students.Student;

public class Display {

  static void displayS(Student S)
    {
        System.out.println("  Student Details  ");
        System.out.println("------------------------------------------------------------------------------- ");
        System.out.println(" "+S.StId+  " " +S.FirstName+ "  " +S.LastName+"  "+ S.Address+ " "+S.Coursepath + "");
    }

    static void displayR(Results R)
    {    System.out.println(" Student Results" );
        System.out.println("--------------------------" );
         System.out.println("" +R.S1.CCode+  " " +R.S1.Grade+"" );
        System.out.println("" +R.S2.CCode+   " " +R.S2.Grade+"" );
        System.out.println("" +R.S3.CCode+   " " +R.S3.Grade+"" );
        System.out.println("" +R.S4.CCode+   " " +R.S4.Grade+"" );
        System.out.println("" +R.S5.CCode+   " " +R.S5.Grade+"" );
        System.out.println("" +R.S6.CCode+   " " +R.S6.Grade+"" );

        System.out.printf("Grade point Average :"+R.gpa+"" );
        System.out.println("\n" );

    }
    void displayC(Course C)
    {
        System.out.println(" COuID    Subject1    Subject2    Subject3    Subject4    Subject5    Subject6 " );
        System.out.println("---------------------------------------------------------------------------- ");
        System.out.println(""+C.PatNo+" "+C.Subject01+ " " +C.Subject02+" "+ C.Subject03+""+C.Subject04+"" +C.Subject05+""+C.Subject06+"");
    }


    public static void dberror1()
           {
             System.out.println(" There Are NO Such Element IN DATA BASE " );
           }

    public static void dberror2()
          {
           System.out.println(" Error : DATA BASE Insertion Failure " );
          }
    public static void dberror3()
          {
            System.out.println(" Greeting : DATA BASE Insertion Successfully " );
          }
}