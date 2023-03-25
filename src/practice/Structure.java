package practice;

public class Structure {
    int a = 8; //Instance/Global variable - all 4
    static int a1 = 77;
    boolean b = 3>5;
    String drive = "Driving";
    public static void car(){ //method created - Sout (Add printout) & bracket complete
      System.out.println("I am driving a car");
      //Inverted comma for method data mandatory
    }
    public static void main (String[] args){ //main class has own bracket
    //System.out.println(a); - As a is not static, it cannot be Sout
        System.out.println(a1);
        System.out.println("a1"); //Inverted comma make it as statement to sout
        Structure.car(); //Method called without object as it is static.
        //If not static, needs object creation for calling

        Structure driving = new Structure();
        { //Object with { or without { is fine
            System.out.println(driving.a); //Without inverted comma,
            // if "" added it will print as statement
            System.out.println(driving.b);
            System.out.println(driving.drive);
            driving.car();
            System.out.println(driving.a1);//Can be access directly as it is static
            // & also via object
        }  //Object bracket closed
    }        //main class bracket closed
}           // public class bracket closed
