package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectin {

	public static void main(String[] args) {
		int[] num = {3, 2, 11, 4, 6, 7};
		int[] num1= {1, 2, 8, 4, 9, 7};
		List<Integer> unq=new ArrayList<Integer>();
		List<Integer> unq1=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			unq.add(num[i]);
		}
	for (int j = 0; j < num1.length; j++) {
		unq1.add(num1[j]);
	}
	System.out.println(unq);
	Collections.sort(unq);
	System.out.println(unq);
	
	System.out.println(unq1);
	Collections.sort(unq1);
	System.out.println(unq1);
	for (int i = 0; i < unq.size()-1; i++) {
		for (int j = 0; j < unq1.size()-1; j++) {
			if (unq.get(i)==unq1.get(j)) {
				System.out.println(unq.get(i));
			}
		}
	}
	}
	

}
