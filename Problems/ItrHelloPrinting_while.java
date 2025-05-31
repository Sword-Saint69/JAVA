package Problems;

import java.util.Scanner;

public class ItrHelloPrinting_while {
    public static void main(String[] args) {
        System.out.println("Enter no of times Hello should be printed");

        Scanner mu = new Scanner(System.in);
        int n = mu.nextInt();

        int i=1;
        while (i<=n){
            System.out.println(i+" Hello");
            i++;
        }
    }

}
