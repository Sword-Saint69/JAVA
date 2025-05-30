package Problems;

import java.util.Scanner;

public class PossibleTriangle {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);

        System.out.print("Enter the first angle");
        int Angle1 = myinput.nextInt();

        System.out.print("Enter the first angle");
        int Angle2 = myinput.nextInt();

        System.out.print("Enter the first angle");
        int Angle3 = myinput.nextInt();

        int Angleout = (Angle1+Angle2+Angle3);


        if (Angle1 > 0  && Angle2 > 0 && Angle3 > 0) {
            if (Angleout == 180) {
                System.out.print("The Triangle is Possible");

            } else {
                System.out.print("The triangle is not possible");
            }
        }
        else{
                System.out.print("One of the angle is 0 or Less than 0");
            }
        }


    }

