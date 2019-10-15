package Mat16th;

class Node {
	protected int data;
	protected Node link;

	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public int getData() {
		return data;
	}
}

class linkedList {
	protected Node start;
	protected Node end;
	public int size;

	public linkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	// inserts at starting
	public void insert(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}
	}
// inserts elements at specific position
	public void insertAtPos(int val , int pos)
    {
		// creating temp node with given data
        Node nptr = new Node(val, null);     
        // starting from head
        Node trav = start;
        pos = pos - 1 ;
        boolean flag = false;
        for (int i = 1; i < size; i++) 
        {
        	// if i meets position
            if (i == pos) 
            {
            	flag = true;
                Node tmp = trav.getLink() ;
                trav.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            trav = trav.getLink();
        }
       // if given position is more than size than inserting at starting
        if(!flag){
        	insert(val);
        }
        size++ ;
    }
// displays the elements in the list
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		// taking head ptr to start from
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		linkedList list1 = new linkedList();
		list1.insert(1);
		list1.insert(2);
		list1.insertAtPos(3,2);
		list1.insertAtPos(4,2);
		list1.insertAtPos(5,2);
		list1.insertAtPos(6,2);
		list1.insertAtPos(7,10);
		
		list1.display();

	}
}