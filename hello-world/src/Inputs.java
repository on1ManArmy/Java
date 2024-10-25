import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        System.out.println("My roll no is: " + rollno);

        String name = sc.nextLine();
        System.out.println("name: " + name);

        float marks = sc.nextFloat();
        System.out.println("marks: " + marks);
    }
}
