package linkedListImplementation;

public class LinkedIntListNode {
	
	private int value;
	private LinkedIntListNode next;
	
	public LinkedIntListNode(int value, LinkedIntListNode next) {
		this.value = value;
		this.next = next;
	}
	
	public LinkedIntListNode(int value) {
		this(value, null);
	}
	
	public int getValue() {
		return this.value;
	}
	
	public LinkedIntListNode getNext() {
		return this.next;
	}
	
	public void setNext(LinkedIntListNode next) {
		this.next = next;
	}
}
