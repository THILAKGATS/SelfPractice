
package Arrays;

import java.util.Scanner;

public class SearchingAnArray {

	
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,4,5,6};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scan.nextInt();
		for(int pos= 0;pos<num.length;pos++)
		{
			if(num[pos]==number)
			{
				System.out.println(number+"the index number is"+pos);
			}
			
				
			
		}
		
		

	}
	

}
