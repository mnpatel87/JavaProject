package e3_nonAccessModifiers;

public class StaticMethod {
    public static void printMyAddress() {
        //Static method can be directly called in main method using method name
        System.out.println("Ashridge drive," + " South Oxhey," + " WD19 6TL");
    }

    public static void main(String[] args) {

    System.out.println("program starts.");
    StaticMethod.printMyAddress(); //Static method can be directly
        // called in main method using method name

    System.out.println("program ends.");
    }

}
