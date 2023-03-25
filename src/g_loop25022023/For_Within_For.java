package g_loop25022023;

public class For_Within_For {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++){                      //LINE 1
            for (int j = 0; j<2; j++)                   //LINE 2
                System.out.println(i + "    " + j);     //LINE 3
            System.out.println();                       //LINE 4
            }
    }}

/* Line 1 - Int i is 0 (Less than 3) - yes, go to next line and check j
is less than 2, yes, so printed 0 space 0 (Concetanation).
Again check inner loop and now its j++, so 1 is less than 3 - Yes,
so printed 0 space 1.
again check inner loop and now its j++ (1++), its 2, so check 2 is <2 - NO.
Inner loop is executed and and go next line. i.e. SOUTPRNTLN (Blank line).

Again go to outer loop, now its i ++, i.e. 0++ - Its 1 and it is less than 2.
Now after exceution of inner loop variable J was destroyed, so again check,
j (i.e. 0) is less than 2 - Yes - So print 1 space 0 (1 for outer loop and 0
for inner loop) and repeat the cycle until outer loop completes
 */