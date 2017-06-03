import java.util.LinkedList;
import javafx.util.Pair;
import java.util.Scanner;

public class AdjacencyListGraph{


static class AdjacencyList{
	
	private final LinkedList< Pair<Integer, Integer> > [] adjacencyList;

	public AdjacencyList(int vertices){
		adjacencyList = (LinkedList < Pair<Integer,Integer> > []) new LinkedList[vertices];

		for(int i = 0; i<adjacencyList.length; i++){
			adjacencyList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int startVertex, int endVertex, int weight){
		adjacencyList[startVertex].add(new Pair<>(endVertex, weight));
	}

	public int getEdgesToVertex(int vertex){
		return adjacencyList[vertex].size();
	}

	public void printList(){
		int i=0;

		for(LinkedList< Pair<Integer, Integer> > list : adjacencyList){

			System.out.println("[" + i + "] -->" );

			for(Pair<Integer, Integer> node: list){
				System.out.print(node.getKey() + "(" + node.getValue() + ")-");
			}
			i++;
			System.out.println();
		}
	}

	public boolean removeEdge(int startVertex, Pair<Integer, Integer> edge){
		return adjacencyList[startVertex].remove(edge);
	}
}

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Vertices: ");
		int vertices = scan.nextInt();
		AdjacencyList adjacencyList = new AdjacencyList(vertices);


		System.out.println("Enter Number of Edges:");
		int edges = scan.nextInt();

		int i = 0;
		while(i < edges){
			System.out.println("Enter Start Edge, End Edge and weight");
			int s = scan.nextInt();
			int e = scan.nextInt();
			int w = scan.nextInt();

			adjacencyList.addEdge(s, e, w);
			i++;
		}

		adjacencyList.printList();
	}
}