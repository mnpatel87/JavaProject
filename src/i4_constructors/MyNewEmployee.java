package i4_constructors;

public class MyNewEmployee {
    String name;
    int id;

    MyNewEmployee(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public static void main(String[] args) {
        MyNewEmployee details = new MyNewEmployee("Mehul",99);
        //User defined or Parameterized Constructors
        System.out.println(details.name);
        System.out.println(details.id);
    }
}