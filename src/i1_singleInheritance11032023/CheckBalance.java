package i1_singleInheritance11032023;

public class CheckBalance extends Balance {

    public static void main(String[] args) {
        CheckBalance checkBalance = new CheckBalance();

        System.out.print("Current Balance of my Halifax account is ");
        checkBalance.balanceHalifax();
        System.out.print("Current Balance of my Metro account is ");
        checkBalance.balanceMetro();
        System.out.print("Current Balance of my Santander account is ");
        checkBalance.balanceSantander();}
}
