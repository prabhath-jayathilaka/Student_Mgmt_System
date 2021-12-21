package database.controller.students;
import java.util.Scanner;

// Enter Students Data to DB

public class EnterStudent extends Student {

    // prompt user to enter student data
    public EnterStudent() {
        Scanner NewStudent = new Scanner(System.in);
        System.out.println("Enter Provided Student Id Number ");
          this.StId= NewStudent.nextLine();

        System.out.println("Enter Student's First Name ' ");
          this.FirstName= NewStudent.nextLine();

        System.out.println("Enter Student's Last Name");
          this.LastName =NewStudent.nextLine();

        System.out.println("Enter Valid Student's Address");
          this.Address=NewStudent.nextLine();

        System.out.println("Enter Student's Registered Course Path Like : \"C04\" ");

          this.Coursepath= NewStudent.nextLine();
    }

    public static Student Enroll() {
        EnterStudent s = new EnterStudent();
        return s;
    }



}
