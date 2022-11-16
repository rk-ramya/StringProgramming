package demo;

import java.util.Scanner;

public class Pangram {
	static void checkPangram(String str) {
			str=str.toLowerCase();
			int count =0;
			
			for (char ch = 'a'; ch <= 'z'; ch++) {
				count=0;
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)==ch) {
						count++;
					}
				}
					if(count==0) {
						System.out.println("Not a pangram string");
						return;
					}
			
		}
			System.out.println("It is a Pangram String");
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String:");
	String str1=sc.nextLine();
	checkPangram(str1);

	sc.close();
}


}
