public class BinarySearch{
	
	public static int binarySearch(int arr[], int low, int high, int key){
		int mid = (low + high)/2;

		if(arr[mid] == key) return mid;

		if(arr[mid] > key) return binarySearch(arr, low, mid - 1, key);

		if(arr[mid] < key) return binarySearch(arr, mid + 1 , high, key);

		return -1;
	}

	public static void main(String args[]){

		int arr[] = {1,2,3,4,5,6,7,8,9};

		//Searching for "9"
		int returnVal = binarySearch(arr, 0 , arr.length, 9);

		if(returnVal == -1){
			System.out.println("Value not found");
		}
		else{
			System.out.println("Searched value is at: " + returnVal);
		}		
	}
}