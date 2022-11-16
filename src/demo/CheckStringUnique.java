package demo;
import java.util.Scanner;

//Question 7
public class CheckStringUnique {

	
	static void CheckUnique(String str) {
		int flag=0;
		for(int i=0;i<str.length()-1;i++)
			for(int j =i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=1;
				}
			}
		if(flag==0)
			System.out.println("String contains all unique characters");
		else
			System.out.println("String does not contains all unique characters");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		CheckUnique(sc.nextLine());
		sc.close();
	}

}
