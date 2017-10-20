package doublyLinkedList;

public class listElement {
	//private ListElement head; // to hold the head (beginning) of the list
	//private ListElement tail; // to hold the tail (end) of the list
	private listElement next; // to go to the next element
	private listElement prev; // to go to the previous element
	private int data; // to fold the integer
	
	public listElement() {
		//this.head = null; // assign head to null
		//this.tail = this.head; // assign tail to head
		this.next = null; // assign next to 
		data = 0;
		
	}

	
	// setter
	public void setData(int data)  {
		this.data = data;
	}
	
	public void setNextPointer(listElement ptr) {
		this.next = ptr;
	}
	
	public void setPrevPointer(listElement ptr) {
		this.prev = ptr;
	}
	
	// getter
	public int getData() {
		return this.data;
	}
	public listElement getNextPointer() {
		return this.next;
	}
	public listElement getPrevPointer() {
		return this.prev;
	}
	
	
	// Add a node
	public void addElement(listElement le) {
		this.data = le.data;
	}
	
	//Retrieve a node 
	public listElement getElement(int index) {
		int counter = 1; // counter to reach the index
		listElement tempObject = this;
		while (counter < index) { // traverse till counter reach wanted index
			tempObject = tempObject.next; // traversing
			counter++; // increment
		}
		return tempObject; // return index object
	}
	
	
	//Delete a node 
	public listElement deleteElement(int index) {
		int counter = 1; // counter to reach the index
		listElement tempObject = this;
		listElement deletedObject = this;
		while (counter <= index ) { // traverse till counter reach wanted index - 1
			if (index != counter ) {
				tempObject = tempObject.next; // traversing
			} else {
				deletedObject = tempObject;
				tempObject.next.setPrevPointer(deletedObject.getPrevPointer());
				tempObject.getPrevPointer().setNextPointer(deletedObject.getNextPointer());
			}
			counter++; // increment
		}
		
		return deletedObject; // return index object
	}
	
	// Print the linked list from the head 
	public void printLinkedListHead() {

		listElement tempObject = this;
		if (tempObject.next != null) {
			System.out.println("List: \n");
			//System.out.println(++counter + ": " + tempObject.data + "\n");
			while (tempObject.next != null) // while next not == null traverse 
			{
				System.out.println(tempObject.data);
				tempObject = tempObject.next;
			}
		} else {
			System.out.println("List Empty!");
		}
	}
	public void printLinkedListTail() {

		listElement tempObject = this;
		if (tempObject.prev != null) {
			System.out.println("List: \n");
			//System.out.println(++counter + ": " + tempObject.data + "\n");
			while (tempObject.prev != null) // while next not == null traverse 
			{
				tempObject = tempObject.prev;
				System.out.println(tempObject.data);
			}
		} else {
			System.out.println("List Empty!");
		}
	}
	
}
