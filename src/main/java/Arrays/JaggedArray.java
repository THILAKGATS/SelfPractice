package Arrays;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int [][] jaggarr = {{1,2,3,4},{2,4,5},{5,6,7}};
		for(int row = 0;row<jaggarr.length;row++)
		{
			for(int column=0;column<jaggarr[row].length;column++)
			{
				System.out.print(jaggarr[row] [column]+" ");
			}
			System.out.println();
		}
	}

}
