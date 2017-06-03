public class InsertionSort{

	static int[] insertionSort(int arr[]){

		for(int i = 1; i < arr.length - 1; i++){
			int j = i-1;
			int key = arr[i];

			while(j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j = j -1;
			}

			arr[j + 1] = key;
		}

		return arr;

	}

	public static void main(String args[]){
		int[] array =  {89,23,56,12,22,38,1,39,99,22,6};

		array = insertionSort(array);

		System.out.println("Sorted array:");
		for(int i = 0; i < array.length - 1; i++){
			System.out.println(array[i] + " ");
		}
	}
}

//Complexity = O(n^2)