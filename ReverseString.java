public class ReverseString{
	
	public String reverseString(String str){

		char[] temp =str.toCharArray();
		int len = str.length();

		int j=0;
		for(int i = 0; i < len/2 ; i++){
			char c = temp[i];
			temp[i] = temp[len - 1 - i];
			temp[len - 1 - i] = c;
		}
		return new String(temp);
	}


	public static void main(String args[]){

		ReverseString revStr = new ReverseString();
		System.out.println("Reverse of 'hello' is: " +revStr.reverseString("hello"));
	}
}