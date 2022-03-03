package stackandqueue;

public class Stack {

	/*
	 * creating Object
	 */
	LinkedList linkedList = new LinkedList();

	/*
	 * pushing the value at first place calling method through object
	 */
	public void push(Object data) {
		linkedList.addFirst(data);
	}

	/*
	 * calling method to display value in linkedList/stack
	 */
	public void displayStack() {
		linkedList.display();
	}

	/*
	 * deleting top value in the stack till stack gets empty
	 */
	public void pop() {
		while (linkedList.head != null)
			linkedList.deleteFirst();
	}
}

