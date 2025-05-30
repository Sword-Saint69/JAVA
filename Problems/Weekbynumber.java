package Problems;

import java.util.Scanner;

public class Weekbynumber {
    public static void main(String[] args) {
        System.out.print("Enter the day number: ");
        Scanner my = new Scanner(System.in);

        int num = my.nextInt();

        switch (num){
            case 1 :
                System.out.print("Monday");
                break;
            case 2 :
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print("Wednesday");
                break;
            case 4 :
                System.out.print("Thursday");
                break;
            case 5 :
                System.out.print("Friday");
                break;
            case 6 :
                System.out.print("Saturday");
                break;
            case 7 :
                System.out.print("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
