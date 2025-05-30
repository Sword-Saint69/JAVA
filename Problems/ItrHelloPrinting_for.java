package Problems;

import java.util.Scanner;
public class ItrHelloPrinting_for {
    public static void main(String[] args) {
        System.out.print("Enter The Number of Times Hello should be Printed: ");

        Scanner my = new Scanner(System.in);
        int n = my.nextInt();

        for (int i=0;i<=n;i++){
            System.out.println(i+" Hello");
        }

    }
}
