package Problems;

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args){

        System.out.print("Enter Three Numbers");
        Scanner My = new Scanner(System.in);
        int a = My.nextInt();
        int b = My.nextInt();
        int c = My.nextInt();

        if (a >= b && a >= c){
            System.out.print("A is greatest number");
        }else if ( b >= a && b >= c) {
            System.out.print("B is greatest numbber ");
        }else if (c >= a && c >= b) {
            System.out.print("C is greatest number");
        }else{
            System.out.println();
        }
    }
}
