public class BinarySearch{

	static int binarySearch(int low, int high, int arr[], int val){
		if(low >= high){
			return -1;
		}

		int mid = (low + high - 1)/2;
		System.out.println(mid);
		if(arr[mid] == val){
			return mid + 1; 
		}
		if(arr[mid] > val){
			return binarySearch(low, mid-1, arr, val);
		}
	
		return binarySearch(mid+1, high, arr, val);
		
	}

	public static void main(String args[]){

		int[] array = {1,5,8,29,55,69,111,450};

		int returnValue = binarySearch(0, array.length - 1, array, 69);

		if(returnValue == -1){
			System.out.println("Value not Found !");
		}
		else{
			System.out.println("Value found at "+ returnValue);
		}

 	}
}

//Complexity O(log n)