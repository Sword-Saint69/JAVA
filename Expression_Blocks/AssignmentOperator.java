package Expression_Blocks;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {

        System.out.println("Assignment Operator");
        System.out.println("____________________");

        System.out.println("Enter the first number");
        int firstNum;
        Scanner scan = new Scanner(System.in);
        firstNum = scan.nextInt();
        int a;
        a = firstNum;

        System.out.println("Enter the second number");
        int secondNum;
        Scanner scan2 = new Scanner(System.in);
        secondNum = scan2.nextInt();
        int b;
        b = secondNum;

        b += a;
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + b);

        b -= a;
        System.out.println("The difference of " + firstNum + " and " + secondNum + " is " + b);

        b /= a;
        System.out.println("The product of " + firstNum + " and " + secondNum + " is " + b);

        b %= a;
        System.out.println("The remainder of " + firstNum + " and " + secondNum + " is " + b);


    }
}
