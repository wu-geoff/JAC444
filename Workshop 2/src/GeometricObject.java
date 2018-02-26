import java.util.Date;

public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated = new Date();
	
	public GeometricObject() {}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		setFilled(filled);
	}

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

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract String toString();
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
