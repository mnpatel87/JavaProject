package d_variablesObjects04022023;
class Mobile {
    int price1 = 999;
    int price2 = 799;
    int weight = 184;
    String model = "X200";
    public void Charging(){
        System.out.println("My Phone charges in 20 minutes");}
    public void resolution(){
        System.out.println("Resolution is 2000 * 1820");}
    public static void main(String[] args) {
        Mobile myMobileObject = new Mobile();
        System.out.println(myMobileObject.price1);
        System.out.println(myMobileObject.price1 - myMobileObject.price2);
        //Using Arithmetic Operator
        System.out.println(myMobileObject.price1 <= myMobileObject.price2);
        //Using Comparison Operator
        System.out.println(!(myMobileObject.price1 <= myMobileObject.price2));
        //Using Logical and Comparison Operator Simultaneously
        System.out.println(myMobileObject.price1 != myMobileObject.price2);
        System.out.println(myMobileObject.weight);
        System.out.println(myMobileObject.model);
        myMobileObject.Charging();
        myMobileObject.resolution();
    }
}
