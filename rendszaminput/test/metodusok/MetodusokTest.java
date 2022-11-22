/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user3
 */
public class MetodusokTest {
    
    public MetodusokTest() {
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
     * Test of atlag method, of class Metodusok.
     */
    @Test
    public void testAtlag() {
        System.out.println("atlag");
        int szam1 = 0;
        int szam2 = 0;
        double expResult = 0.0;
        double result = Metodusok.atlag(szam1, szam2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feladat method, of class Metodusok.
     */
    @Test
    public void testFeladat() {
        System.out.println("feladat");
        Metodusok.feladat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tartomany method, of class Metodusok.
     */
    @Test
    public void testTartomany() {
        System.out.println("tartomany");
        int szam3 = 0;
        int szam4 = 0;
        Metodusok.tartomany(szam3, szam4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veletlen method, of class Metodusok.
     */
    @Test
    public void testVeletlen() {
        System.out.println("veletlen");
        int also = 0;
        int felso = 0;
        int expResult = 0;
        int result = Metodusok.veletlen(also, felso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Metodusok.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Metodusok.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
