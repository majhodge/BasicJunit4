import java.util.LinkedList;

public class HelloWorld {
	
	private static LinkedList<String> schoolBag;
	
	public static void main(String[] args ){
		//System.out.println(sum(3, 5));
		schoolBag = new LinkedList<String>();
		addToMyBag("markers");
		addToMyBag("books");
	}
	public static int sum(int var1, int var2) {
        return var1 + var2;
    }
	
	public static LinkedList<String> addToMyBag(String newItem) {
		schoolBag.add(newItem);
		System.out.println(schoolBag.peekLast());
		return schoolBag;
	}
 }
