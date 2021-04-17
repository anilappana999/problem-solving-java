package problemsolving;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {
////////////////////////////////////////////////////////////////////////
	public static int pickingNumbers(List<Integer> a) {
		   int count=0;
		   int max=0;
		   Collections.sort(a);
		   for(int i=0;i<a.size();i++){
		       for(int j=i+1;j<a.size();j++){
		           if(Math.abs(a.get(i)-a.get(j))<=1){
		               count++;
		           }
		       }
		 
		  if(count>max)
		  max=count;
		  count=0;
		   

		   }
		 return max+1;
		    }///////////////////////////////////////////////////////////////////////
}
