import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] arg){

        System.out.println("Podaj wyrażenie matematyczne w celu sprawdzenia poprawności podania nawiasów");
        Scanner scanner = new Scanner(System.in);
        StringBuffer wyrażenie = new StringBuffer(scanner.nextLine());

        int a = 0;
        int b = 0;
        char character;
        char nawias1 = '(';
        char nawias2 = ')';

        for(int i = 0; i < wyrażenie.length(); i++){
            character = wyrażenie.charAt(i);
            if (character == nawias1) {
                a++;
            }
            if (character == nawias2) {
                b++;
            }
        }

        if (a == b) {
            System.out.println("Dobrze podane nawiasy.");
        }
        else {
            System.out.println("Błędnie podane nawiasy.");
        }
    }
}
