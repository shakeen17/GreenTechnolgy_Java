package sample;

import java.util.*;

public class Dulpilicate {
public static void main(String[] args) {
	int[] arr = {1,2,3,3,2,4,5,6,7};
	List<Integer> dup = new ArrayList<>();
	HashMap<Integer,Integer> map = new HashMap<>();
//	for(int i : arr) {
//		map.put(i,map.getOrDefault(i, 0) + 1);
//    }
//	System.out.println(map);
//  for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
//	  if(entry.getValue()> 1) {
//		  System.out.print(entry.getKey() + " ");
//	  }
//  }
	for(int i: arr) {
		if(map.containsKey(i)) {
			dup.add(i);
		}
		else {
			map.put(i,map.getOrDefault(i, 0) + 1);
		}
	}
//	System.out.println(map);
	System.out.println(dup);
}
}
