package f_conditionalStatement18022023;

public class WeekDays {
    public static void main(String[] args) {
        int W=5;
        switch (W){
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");

            case 6:System.out.println("Saturday");

            case 7:System.out.println("Sunday");
                break;
            default:
                System.out.println("incorrect Input");

    //Result displayed wrong as Break is not added - IMPORTANCE OF BREAK
    }}}
