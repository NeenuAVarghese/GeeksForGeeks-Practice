import java.util.Scanner;

public class BinaryTreeBasics{

	Node root = null;

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}


	public Node insert(Node value){

		Scanner reader = new Scanner(System.in);
		Node head = value;
		boolean flag = true;

		while(flag){

			System.out.println("Enter a value for the node:");
			int val = reader.nextInt();

			if(value == null){
				head = new Node(val);
				value = head;
				System.out.println("Value entered");
			}
			else{
				boolean flag_traversal = true;
				while(flag_traversal){
					System.out.println("Current Node is: "+ value.data);
				System.out.println("\n1. Left\n2. Right");
				int opt = reader.nextInt();
				int traverse;
				switch(opt){
					case 1: 
							if(value.left == null){
								value.left = new Node(val);
								value = head;
								System.out.println("Value entered");
								flag_traversal = false;
							}
							else{
								System.out.println("Do you want to traverse more ?");
								traverse = reader.nextInt();
								if(traverse != 1){
									Node newVal = new Node(val);
									newVal.left = value.left;
									newVal.right = value.right;
									value.left = newVal;
									value = head;
									System.out.println("Value entered");
									flag_traversal = false;
								}
								else{
									value = value.left;
								}
							}
							break;
					case 2: 
							if(value.right == null){
								value.right = new Node(val);
								value = head;
								System.out.println("Value entered");
								flag_traversal = false;
							}
							else{
								System.out.println("Do you want to traverse more ?");
								traverse = reader.nextInt();
								if(traverse != 1){
									Node newVal = new Node(val);
									newVal.left = value.left;
									newVal.right = value.right;
									value.right = newVal;
									value = head;
									System.out.println("Value entered");
									flag_traversal = false;
								}
								else{
									value = value.right;
								}
							}
							break;
				}
				}
				
			}
			System.out.println("Do you want to continue ?");

			if(reader.nextInt() != 1){
				flag = false;
			}
		}
		return head;

	}

	public void printInorder(Node value){
		if(value == null){
			return;
		}

		printInorder(value.left);

		System.out.println(value.data);

		printInorder(value.right);
	}

	public void printPreorder(Node value){
		if(value == null){
			return;
		}

		System.out.print(value.data + "--");

		printPreorder(value.left);

		printPreorder(value.right);
	}

	public void printPostorder(Node value){
		if(value == null){
			return;
		}

		printPostorder(value.left);

		printPostorder(value.right);

		System.out.println(value.data);

	}


	public static void main(String args[]){

		BinaryTreeBasics bt = new BinaryTreeBasics();
		Scanner reader = new Scanner(System.in);
		boolean flag = true;

		while(flag){
			System.out.println("\n1. Insert new Node\n2. Print Inorder\n3. Print Postorder \n4. Print Preorder");
			int opt = reader.nextInt();
		
			switch(opt){
				case 1: 
						bt.root = bt.insert(bt.root);
						break;
				case 2: 
						bt.printInorder(bt.root);
						System.out.println("Tree is as follows:");
						break;
				case 3: 
						bt.printPostorder(bt.root);
						System.out.println("Tree is as follows:");
						break;
				case 4: 
						bt.printPreorder(bt.root);
						System.out.println("Tree is as follows:");
						break;
			}

			System.out.println("Do you want to Continue ?");
			int reply = reader.nextInt();

			if(reply != 1){
				flag = false;
			} 
		}
		


	}
}