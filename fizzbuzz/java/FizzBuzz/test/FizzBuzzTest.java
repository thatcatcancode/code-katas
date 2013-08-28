/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author l.adams
 */
public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;
    public FizzBuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void passingInOneShouldReturnOne() {
        String result = fizzBuzz.FizzBuzzCalc(1);
        Assert.assertEquals("1", result);
    }
    @Test
    public void passingInTwoSHouldReturnTwo() {
        String result = fizzBuzz.FizzBuzzCalc(2);
        Assert.assertEquals("2", result);
    }
    
    @Test
    public void passingInThreeShouldReturnFizz() 
    {
        String result = fizzBuzz.FizzBuzzCalc(3);
        Assert.assertEquals("Fizz", result);
    }
    
    @Test
    public void passingInSixShouldReturnFizz()
    {
        String result = fizzBuzz.FizzBuzzCalc(6);
        Assert.assertEquals("Fizz", result);
    }
}