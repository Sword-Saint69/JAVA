package PattternProblems;

public class Pattern7 {
    public static void main(String[] args) {

        int n= 7;

        int trows = n;
        int stars =1;
        int spaces = n-2 ;
        for (int row =1;row<=trows;row++){

            //stars
            for (int cst = 1;cst<=stars;cst++){
                System.out.print("*");

            }
            //spaces
            for (int csp =1;csp<=spaces;csp++){
                System.out.print(" ");

            }
            //stars
            for (int cst = 1;cst<=stars;cst++) {
                System.out.print("*");
            }
            System.out.println();
            if (row<=trows/2){

                stars++;
                spaces-=2;

            }else{
                stars--;
                spaces+=2;
            }
        }
    }
}
