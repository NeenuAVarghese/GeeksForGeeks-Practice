public class InterpolationSearch{

	public static int interpolationSearch(int arr[], int val){

		int low = 0, pos  = 0, high = arr.length -1;


		while(low <= high && val >= arr[low] &&  val <= arr[high]){

			pos = low + ((val - arr[low]) * (high - low) / (arr[high] - arr[low]));

			if(arr[pos] == val){
				return pos;
			}

			if(arr[pos] > val){
				high = pos -1;
			}

			if(arr[pos] < val){
				low = pos + 1;
			}
		}

		return -1;

	}

	public static void main(String args[]){
		int arr[] =  {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

		int returnVal = interpolationSearch(arr, 33);
		if(returnVal == -1){
			System.out.println("Value not found");
		}
		else{
			System.out.println("Searched value is at: " + returnVal);
		}	
	}

}