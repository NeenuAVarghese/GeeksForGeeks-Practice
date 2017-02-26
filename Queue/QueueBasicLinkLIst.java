import java.util.Scanner;

public class QueueBasicLinkLIst{

	Node front = null, rear = null;
	
	static class Node{
		
		int  data;
		Node next;

		Node(int x){
			data = x;
			next = null;
		}
	}


		public Node getfront(){
			if(front == null){
				return null;
			}
			else{
				return front;
			}
		}

		public Node getrear(){
			if(rear == null){
				return null;
			}
			else{
				return rear;
			}
		}


		public void enqueue(int val){
			Node temp = new Node(val);
			if (rear == null && front == null) {
				rear = front = temp;
				return;
			}
			rear.next = temp;
			rear = temp;
		}

		public void dequeue(){
			if(front == null){
				System.out.println("Queue is empty");
				return;
			}
			front = front.next;

			if(front ==  null){
				rear = null;
			}
		}



		public static void main(String args[]){
			Scanner reader = new Scanner(System.in);
			boolean flag = true;
			QueueBasicLinkLIst qbLL = new QueueBasicLinkLIst();

			while(flag){

				System.out.println("\n1. Enqueue\n2. Dequeue\n3. Get Front\n4. Get Rear ");
				int val = reader.nextInt();


				switch(val){
					case 1:
							System.out.println("\n Enter a value to input into Queue");
							int valQ = reader.nextInt();
							qbLL.enqueue(valQ);
							break;
					case 2:
							qbLL.dequeue();
							break;
					case 3: 
							Node valFront = qbLL.getfront();
							if(valFront != null){
								System.out.println("Value retrieved is: " + valFront.data);
							}
							break;
					case 4:
							Node valRear = qbLL.getrear();
							if(valRear != null){
								System.out.println("Value retrieved is: " + valRear.data);
							}
							break;
					default:
							System.out.println("Enter Valid option");
				}

				System.out.println("\n Do you want to continue ?(1/0)");
				int ans = reader.nextInt();

				if(ans != 1){
					flag = false;
				}
			}
			

		}
	}