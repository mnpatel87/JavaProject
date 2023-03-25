package h_arrays04032023;

public class MaxMinNumberArray {
    public static void main(String[] args) {
        int[] balance = {21,29,35,-29,29,102,55,91,11,0,58,78};
                int max = balance[0];
                int min = balance[0];

                for(int i = 1; i<balance.length; i++){
                    if(balance[i]>max){
                        max = balance[i];
                    }
                    else if(balance[i]<min){
                        min = balance[i];
                    }
                }
        System.out.println("Highest credit card balance is " + max + " 😀😀😀");
        System.out.println("Lowest credit card balance is " + min + " 😥😥😥");
    }
}