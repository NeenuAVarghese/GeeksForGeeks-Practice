public class MissingNumber{

	public static int getMissingNo(int a[], int n){
		int x1 = a[0];
		int x2 = 1;

		for(int i=1; i<n; i++)
			x1 = x1 ^ a[i];

		for(int j = 2; j <= n+1; j++)
			x2 = x2 ^ j;

		return x1 ^ x2;
	}

	public static void main(String args[]){

		int a[] = {1, 2, 4, 6, 3, 7, 8};
		int n = 7;

		System.out.println("\n Missing NUmber was: "+ getMissingNo(a, n));
	}


}
