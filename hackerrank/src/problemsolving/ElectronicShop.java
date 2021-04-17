package problemsolving;

public class ElectronicShop {
	/////////////////////////////////////////////////////////////////
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	       int spent=-1;

	       for(int i=0;i<keyboards.length;i++){
	           for(int j=0;j<drives.length;j++){


	               int total= keyboards[i]+drives[j];
	               if(total<=b){
	                   spent=Math.max(spent,total);
	               }
	              
	       }

	    }
	return spent;}///////////////////////////////////////////////////////
}
