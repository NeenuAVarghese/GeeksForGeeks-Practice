import java.util.Scanner;

public class StackBasicOperations{

	Node top = null;

	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public Node push(Node top){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to push:");
		int val = reader.nextInt();

		Node newVal = new Node(val);
		newVal.next = null;
		if(top == null){
			top = newVal;
		}
		else{
			newVal.next = top;
			top = newVal;
		}
		
		return top;
	}

	public Node pop(Node top){

		if(top == null){
			System.out.println("Nothing to pop !");
		}
		else{
			top = top.next;
		}
		return top;
	}

	public void printStack(Node top){

		Node iterator = top;

		while(iterator != null){
			System.out.print("-" + iterator.data );
			iterator = iterator.next;
		}

	}


	public static void main(String args[]){

		StackBasicOperations stackOp = new StackBasicOperations();
		Scanner reader = new Scanner(System.in);
		boolean flag = true;

		while(flag){
			System.out.println("\n1. Push\n2. Pop");
			int option = reader.nextInt();

			switch(option){
				case 1: 
						stackOp.top = stackOp.push(stackOp.top);
						stackOp.printStack(stackOp.top);
						break;
				case 2: 
						stackOp.top = stackOp.pop(stackOp.top);
						stackOp.printStack(stackOp.top);
						break;
				default:
						System.out.println("Enter valid option.");
			}

			System.out.println("\n Do you want to continue ?");
			if(reader.nextInt() == 1){
				flag = true;
			}
			else{
				flag = false;
			}
		}


	}
}