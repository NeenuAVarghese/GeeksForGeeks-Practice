public class BubbleSort{


	static int[] bubbleSort(int arr[]){

		for(int i = 0; i < arr.length - 1; i++){
			 boolean swapped = false;
			for(int j = 0; j < arr.length - i - 1; j ++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				
			}

			if(!swapped){
				break;
			}
			
		}

		return arr;

	}

	public static void main(String args[]){
		int[] array =  {89,23,56,12,22,38,1,39,99,22,6};

		array = bubbleSort(array);

		System.out.println("Sorted array: \n");
		for(int i = 0; i < array.length - 1; i++){
			System.out.print(array[i] + " ");
		}
	}
}

//Complexity = O(n^2) - Improved by adding "swapped" variable to void unnecessary iteratiosn if the array is already swapped