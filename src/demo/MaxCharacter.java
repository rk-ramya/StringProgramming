package demo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCharacter {
	static void maxCharacters(String str1) {
		int[] array=new int[26];
		str1=str1.toLowerCase();

		for(int i=0;i<str1.length();i++) {
			int ch=str1.charAt(i);
			array[ch-97]++;
				}
		int max=0;
		for(int i=1;i<array.length;i++)
			if(array[i]>array[max])
				max=i;

		System.out.println("Maximum occuring characters :"+ (char)(max+97));
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String:");
	String str1=sc.nextLine();
	maxCharacters(str1);

	sc.close();
}

}
