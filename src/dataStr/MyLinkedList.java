package dataStr;

public class MyLinkedList<T> {
	private MyNode first = null;
	private MyNode last = null;
	private int elementCounter = 0;
	
	//TODO isFull() isEmpty() howManyElements()
	
	public void add(T newElement) {
		//TODO verify not full
		if (elementCounter == 0) {
			MyNode<T> newNode = new MyNode<T>(newElement);
			first = newNode;
			last = newNode;
			elementCounter++;
		} else {
			MyNode<T> newNode = new MyNode<T>(newElement);
			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;
			elementCounter++;
		}
	}
	
	public void add(T newElement, int position) throws Exception {
		//TODO verify not full
		if (position < 0 || position > elementCounter) {
			throw (new Exception("Wrong position"));
		}
		//add at the beginning
		if (position == 0) {
			MyNode<T> newNode = new MyNode<T>(newElement);
			first.setNext(first);
			first = newNode;
			elementCounter++;
		}
		//add at the end
		else if (position == elementCounter) {
			add(newElement);
		}
		//add in the middle
		else {
			MyNode tempNode = first;
			for (int i = 0; i < position - 1; i++) {
				tempNode = tempNode.getNext();
			}
			MyNode tempNode2 = tempNode.getNext();
			MyNode<T> newNode = new MyNode<T>(newElement);
			
			tempNode.setNext(newNode);
			newNode.setPrev(tempNode);
			
			tempNode2.setPrev(newNode);
			newNode.setNext(tempNode2);
			elementCounter++;
		}
	}
	public void print() {
		//TODO verify not empty
		MyNode tempNode = first;
		while (tempNode != null) {
			System.out.print(tempNode.getElement() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}
	
	public void remove(int position) {
		//TODO verify if list is empty, if position exists
		//remove beginning
		if (position == 0) {
			first = first.getNext();
			first.setPrev(null);
			elementCounter--;
		}
		//remove from end
		else if (position == elementCounter-1) {
			last = last.getPrev();
			last.setNext(null);
			elementCounter--;
		}
		//remove from mid
		else {
			MyNode tempNode = first;
			for (int i = 0; i < position; i++) {
				tempNode = tempNode.getNext();
			}
			MyNode tempNodePrev = tempNode.getPrev();
			MyNode tempNodeNext = tempNode.getNext();
			
			tempNodePrev.setNext(tempNodeNext);
			tempNodeNext.setPrev(tempNodePrev);
			elementCounter--;
		}
	}
}
