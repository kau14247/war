/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cardgamewar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ravee
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName good");
        Player instance = new Player("Alice");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result, "Name should match");
    }
    @Test
    public void testGetNameBad() {
        System.out.println("getName bad");
        Player instance = new Player("Alice");
        String expResult = "123";
        String result = instance.getName();
        assertEquals(expResult, result, "Name should match");
        
    }
@Test
    public void testGetNameBoundary() {
        System.out.println("getName boundary");
        Player instance = new Player("Alice");
        String expResult = " ";
        String result = instance.getName();
        assertEquals(expResult, result, "Name should match");
    }
    

   
    @Test
    public void testIncrementScoreGood() {
        System.out.println("incrementScore good");
        Player instance = new Player("Alice");
        instance.incrementScore();
        assertEquals(1, instance.getScore(), "Score should be incremented by 1");
    }

    @Test
    public void testIncrementScoreBoundary() {
        System.out.println("incrementScore boundary");
        Player instance = new Player("Bob");
         // Set score to a specific value
        instance.incrementScore();
        assertEquals(21, instance.getScore(), "Score should be at maximum boundary");
    }

    @Test
    public void testIncrementScoreBad() {
        System.out.println("incrementScore bad");
        Player instance = new Player("Charlie");
        // Set score to just before overflow
        instance.incrementScore();
        assertEquals(Integer.MAX_VALUE, instance.getScore(), "Score should not exceed maximum value");
        
        // Now try to increment beyond the limit, it should not throw an exception but remain at the maximum value
        instance.incrementScore();
        assertEquals(Integer.MAX_VALUE, instance.getScore(), "Score should not exceed maximum value");
    }

    // ... other tests ...

}





   
   
    
    

