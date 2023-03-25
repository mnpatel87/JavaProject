package f_conditionalStatement18022023;

public class LeapYear {
    static void leapYearOrNot(int number) {
//  Can also be accessed by Object creation and adding year, if not Static
    if (number%4==0 && number % 100 !=0 || number %400 == 0)
        {System.out.println(number + " is leap year with 29 Days");}
    else
        {System.out.println(number + " is not a leap year and has 28 days");}
            }

    public static void main(String[] args) {
        leapYearOrNot(2020);
        leapYearOrNot(2023);
        leapYearOrNot(2026);
        leapYearOrNot(2032);
        leapYearOrNot(2024);
        leapYearOrNot(1900);
        }
}
