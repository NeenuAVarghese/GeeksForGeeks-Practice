public class MajorityElement{
	public static void main(String args[]){
		int array[] = {2,3,4,4,4,4,3,3,2,5,5, 4,4, 4};
		int count[] = new int[10000];

		for(int i = 0; i < array.length; i++){
			count[array[i]] += 1;
		}

		for(int j=0; j < count.length; j++){
			if(count[j] >= (array.length/2)){
				System.out.println("count = " + count[j] + "i = " + j);
			}
		}
	}	

}