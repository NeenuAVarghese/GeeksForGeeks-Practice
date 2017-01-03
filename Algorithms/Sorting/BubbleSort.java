public class BubbleSort{

	public static void bubbleSort(int arr[]){
		int temp;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length -1- i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println("Sorted array is:");
		for(int i=0; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String args[]){
		 int arr[] = {64, 34, 25, 12, 22, 11, 19};

		 bubbleSort(arr);
	}
}