import org.junit.jupiter.api.Test;

import src.rWhitespace;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class removeWhitespaceTest {
    
    @Test
    public void testNoWhitespace() {
        // Test with no whitespace
        ArrayList<String> result = rWhitespace.removeWhitespace("14586");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("14586");
        assertEquals(expected, result);
    }
    
    @Test
    public void testSingleWhitespace() {
        // Test with one space
        ArrayList<String> result = rWhitespace.removeWhitespace("12 21");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("12");
        expected.add("21");
        assertEquals(expected, result);
    }
    
    @Test
    public void testMultipleWhitespaces() {
        // Test with multiple spaces
        ArrayList<String> result = rWhitespace.removeWhitespace("12   5   21");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("12");
        expected.add("5");
        expected.add("21");
        assertEquals(expected, result);
    }
    
    @Test
    public void testLeadingWhitespace() {
        // Test with leading spaces
        ArrayList<String> result = rWhitespace.removeWhitespace("  8");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("8");
        assertEquals(expected, result);
    }
    
    @Test
    public void testTrailingWhitespace() {
        // Test with trailing spaces
        ArrayList<String> result = rWhitespace.removeWhitespace("21  ");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("21");
        assertEquals(expected, result);
    }
    
    @Test
    public void testOnlyWhitespace() {
        // Test with only whitespace
        ArrayList<String> result = rWhitespace.removeWhitespace("   ");
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    
    @Test
    public void testEmptyString() {
        // Test with empty string
        ArrayList<String> result = rWhitespace.removeWhitespace("");
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    
    @Test
    public void testTabsAndNewlines() {
        // Test with tabs and newlines (if they're considered whitespace)
        ArrayList<String> result = rWhitespace.removeWhitespace("21\n12\n8");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("21");
        expected.add("12");
        expected.add("8");
        assertEquals(expected, result);
    }
}