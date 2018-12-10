import java.util.LinkedList;
import java.util.List;

public class MyString extends MyComparable{
	//Private variables
	private List<Character> data;
	
	//Constructor
	public MyString(String s) {
		this.data = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			this.data.add(i, Character.toLowerCase(s.charAt(i)));
		}
	}
	
	//Override SuperClass functions
	@Override
	public boolean inferior(MyComparable other) {
		// code
		return false;
	}

	@Override
	public boolean equal(MyComparable other) {
		// code
		return false;
	}
}
