public abstract class MyComparable {
	
	//abstract if italic in UML -  will be written in child
	//public if + in UML
	//private if - in UML
	
	//Mutators - change values from class {none}
	//Accessors Methods - return values from class {none}
	//Calculation Methods
	public abstract boolean inferior(MyComparable other);
	public abstract boolean equal(MyComparable other);
	public boolean inferiorOrEqual(MyComparable other) {
		//code
		return false;
	}	
	public boolean superiorOrEqual(MyComparable other) {
		//code
		return false;
	}	
	public boolean superior(MyComparable other) {
		//code
		return false;
	}
}
