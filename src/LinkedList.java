
public class LinkedList implements List {

	Node first;
	Node current;
	Node last;

	public LinkedList() {
		first = null;
		current = null;
		last = null;
	}

	@Override
	public void add(Node node) {

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
		Node temp = node;
		current = first;
		
		if(current == node) {
			first = first.next;
			return;
		}

		if (current == null || current.next == null) {
			return;
		}

		while (current.next != temp) {
			current = current.next;
		}

		current.next = temp.next;
	}

	@Override
	public void reverse() {

		Node prev = null;
		Node next = null;
		current = first;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		first = prev;
	}

	@Override
	public Object first() {
		return (String) first.data;
	}

	public String toString() {
		String printedList = "";

		if (first == null) {
			return "";
		}

		Node current = first;

		while (current != null) {
			printedList += current.data;
			current = current.next;
		}

		return printedList;
	}

}
