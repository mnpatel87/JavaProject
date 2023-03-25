package h_arrays04032023;

public class NarrowingArray {
    public static void main(String[] args) {
        double m = 299.2354;
        float f = (float) m;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;

        System.out.println(m);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
    }
}
