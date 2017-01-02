

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
 
 
import javaapplication6.ArithmaticClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.rmi.runtime.Log;

/**
 *
 * @author master
 */
public class Arithmatic_Tests {
    
    public Arithmatic_Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void DoMath() {
    
    ArithmaticClass arith = new ArithmaticClass();
    
    int number1 = 5;
    int number2 = 5;
    
    arith.Number1 = number1;
    arith.Number2  = number2;
    arith.AddNumbers();
    
    System.out.println("asdfasdf");
    assertSame((number1 + number2),arith.GetResults());
    
    }
}
