package questions;

import linkedListImplementation.LinkedIntListNode;

public class QueueImplementation {
	
	LinkedIntListNode front;
	
	public QueueImplementation() {
		this.front = null;
	}
	
	//Peek
	public int peek() {
		return front.getValue();
	}
	
	//Remove
	public int remove() {
		int value = front.getValue();
		front = front.getNext();
		return value;
	}
	
	//Add
	public void add(int value) {
		this.front = new LinkedIntListNode(value, front);
	}
	
	//IsEmpty
	public boolean isEmpty() {
		return front == null;
	}
	
	//Clear
	public void clear() {
		front = null;
	}
	
}
