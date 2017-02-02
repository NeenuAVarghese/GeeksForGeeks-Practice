import java.util.Scanner;


public class BinarySearchTree{

	Node root = null;
	
	static class Node{

		Node left;
		Node right;
		int data;

		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}

	public Node insertInBST(Node nodeVal, int key){

		if(nodeVal == null){
			nodeVal = new Node(key);
			return nodeVal;
		}
		else {
			if(nodeVal.data > key)
			nodeVal.left = insertInBST(nodeVal.left, key);
		
			else {
				if(nodeVal.data < key)
			nodeVal.right = insertInBST(nodeVal.right, key);
			}
		}

		return nodeVal;
	}

	public void printBST(Node printVal){

		if(printVal != null){
			printBST(printVal.left);
			System.out.println(printVal.data + "---");
			printBST(printVal.right);
		}
	}

	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		BinarySearchTree bst = new BinarySearchTree();

		while(flag){
			System.out.println("\n1. Insert \n2. Delete \n3. Print");
			int option = reader.nextInt();

			switch(option){
				case 1: 
						System.out.println("Enter a value");
						int val = reader.nextInt();
						bst.root = bst.insertInBST(bst.root, val);
						break;
				case 2:
						break;
				case 3:
						bst.printBST(bst.root);
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