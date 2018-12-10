import java.awt.Color;

public class MyColor extends MyComparable {
	private Color color;
	
	// Constructor
	MyColor(Color c){
		color = c;
	}
	//Override SuperClass functions
	@Override
	public boolean inferior(MyComparable other) {
		return ((MyColor)other).color.getRed() + ((MyColor)other).color.getGreen() +
				((MyColor)other).color.getBlue() < color.getRed() + color.getGreen() + color.getBlue();
	}
	@Override
	public boolean equal(MyComparable other) {
		return ((MyColor)other).color.getRed() == color.getRed() && 
				((MyColor)other).color.getGreen() == color.getGreen() &&
				((MyColor)other).color.getBlue() == color.getBlue();
	}
}
