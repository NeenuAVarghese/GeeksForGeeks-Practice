public class SelectionSort{

	public static void selectionSort(int arr[]){
		int min, temp;

		for(int i = 0 ; i < arr.length; i ++){
			min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println("Sorted array is:");
		for(int i=0; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}

	}

	public static void main(String args[]){

		int arr[] = {64, 25, 12, 22, 11};
		selectionSort(arr);
	}
}