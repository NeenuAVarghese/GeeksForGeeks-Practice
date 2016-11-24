public class MajorityElement{
	public static void main(String args[]){
		int array[] = {2,3,4,4,4,4,3,3,2,5,5, 4,4, 4};
		int count[] = new int[10000];
		boolean flag = false;

		for(int i = 0; i < array.length; i++){
			count[array[i]] += 1;
			if(count[array[i]] >= (array.length/2)){
				System.out.println("count = " + count[array[i]] + "Var = " + array[i]);
				flag=true;
			}
		}
		if(!flag){
			System.out.println("Match Not found !");
		}
	}	

}