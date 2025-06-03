package DSA;

import java.util.Arrays;

public class Runningsum {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,2};

        runningarraay(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] runningarraay(int []arr){
        for (int i = 1;i < arr.length ; i++){

            arr[i] += arr[i - 1];
        }
        return arr;

    }


}
