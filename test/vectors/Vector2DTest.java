/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Jestem w metodzie setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Jestem w metodzie tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Jestem w metodzie setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("Jestem w metodzie tearDown");
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(2.0, 3.0);
        double expResult = Math.sqrt(2.0*2.0+3.0*3.0);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(2.0, 3.0);
        Vector2D instance = new Vector2D(2.0, 3.0);
        Vector2D expResult = new Vector2D(2.0+2.0,3.0+3.0);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 4.0;
        Vector2D instance = new Vector2D(2.0, 3.0);
        Vector2D expResult = new Vector2D(alpha*2.0,alpha*3.0);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(2.0, 3.0);
        Vector2D instance = new Vector2D(2.0, 3.0);
        double expResult = 4.0 + 9.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2.0, 3.0);
        String expResult = "[2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
     
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(2.0, 3.0);
        Vector2D instance = new Vector2D(2.0, 3.0);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
       
    }
    
}
