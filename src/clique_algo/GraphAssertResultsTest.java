package clique_algo;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class GraphAssertResultsTest {

    @Test
    public void testGraphStringDoubleInt() {
        Graph G= new Graph("testBig.csv");


        // assert statements
        assertEquals("Edges must be 2407", 2407, G.E());
        assertEquals("Vertices must be 1728",1728, G.V());
        //assertEquals("Minimal Clique must be 5", 5,G.min());
        // assertEquals("Threshold must be 0.1", 0.1, G.TH());
        //fail("Not yet implemented");
    }
}
