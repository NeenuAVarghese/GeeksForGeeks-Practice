public class InsertionSort{
	
	public static void insertionSort(int arr[]){

		int j, key;

		for(int i=1; i<arr.length; i++){
			j = i-1;
			key = arr[i];
			while(j>=0 && arr[j] > key){
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = key;
		}

		System.out.println("Sorted array is:");
		for(int i=0; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}

	}

	public static void main(String args[]){

		int arr[] = {64, 25, 12, 22, 11};
		insertionSort(arr);
	}
}