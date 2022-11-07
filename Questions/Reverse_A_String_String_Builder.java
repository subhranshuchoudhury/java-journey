
public class Hello {

    // Reverse a String.

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("THE NUN");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front_index = i;
            int back_index = sb.length() - 1 - i;

            char frontChar = sb.charAt(front_index);
            char backChar = sb.charAt(back_index);

            // swap

            sb.setCharAt(back_index, frontChar);
            sb.setCharAt(front_index, backChar);

        }

        System.out.println("Reversed String: " + sb);

    }
}
