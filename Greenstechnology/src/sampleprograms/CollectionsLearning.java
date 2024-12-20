package sampleprograms;
import java.util.*;
public class CollectionsLearning {
 public static void main(String[] args) {
	List<Object> obj1 = new ArrayList();
	
	obj1.add("Pink");
	obj1.add(11);
	obj1.add(10.9);
	obj1.add('R');
	obj1.add(true);
	obj1.set(1, "blue");
	System.out.println(obj1);
	System.out.println(obj1.get(0));
	
	List<String> obj2 = new ArrayList<>();
	obj2.add("sam");
	obj2.add("sanjay");
	System.out.println(obj2);
	
	List<Object> obj3 = new LinkedList<>();
	obj3.add("Red");
	obj3.add("Black");
	obj3.add("Yellow");
	
	obj3.addFirst("Blue");
	obj3.addLast("Pink");
	
	System.out.println(obj3);
	
	HashSet<Integer> h1 = new HashSet<>(Arrays.asList(1,2,3,5,4));
	LinkedHashSet<Integer> h2 = new LinkedHashSet<>(Arrays.asList(1,2,3,5,4));
	TreeSet<Integer> h3 = new TreeSet<>(Arrays.asList(1,2,3,5,4));
	System.out.println(h1 + " " + h2 + " " + h3);
	
	HashMap<String,String> hm1 = new HashMap<>();
	hm1.put("india", "delhi");
	hm1.put("Japan", "Tokyo");
	hm1.put("usa", "washington DC");
	hm1.replace("usa", "newyork");
	hm1.remove("japan");
//	hm1.put("Sanjay", "College Mate");
//	hm1.put("Chirag", "School Mate");
//	hm1.put("Joshua", "College Mate");
//	hm1.put("Madav", "School Mate");
//	System.out.println(hm1);
	System.out.println(hm1.get("india"));
	
	TreeMap<String, String> tm1 = new TreeMap<>();
	tm1.put("Sanjay", "College Mate");
	tm1.put("Chirag", "School Mate");
	tm1.put("Joshua", "College Mate");
	tm1.put("Madav", "School Mate");
	
	System.out.println(tm1);
}
}
