package seleniumStart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(22222);
		list.add(2);
		list.add(222222222);
		list.add(222222);
		list.add(2222);
		list.add(222);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		 LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
		System.out.println(hashSet);
		
	}

}
