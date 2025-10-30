import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList();
    }

    @Test
    void testInsertAndPrint() {
        list.inserirOrdenado(5);
        list.inserirOrdenado(3);
        list.inserirOrdenado(8);

        // Capture output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        list.imprimirCrescente();
        String expectedOutput = "3 5 8 \n";
        assertEquals(expectedOutput, outContent.toString());

        outContent.reset();
        list.imprimirDecrescente();
        expectedOutput = "8 5 3 \n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testRemovePrimos() {
        list.inserirOrdenado(4);
        list.inserirOrdenado(5);
        list.inserirOrdenado(6);
        list.inserirOrdenado(7);

        list.removerPrimos();

        // Capture output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        list.imprimirCrescente();
        String expectedOutput = "4 6 \n";
        assertEquals(expectedOutput, outContent.toString());
    }
}