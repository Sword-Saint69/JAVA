package Problems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner myinput = new Scanner(System.in);

        int number = myinput.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
