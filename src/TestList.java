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
	void deleteMoreTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		Node node1 = new Node("B", null);
		list.add(node);
		Node node2 = new Node("C", null);
		list.add(node);
		Node node3 = new Node("D", null);
		list.add(node);
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.delete(node2);
		assertEquals("ABD", list.toString());
	}
	
	@Test 
	void reverseTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);
		Node node3 = new Node("C", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.reverse();
		assertEquals("CBA", list.toString());
	}
	
	@Test
	void firstTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);
		Node node3 = new Node("C", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		Object data = list.first();
		assertEquals("A", data);
	}
	
	@Test
	void addingMoreTest() {
		
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);

		Node node3 = new Node("C", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		assertEquals("ABC", list.toString());
		
	}

}
