package j3_multipleInheritance_Interface;

public class A3_Student extends A1_Study implements A2_Sports_Interface {
    String name = "Mehul Patel";
    int rollno = 19;
    void showStudentdetails(){
    System.out.println("Name : " + name + " 😃😃😃");
    System.out.println("Roll no : " + rollno + " 🏫🏫🏫");
    showMarks();
    showSports();
    } //Can be called and Sout out
    public void showSports() {
    //showSports methods needs to be implemented here else error
    System.out.println("Sports : " + sports);}

    public static void main(String[] args) {
    A3_Student s = new A3_Student();
    s.showStudentdetails();}
}