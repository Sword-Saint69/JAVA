package Expression_Blocks;

public class LogicalOperator {

    public static void main(String[] args) {
        System.out.println("LogicalOperator");

        int a = 1,b = 2;
        System.out.println((a > b) && (a < b));
        System.out.println((a < b) && (a > b));

        System.out.println((a < b)||(a > b));
        System.out.println((a > b)||(a<b));


    }
}
