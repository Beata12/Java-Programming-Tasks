import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz.");

        Scanner scanner = new Scanner(System.in);
        StringBuffer zdanie = new StringBuffer(scanner.nextLine());

        System.out.println("Twój odwrócony wyraz to: " + zdanie.reverse());

    }
}
