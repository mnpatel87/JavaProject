package j1_methodOverloading;

public class MethodOverloading {

    private void m1(double i){
        System.out.println("double");
        System.out.println(i);
        System.out.println();}

    void m1(String i){
        System.out.println("String");
        System.out.println(i);
        System.out.println();}

    void m1(boolean i){
        System.out.println("boolean");
        System.out.println(i);
        System.out.println();}

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.m1(10);
        obj.m1(10.233333);
        obj.m1("Java");
        obj.m1("m");
        obj.m1(23>25);}
}
