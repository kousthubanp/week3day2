package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Findsecondlargest {

	public static void main(String[] args) {
		int[] num= {3, 2, 11, 4, 6, 7};
		List<Integer> unq=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			unq.add(num[i]);
		}
System.out.println(unq);	
Collections.sort(unq);
System.out.println(unq);
	Integer integer = unq.get(4);
	System.out.println(integer);
	
	}

}
