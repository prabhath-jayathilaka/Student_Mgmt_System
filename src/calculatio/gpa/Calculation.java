/// GPA Calculation with find credit individual credit values of course code


package calculatio.gpa;


public class Calculation{


    public static double getgrade(Sgrading s1, Sgrading s2, Sgrading s3,Sgrading s4, Sgrading s5, Sgrading s6) {

            double  grade1= FindGradeValue(s1.Grade);
            int C1 = Creditval(s1.CCode);
            double gradeval1 = grade1 *C1;


            double grade2= FindGradeValue(s2.Grade);
            int C2 = Creditval(s2.CCode);
            double gradeval2 = grade1 *C1;


            double  grade3= FindGradeValue(s3.Grade);
            int C3 = Creditval(s3.CCode);
            double gradeval3 = grade1 *C1;

            double  grade4= FindGradeValue(s4.Grade);
            int C4 = Creditval(s4.CCode);
            double gradeval4 = grade1 *C1;


            double grade5= FindGradeValue(s5.Grade);
            int C5 = Creditval(s5.CCode);
            double gradeval5 = grade1 *C1;


            double  grade6= FindGradeValue(s6.Grade);
            int C6 = Creditval(s6.CCode);
            double gradeval6 = grade1 *C1;


            double gpa = ((gradeval1+gradeval2+gradeval3+gradeval4+gradeval5+gradeval6)/(C1+C2+C3+C4+C5+C6));
            return gpa;
        }

        static double FindGradeValue(String grade) {

            switch(grade) {
                case "A+":
                case "A":
                    return 4.0;
                case "A-":
                    return 3.7;
                case "B+":
                    return 3.3;
                case "B":
                    return 3.0;
                case "B-":
                    return 2.7;
                case "C+":
                    return 2.3;
                case "C":
                    return 2.0;
                case "D+":
                    return 1.3;
                case "D":
                    return 1.0;
                case "AB":
                    return 0.0;
                default:
                    System.out.println("no match Could calculate gpa");
                    return 100;
            }

        }

// method call find credit value
        static int Creditval(String S) {
            char last = S.charAt(S.length() -1);
            int result = Integer.parseInt(String.valueOf(last));
                return result;

        }


    }



