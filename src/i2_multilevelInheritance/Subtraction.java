package i2_multilevelInheritance;

public class Subtraction extends Multiplication {

    public void Subtract(double a, double b){
        System.out.println("Subtraction is " + (a-b));}
    public void Calculations(){
        Add(3.1,2.6);
        Add(-2,-2);
        Divide(10.3,15.1);
        Divide(5,0);
        Multiply(-2.0,-5.0);
        Subtract(7,-15);
    }
    public static void main(String[] args) {
        Subtraction CallAllMethods = new Subtraction();
        CallAllMethods.Calculations();}}

