package Arrays;

public class MultiArray {

	public static void main(String[] args) 
	{
		int [][] arr = {{1,2,3},{2,4,5},{5,6,7}};
		for(int i =0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
