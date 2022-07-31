public class bitwiseAssign {
    public static void main(String[] args) {
        // bitwise compound assignment
        int a = 10;
        int c = 5;

        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>>= 2;
        System.out.println("c >>>= 2 = " + c);
        c &= a;
        System.out.println("c &= a  = " + c);
        c ^= a;
        System.out.println("c ^= a   = " + c);
        c |= a;
        System.out.println("c |= a   = " + c);
    }
}
