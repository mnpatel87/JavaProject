package d_variablesObjects04022023;
//State
public class Car {
    static String colour = "white";
    static int height = 250;
    static int wheelDiameter = 80;
    static boolean motPass = true;
    static int door = 5;

    //Behaviour
    public static void Speeding() {
        System.out.println("Car is running above 60mph");}

    public static void main(String[] args){
        System.out.println(colour);
        System.out.println(height);
        System.out.println(wheelDiameter);
        System.out.println(motPass);
        System.out.println(door);
        Speeding();
    }

}