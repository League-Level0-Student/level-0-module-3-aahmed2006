package methodwriting;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.setSpeed(100);
	
	

	
	
	rob.penDown();
for(int i=0; i<4; i++) {
rob.move(100);
rob.turn(90);
}
	rob.penDown();
	for(int ii=0; ii< 3; ii++) {
		rob.move(100);
		rob.turn(120);
	}
}
}

