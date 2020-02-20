package linkedList;

public class MedicalLinkedList {

	private Node head;
	
	public MedicalLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) 
		{
			return true;
		}
		else 
		{
			temp = null;
			return false;
		}
	}
	
	public boolean addToBack(Stress str) {
		if(isFull() )
		{
			System.out.println("This list is full");
			return false;
		}
		else {
			Node nextItem = new Node();
			nextItem.setData(str);
			
			if(isEmpty() )
			{
				head = nextItem;
			}
			else
			{
				Node current = head;
				while(current.getNext() != null) {
					current = current.getNext();
			}
				current.setNext(nextItem);
			}
			return true;
		}
	}
	
	
	public boolean addToFront(Stress data) {
		if(isFull() ) 
		{
			System.out.println("This list is full");
			return false;
		}
		else
			{
			Node nextItem = new Node();
			nextItem.setData(data);
			
			if(isEmpty())
			{
				head = nextItem;
			}
				else
				{
					nextItem.setNext(head);
					head = nextItem;
				}
				return true;
			}
	}
	
	
	Stress deleteFromFront() {
		if(isEmpty())
		{
			System.out.println("List Empty");
			return null;
		}
		else 
		{
			Node temp = head;
			head = head.getNext();
			Stress tempData = temp.getData(); //store temp into a variable "tempData "
			temp = null; //deleting data
			return tempData;
		}
	}
		
		
	
		Stress search(int identifier) {
			
			Node temp =head;
			while(temp != null) {
				if (temp.getData().getRefNo() == identifier) {
					return temp.getData();
				}
				
				temp = temp.getNext();
			}
				return temp.getData();// need to correct here
			}
		
		

		Stress deleteFromBack() {
			if(isEmpty())
			{
				System.out.println("List Empty");
				return null;
			}
			else {
				if(head.getNext()== null) 
				{
					Stress tempData=head.getData();
					head = null;
					return tempData;
				}
				else
				{
					Node current = head;
					Node prev = null;
					
					while(current.getNext() != null) 
					{
						prev = current;
						current = current.getNext();
					}
					
					prev.setNext(null);
					Stress tempData = current.getData();
					current = null;
					return tempData;
				}
			}
	}
	
	
	
	
	public void display() {
		Node current = head;
		while (current != null) {
			current.getData().display();
			current = current.getNext();
		}
	}
}
