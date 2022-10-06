//Prime Number Program

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //0 & 1 are not prime numbers & 2 is even prime number.
        if (n == 0 || n == 1) {
            System.out.println("Given is not Prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("Given is not Prime number");
                } else {
                    System.out.println("Given is Prime number");
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Given is Prime number");
            }
        }
    }
}
