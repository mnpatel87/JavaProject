package g_loop25022023;

public class For_Table_Line {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            for (int j = 1; j<=10; j++)
                System.out.print((i * j) + "   ");

            System.out.println();
        }

    }
}
/* Outer loop will print 10 lines and inner loop will
generate data for each line.
Outer loop - i is 1 and its less than 10.
check inner loop, j = 1 and its less than 10, go to next line and print
i * j concetenation Space. (i.e. 1 * 1 and space. - Answer is 1.
Agin continue with inner loop until j is <=10, so table of 1.
After that next line.
then go to outer loop and start again for and repeat until i <=10 */