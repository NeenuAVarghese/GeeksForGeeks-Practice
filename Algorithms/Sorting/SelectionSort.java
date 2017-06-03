public class SelectionSort{

	static int[] selectionSort(int arr[]){

		for(int i = 0; i < arr.length - 1; i++){
			int minIdx = i; 
			for(int j = i + 1; j < arr.length - 1; j ++){
				if(arr[minIdx] > arr[j]){
					minIdx = j;
				} 
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp; 
		}

		return arr;

	}

	public static void main(String args[]){
		int[] array =  {89,23,56,12,22,38,1,39,99,22,6};

		array = selectionSort(array);

		System.out.println("Sorted array:");
		for(int i = 0; i < array.length - 1; i++){
			System.out.println(array[i] + " ");
		}
	}
}

//Complexity = O(n^2)