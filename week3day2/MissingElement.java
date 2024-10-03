package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	   int[] num=  {1, 2, 3, 4, 10, 6, 8};
	   List<Integer> unq=new ArrayList<Integer>();
	   for (int j = 0; j < num.length; j++) {
	   unq.add(num[j]);
	   }   
System.out.println(unq);
Collections.sort(unq);
System.out.println(unq);

for (int i = 0; i < unq.size()-1; i++) {
	if (unq.get(i)+1!=unq.get(i+1)) {
		System.out.println(unq.get(i)+1);
	}
}

	}

}
