package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] sort = {55,74,31,23,4,17};
		SelectionSort at = new SelectionSort();
		at.sorting(sort);
		for(int arr:sort)
		{
			System.out.print(arr+" ");
		}

	}
	public void sorting(int []sort1)
	{
		System.out.println("before sorting the values"+Arrays.toString(sort1));
		for(int i =0; i<sort1.length;i++)
		{
			for(int j=0;j<sort1.length;j++)
			{
				if(sort1[i]<sort1[j])
				{
					sort1[i]^=sort1[j];
					sort1[j]^=sort1[i];
					sort1[i]^=sort1[j];
				}
			}
		}
	}

}
