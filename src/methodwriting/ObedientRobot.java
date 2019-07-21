package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	 static Robot rob = new Robot();
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What color do you want your shape to be (black or white)?");
		if(color.equals("white")) {
			rob.setPenColor(255, 255, 255);
		} else if (color.equals("black")) {
			rob.setPenColor(0, 0, 0);
		}
	String shape = JOptionPane.showInputDialog("What shape do you want to have drawn? Choices: square, triangle, or circle.");
	if(shape.equals("square")) {
		drawSquare();
	} else if(shape.equals("triangle")) {
		drawTriangle();
	} else if(shape.equals("circle")) {
		drawCircle();
	}
	
	
	}
	public static void drawSquare() {
		rob.setSpeed(75);
		rob.penDown();
		rob.hide();
		for(int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}
	public static void drawTriangle() {
	rob.setSpeed(75);
		rob.penDown();
		rob.hide();
		for(int ii=0; ii<3; ii++) {
			rob.move(150);
			rob.turn(120);
		}
	}
	public static void drawCircle() {
		rob.setSpeed(100);
		rob.penDown();
		rob.hide();
		for(int iii=0; iii < 360; iii++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}

