package linkedListImplementation;

public class LinkedIntList {
	
	private LinkedIntListNode front;
	private int length;
	
	public LinkedIntList() {
		front = null;
		this.length = 0;
	}
	
	public void add(int value) {
		this.length++;
		if (front == null) {
			front = new LinkedIntListNode(value);
		} else {
			LinkedIntListNode current = front;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new LinkedIntListNode(value));
		}
	}
	
	public int length() {
		return this.length;
	}
	
	public String toString() {
		if (front != null) {
			LinkedIntListNode current = front;
			StringBuffer linkedIntList = new StringBuffer();
			linkedIntList.append(String.format("%i", current.getValue()));
			while (current.getNext() != null) {
				linkedIntList.append(String.format(" -> %i", current.getValue()));
			}
			return linkedIntList.toString();
		} else {
			return "";
		}
	}
	
}
