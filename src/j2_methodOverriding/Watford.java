package j2_methodOverriding;

public class Watford extends Birmingham {
    public void workingHours() {
        System.out.println("Tesco Express");
        System.out.println("10am to 8pm");
    }

    public static void main(String[] args) {
        Watford watford = new Watford();
        watford.workingHours();
    }
}
