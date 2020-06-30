import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestList {

	@Test
	void addTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		assertEquals("A", list.toString());
	}
	
	@Test
	void deleteTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		list.delete(node);
		assertEquals("", list.toString());
	}
	
	@Test 
	void reverseTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		Node node2 = new Node("A", null);
	}

}
