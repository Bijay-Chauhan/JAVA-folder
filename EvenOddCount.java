//Qn. Write a progra to count the even and odd number accept 10 number from command line

// java EvenOddCount 10 23 45 66 78 91 4 8 11 20
// Number of Even numbers = 6
// Number of Odd numbers = 4

// java EvenOddCount 10 3 44 66 78 94 4 8 14
// Please enter exactly 10 numbers


class EvenOddCount {
    public static void main(String args[]) {

        int evenCount = 0;
        int oddCount = 0;

        // Check if 10 numbers are entered
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers");
            return;
        }

        // Convert command line arguments to integers
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of Even numbers = " + evenCount);
        System.out.println("Number of Odd numbers = " + oddCount);
    }
}