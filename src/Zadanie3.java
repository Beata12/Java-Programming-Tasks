import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int h = a.length();

        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {

            if (a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            System.out.println("Wyraz nie jest palindromem");
        else {
            System.out.println("Wyraz jest palindromem");
        }

    }
}