package Arraylist;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList <String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("Javascript");

        System.out.println(languages);


        String str = languages.get(2);
        System.out.println(str);


        languages.set(1,"GO");


        languages.remove(2);
        System.out.println(languages);
    }
}
