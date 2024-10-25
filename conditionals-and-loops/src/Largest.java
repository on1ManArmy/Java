import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // int mx = num1;
        // if (num2 > mx) {
        // mx = num2;
        // }

        // if (num3 > mx) {
        // mx = num3;
        // }

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Maximum value is: " + max);
    }
}
