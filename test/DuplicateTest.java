/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author user
 */
public class DuplicateTest {

    public DuplicateTest() {
    }

    @Test
    public void testWithEmptyString() {
        String[] test = {};
        
        Set<String> output = Duplicate.duplicateWords(test);
        
        assertEquals(Collections.emptySet(), output);
    }

    @Test
    public void testWithAlphaNumeric() {
        String[] test = {"tw2", "one", "two"};
       
        Set<String> output = Duplicate.duplicateWords(test);
        
        assertEquals(Collections.emptySet(), output);
    }

    @Test
    public void testWithDuplicateString() {
        String[] test = {"one", "one", "one", "two", "two"};
        
        Set<String> output = Duplicate.duplicateWords(test);
        
        assertTrue(output.contains("one"));
        assertTrue(output.contains("two"));
        assertTrue(output.size() == 2);
    }

    @Test
    public void testWithOutDuplicates() {
        String[] test = {"one", "two", "three"};
        
        Set<String> output = Duplicate.duplicateWords(test);
        
        assertEquals(Collections.emptySet(), output);
    }

    @Test
    public void testWithMultipleSpaceBetweenWord() {
        
        String[] test = {"one", "two", "three "};
        
        Set<String> output = Duplicate.duplicateWords(test);
    
        assertEquals(Collections.emptySet(), output);
    }
}