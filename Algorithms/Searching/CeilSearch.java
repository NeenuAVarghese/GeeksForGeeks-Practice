public class CeilSearch{
	
	//Fundtion to get index of ceiling of x in array
	static int ceilSearch(int arr[], int low, int high, int val){

		if(val <= arr[low]){
			return low;
		}

		if(val >= arr[high]){
			return -1;
		}


		int mid = (low + high)/2;

		if(arr[mid] == val){
			return mid;
		}

		else{
			if(arr[mid] > val){

				if(mid - 1 >= low && val >= arr[mid - 1] ){
					return mid;
				}
				else{
					return ceilSearch(arr, low, mid - 1, val);
				}
			}
			else{

				if(mid + 1 <= high && val <= arr[mid +1]){
					return mid+1;
				}
				else{
					return ceilSearch(arr, mid+1, high, val);
				}
			}
		}
	}

	public static void main(String args[]){
		int[] arr = {2, 5, 6, 8, 10, 23, 57, 89, 569, 789, 900};

		int returnVal = ceilSearch(arr, 0, arr.length - 1, 22);

		if(returnVal == -1){
			System.out.println("No ceil value");
		}
		else{
			System.out.println("Ceil Value is located at: " + returnVal);
		}
	}
}

//Complexity O(log n)