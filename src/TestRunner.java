import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class TestRunner {
    private Logic logicTest;

    @Before
    public void setUpTest() { // sätter upp scannern för att kunna testa utan användarens inmatning av data
        logicTest = new Logic(new Scanner(System.in));
    } // skapar en scanner i test som inte innehåller
    // någon inmatning men tar ändå från setters och getters

    @Test
    public void testSetCountWords() { // testar att antalet setCountWords räknar rätt
        logicTest.setCountWords();
        assertEquals(-1, logicTest.getCountWords()); // returnerar -1 eftersom return i countWords är -1 för att
        // räkna bort ordet "stop"
    }

    @Test
    public void testSetCountRows() { // testar så att setCountRows räknar rätt
        logicTest.setCountRows();
        assertEquals(0, logicTest.getCountRows());
    }

    @Test
    public void testSetCountChars() { // testar setCountChars
        logicTest.setCountChars();
        assertEquals(1, logicTest.getCountChars()); // returnerar 0 ifall jag ändrar original string till ""
        // istället för " ".
    }
}
