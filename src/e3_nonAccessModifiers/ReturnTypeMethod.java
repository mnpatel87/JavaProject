package e3_nonAccessModifiers;

public class ReturnTypeMethod{

    int sum(int a, int b){

        int c = a+b;
        return c;}

    public static void main(String[] args){

    ReturnTypeMethod mySumObj = new ReturnTypeMethod();
    System.out.println(mySumObj.sum(20, 30));}}