package problemsolving;

import java.util.HashSet;

public class SockMerchant {
	 static int sockMerchant(int n, int[] ar) {
		 HashSet<Integer> hash = new HashSet<Integer>();
		 int count=0;
		 for(int i=0;i<n;i++){
		     int element = ar[i];

		     if(hash.contains(element)){
		         hash.remove(element);
		         count++;
		     }
		     else{
		     hash.add(element);}
		 }

		 return count;
		     }
}
