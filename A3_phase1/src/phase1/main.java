package phase1;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		ListElement head = new ListElement();

		ListElement tail = head;

		Scanner cin = new Scanner(System.in); // scanner to read from the user
		
		int counter = 0; // counter for the objects
		int input;
		char choice; // the choice user imput
		// System.out.println("");
		do {
			// show the choices
			System.out.println("To add a new object, enter n ");
			System.out.println("To print the objects, enter p ");
			System.out.println("To search the objects, enter s ");
			System.out.println("To delete an object, enter d ");
			System.out.println("To exit the program, enter x ");
			
			choice = cin.next().charAt(0); // input
			
			if (choice == 'n') { // add new object
				if (counter == 0) {
					System.out.println("Insert the head element data: ");
					input = cin.nextInt();
					head.setData(input);
					head.setPointer(new ListElement());
					tail = head.getPointer();
					counter++;
				}
				else {
					System.out.println("Insert the tail element data: ");
					input = cin.nextInt();
					tail.setData(input);
					tail.setPointer(new ListElement());
					tail = tail.getPointer();
					counter++;
				}
			}
			else if (choice == 'p') { // print objects
				head.printLinkedListHead();
			}
			else if (choice == 's') { // search the objects
				System.out.println("Enter an index to get:");
				input = cin.nextInt();
				if (input > counter) {
					System.out.println("The index you entered is larger than the list!");
				} else if (input <= 0) {
					System.out.println("The index you entered is smaller than the list~");
				} else {
					ListElement wantedElement = new ListElement();
					wantedElement = head.getElement(input);
					System.out.print("Element " + input + ":  " + wantedElement.getData() + '\n');
				}
				
			}
			else if (choice == 'd') { // delete an object
				System.out.println("Enter an index to delete:");
				input = cin.nextInt();
				if (input > counter) {
					System.out.println("The index you entered is larger than the list!");
				} else if (input < 0) {
					System.out.println("The index you entered is smaller than the list~");
				} else if (counter == 0) {
					System.out.println("Empty List!");
				}
				else {
					ListElement wantedElement = new ListElement();
					wantedElement = head.deleteElement(input);
					System.out.print("Element " + input + ":  " + wantedElement.getData() + ", was deleted \n");
					counter--;
				}
			}
			else if (choice == 'x') { // exit message
				System.out.println("Have a nice day!");
			}  // end else if
			else { // foe invalid inputs
				System.out.println("Invalid input");
			} // end else
		

	} while (choice != 'x'); // end do while loop


	}
}
