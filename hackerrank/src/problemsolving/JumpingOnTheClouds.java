package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {

		List<Integer> lis = new ArrayList<>();

		for(int i=0;i<c.length;i++){

		    if(c[i]==0){
		        lis.add(i);
		    }
		}


		for(int k=0;k<lis.size()-2;k++){
		    if(lis.get(k)+1==lis.get(k+1) && lis.get(k)+2==lis.get(k+2)){
		        lis.remove(lis.get(k+1));
		    }
		}

		return lis.size()-1;
		    }
}
