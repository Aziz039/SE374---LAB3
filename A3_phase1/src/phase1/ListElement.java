package phase1;

public class ListElement {
	
	//private ListElement head; // to hold the head (beginning) of the list
	//private ListElement tail; // to hold the tail (end) of the list
	private ListElement next; // to go to the next element
	
	private int data; // to fold the integer
	
	public ListElement() {
		//this.head = null; // assign head to null
		//this.tail = this.head; // assign tail to head
		this.next = null; // assign next to 
		data = 0;
		
	}

	
	// setter
	public void setData(int data)  {
		this.data = data;
	}
	
	public void setPointer(ListElement ptr) {
		this.next = ptr;
	}
	
	// getter
	public int getData() {
		return this.data;
	}
	public ListElement getPointer() {
		return this.next;
	}
	
	// Add a node
	public void addElement(ListElement le) {
		this.data = le.data;
	}
	
	//Retrieve a node 
	public ListElement getElement(int index) {
		int counter = 1; // counter to reach the index
		ListElement tempObject = this;
		while (counter < index) { // traverse till counter reach wanted index
			tempObject = tempObject.next; // traversing
			counter++; // increment
		}
		return tempObject; // return index object
	}
	
	
	//Delete a node 
	public ListElement deleteElement(int index) {
		int counter = 0; // counter to reach the index
		ListElement tempObject = this;
		ListElement deletedObject = this;
		while (counter <= index ) { // traverse till counter reach wanted index - 1
			if (index != counter ) {
			tempObject = tempObject.next; // traversing
			} else {
			deletedObject = tempObject;
			this.next = this.next.next;
			}
			counter++; // increment
		}
		
		return deletedObject; // return index object
	}
	
	// Print the linked list from the head 
	public void printLinkedListHead() {

		int counter = 0;
		ListElement tempObject = this;
		if (tempObject.next != null) {
			System.out.println("List: \n");
			//System.out.println(++counter + ": " + tempObject.data + "\n");
			while (tempObject.next != null) // while next not == null traverse 
			{
				System.out.println(counter++ + ": " + tempObject.data + '\n');
				tempObject = tempObject.next;
			}
		} else {
			System.out.println("List Empty!");
		}
	}
	
	
}
