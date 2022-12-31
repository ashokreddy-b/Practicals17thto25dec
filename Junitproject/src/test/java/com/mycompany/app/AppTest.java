package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = App.add(2, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }   
    @Test
    public void add_FourPlusTwo_ReturnsFour() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = App.add(4, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }   
    @Test
    public void multiply_FourTimesTwo_ReturnsEight() {
      // Arrange
      final int expected = 8;
  
      // Act
      final int actual = App.multiply(4, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiply_EightTimesTwo_ReturnsEight() {
      // Arrange
      final int expected = 16;
  
      // Act
      final int actual = App.multiply(8, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }
    @Test    
    public void multiply_FiftyTimesTwo_ReturnsOneHundred() 
    {      
        // Arrange      
        final int expected = 100;        
        // Act      
        final int actual = App.multiply(50, 2);        
        // Assert      
        Assert.assertEquals(actual, expected);    
    }
    @Test    
    public void multiply_sixtyTimesTwo_ReturnsOneHundred() 
    {      
        // Arrange      
        final int expected = 120;        
        // Act      
        final int actual = App.multiply(60, 2);        
        // Assert      
        Assert.assertEquals(actual, expected);    
    }

    @Test
    public void divide_TenDividedTwo_ReturnsFive() {
      // Arrange
      final int expected = 5;
  
      // Act
      final int actual = App.divide(10, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }   
    @Test
    public void divide_TwentyDividedTwo_ReturnsFive() {
      // Arrange
      final int expected = 10;
  
      // Act
      final int actual = App.divide(20, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }          
}