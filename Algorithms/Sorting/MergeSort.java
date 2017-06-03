public class MergeSort{

	public void merge(int low,int high, int mid, int arr[]){

		int l1 = mid - low + 1;
		int l2 = high - mid;

		int[] arr1 = new int[l1];
		int[] arr2 = new int[l2];

		for(int i=0;i<l1;i++){
			arr1[i] = arr[i + low];
		}

		for(int j=0; j<l2; j++){
			arr2[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = low;

		while(i < l1 && j < l2){

			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
			else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while( i < l1){
			arr[k] = arr1[i];
			i++;
			k++;
		}

		while( j < l2){
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}


	public void mergeSort(int low, int high, int arr[]){

		if(low < high){
			int mid = (low + high)/2;

			mergeSort(low, mid, arr);
			mergeSort(mid + 1, high, arr);
			
			merge(low, high ,mid, arr);
		}
	}

	static void printArray(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[]){

		MergeSort mg = new MergeSort();

		int[] arr =  {89,23,56,12,22,38,1,39,99,22,6};

		mg.mergeSort(0, arr.length-1, arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}
}

//Complexity = O(n log n)