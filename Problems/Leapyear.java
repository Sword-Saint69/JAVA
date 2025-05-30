package Problems;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){

        System.out.print("Enter the Year you want to check if leap year or not: ");
        Scanner myinput = new Scanner(System.in);
        int year = myinput.nextInt();

        if (year%4 == 0 && year%100 !=0 || year%400 == 0){
            System.out.print("This is a Leap Year");
        }else{
            System.out.print("This is not a Leap Year");
        }

    }
}
