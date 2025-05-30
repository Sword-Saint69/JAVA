package Expression_Blocks;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        System.out.print("Enter the Number: ");
        Scanner SC = new Scanner(System.in);
        int number = SC.nextInt();

        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
//If break is not given then whenever a succesful statement is found it will print all remaining statement
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            case 10:
                System.out.println("The number is 10");
                break;
            default:
                System.out.println("Invalid Number");

                break;

        }
    }
}
