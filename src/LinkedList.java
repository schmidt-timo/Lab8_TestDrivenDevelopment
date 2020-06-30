
public class LinkedList implements List{

	private Node head;
	private Node tail;
	private int size;

	// Constructor
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Node A = new Node("A");
		Node B = new Node ("B", A);
		Node C = new Node ("C", B);
		list.add(A);
		list.add(B);
		list.add(C);
		System.out.println(list.toString());
	}
	

	@Override
	public void add(Node node) {
		// TODO Auto-generated method stub

		head = node;
		size++;

		if (size == 1) {
			tail = node;
		}
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

		while (head != null) {
			printedList.append(head.data).append(" -> ");
			head = head.next;
		}
		printedList.append("END");

		return printedList.toString();
	}

	

}
