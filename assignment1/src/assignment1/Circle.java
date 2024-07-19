package assignment1;

public class Circle {

	private Double radius;
	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public void computeArea() {
		if (radius == null || radius <= 0) {
			System.out.println("กำหนดค่า Radius ให้ถูกต้อง.");
			return;
		}
		
		double area = Math.PI * radius * radius;
		System.out.println("พื้นที่รอบวงกลม: " + area);
	}
	
}
