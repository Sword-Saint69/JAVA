
/*
*******
 *****
  ***
   *
 */

package PattternProblems;

public class Pattern8 {
    public static void main(String[] args) {

        int n=5;

        int trows=n;

        int stars=n;
        int spaces=n-1;

        for (int rows=1;rows<=trows;rows++){

            //spaces
            for (int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst =1 ; cst<=stars;cst++){
                System.out.print("*");
            }

            System.out.println();
            stars-=2;
            spaces++;
        }



    }
}
