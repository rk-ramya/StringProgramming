package demo;
import java.util.Scanner;

//Question 4
public class VowelsConsonants {

		static void CheckString(String str) {
			int vowel = 0,consonant=0,specialChars=0;
			str=str.toLowerCase();
			String specialCharacters="!@#$%&*()’+,-./:;<=>?[]^_`{|}";
			for(int i=0;i<str.length();i++) {
				int ch=str.charAt(i);
				if(ch>=97 && ch<=122 ){
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
	            || str.charAt(i) == 'u')
					vowel++;
				else
					consonant++;
			}
		}
		
			for(int i=0;i<specialCharacters.length();i++) {
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)==specialCharacters.charAt(i))
						specialChars++;
				}
			}
			System.out.println("Count of Vowels = "+vowel);
			System.out.println("Count of Consonants = "+consonant);
			System.out.println("Count of Special Characters = "+specialChars);
	}
			

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String:");
			CheckString(sc.nextLine());
			sc.close();
		}
	}


