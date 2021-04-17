package problemsolving;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
	  public static int birthdayCakeCandles(List<Integer> candles) {
		    // Write your code here
		    int count=0;
		    int maxEl=Collections.max(candles);
		    for(Integer c:candles){
		        if(c==maxEl)
		        count++;
		    }
		return count;
		    }
}
