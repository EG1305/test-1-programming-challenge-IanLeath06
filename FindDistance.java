import java.lang.Math;
import java.util.Scanner;

public class FindDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FindDistance fd = new FindDistance();
		System.out.println("Please enter the x and y values for the first point.\nx:");
		double x1 = input.nextDouble(); // Storing each of the inputs into respective variables
		System.out.println("y:");
		double y1 = input.nextDouble();
		System.out.println("Please enter the x and y values for the second point.\nx:");
		double x2 = input.nextDouble();
		System.out.println("y:");
		double y2 = input.nextDouble();
		double d = fd.getDistance(x1, y1 ,x2, y2); // It would take more space to call directly in the next two lines
		System.out.println("The distance between these two points is " + d); // I forgot how to truncate to 2 decimal places
		System.out.println("Classification: " + fd.classifyDistance(d)); // Saving some coding space by just directly calling the object
		input.close(); // Closing input for security
	}
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return ((double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))); // Just ripped pythagorean equation directly
	}
	public static String classifyDistance(double distance) {
		if (distance < 5) {
			return "Short";
		} else if (distance <= 15 && distance >= 5) {
			return "Medium";
		} else {
			return "Long"; // Theres definitely an easier and more efficient way to do this but it's ok for this
		}
	}
}
