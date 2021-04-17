package problemsolving;

public class AlternatingCharacters {
	 static int alternatingCharacters(String s) {
		 int count = 0;
		 int a[] =  new int[s.length()];
		 for(int i=0;i<s.length();i++){
		     a[i] = s.charAt(i);
		 }
		 for(int k=0;k<a.length-1;k++){
		     if(a[k]==a[k+1]){
		         count++;
		     }
		     
		 }
		 return count;
		     }

}
