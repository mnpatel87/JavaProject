package h_arrays04032023;
public class StringArray {
    public static void main(String[] args) {
        String[] arrSuperMarkets = {"Tesco" , "Sainsbury" , "Asda" , "Morrison" , "Aldi" , "Lidl"};
        //Index                         0           1           2           3       4          5
        //Length                        1           2           3           4       5          6
        int myArrayLength = arrSuperMarkets.length;

        //Print in Reverse using - For Loop
        System.out.println("😀😁😃😄😆😉😊😋🥰");
        System.out.println("List of SuperMarkets");
        System.out.println("🕉️🕉️🕉️🕉️🕉️🕉️🕉️🕉️🕉️");
        for(int i = myArrayLength-1 ; i>=0; i--){
            System.out.println (("        ") + arrSuperMarkets[i]);}

        //Print using - For Loop
        System.out.println();//Print Blank Line
        System.out.println("👸👮‍♀️🎅👲🕵️💂‍♂️🥷👩‍🌾👨‍✈️");
        System.out.println("List of SuperMarkets");
        System.out.println("🍟🍿🧀🥗🥪🎂🍭🍬🍻");
        for(int i = 0; i<myArrayLength; i++){
            System.out.println(("        ") + arrSuperMarkets[i]);}

        //Print using - For Each Loop
        System.out.println();
        System.out.println("🚗🚓🚕🛺🚙🚌🚐🚎🚑");
        System.out.println("List of SuperMarkets");
        System.out.println("\uF04A*\uF04A*\uF04A*\uF04A*\uF04A*\uF04A*\uF04A*\uF04A*\uF04A");
        for (String x:arrSuperMarkets){
            System.out.println("        " + x);}}}


