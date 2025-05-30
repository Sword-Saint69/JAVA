package Problems;

import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the N number to find sum of natural Number");

        Scanner my = new Scanner(System.in);
        int n = my.nextInt();

        int sum = 0;
        for (int i=1;i<=n;i++){
            sum += i;

        }
        System.out.println(sum);
    }
}
