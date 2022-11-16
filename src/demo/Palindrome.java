package demo;
import java.util.Scanner;

public class Palindrome {

	static void checkPalindrome(String str) {
		int flag=0;
				for(int i=0,j=str.length()-1;i<str.length()-1 && j>=0;j--,i++) {
				if(str.charAt(i)!=str.charAt(j)) {
					flag=1;
					break;
			}
		}
		if(flag==1)
			System.out.println("The string "+str+ " is not palindrome");
		else
			System.out.println("The string "+str+ " is palindrome");
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		checkPalindrome("2552");
		sc.close();
	}

}
