import java.util.Scanner;

class Solution {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number under 100: ");
        int num = console.nextInt();

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return True;
            }
            
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    return False;
                }
            }
            return True;
        }
    }
}