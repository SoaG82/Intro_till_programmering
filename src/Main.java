import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner för indata

        Logic logic = new Logic(scanner);
        logic.counter(); // kallar på count metoden i Logic klassen
        // kallar på setters
        logic.setCountWords();
        logic.setCountRows();
        logic.setCountChars();
        logic.setLongestWord();



        // skriver ut getters
        System.out.println("Antal bokstäver är: " + logic.getCountChars()); // skriver ut antal bokstäver från räknaren
        System.out.println("Antal ord är: " + logic.getCountWords()); // skriver ut antal ord från räknaren
        // -ordet stop
        System.out.println("Antal rader är: " + logic.getCountRows()); // skriver ut antal rader från räknaren
        // -raden för stop
        System.out.println("Det längsta ordet är: " + "'"+ logic.getLongestWord() + "'");
        // skriver ut det längsta ordet
    }
}
