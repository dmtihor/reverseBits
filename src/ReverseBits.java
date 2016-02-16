public class ReverseBits {
    public int reverse(int input) {

        int temp = 0;

        for (int i = 0; i < 32; i++) {
            temp <<= 1;
            temp |= (input & 1);
            input >>>= 1;
        }
        return temp;
    }
}