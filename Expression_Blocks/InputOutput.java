package Expression_Blocks;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner myinput = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = myinput.nextLine();
        System.out.println("You entered: " + str);

        System.out.println("Enter a number: ");
        int num = myinput.nextInt();
        System.out.println("You entered: " + num);

        System.out.println("Enter a boolean");
        boolean bool = myinput.nextBoolean();
        System.out.println("You entered: " + bool);

        System.out.println("Enter a char:");
        char ch = myinput.next().charAt(0);
        System.out.println("You entered: " + ch);

        System.out.println("Enter a double number: ");
        double num2 = myinput.nextDouble();
        System.out.println("You entered: " + num2);


        System.out.println("Enter a float number: ");
        float num3 = myinput.nextFloat();
        System.out.println("You entered: " + num3);


        System.out.println("Enter a long number: ");
        long num4 = myinput.nextLong();
        System.out.println("You entered: " + num4);

        System.out.println("Enter a short number: ");
        short num5 = myinput.nextShort();
        System.out.println("You entered: " + num5);

        System.out.println("Enter a byte number: ");
        byte num6 = myinput.nextByte();
        System.out.println("You entered: " + num6);

    }
}
