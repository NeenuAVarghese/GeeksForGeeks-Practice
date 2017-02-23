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

	public Node minNode(Node nodeVal){
		while(nodeVal.left != null){
			nodeVal = nodeVal.left;
		}

		return nodeVal;
	}

	public Node deleteFromBST( Node nodeVal, int key){
		if(nodeVal == null){
				return nodeVal;
		}
		else{
			if(key < nodeVal.data){
				nodeVal.left = deleteFromBST(nodeVal.left, key);
			}
			else{
				if(key > nodeVal.data){
					nodeVal.right = deleteFromBST(nodeVal.right, key);
				}
				else{
					if(nodeVal.left == null){
						Node temp = nodeVal.right;
						return temp;
					}
					else{
						if(nodeVal.right == null){
							Node temp = nodeVal.left;
							return temp;
						}
						
						Node temp = minNode(nodeVal.right);
						nodeVal.data = temp.data;
						nodeVal.right = deleteFromBST(nodeVal.right, temp.data);
					}
				}
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
						System.out.println("Enter a value to insert:");
						int val = reader.nextInt();
						bst.root = bst.insertInBST(bst.root, val);
						break;
				case 2: System.out.println("enter a value to delete:");
						int delVal = reader.nextInt();
						bst.root = bst.deleteFromBST(bst.root, delVal);
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