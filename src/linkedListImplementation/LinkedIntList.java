package linkedListImplementation;

public class LinkedIntList {
	
	private LinkedIntListNode front;
	private int length;
	
	public LinkedIntList() {
		front = null;
		this.length = 0;
	}
	
	public void add(int value) {
		if (length() == 0) {
			front = new LinkedIntListNode(value);
		} else {
			LinkedIntListNode current = front;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new LinkedIntListNode(value));
		}
		this.length++;
	}
	
	public void remove(int value) {
		if (length() != 0) {
			LinkedIntListNode current = front;
			if (front.getValue() == value) {
				front = front.getNext();
				this.length--;
			} else {
				while (current.getNext() != null && current.getNext().getValue() != value) {
					current = current.getNext();
				}
				if (current.getNext() != null) {
					this.length--;
					current.setNext(current.getNext().getNext());
				}
			}
		}
	}
	
	public void removeAll(int value) {
		if (length() != 0) {
			while (front != null && front.getValue() == value) {
				front = front.getNext();
				this.length--;
			}
			if (length() != 0) {
				LinkedIntListNode current = front;
				while (current.getNext() != null) {
					if (current.getNext().getValue() == value) {
						this.length--;
						current.setNext(current.getNext().getNext());
					} else {
						current = current.getNext();
					}
				}
			}
		}
	}
	
	public int length() {
		return this.length;
	}
	
	public String toString() {
		if (length() != 0) {
			LinkedIntListNode current = front;
			StringBuilder linkedIntList = new StringBuilder();
			linkedIntList.append(current.getValue());
			while (current.getNext() != null) {
				linkedIntList.append(" -> ");
				linkedIntList.append(current.getNext().getValue());
				current = current.getNext();
			}
			return linkedIntList.toString();
		} else {
			return "";
		}
	}
	
}
