
import java.util.Scanner;

public class TwoStackInSingleArray{

	int size, top1, top2;
	int arr[];

	TwoStackInSingleArray(int n){
		size = n;
		top1 = -1;
		top2 = size;
		arr = new int[n];
	}

	public void pushToStack1(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int val = reader.nextInt();

		if(top1 < top2 - 1){
			top1++;
			arr[top1] = val;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}

	public void pushToStack2(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int val = reader.nextInt();

		if(top1 < top2 - 1){
			top2--;
			arr[top2] = val;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}

	public void pop2(){
		if(top2 < size){
			System.out.println("Removing "+ arr[top2]);
			top2++;
		}
		else{
			System.out.println("Array size underflow");
		}
	}

	public void pop1(){
		if(top1 >= 0){
			System.out.println("Removing "+arr[top1]);
			top1--;
		}
		else{
			System.out.println("Array size underflow");
		}
	}

	public void printArrray(){
		System.out.println("Stack 1:");
		for(int i=top1; i >= 0; i--){
			System.out.println("-" + arr[i]);
		}
		System.out.println("Stack 2:");
		for(int i = top2; i < size; i++){
			System.out.println("-" + arr[i]);
		}
	}


	public static void main(String args[]){

		TwoStackInSingleArray stack = new TwoStackInSingleArray(10);
		boolean flag = true;
		Scanner reader = new Scanner(System.in);

		while(flag){
			System.out.println("1. Push in Stack 1\n2. Push in Stack 2\n3. Pop from stack 1\n4. Pop from Stack 2\n5. Print Stack\n");
			int option = reader.nextInt();

			switch(option){
				case 1:
						stack.pushToStack1();
						break;
				case 2:
						stack.pushToStack2();
						break;
				case 3:
						stack.pop1();
						break;
				case 4:
						stack.pop2();
						break;
				case 5:
						stack.printArrray();
						break;
				default:
						System.out.println("Enter valid option");
			}	
			System.out.println("\nDo you want to continue ? (Ans: 1 or 0)");
			if(reader.nextInt() != 1){
				flag = false;
			} 
		}
	}
}