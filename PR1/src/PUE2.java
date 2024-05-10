import java.util.*;

public class PUE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int zahl = scanner.nextInt();
        int zahl2 = zahl;

        while (zahl > 1) {
            for (int test = zahl; test > 1; test--) {
                if (zahl % 2 != 0)
                    if (zahl % 3 != 0)
                        if (zahl % 5 != 0)
                            if (zahl % 7 != 0)
                                System.out.println(zahl);
                zahl--;
            }

        }
        if (zahl2 > 7) {
            System.out.println(7);
            System.out.println(5);
            System.out.println(3);
            System.out.println(2);
        }
    }
}
