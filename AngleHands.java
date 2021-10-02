import java.util.Scanner;

public class AngleHands {
	public static void main(String[] args) {
		int hours = 0;
		int minutes = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter hours :");
		hours = scan.nextInt();
		System.out.println("Enter minutes :");
		minutes = scan.nextInt();
		if (hours < 0 || minutes < 0 || hours > 12 || minutes > 60) {
			System.out.println("Please enter correct input.");
		} else {
			if (hours == 12)
				hours = 0;
			if ( minutes == 60)
				minutes = 0;
			
			double hourHandAngle = 0.5 * (hours * 60 + minutes);
			int minuteHandAngle = 6 * minutes;
			
			double angle = Math.abs(hourHandAngle - minuteHandAngle);
			System.out.println("Angle between hands is :"+angle);
		}
	}
}