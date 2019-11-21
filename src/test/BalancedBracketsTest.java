package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_Class = new BalancedBrackets();
    //TODO: add tests here
    @Test
    public void onlyBrackets() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyString() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }
    @Test
    public void stringNoBrackets() {
        assertTrue(test_Class.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void emptyBracketsBeforeString() {
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketsWrappingString() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsPartOfString() {
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void twoPairsOfBrackets() {
        assertTrue(test_Class.hasBalancedBrackets("[Launch][Code]"));
    }
    //assertFalse
    @Test
    public void emptyBracketFlipOrder() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }
    @Test
    public void singleLeftBracket() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }
    @Test
    public void singleRightBracket() {
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }
    @Test
    public void stringLeftBracket() {
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void stringRightBracket() {
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void partOfStringFlipBrackets() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void flipBracketsWrappingString() {
        assertFalse(test_Class.hasBalancedBrackets("]LaunchCode["));
    }

}
