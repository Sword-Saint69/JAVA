package FunctionConcept;

public class MethodOverloading {

    public static String formatnumber (int value){
        return String.format("%d",value);
    }
    public static String formatnumber (double value){
        return String.format("%.3f",value);
    }
    public static String formatnumber (String value){
        return String.format("%.2f",Double.parseDouble(value));
    }
    public static void main(String [] args){
        System.out.println(formatnumber("90"));
        System.out.println(formatnumber(90.2));
        System.out.println(formatnumber("89"));
        System.out.println(formatnumber(90));
    }


}
