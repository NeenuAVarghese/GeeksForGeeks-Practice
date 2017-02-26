import java.util.Scanner;

public class CheckIfBinaryTreeIsBST{
	
	Node root = null;

	static class Node{
		int data;
		Node left, right;

		Node(int x){
			data = x;
			left = null;
			right = null;
		}
	}


	public Node insert(Node nodeVal, int x){

			if(nodeVal == null){
				nodeVal = new Node(x);
			}

			else{
				if(nodeVal.data > x){
					nodeVal.left = insert(nodeVal.left , x); 
				}
				else{
					if(nodeVal.data < x){
						nodeVal.right = insert(nodeVal.right , x);
					}
				}
			}

			return nodeVal;
		}

		

		public void print(Node nodeVal){

			while(nodeVal != null){
				print(nodeVal.left);
				System.out.println(nodeVal.data + "-----");
				print(nodeVal.right);
			}
		}

		public boolean checkIfBST(Node nodeVal){

			return bstUtil(nodeVal, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}


		public boolean bstUtil(Node nodeVal, int min, int max){

			if(nodeVal == null){
				return true;
			}
			else{
				if(nodeVal.data < min || nodeVal.data > max){
					return false;
				}
				else{
					return (bstUtil(nodeVal.left, min, nodeVal.data - 1) && 
							bstUtil(nodeVal.right, nodeVal.data + 1 , max));
				}
			}
		}


		public static void main(String args[]){


			Scanner reader = new Scanner(System.in);
			boolean flag = true;
			CheckIfBinaryTreeIsBST bst = new CheckIfBinaryTreeIsBST();

			while(flag){
				System.out.println("\n1. Insert \n2. Check \n3. Print");
				int option = reader.nextInt();

				switch(option){
					case 1: 
							System.out.println("Enter a value to insert:");
							int val = reader.nextInt();
							bst.root = bst.insert(bst.root, val);
							break;
					case 2: 
							if(bst.checkIfBST(bst.root)){
								System.out.println("True");
							}
							else{
								System.out.println("False");
							}
							break;
					case 3:
							bst.print(bst.root);
							break;
					default:
							System.out.println("Enter Valid option");
				}

				System.out.println("\nDo you want to continue ?(1 or 0)");
				if(reader.nextInt() != 1){
					flag = false;
				}
			}

		}


}