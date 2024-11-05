public class bitmanupilation {

    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setbit(int n, int i) {
        int bitmak = 1 << i;
        return n | bitmak;
    }

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int countsebit(int n) {
        int c = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                c++;
            }
            n = n >> 1;
        }
        return c;
    }

    public static long fastExpo(int a, int n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
 public static void UppercaeToLowercase(){
    for(char ch='A';ch<='Z';ch++){
        System.out.print((char)(ch | ' ')+" ");
    }
 }



    public static void main(String[] args) {
        UppercaeToLowercase();
        // int a = 5;
        // int n = 100;
        // System.out.println(fastExpo(a, n));
        // int x = 6;
        // System.out
        //         .println( x+" + "+1+" is "+ -~x);
                              
    }
}
