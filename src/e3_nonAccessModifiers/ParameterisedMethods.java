package e3_nonAccessModifiers;

public class ParameterisedMethods {
    public static void email(String name, int a, String extention) {
        //Static method needed as we are not creating object
        //Static void so Return type method not needed
        System.out.print(name);
        System.out.print(a);
        System.out.print(extention);
        System.out.println();}
    static void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {

    email("mnpatel",87,"gmail.com");
    addition(10,20);
    email("mn", 1987, "@rediffmail.com");
    }
}