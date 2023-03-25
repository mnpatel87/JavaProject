package c_typesOfData28012023;

public class DeclarationAssigningCommentConcatenation {
    public static void main(String[] args) {
        boolean javaClass = true;
        char houseNumber = 25;
        byte streetNumber = 25;
        short billAmount = 5252;
        int cashPayment = 3252;
        long cardPayment = 2000L;
        float saving = 52.50F;
        double temperatureInTesco = 37.5D;
        float T = (40+(6-5)+(5*5)/(3*5F));

        System.out.println(javaClass);
        System.out.println("House Number:"+houseNumber);
        System.out.println("My Street Number Is"+streetNumber);
        System.out.println("I Have Paid A Bill Amount Of"+" "+billAmount);
        System.out.println("Cash Amount Paid By Me Is="+cashPayment);
        // Concatenation
        System.out.println("I have Paid through card Around"+"="+cardPayment);
        System.out.println("My Total Saving with Clubcard is"+" "+"-"+" "+saving);
        // Have used multiple concatenation - Added comments oo
        System.out.println("Current Temperature in Tesco is"+"="+temperatureInTesco);
        System.out.println(T);
        //BODMAS calculation
     }
}
