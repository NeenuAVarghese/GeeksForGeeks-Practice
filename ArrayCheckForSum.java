/*
*Given an array A[] and a number x, check for pair in A[] with sum as x
*/

public class ArrayCheckForSum{

	//Max size for array
	private static final int MAX = 10000000;

	static void checkSum(int[] array, int sum){
		/*Boolean array for checking if a value exists in array
		* the value is initialized to FALSE
		*/
		boolean[] ifExists = new boolean[MAX];

		for(int i=0 ; i<array.length; i++){
			int temp = sum - array[i];
			if(temp >= 0 && ifExists[temp]){
				System.out.println("Match Found I = "+array[i]+" J = " + temp);
			}
			//Set the boolean to true for a value in array
			ifExists[array[i]] = true;
		}
	}

	public static void main(String args[]){
		
		int array[] = {2,3,4,5,6,7,8,9};
		int sum = 10;

		checkSum(array, sum);
	}

}
