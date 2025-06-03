package Arraylist;

import java.util.ArrayList;

public class Sumof2Array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 2, 3, 4, 6};
        int[] arr1 = {12, 32, 12, 3, 45, 6, 3};

        System.out.println(Arraysum(arr, arr1));
    }

    public static ArrayList<Integer> Arraysum(int[] arr, int[] arr1) {

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 0;
        int i = arr.length - 1;
        int j = arr1.length - 1;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0) {
                sum += arr[i];
                i--;
            }

            if (j >= 0) {
                sum += arr1[j];
                j--;
            }

            int rem = sum % 10;
            carry = sum / 10;

            ans.add(0, rem);
        }

        if (carry != 0) {
            ans.add(0, carry);
        }

        return ans;
    }
}
