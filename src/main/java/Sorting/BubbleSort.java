package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] sort = {98,89,76,67,56,23,45,49,23};
		BubbleSort at  = new BubbleSort();
		at.bubble(sort);
		System.out.println("After sorting the values"+Arrays.toString(sort));
		
	}
	public void bubble(int [] sort1)
	{
		System.out.println("Before sorting"+Arrays.toString(sort1));
		for(int i=0;i<sort1.length;i++)
		{
			for(int j=0;j<sort1.length-i-1;j++)
			{
				if(sort1[j]<sort1[j+1])
				{
					int swap = sort1[j];
					sort1[j]=sort1[j+1];
					sort1[j+1]=swap;
					
				}
			}
		}
	}

}
