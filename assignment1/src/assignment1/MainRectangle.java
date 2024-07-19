package assignment1;

public class MainRectangle {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		
		obj.setWidth(2);
		obj.setHeight(4);
	

        int width = obj.getWidth(); 
        int height = obj.getHeight(); 
        int area = obj.ConputeArea(); 

        System.out.println("ค่าความกว้าง: " + width); 
        System.out.println("ค่าความสูง: " + height); 
        System.out.println("พื้นที่สี่เหลี่ยม: " + area); 
	}
}
