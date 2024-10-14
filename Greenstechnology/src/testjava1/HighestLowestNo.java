package testjava1;
import java.util.*;
public class HighestLowestNo {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>(Arrays.asList(1, 5, 7, 8, 3, 4, 8, 9, 8, 10));
	List<Integer> list = new LinkedList<>(set);
    System.out.println("The Smallest Element is: " + list.get(0) + " and Largerest Element is: " + list.get(list.size() - 1));
   
}
}
