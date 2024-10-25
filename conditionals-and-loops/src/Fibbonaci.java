import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the indexed number: ");
        int no = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= no) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("Nth fibbonaci number is: " + b);

    }
}
