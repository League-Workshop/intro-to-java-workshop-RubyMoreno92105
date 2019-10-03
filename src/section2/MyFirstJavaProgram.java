package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot oreo = new Robot();
oreo.setSpeed(100);
oreo.penDown();
for(int i=0; i<4 ; i++) {
oreo.move(100);
oreo.turn(90);
}	
oreo.move(200);
oreo.turn(90);
oreo.turn(90);
oreo.move(200);
oreo.move(200);
oreo.turn(90);
oreo.move(200);
oreo.sparkle();
oreo.turn(90);
oreo.move(200);
oreo.move(200);
oreo.turn(90);
oreo.move(200);


		
	}
}
