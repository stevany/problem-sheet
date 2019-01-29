 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;




/**
 *
 * @author user
 */
public class EdgeTest {

    @Test
    public void testWithKey() {
        assertTrue(Edge.listWrapper().containsKey("a"));
    }

    @Test
    public void testCompareMap() {
        HashMap<String, Double> hmap = new HashMap<String, Double>();
        hmap.put("a", 1.0);
        hmap.put("b", 2.0);
        hmap.put("c", 3.0);
        assertTrue(hmap.equals(Edge.listWrapper()));
    }

    @Test
    public void testSizeMap() {
        assertTrue(Edge.listWrapper().size() == 3);
    }

    
   
}
