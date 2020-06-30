import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestList {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void addTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		assertEquals("A", list.toString());
	}
	
	

}
