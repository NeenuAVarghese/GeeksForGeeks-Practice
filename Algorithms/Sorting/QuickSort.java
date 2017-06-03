public class QuickSort{
	
	public void quickSort(int arr[], int low, int high){
		
		if(low < high){

			int pivot = partition(arr, low, high);

			quickSort(arr, low, pivot -1);
			quickSort(arr, pivot+1, high);
		}
	}


	public int partition(int arr[], int low, int high){

		int pivot = arr[high];

		int i = low - 1;

		for(int j = low; j <= high ; j++){

			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}

	static void printArray(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[]){

		QuickSort qs = new QuickSort();

		int[] arr =  {89,23,56,12,22,38,1,39,99,22,6};

		qs.quickSort(arr, 0, arr.length-1);

		System.out.println("Sorted array:");
		printArray(arr);
	}

}