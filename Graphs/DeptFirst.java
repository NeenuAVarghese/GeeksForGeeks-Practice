import java.util.LinkedList;
import java.util.Scanner;

public class DeptFirst{

	static class Graph{

		LinkedList<Integer> list[];
		int vertices;

		Graph(int verticesC){

			vertices = verticesC;

			list = new LinkedList[vertices];
			for(int i = 0; i< vertices; i++){
				list[i] = new LinkedList();
			}
		}

		public void addNode(int n1, int n2){
			list[n1].add(n2);
		}

		void DFSUtil(int v, boolean visited[]){

			visited[v] = true;
			System.out.print(v + " - ");

			for(Integer i: list[v]){
				if(!visited[i]){
					DFSUtil(i, visited);
				}
			}
		}

		void DFS(int start){

			boolean visited[] = new boolean[vertices];

			DFSUtil(start, visited);
		}
	
	}


	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Vertices: ");
		int vertices = scan.nextInt();
		Graph graph = new Graph(vertices);


		System.out.println("Enter number of Edges: ");
		int edges = scan.nextInt();

		int i = 0;
		while(i < edges){

			System.out.println("Enter node1 and node2");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();

			graph.addNode(n1, n2);
			++i;
		}

		System.out.println("Enter the start node");
		int start = scan.nextInt();

		graph.DFS(start);
	}
}