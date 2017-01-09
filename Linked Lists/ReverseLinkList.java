public class ReverseLinkList{
	
	Node head;

	static class Node{

		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}

	}

	public void printList(Node head){
		Node iterator = head;
		while(iterator.next != null){
			System.out.print(iterator.data + "->");
			iterator = iterator.next;
		}
		System.out.print(iterator.data + "->EndofList");
	}


	public void reverseList(Node head){

		Node prev = null;
		Node iterator = head;
		Node forward = null;

		System.out.println("In function !");
		while(iterator != null){
			forward = iterator.next;
			iterator.next = prev;
			prev = iterator;
			iterator = forward;
			
		}
		head = prev;
		System.out.println("Reversed !");

		printList(head);
	}


	public static void  main(String args[]){

		ReverseLinkList lList = new ReverseLinkList();

		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		lList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;


		lList.printList(lList.head);

		System.out.println("\nReverseLinkList:");

		lList.reverseList(lList.head);

	}
}