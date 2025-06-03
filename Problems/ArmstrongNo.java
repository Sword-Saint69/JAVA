package Problems;

public class ArmstrongNo {

    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int n) {
        int nod = countOfDigits(n);
        int on = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, nod);
            n = n / 10;
        }

        return sum == on;
    }

    public static int countOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
