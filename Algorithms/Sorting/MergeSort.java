public class MergeSort{


	public static void merge(int arr[], int low, int high, int mid){

		int lengthL = mid - low + 1;
		int lengthR = high - mid;


		int lArray[] = new int[lengthL];
		int rArray[] = new int[lengthR];

		for(int i = 0; i < lengthL ; i++){
			lArray[i] = arr[low+i];
		}

		for(int j = 0 ; j < lengthR; j++){
			rArray[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = low;
		while(i < lengthL && j < lengthR){

			if(lArray[i] < rArray[j]){
				arr[k] = lArray[i];
				i++;
			}
			else{
				arr[k] = rArray[j];
				j++;
			}
			k++;
		}

		while(i < lengthL){
			arr[k] = lArray[i];
			i++;
			k++;
		}

		while(j < lengthR){
			arr[k] = rArray[j];
			j++;
			k++;
		}


	}
	
	public static void sort(int arr[], int low, int high){

		int mid = (low + high)/2;
		if( low < high){
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			merge(arr, low, high, mid);
		}
		
	}


	public static void main(String args[]){
		int arr[] = {64, 25, 12, 22, 11};
		sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array is:");
		for(int i=0; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}

	}
}