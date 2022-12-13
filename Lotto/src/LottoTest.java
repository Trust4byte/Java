/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author wolfgang
 */
public class LottoTest {
    
    public LottoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddNumber1() {
        Set<Integer> expected = new TreeSet<>();
        expected.add(1);
        expected.add(7);
        expected.add(12);
        expected.add(25);
        expected.add(39);
        expected.add(42);
        
        Tipp tipp = new Tipp();
        tipp.add(1);
        tipp.add(7);
        tipp.add(12);
        tipp.add(25);
        tipp.add(39);
        tipp.add(42);
        
        assertEquals(expected, tipp.getSet());
    }

    @Test
    public void testAddNumber2() {
        Set<Integer> expected = new TreeSet<>();
        expected.add(8);
        expected.add(9);
        expected.add(12);
        expected.add(21);
        expected.add(32);
        expected.add(41);
        
        Tipp tipp = new Tipp();
        tipp.add(8);
        tipp.add(41);
        tipp.add(32);
        tipp.add(21);
        tipp.add(9);
        tipp.add(12);
        tipp.add(32);
        
        assertEquals(expected.size(), tipp.countNumbers());
        assertEquals(expected, tipp.getSet());
    }

    @Test
    public void checkResult1() {
        int expected = 0;
        Set<Integer> drawn = new TreeSet<>();
        drawn.add(8);
        drawn.add(9);
        drawn.add(12);
        drawn.add(21);
        drawn.add(32);
        drawn.add(41);
        
        Tipp tipp = new Tipp();
        tipp.add(7);
        tipp.add(40);
        tipp.add(31);
        tipp.add(20);
        tipp.add(10);
        tipp.add(11);
        
        assertEquals(expected, tipp.calcCorrect(drawn));
    }

    @Test
    public void checkResult2() {
        int expected = 3;
        Set<Integer> drawn = new TreeSet<>();
        drawn.add(8);
        drawn.add(9);
        drawn.add(12);
        drawn.add(21);
        drawn.add(32);
        drawn.add(41);
        
        Tipp tipp = new Tipp();
        tipp.add(8);
        tipp.add(40);
        tipp.add(31);
        tipp.add(20);
        tipp.add(9);
        tipp.add(12);
        
        assertEquals(expected, tipp.calcCorrect(drawn));
    }

    @Test
    public void checkResult3() {
        int expected = 6;
        Set<Integer> drawn = new TreeSet<>();
        drawn.add(8);
        drawn.add(9);
        drawn.add(12);
        drawn.add(21);
        drawn.add(32);
        drawn.add(41);
        
        Tipp tipp = new Tipp();
        tipp.add(8);
        tipp.add(41);
        tipp.add(32);
        tipp.add(21);
        tipp.add(9);
        tipp.add(12);
        
        assertEquals(expected, tipp.calcCorrect(drawn));
    }

}
