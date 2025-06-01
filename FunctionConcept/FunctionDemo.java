package FunctionConcept;

public class FunctionDemo {
    public static void main(String[] args) {


        System.out.println("Lets get started");
        //calling a function
        SayHello();
        System.out.println("See you soon");
        addnumbers(12,24);


        //calling function2
        int res = addnumbers2(23,13);
        System.out.println(res);


        //calling function3

        int num1 = 3;
        int num2 = 4;

        int res2 = addnumbers3(num1,num2);
        System.out.println(res2);
    }

    /// making a function
    public static void SayHello() {
        System.out.println("Hello Everyone");
        System.out.println("Hope you are having a good Day");
    }

    //adding two numbers with function

    public static void addnumbers(int val1, int val2) {

        int sum = val1 + val2;

        System.out.println("The sum of " + val1 + " and " + val2 + " is " + sum);

    }

    //adding  with another fuction
    public static int addnumbers2(int val3,int val4){

        int sum1 =val3+val4;
        return sum1;

    }

    public static int addnumbers3(int val5,int val6){

        int sum = val5+val6;
        return sum;

    }
}
