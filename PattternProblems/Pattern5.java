package PattternProblems;

public class Pattern5 {
    public static void main(String[] args) {

        int n = 7;
        int trows = n;

        int spaces = n/2;
        int stars = 1;

        for (int row = 1 ;row<=trows;row++){
            for (int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
            for (int cst = 1;cst<=stars;cst++){
                System.out.print("*");
            }
            System.out.println();
            if (row <=trows/2){
                spaces--;
                stars +=2;

            }else{
                spaces++;
                stars -=2;
            }
        }
    }
}
