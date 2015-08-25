package clique_algo;
import static org.junit.Assert.*;


import java.util.Vector;

import org.junit.Test;

public class GraphAssertResults {

	@Test
	public void testGraphStringDoubleInt() {
		Graph G= new Graph("test1Small.csv",0.2,5);


	    // assert statements
	    assertEquals("Edges must be 7", 7, G.E());
	 assertEquals("Vertices must be 9", 9, G.V());
	 //assertEquals("Minimal Clique must be 5", 5,G.min());
	   // assertEquals("Threshold must be 0.1", 0.1, G.TH());
		//fail("Not yet implemented");
	}

}
