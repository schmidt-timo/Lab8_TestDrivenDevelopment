
public class LinkedList implements List{
	
	Node first;
	Node next;
//	Node current;
	Node last;
	

	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub
		if (first == null) {
			first = node;
		}

		else {
			last.next = node;
		}

		last = node;
	}

	@Override
	public void delete(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		StringBuilder printedList = new StringBuilder();

		if (first == null) {
			return "";
		}

		Node current = first;

		if (current.next == null) {
			return current.data + "";
		}

		while (current.next != null) {
			printedList.append(current.data);
			current = current.next;
		}

		return printedList.toString();
	}

	

}
