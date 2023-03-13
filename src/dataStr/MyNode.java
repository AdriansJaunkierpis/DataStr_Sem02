package dataStr;

public class MyNode<T> {
	
	private T element;
	private MyNode next = null;
	private MyNode prev = null;

	
	public T getElement() {
		return element;
	}

	public void setElement(T inputElement) {
		if (inputElement != null) {
			element = inputElement;
		} else {
			element = (T) new Object();
		}
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode getPrev() {
		return prev;
	}

	public void setPrev(MyNode prev) {
		this.prev = prev;
	}


	public MyNode(T inputElement) {
		setElement(inputElement);
	}
	
	public String toString() {
		return "" + element;
	}
}
