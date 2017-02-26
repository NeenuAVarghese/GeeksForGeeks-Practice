import java.util.Scanner;

public class QueueBasicArray{

	Queue queue;
	
	static class Queue{
		int front, size, capacity, rear;
		int[] queueArray;

		Queue(int vCapacity){
			front = size = 0;
			capacity = vCapacity;
			rear = vCapacity - 1;
			queueArray = new int[vCapacity];
		}
	}


		public boolean isEmpty(Queue queueHandle){
			return (queueHandle.size == 0);
		}

		public boolean isFull(Queue queueHandle){
			return(queueHandle.size == queueHandle.capacity);
		}

		public int getfront(Queue queueHandle){
			if(isEmpty(queueHandle)){
				return Integer.MIN_VALUE;
			}
			else{
				return queueHandle.queueArray[queueHandle.front];
			}
		}

		public int getrear(Queue queueHandle){
			if(isEmpty(queueHandle)){
				return Integer.MIN_VALUE;
			}
			else{
				return queueHandle.queueArray[queueHandle.rear];
			}
		}


		public void enqueue(Queue queueHandle, int val){
			if (isFull(queueHandle)) {
				System.out.println("Queue is full");
				return;
			}
			queueHandle.rear = (queueHandle.rear + 1)%queueHandle.capacity;
			queueHandle.size ++;
			queueHandle.queueArray[queueHandle.rear] = val;
		}

		public void dequeue(Queue queueHandle){
			if(isEmpty(queueHandle)){
				System.out.println("Queue is empty");
				return;
			}
			System.out.println("Removing: " + queueHandle.queueArray[queueHandle.front]);
			queueHandle.front = (queueHandle.front + 1)%queueHandle.capacity;
			queueHandle.size--;
		}



		public static void main(String args[]){
			Scanner reader = new Scanner(System.in);
			boolean flag = true;
			QueueBasicArray qba = new QueueBasicArray();

			qba.queue = new Queue(10);

			while(flag){

				System.out.println("\n1. Enqueue\n2. Dequeue\n3. Get Front\n4. Get Rear ");
				int val = reader.nextInt();


				switch(val){
					case 1:
							System.out.println("\n Enter a value to input into Queue");
							int valQ = reader.nextInt();
							qba.enqueue(qba.queue, valQ);
							break;
					case 2:
							qba.dequeue(qba.queue);
							break;
					case 3: 
							System.out.println("Value retrieved is: " + qba.getfront(qba.queue));
							break;
					case 4:
							System.out.println("Value retrieved is: " + qba.getrear(qba.queue));
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