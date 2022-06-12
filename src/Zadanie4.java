import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] arg){

        System.out.println("Podaj wyraz zawierający liczby");
        Scanner scanner = new Scanner(System.in);
        StringBuffer wyrazenie = new StringBuffer(scanner.nextLine());

        int a = 0;
        int b;

        for(int i = 0; i < wyrazenie.length(); i++){
            if (Character.isDigit(wyrazenie.charAt(i))) {
                b = Character.getNumericValue(wyrazenie.charAt(i));
                a = a + b;
            }
        }
        System.out.println("Liczby w Twoim słowie wyniosły: " + a + "!");
    }
}
