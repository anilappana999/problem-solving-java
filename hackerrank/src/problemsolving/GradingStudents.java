package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
//code starts here
	public static List<Integer> gradingStudents(List<Integer> grades) {
	
	    List<Integer> grades1 = new ArrayList<>();
	    for(Integer i:grades ){
	      Integer num =i;
	      Integer num1 = (Integer)Math.round(num/5)*5;
	      num1+=5;
	      if(i<38||num1-num>=3){
	          grades1.add(i);
	      }
	      else{
	          grades1.add(num1);
	      } 
	         
	    }
	return grades1;
	    }
	//code ends here
	public static void main(String[] args) {
		 

		

	}

}
