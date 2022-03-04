package stackandqueue;

public class LinkedList {
	/*steps
	 * ================================================
	 * 1.Creating node head
	 * 2.creating variables
	 * 3.created method to peak a value frm stack
	 * 4.creating method to add the first value to stack
	 * 5.method to delete first value till the stack gets empty
	 * 6.created method to diplay the linkedlist/stack
	 * =================================================
	 */

	/*
	 * 1.Creating node head
	 */
	Node head;

	/*
	 * 2.creating variables
	 */
	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * 3. creating method to add values
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	/*
	 * 4.created method to peak a value from stack
	 */
	public void peak() {
		if (head != null) {
			System.out.println("Peaked from stack : " + head.data);
		} else {
			System.out.println("No element left in the stack.");
			return;
		}
	}

	/*
	 * 5.method to delete peaked value
	 */
	public Node pop() {
		System.out.println("Popped value is : " + head.data);
		head = head.next;
		return head;
	}

	/*
	 * 6.created method to diplay the linkedlist/stack
	 */
	public void display() {
		if (head == null)
			System.out.println("The Stack is empty");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
