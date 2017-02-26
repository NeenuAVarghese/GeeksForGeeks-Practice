import java.util.Scanner;


public class LowestCommonAncestor{

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

	public Node getLCA(Node nodeVal, int val1, int val2){

		if(nodeVal == null){
			return nodeVal;
		}

		if(nodeVal.data > val1 && nodeVal.data > val2){
			return getLCA(nodeVal.left, val1, val2);
		}

		if(nodeVal.data < val1 && nodeVal.data < val2){
			return getLCA(nodeVal.right, val1, val2);
		}

		return nodeVal;
	}

	public Node insert(Node nodeVal, int key){
		if(nodeVal == null){
			nodeVal = new Node(key);
			return nodeVal;
		}
		else {
			if(nodeVal.data > key){
				System.out.println("Going to left" + nodeVal.data);
			nodeVal.left = insert(nodeVal.left, key);
			}
				
		
			else {
				if(nodeVal.data < key){
					System.out.println("Going to right"+ nodeVal.data);
					nodeVal.right = insert(nodeVal.right, key);
				}

			
			}
		}

		return nodeVal;
	}

	public void print(Node nodeVal){

			if(nodeVal != null){
				print(nodeVal.left);
				System.out.println(nodeVal.data + "-----");
				print(nodeVal.right);
			}
		}

	public static void main(String args[]){

		Scanner reader = new Scanner(System.in);
		boolean flag = true;
		LowestCommonAncestor bst = new LowestCommonAncestor();

		while(flag){
			System.out.println("\n1. Insert \n2. Find LCA \n3. Print");
			int option = reader.nextInt();

			switch(option){
				case 1: 
						System.out.println("Enter a value to insert:");
						int val = reader.nextInt();
						bst.root = bst.insert(bst.root, val);
						break;
				case 2: System.out.println("Enter Value 1");
						int val1 = reader.nextInt();
						System.out.println("Enter Value 2");
						int val2 = reader.nextInt();
						Node lca = bst.getLCA(bst.root, val1, val2);
						if(lca != null){
							System.out.println("The LCA is " + lca.data);
						}
						else{
							System.out.println("The LCA is null");
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