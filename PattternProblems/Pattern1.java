package PattternProblems;

public class Pattern1 {
    public static void main(String[] args) {

        int n = 4;

        int trows = n;

        for(int row =1;row <= trows;row++){
            for(int cst=1;cst <=row;cst++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
