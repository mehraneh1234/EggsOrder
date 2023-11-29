
package eggsorder.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity 1
 */
public class EggsOrderTest {
    @Test
    public void testCalculateTotalAmount(){
         System.out.println("calculateTotalAmount");
        int i = 29;
        String expResult = "You redered 29 eggs.\n" +
            "That is 2 dozen eggs at $7.25 per dozen and 5 additional eggs at"
                + " $0.75 each for a \n" + "total of $18.25.";
        String result = EggsOrderJava.calculateTotalAmount(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}




