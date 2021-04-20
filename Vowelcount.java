package Assignment1;
import java.io.*;

public class Vowelcount {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        String str ="Rogue Aspirant";
        
        countVowels(str);
	}

	
	private static void countVowels(String str) {
		
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0;i<str.length();i++){
			if(isVowel(str.charAt(i))){
				++vowelCount;
			}else{
				++consonantCount;
			}
		}
	    System.out.println("Vowel Count="+vowelCount);
	    System.out.println("Consonant Count="+consonantCount);
}

	private static  boolean isVowel(char ch){
		ch=Character.toUpperCase(ch);
		return (ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U');
	}
}
	