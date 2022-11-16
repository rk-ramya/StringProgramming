package demo;
import java.util.Scanner;

//Question2
public class FindDuplicates {

	
	static void findDuplicates(String str) {
		int flag=0;
		for(int i=0;i<str.length()-1;i++)
			for(int j =i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					if(flag==0)
						System.out.println("The Duplicates found in the String :");
					System.out.println(str.charAt(i));
					flag=1;
				}
			}
		if(flag==0)
			System.out.println("No duplicates in the String");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		findDuplicates(sc.nextLine());
		sc.close();
	}

}
