package demo;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	static void removeDuplicate(String str) {
		char[] input=str.toCharArray();
		String result="";
		int i;
		Arrays.sort(input);
		for(i=0;i<input.length-1;i++) {
			if(input[i]==input[i+1])
				continue;
			else
				result+=input[i];
		}
		result+=input[i];
		System.out.println("String after removing duplicates "+result);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		removeDuplicate(sc.nextLine());
		sc.close();
	}

}

