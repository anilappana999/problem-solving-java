package problemsolving;

public class FindDigits {
	 static int findDigits(int n) {
		 int count =0;
		 int countOfDigits = (int)(Math.log10(n)+1);
		 for(int i=0;i<countOfDigits;i++){
		 String s = String.valueOf(n);
		 s = s.substring(i,i+1);
		 int j =Integer.parseInt(s);
		 if(j!=0 && n%j==0){
		     count++;
		 }
		 }
		 return count;
		     }
}
