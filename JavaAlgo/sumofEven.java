

class sumofEven {

    public static void main(String[] args) {

        int j = 0;
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                j = j + i;

            }

        }
        System.out.println(j);
    }
}