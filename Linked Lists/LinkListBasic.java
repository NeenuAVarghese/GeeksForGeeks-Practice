class LinkListBasic{

	Node head;

	static class Node{
		int data;
		Node next;

		Node(int d) {
			data = d; 
			next = null;
		}
	}


	public static void main(String args[]){

		LinkListBasic lList  = new LinkListBasic();

		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);


		lList.head.next = second;
		second.next = third;


		Node iterator = lList.head;
		while(iterator.next != null){
			System.out.print(iterator.data);
			iterator = iterator.next;
		}
	}
}