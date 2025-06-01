package PattternProblems;

public class Pattern6 {
    public static void main(String[] args) {

        int n = 4;

        // First row: full stars
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        int stars = n - 1;
        int spaces = 1;

        for (int row = 1; row <= n - 1; row++) {
            // Left stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }

            // Right stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            System.out.println();

            stars++;
            spaces += 2;
        }
    }
}
