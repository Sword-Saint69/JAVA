package Expression_Blocks;

import java.util.Scanner;

public class Arithmetic_operator {
    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);

        int FirstNum = sc.nextInt();

        System.out.print("Enter the second number: ");
        int SecondNum = sc.nextInt();

        System.out.print("The sum is: "+(FirstNum+SecondNum));
        System.out.println();
        System.out.println("The difference is: "+(FirstNum-SecondNum));
        System.out.println("The product is: "+(FirstNum*SecondNum));
        System.out.println("The remainder is: "+(FirstNum%SecondNum));
        System.out.println("The division is: "+(FirstNum/SecondNum));


    }
}
