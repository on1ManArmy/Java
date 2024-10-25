public class Basics {
    public static void main(String[] args) {
        boolean a = true;
        if (a) {
            System.out.println(("Hellow world"));
        }

        // when end is not known
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // when end is known
        for (int cnt = 1; cnt < 5; cnt++) {
            System.out.println(cnt);
        }
    }
}
