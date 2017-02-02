public class findNthFibonacci{

	int fibonacciArray[];
	
	public int findFibonacci(int n){

		if(n <= 1){
			return n;
		}
		else{
			return findFibonacci(n - 1) + findFibonacci(n - 2); 
		}
	}

	public static void main(String args[]){

		findNthFibonacci fnf = new findNthFibonacci();

		System.out.println("Nth fibonacci is :" + fnf.findFibonacci(2) + " n = 2 ");

	}
}