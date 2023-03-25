package j2_methodOverriding;

public class Birmingham {
    public void workingHours(){
        System.out.println("Tesco Extra");
        System.out.println("24 Hours");
    }

    public static void main(String[] args) {
        Birmingham birmingham = new Birmingham();
        birmingham.workingHours();}
}
