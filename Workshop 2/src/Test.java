import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		try{
			double s1, s2, s3;
			String color, isFilled;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter side 1: ");
			s1 = Double.parseDouble(br.readLine());
			System.out.println("Enter side 2: ");
			s2 = Double.parseDouble(br.readLine());
			System.out.println("Enter side 3: ");
			s3 = Double.parseDouble(br.readLine());
			System.out.println("Enter color: ");
			color = br.readLine();
			System.out.println("Enter is filled: ");
			isFilled = br.readLine();
			
            Triangle t = new Triangle(s1, s2, s3);
            t.setColor(color);
            t.setFilled(isFilled.equals("true"));
            
            System.out.println(t.toString());
            System.out.println("Area: " + t.getArea() + " Perimeter: " + t.getPerimeter());
            System.out.printf("Color: %s Filled: %b\n", t.getColor(), t.isFilled());
        }
        catch (IllegalTriangleException ite) {
            ite.printStackTrace();
        }
	}

}
