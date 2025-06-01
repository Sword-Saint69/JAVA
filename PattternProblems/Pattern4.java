package PattternProblems;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 7;
        int trows=n;


        int spaces= n-3;
        int stars = 1;


        for (int row =1;row<=trows;row++){

            //stars
            for (int cos=1;cos<=stars;cos++){
                System.out.print(cos;
            }

            System.out.println();
            if (row<=trows/2){
                stars++;
            }else
                stars--;
        }

    }
}

