package Problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the n number of Fibonacci number to be printed");
        Scanner mu = new Scanner(System.in);

        int n = mu.nextInt();
        int fib1 = 0;
        int fib2 = 1;

        int count = 1;

        while (count <= n){
            System.out.println(fib1);

            int sum = fib1+fib2;
            fib1 = fib2;
            fib2 = sum;
            count = count +1;

        }


    }
}
