package Problems;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number to Reverse");

        Scanner mu = new Scanner(System.in);
        int n = mu.nextInt();

        int ans = 0;
        while(n>0){
            int remainder = n%10;
            ans = ans*10+remainder;
            n=n/10;
        }
        System.out.println(ans);
    }
}
