import java.util.Scanner;


public class LinkListOperations{

	Node head;

	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public Node insertStartofArray(Node head){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int val = reader.nextInt();
		//Need to sanitize input
		Node newNode = new Node(val);
		newNode.next = head;

		return newNode;
	}

	public Node deleteAKey(Node head){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a value to delete:");
		int val = reader.nextInt();
		boolean deleted = false;

		Node prev = head;
		Node iterator = head;

		if(iterator.data == val){
			head = iterator.next;
			System.out.println("Key Deleted !");
			return head;
		}
		iterator = iterator.next;
		while(iterator!= null){
			if(iterator.data == val){
				prev.next = iterator.next;
				System.out.println("Key Deleted !");
				deleted = true;
			}
			prev = iterator;
			iterator = iterator.next;
		}
		if(!deleted){
			System.out.println("Key not found");
		}
		
		return head;
	}

	public Node deleteKeyAtALocation(Node head){
		Scanner reader = new Scanner(System.in);
		System.out.println("Position Counting starts from 1. 1 is the eaad node.\nEnter a position to delete:");
		int val = reader.nextInt();
		//Need to sanitize Value of 'val'
		int count = 0;
		Node prev = head;
		Node iterator = head;
		boolean deleted = false;

		if(val == 1){
			head = iterator.next;
			System.out.println("Key Deleted !");
			return head;
		}
		iterator =iterator.next;
		while(iterator!= null){
			count++;
			if(count == val){
				prev.next = iterator.next;
				System.out.println("Key Deleted !");
				deleted = true;
			}
			prev = iterator;
			iterator = iterator.next;
		}
		if(!deleted){
			System.out.println("Key not found");
		}
		
		return head;
	}

	public void printList(Node head){
		Node iterator = head;
		while(iterator.next != null){
			System.out.print(iterator.data + "->");
			iterator = iterator.next;
		}
		System.out.print(iterator.data + "->EndofList");
	}

	public void insertAtEnd(Node head){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int val = reader.nextInt();
		//Need to sanitize input
		Node newNode = new Node(val);
		Node iterator = head;
		while(iterator.next != null){
			iterator = iterator.next;
		}
		iterator.next = newNode;
	}

	public int getCount(Node iterator){
		if(iterator.next == null){
			return 1;
		}
		else{
			iterator = iterator.next;
			return (1 + getCount(iterator));
		}
	}

	public static void main(String args[]){

		LinkListOperations lList = new LinkListOperations();
		Scanner reader = new Scanner(System.in);
		boolean flag = true;

		lList.head = new Node(1);

		while(flag){
			System.out.println("1. Insert at Start\n2. Delete a Key\n3. Delete key at a particular location\n4. Print List");
			System.out.println("5. Insert at end\n6. Count length of list");
			int caseVal = reader.nextInt();
			switch(caseVal) {
				case 1: 
						lList.head = lList.insertStartofArray(lList.head);
						break;
				case 2: 
						lList.head = lList.deleteAKey(lList.head);
						lList.printList(lList.head);
						break;
				case 3: 
						lList.head = lList.deleteKeyAtALocation(lList.head);
						lList.printList(lList.head);
						break;
				case 4:
						lList.printList(lList.head);
						break;
				case 5:
						lList.insertAtEnd(lList.head);
						break;
				case 6: 
						int count = lList.getCount(lList.head);
						System.out.println("Total elements in list is: "+count);
						break;

				default: System.out.println("Enter Valid option");
			}

			System.out.println("\nDo you want to continue ? (Ans: 1 or 0)");
			if(reader.nextInt() == 1){
				flag = true;
			} 
			else{
				flag = false;
			}
		}
	}
	
}