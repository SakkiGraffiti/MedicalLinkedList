package linkedList;

public class Node {
	
	private Stress data;
	private Node next;
	
	public Node() {
		super();
	}

	public Node(Stress data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Stress getData() {
		return data;
	}

	public void setData(Stress data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
