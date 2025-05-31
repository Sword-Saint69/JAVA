package Problems;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        System.out.println("Enter the Number to check if Prime or not");
        Scanner mu = new Scanner(System.in);

        int number = mu.nextInt();
        boolean isprime = true;

        if (number <= 1) {
            isprime = false;

        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime){
            System.out.println("The number is prime");

        }else {
            System.out.println("The number is not prime");
        }
    }

    }

