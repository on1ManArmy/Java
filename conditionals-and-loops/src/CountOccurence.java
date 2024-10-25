import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you wanted to find occurence: ");
        int number = sc.nextInt();

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        int cnt = 0;

        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            if (rem == no) {
                cnt++;
            }
        }

        System.out.println("Number of occurences are: " + cnt);
    }
}
