class GfG3 {
    public int powMod(int x, int n, int M) {
        int res = 1;

        // Loop until exponent becomes 0
        while (n >= 1) {

            // n is odd, multiply result by current x and take modulo
            if ((n & 1) == 1) {
                res = (res * x) % M;
System.out.println("res" + res);
                // Decrease n to make it even
                n--;
            } else {

                // n is even, square the base and halve the exponent
                x = (x * x) % M;
                n /= 2;
                System.out.println("n" + n);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int x = 4, n = 3, M = 5;
        GfG3 obj = new GfG3();
        System.out.println(obj.powMod(x, n, M));
    }
}