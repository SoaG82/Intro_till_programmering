import java.util.Scanner;

public class Logic {
    private Scanner scanner; // Scannerns namn
    private String input = " "; // initiala värdet för input i det användaren matar in. Mellanslaget gör att den
    // returnerar 1
    // (i brist på annat sätt att förklara det)

    public Logic(Scanner scanner) { // Kallar på scanner (hoppas det är rätt för uppgiften)
        this.scanner = scanner;

    }


    int countRows = 0; // sätter namnet för räkningen av rader och vad den ska börja ifrån
    int countWords = 0; // sätter namnet för räkningen av ord och vad den ska börja ifrån
    int countChars = 0; // sätter namnet för räkningen av bokstäver och vad den ska börja ifrån
    private String longestWord = ""; // sätter en string för att räkna längsta ordet

    public void counter() { // Räknar under loopen
        while (true) {
            System.out.println("Enter a string (or 'stop' to quit):"); // ger användaren instruktioner
            // om vad som ska göras
            input = scanner.nextLine(); // läser indata av vad användaren skriver

            if (input.equalsIgnoreCase("stop")) { // bryter loopen även om man skriver ordet stop
                // på olika sätt
                break; // avslutar loopen
            }
            // Kalla på setters för att räkna under loopen
            setCountWords();
            setCountChars();
            setCountRows();
            setLongestWord();
        }
    }

    public void setCountWords() { // setter för att räkna ord

        String strippedInput = input.strip(); // strip för att plocka bort "whitespace"
        if (!strippedInput.isEmpty()) {
            countWords += strippedInput.split("\\s+").length;
        }
    }


    public int getCountWords() { // returnerar antalet ord till Main class
        return countWords - 1;
    } // returnerar setCountWords men med -1 för att räkna bort ordet "stop".

    public void setCountRows() { // setter för att räkna rader
        countRows += input.split("\n").length; // delar upp raderna och räknar dem

    }

    public int getCountRows() { // returnerar antalet rader till Main class
        return countRows - 1;
    } // returnerar antalet rader -1 för att räkna bort raden för "stop"

    public void setCountChars() { // setter för att räkna bokstäver
        if (!input.equalsIgnoreCase("stop")) { // räknar bort ordet stop
            // likt hur man stoppar while loopen ovanför även om man stavar stop på olika sätt
            countChars += input.length(); // räknar bokstäverna baserat på längden av orden
        }
    }

    public int getCountChars() { // returnerar antalet bokstäver till Main class
        return countChars;
    } // returnerar antalet chars från inmatningarna

    public void setLongestWord() { // räknar längsta ordet
        String[] words = input.split("\\s+"); // delar upp inmatningarna och läser av dem
        for (String word : words) {
            if (word.length() > longestWord.length()) { // räknar vilket ord som är längst
                longestWord = word; // sparar längsta ordet (i brist på hur man ska beskriva det bättre)
            }
        }
    }
    public String getLongestWord() { // returnerar det längsta ordet
        return longestWord;
    }
}