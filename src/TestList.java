import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestList {

	@Test
	void addTest() {
		LinkedList list = new LinkedList();
		//node can be created both with and without data and a reference to next node
		Node node = new Node("A", null);
		//node has to be given to add(), so that a node can be added without data
		list.add(node);
		assertEquals("A", list.toString());
	}
	
	@Test
	void deleteTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		//node and not just data of node has to be given, so that the right node is deleted
		list.delete(node);
		//toString so that we can compare the result String with the String of our List elements
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
		list.delete(node);
		assertEquals("BCD", list.toString());
	}

	@Test
	void reverseEmptyListTest() {
		LinkedList list = new LinkedList();
		list.reverse();
		assertEquals("", list.toString());
	}

	@Test
	void reverseOneNodeTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		list.add(node);
		list.reverse();
		assertEquals("A", list.toString());
	}

	@Test
	void reverseTwoNodesTest() {
		LinkedList list = new LinkedList();
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);
		list.add(node);
		list.add(node2);
		list.reverse();
		assertEquals("BA", list.toString());
	}
	

	@Test 
	void reverseThreeNodesTest() {
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
