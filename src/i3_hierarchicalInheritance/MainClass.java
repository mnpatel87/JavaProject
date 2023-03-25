package i3_hierarchicalInheritance;

public class MainClass {

    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();

        obj1.showA();
        obj1.showB();

        obj2.showA();
        obj2.showC();
    }
}
