package Expression_Blocks;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("you are a subscriber");

        boolean subscription = input.nextBoolean();
        if (subscription == true) {
            System.out.println("You are subscribed to the condition");
        } else {
            System.out.println("You are not subscribed to the condition");
        }

        System.out.println("Enter your Mark");
        int mark = input.nextInt();

        if (mark > 90) {
            System.out.println("You have grade A");
        } else if (mark > 90) {
            System.out.println("You have grade B");
        } else if (mark > 80) {
            System.out.println("You have grade C");
        } else if (mark > 70) {
            System.out.println("You have grade D");
        } else if (mark > 60) {
            System.out.println("You have grade E");
        } else if (mark > 50) {
            System.out.println("You have grade F");
        } else {
            System.out.println("You failed");

        }
    }
}
