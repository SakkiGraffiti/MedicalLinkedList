package linkedList;

public class Main {

	public static void main(String[] args) {

		Stress items[] = new Stress[] 
				{ new Stress(1, "Girl", 1000000),
				  new Stress(2, "School", 312000),
				  new Stress(3, "Work", -1), };

		MedicalLinkedList list = new MedicalLinkedList();
		for (int i = 0; i < 3; i++) {
			list.addToBack(items[i]);
		}
		System.out.println("**** Display List **** ");
		list.display();

		MedicalLinkedList list2 = new MedicalLinkedList();

		Stress item1 = new Stress(1, "School", 300);

		boolean success = list2.addToFront(item1);

		if (success == true) {
			System.out.println("Stress added");
		} else

			System.out.println("Stress not added");
		Stress deletedItem = list2.deleteFromBack();

		if (deletedItem != null) {
			System.out.println("Deleted");
			deletedItem.display();
		} else {
			System.out.println("Nothing deleted");
		}

		//calling search function 
		list.search(3).display();
	}

}
