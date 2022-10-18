package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) {
		String [] anime = {"one piece","naruto","balck clover","one punch man"};
		System.out.println("Before updating the values"+Arrays.toString(anime));
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter, which position need to be updated");
		int pos = scan.nextInt();
		System.out.println("Enter the name  need to be updated");
		String newname =scan.next();
		anime[pos]=newname;
		System.out.println("After updating");
		//System.out.println("After updating the values"+Arrays.toString(anime));
		for(String anime1 :anime)
		{
			System.out.println(anime1+" ");
		}
		
		
				
		

	}

}
