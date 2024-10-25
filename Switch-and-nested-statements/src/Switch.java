import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.nextLine();

        // switch (fruit) {
        // case "Mango":
        // System.out.println("Mongo is awesome");
        // break;
        // case "Apple":
        // System.out.println("Mongo is sweet");
        // break;
        // case "Orange":
        // System.out.println("Orange is soury");
        // break;
        // default:
        // break;
        // }

        System.out.print("Enter a number for day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Its monnday");
                break;
            case 2:
                System.out.println("Its tuesday");
                break;
            case 3:
                System.out.println("Its wednesday");
                break;
            case 4:
                System.out.println("Its thrusday");
                break;
            case 5:
                System.out.println("Its friday");
                break;
            case 6:
                System.out.println("Its saturday");
                break;
            case 7:
                System.out.println("Its sunday");
                break;
            default:
                System.out.println("Its alien day");
                break;
        }
    }
}
