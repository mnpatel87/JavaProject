package g_loop25022023;

public class For_TimeTable {
    public static void timeTable(int tables){
        System.out.println("Reverse Table of " + tables);
        System.out.println("*******************");

        for(int t = 10; t>=1; t--) {
            System.out.println(tables + "x" + t + "=" + tables * t);
        }
        System.out.println("*******************");}

    public static void main(String[] args) {

        timeTable(1);
        timeTable(2);
        timeTable(3);
        timeTable(4);
        timeTable(5);}}
