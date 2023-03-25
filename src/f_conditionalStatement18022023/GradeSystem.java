package f_conditionalStatement18022023;

public class GradeSystem {

    static void checkGradeSystem(int marks) {
        if (marks >=0 && marks <= 100){ //Nested Condition - Working Range - Outside range will not display result
            if (marks >= 35 && marks <= 50)
            {System.out.println("Pass Class");}
            else if (marks > 50 && marks < 65)
            {System.out.println("Student Passed with Grade D");}
            else if (marks > 65 && marks <= 75)
            {System.out.println("Student Passed with Grade C");}
            else if (marks > 75 && marks <= 90)
            {System.out.println("Student Passed with Grade B");}
            else if (marks > 90) //As working range is added : <=100 is
                // not necessary
            {System.out.println("Student Passed with Grade A");}
            else if (marks <=34) //As working range is added : >=0 is
                // not necessary
                {System.out.println("Student Failed");}
        else
                {System.out.println("Invalid Data Entered");}
    }}

    public static void main(String[] args) {
        checkGradeSystem(45);
        checkGradeSystem(12);
        checkGradeSystem(69);
        checkGradeSystem(95);
        checkGradeSystem(102); //Result is not displayed as
        // it is outside working Range.
        //If we remove nested condition it will
        // display result of 102 marks as Invalid data Entered.
    }}
