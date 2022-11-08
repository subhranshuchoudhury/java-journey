

public class Hello {

    public static void main(String[] args) {

        int n = 5;
        int pos = 2;

        int bitMask = 1 << pos;
        bitMask = ~(bitMask);

        System.out.println("New Number:" + (bitMask & n));
    }
}
