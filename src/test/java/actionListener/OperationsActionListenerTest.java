/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListener;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Simon
 */
public class OperationsActionListenerTest {
    
    public OperationsActionListenerTest() {
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
     * Test of operationEnter method, of class OperationsActionListener.
     */
    @Test
    //Test bouton enter (OperationEnter()) qui prend en charge les opérations
    //  suivant les opérandes et l'opérateur passés en paramètre
    //  Cette méthode est censé retourner le résultat, on va la tester avec la méthode ci-dessous
    
    //Pour chaque opérateur, on teste 
    public void testOperationEnter() {
        System.out.println("operationEnter");
        //Tests addition
        assertEquals(20, OperationsActionListener.operationEnter("8", "12", "+"), "8 + 12 must be 20");
        assertEquals(-4, OperationsActionListener.operationEnter("8", "-12", "+"), "8 + -12 must be -4");
        assertEquals(-3, OperationsActionListener.operationEnter("-2", "-1", "+"), "-2 + -1 must be -3");
        assertNotEquals(4, OperationsActionListener.operationEnter("1", "2", "+"), "1 + 2 must not be 4");
        
        
        //Tests soustraction
        assertEquals(-4, OperationsActionListener.operationEnter("8", "12", "-"), "8 - 12 must be -4");
        assertEquals(20, OperationsActionListener.operationEnter("8", "-12", "-"), "8 - -12 must be 20");
        assertEquals(-1, OperationsActionListener.operationEnter("-2", "-1", "-"), "-2 - -1 must be -1");
        assertNotEquals(4, OperationsActionListener.operationEnter("1", "2", "-"), "1 - 2 must not be 4");
        
        //Tests multiplication
        assertEquals(6, OperationsActionListener.operationEnter("3", "2", "*"), "3 * 2 must be 6");
        assertEquals(-8, OperationsActionListener.operationEnter("4", "-2", "*"), "4 * -2 must be -8");
        assertEquals(2, OperationsActionListener.operationEnter("-2", "-1", "*"), "-2 * -1 must be 2");
        assertNotEquals(4, OperationsActionListener.operationEnter("1", "2", "*"), "1 * 2 must not be 4");
        
        //Tests division
        assertEquals(5, OperationsActionListener.operationEnter("10", "2", "/"), "10 / 2 must be 5");
        assertEquals(2.5, OperationsActionListener.operationEnter("5", "2", "/"), "5 / 2 must be 2.5");
        assertEquals(-3, OperationsActionListener.operationEnter("-9", "3", "/"), "-9 / 3 must be -3");
        assertNotEquals(4, OperationsActionListener.operationEnter("1", "2", "/"), "1 / 2 must not be 4");
        
        
        //Tests modulo
        assertEquals(2, OperationsActionListener.operationEnter("10", "4", "%"), "10 % 4 must be 2");
        assertEquals(0, OperationsActionListener.operationEnter("20", "10", "%"), "20 % 10 must be 0");
        assertEquals(-2, OperationsActionListener.operationEnter("-2", "4", "%"), "-2 % 4 must be -2");
        assertNotEquals(3, OperationsActionListener.operationEnter("11", "7", "%"), "11 % 7 must not be 3");
        
    } 
}
