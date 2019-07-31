package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
	Robot robot = new Robot();
		robot.setX(10);
		robot.setY(500);
		robot.penDown();
		robot.setSpeed(100);
		robot.hide();
		Random random = new Random();
		int r = random.nextInt(51)+11;
		for (int i = 0; i < 10; i++) {
			if(r<300) {
				robot.setRandomPenColor();
				robot.move(r);
				robot.turn(45);
				robot.move(25);
				robot.turn(45);
				robot.move(25);
				robot.turn(90);
				robot.move(r);
				robot.setPenColor(Color.green);
				robot.turn(270);
				robot.move(50);
			} else if(r>300) {
			robot.setRandomPenColor();
			robot.move(r);
			robot.turn(90);
			robot.move(50);
			robot.turn(90);
			robot.move(r);
			robot.setPenColor(Color.green);
			robot.turn(270);
			robot.move(50);
			}
		}

	}
	
}
