import java.util.Scanner;

class Solution {
    public static boolean isPrime(int num) {
            if (num <= 1) {
                return true;
            }
            
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.print("Please enter a number under 100: ");
            int num = console.nextInt();
            isPrime(num);
        } finally {
            console.close();
        }   
    }   
}