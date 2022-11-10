Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        boolean flag = false;
        for (int i = 0; i < word.length() / 2; i++) {
            char temp1 = word.charAt(i);
            char temp2 = word.charAt(word.length() - i - 1);

            if (temp1 != temp2) {
                flag = true;
            }
        }

        System.out.println(flag ? "No" : "Yes");
