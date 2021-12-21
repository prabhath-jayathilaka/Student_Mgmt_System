/*****************************

 Purpose Object Oriented Group project with Java
 Created Data: 2021.02.01
 Last Modified Date: 2021.02.05

 Developers
 R.M.P.M  JAYATHILAKA - PS/2017/077
 U.B. G.I  LAKMINI - PS/2017/099
 S.D.C.V  WIMUKTHI -PS/2017/222
 S.A.H NETHMINI - PS/2017/261

 ********************************/

/*

Semi Automates University Student Management System.
        We can monitor the registration of students  for the course;
        It displays the student's details.
        It includes the computation of grade point average (GPA).
        It highlights the course grades of each student.
        In a further implementation, we and identify student's performances furthermore.

*/


package stmgmt.systemclass.main;

import course.department.Course;
import course.department.EnterResult;
import database.controller.students.Results;
import database.controller.students.Student;
import control.database.FindGrades;
import control.database.FindPath;
import control.database.Insertion;
import control.database.Validation;

import java.util.Scanner;

public class StudentManagementApp {

    //main controller

    public static void main(String[] args) {
        System.out.println("\n\nWelcome To The Student Data Management Application\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would To Find Student's Details Please Enter NO 1 ");
        System.out.println("Would To Insert Student's Details To System please Enter NO 2 ");
        System.out.println("Please Type \"exit\" To Exit Application  Any time");
        int i= keyboard.nextInt();

        do {

            if (i == 1) {

                // Create a Scanner object get user input

                Scanner myObj = new Scanner(System.in);
                System.out.println("Please Enter Student Id Number ");
                String studentID = myObj.nextLine();
                Student S = Validation.Validate(studentID);

                Course C = FindPath.FindSubjects(S.Coursepath);
                Display.displayS(S);
                Results R = FindGrades.Fresult(S, C);
                Display.displayR(R);


            } else if (i == 2) {


                System.out.println(" ********** Enter Required details Continuously ************ ");

                Student SN = Insertion.Insert();
                Course CN = FindPath.FindSubjects(SN.Coursepath);
                EnterResult.InsertResult(CN, SN.StId);

                // validation of insert data
                Student s = Validation.Validate(SN.StId);


                Course c = FindPath.FindSubjects(s.Coursepath);
                Display.displayS(s);
                Results r = FindGrades.Fresult(s, c);
                Display.displayR(r);


            } else if (i == 3) {
                System.out.println(" Exit Successfully  ");
            }


            System.out.println("Would To Find Student's Details Please Enter NO \" 1\" ");
            System.out.println("Would To Insert Student's Details To System please Enter NO \" 2\" ");
            System.out.println("Please Type \"3\" To Exit Application  Any time");

            i = keyboard.nextInt();

        } while (i <= 0 && 4 < i);
    }
}