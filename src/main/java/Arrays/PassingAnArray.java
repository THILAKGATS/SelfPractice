package Arrays;

import java.util.Arrays;

public class PassingAnArray {

	public static void main(String[] args) {
		int [] num = {10,20,30,40,50};
		System.out.println(Arrays.toString(num));
		PassingAnArray pass = new PassingAnArray();
		pass.Passvalue(num);

	}
	public void Passvalue(int[]num1)
	{
		System.out.println(num1.length);
		num1[2]= 80;
		System.out.println(Arrays.toString(num1));
		
	}

}
