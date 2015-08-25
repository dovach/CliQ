package clique_algo;

import static org.junit.Assert.*;

import org.junit.Test;

public class VertexSetTest {

	@Test
	public void intersectiontest() {
		VertexSet V1=new VertexSet();
		V1.add(1);
		V1.add(3);
		V1.add(4);
		V1.add(7);
		VertexSet V2=new VertexSet();
		V2.add(2);
		V2.add(3);
		V2.add(4);
		V2.add(5);
		VertexSet Ans=new VertexSet();
		Ans.add(3);
		Ans.add(4);
		 assertEquals("Common vertices must be 3,4", Ans.toString(), V1.intersection(V2).toString());
	//	fail("Not yet implemented");
	}
	@Test
	public void sizetest() {
		VertexSet V1=new VertexSet();
for (int i = 0; i < 21; i++) {
	V1.add((int)Math.random());
}
assertTrue( V1.size()==21);
	//	fail("Not yet implemented");
	}
}
