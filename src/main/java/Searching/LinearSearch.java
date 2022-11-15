package Searching;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr = {22,34,67,12,56};
		System.out.println(Arrays.toString(arr));
		int find = 67;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				System.out.println("the number is "+find +" "+"the index is "+i);
			}
			
				
		}
		
	}

}
