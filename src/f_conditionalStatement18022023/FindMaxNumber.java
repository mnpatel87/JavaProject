package f_conditionalStatement18022023;

public class FindMaxNumber {

    static void findMaxNumber(int a, int b, int c, int d) {
        //Its parameterized method, hence static
        if (a > b && a > c && a > d)
        {System.out.println(a + " is the biggest number out of all 4 numbers");}
        else if (b>a && b>c && b>d)
        {System.out.println(b + " is the biggest number out of all 4 numbers");}
        else if (c>a && c>b && c>d)
        {System.out.println(c + " is the biggest number out of all 4 numbers");}
        else if (d>a && d>b && d>c)
        {System.out.println(d + " is the biggest number");}
        else
        {System.out.println("Some numbers are Equal");}
    }

    public static void main(String[] args) {

    findMaxNumber(10,12,13,4); //ladder condition - correct result
    findMaxNumber(22,28,26,27); //ladder condition - correct result
    findMaxNumber(22,34,-99,25); //ladder condition - correct result
    findMaxNumber(29,29,29,29);
    }
}