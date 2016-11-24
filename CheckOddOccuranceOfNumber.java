public class CheckOddOccuranceOfNumber{

	static int checkOddOccurance(int array[]){
		int res=0;
		for(int i=0; i < array.length; i++){
			res = res ^ array[i];
		}	
		return res;

	}

	public static void main(String args[]){
		int array[] = {2,2,3,4, 4, 5,5,4,4};

		System.out.println("Element with Odd number of occurance is: "+ checkOddOccurance(array));

	}
}