package set_org;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TestSet {
	public static void main(String[] args) {
		Set<String> fruits=new TreeSet();
		//TreeSet fruits=new TreeSet();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Fig");
		System.out.println("treeset "+fruits);
		Set<String> fruits1=new HashSet();
		//HashSet fruits=new HashSet();
		fruits1.add("Apple");
		fruits1.add("Orange");
		fruits1.add("Banana");
		fruits1.add("Orange");
		fruits1.add("Pineapple");
		fruits1.add("Grapes");
		fruits1.add("Apple");
		fruits1.add("Fig");
		System.out.println("Hashset "+fruits1);
	}

}
