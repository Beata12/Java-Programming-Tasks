import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] arg){

        System.out.println("Podaj ciąg znaków");
        Scanner scanner = new Scanner(System.in);
        StringBuffer zdanie = new StringBuffer(scanner.nextLine());

        int count = 0;
        char lastChar;
        char findA = 'a';

        for(int i = 0; i < zdanie.length() ; i++) {
            lastChar = zdanie.charAt(i);
            if(lastChar == findA) {
                count++;
            }
        }
        System.out.println("W twoim ciągu znaków było " + count + " litery a.");
    }
}