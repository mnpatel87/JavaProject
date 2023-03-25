package e3_nonAccessModifiers;

public class InstanceMethod {

    void countMinutes(){  // How many minutes in a day (24 hours)
        //Static method not needed as we are creating object
        int a = 24; //24hrs in a day
        int b = 60; //60minutes in hour
        int c = a * b; //24*60
        System.out.println(c);}

    public static void main(String[] args) {
        InstanceMethod myObj = new InstanceMethod();
        myObj.countMinutes();
    }
}