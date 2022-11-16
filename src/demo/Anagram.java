package demo;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
//	public void stringSort(String str1, String str2) {
//		
//	}
	
	static void checkAnagram(String str1, String str2) {
		int[] aToZ1=new int[26];
		int[] aToZ2=new int[26];
		str1=str1.toLowerCase();

		for(int i=0;i<str1.length();i++) {
			int ch=str1.charAt(i);
			aToZ1[ch-97]++;
				}

		str2=str2.toLowerCase();
		for(int i=0;i<str2.length();i++) {
			int ch=str2.charAt(i);
			aToZ2[ch-97]++;
				}
		
		if(Arrays.equals(aToZ1,aToZ2))
			System.out.println("Both Strings are Anagrams");
		else
			System.out.println("Both Strings are not Anagrams");
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String:");
	String str1=sc.nextLine();
	System.out.println("Enter the first String:");
	String str2=sc.nextLine();
	checkAnagram(str1,str2);
	sc.close();
}
}
