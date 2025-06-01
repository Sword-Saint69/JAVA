package Problems;

public class SwapNumbers {

    public static void main(String[] args) {

        int one = 12;
        int two = 24;

        Swap(one,two);
    }

    public static void Swap(int num1,int num2){

        System.out.println("Numbers Before Swapping are "+num1+" and "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println();

        System.out.println("Numbers After Swapping are "+num1+" and "+num2);


    }
}
