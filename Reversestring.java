package Assignment1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kedarnath";
		
		char chars[] = str.toCharArray();
		
		for(int i= chars.length-1; i>=0; i-- ){
			System.out.print(chars[i]);
			
		}

	}

}
