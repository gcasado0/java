class WhileDemo {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        System.out.println("Count is: " + count);

        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }

        System.out.println("For example");
        
        int[] numbers = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 1010 };
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

    }
}