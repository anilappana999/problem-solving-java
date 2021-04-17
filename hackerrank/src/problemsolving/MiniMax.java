package problemsolving;

import java.util.Arrays;

public class MiniMax {
/////////////////////////////////////////////////////
	static void miniMaxSum(int[] arr) {
		long a=0;
		long b=0;
		long sum=0;


		for(int i=0;i<arr.length;i++){
		    sum=sum+arr[i];
		}

		Arrays.sort(arr);

		a=sum-arr[0];
		b=sum-arr[arr.length-1];


		System.out.print(b);
		System.out.print(" ");
		System.out.print(a);


		    }//////////////////////////////////////////////////////////
}
