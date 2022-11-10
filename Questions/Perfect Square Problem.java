// print numbers from a to b that are perfect square and odd. And stop the loop when we hit the 1st odd perfect square.
// if a = 5 and b = 20, then output should 5 6 7 8 9, because 9 is the 1st odd perfect square.

public static void main(String[] args) {

        int a = 5;
        int b = 20;

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 != 0) {
                // odd
                if (Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0) {
                    System.exit(0);
                }
            }
        }

    }
