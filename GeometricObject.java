package chast4;

public class GeometricObject {
	
	GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	GeometricObject(){
	
	}
	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

}
