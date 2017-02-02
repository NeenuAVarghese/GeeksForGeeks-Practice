public class MultiplicationTable{
	
	public void mulTable(int val){
		for(int i = 1; i<= val; i++){
			for(int j = 1; j <= val; j++){
				System.out.print("\t" + j*i);
			}
			System.out.println("");
		}
	}

	public static void main(String args[]){
		MultiplicationTable mT = new MultiplicationTable();
		mT.mulTable(10);
	}
}