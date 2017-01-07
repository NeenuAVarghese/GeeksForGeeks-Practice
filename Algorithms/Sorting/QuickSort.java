public class QuickSort{

	public static int partition(int arr[], int low, int high){

		int pivot = arr[high];
		int i = low - 1, temp;

		for(int j = low; j < high; j++){

			if(arr[j] <= pivot){
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;

	}

	public static void quickSort(int arr[], int low, int high){

		if(low < high){

			int index = partition(arr, low, high);

			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}

	public static void main(String args[]){
		int arr[] = {64, 25, 12, 22, 11};
		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array is:");
		for(int i=0; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}
	}
}