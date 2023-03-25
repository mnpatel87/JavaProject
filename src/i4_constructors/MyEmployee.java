package i4_constructors;

public class MyEmployee {
    private String name;
    private int id;
    private int oldId;
    public MyEmployee() {
    name = "Mehul Patel"; //default constructor - Value is assigned or kept null
    id = 99;
    oldId = 95;
    }

    public static void main(String[] args) {
        MyEmployee details = new MyEmployee();
        System.out.println(details.name);
        System.out.println(details.id);
        System.out.println(details.oldId);
    }


    }