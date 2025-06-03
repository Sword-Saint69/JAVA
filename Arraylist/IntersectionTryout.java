package Arraylist;

import java.util.ArrayList;

public class IntersectionTryout {

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 20, 25};
        int[] arr1 = {9, 12, 14, 15};

        System.out.println("Intersection of Arrays are :");
        System.out.println(intersection(arr, arr1));

    }

        public static ArrayList<Integer>  intersection(int [] arr,int[] arr1){

            ArrayList<Integer> ans = new ArrayList<>();

            int i=0;
            int j=0;

            while(i < arr.length && j < arr1.length){

                if (arr[i]<arr1[j]){
                    i++;
                } else if (arr[i]>arr1[j]) {
                    j++;

                }else {
                    ans.add(arr[i]);
                    i++;
                    j++;
                }
            }
            return ans;
        }





}
