package Arrays;

import java.util.Scanner;

public class InsertingAnArrayScan {

	public static void main(String[] args)
	{
		String [] name = new String[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Please enter the name");
			name[i] = scan.nextLine();
			
			
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		
	}

}
