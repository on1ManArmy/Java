import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you wanted to reverse: ");
        int number = sc.nextInt();

        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            ans = ans * 10 + rem;
        }

        System.out.println("Reverse number is: " + ans);
    }
}