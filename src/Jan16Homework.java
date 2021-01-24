import java.lang.System;

public class Jan16Homework {

	public static void main(String[] args) {
		// Glen Chen's January 16 homework, Java 2 class.
		
		System.out.println(Math.tan(0.4));
		System.out.println(Math.tan(0.5));
		System.out.println(Math.tan(0.6));
		System.out.println(Math.tan(Math.PI / 4));
		System.out.println(Math.tan(Math.PI / 2));
		System.out.println(Math.tan(Math.PI));
		
		// Although the tangent of pi/4 should be 1, java shows it as 0.999...
		// Although the tangent of pi/2 should be undefined, java shows it as 1.633123935319537E16.
		// Although the tangent of pi should be 0, java shows it as -1.2246467991473532E-16
	}

}
