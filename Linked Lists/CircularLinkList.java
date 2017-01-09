import java.util.Scanner;

public class CircularLinkList{

	Node head;
	
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public Node insertNewNode(Node head){

		Node iterator = head;
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a number:");
		int val = reader.nextInt();
		Node newNode = new Node(val);

		while(iterator.next != head){
			iterator = iterator.next;
		}

		iterator.next = newNode;
		newNode.next = head;

		return head;
	}

	public Node deleteAKey(Node head){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a value to delete:");
		int val = reader.nextInt();
		boolean deleted = false;

		Node prev = head;
		Node iterator = head;

		if(head.data == val){
			while(iterator.next != head){
				iterator = iterator.next;
			}
			iterator.next = head.next;
			head = head.next;
			System.out.println("Key Deleted !");
			
			return head;
		}
		iterator = iterator.next;

		while(iterator.next != head){
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

	public void printList(Node head){
		Node iterator = head;
		while(iterator.next != head){
			System.out.print(iterator.data + "->");
			iterator = iterator.next;
		}
		System.out.print(iterator.data + "->StartOfList");
	}

	public int getCount(Node head){
		Node iterator = head;
		int count = 0;
		while(iterator.next != head){
			count++;
			iterator = iterator.next;
		}
		count++;
		return count;
	}


	public static void main(String args[]){
		CircularLinkList cList = new CircularLinkList();
		Scanner reader = new Scanner(System.in);
		boolean flag = true;

		cList.head = new Node(1);
		cList.head.next = cList.head;

		while(flag){
			System.out.println("1. Insert new Node\n2. Delete a Key\n3. Print List");
			System.out.println("4. Count length of list");
			int caseVal = reader.nextInt();
			switch(caseVal) {
				case 1: 
						cList.head = cList.insertNewNode(cList.head);
						break;
				case 2: 
						cList.head = cList.deleteAKey(cList.head);
						cList.printList(cList.head);
						break;
				case 3:
						cList.printList(cList.head);
						break;
				case 4: 
						int count = cList.getCount(cList.head);
						System.out.println("Total elements in list is: " + count);
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