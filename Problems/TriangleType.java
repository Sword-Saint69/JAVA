package Problems;

import java.util.Scanner;
public class TriangleType {

    System.out.print("Enter the sides of triangle: ")
    Scanner my = new Scanner(System.in);

    int side1 = my.nextInt();
    int side2 = my.nextInt();
    int side3 = my.nextInt();

    if (side1 > 0 && side2 > 0 && side3 > 0){
        if(side1 == side2 == side3){
            System.out.print("The triangle is a Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.print("This is a isoscles triangle");
        }
        else {
            System.out.print("The triangle is Scaline");
        }
    }else{
        System.out.print("The triangle is invalid")
    }

}
