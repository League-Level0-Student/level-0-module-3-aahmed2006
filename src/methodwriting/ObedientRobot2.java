package methodwriting;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot2 {
public static Robot rob = new Robot();
public static void main(String[] args) {
	rob.hide();
	String shape = JOptionPane.showInputDialog("What shape would you like to have drawn? (square, triangle, circle)");
	String color = JOptionPane.showInputDialog("What color would you like your " + shape + " to be? (any color in the rainbow + black and white)");
	
	if(shape.equalsIgnoreCase("square")) {
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		} else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		} else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else if(color.equals("purple")) {
			rob.setPenColor(Color.pink);
		} else if(color.equalsIgnoreCase("white")) {
			rob.setPenColor(Color.white);
		} else if(color.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		}
		drawSquare();
	} else if(shape.equalsIgnoreCase("triangle")) {
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		} else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		} else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else if(color.equals("purple")) {
			rob.setPenColor(Color.pink);
		} else if(color.equalsIgnoreCase("white")) {
			rob.setPenColor(Color.white);
		} else if(color.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		}
		drawTriangle();
	} else if(shape.equalsIgnoreCase("circle")) {
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		} else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		} else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		} else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		} else if(color.equals("purple")) {
			rob.setPenColor(Color.pink);
		} else if(color.equalsIgnoreCase("white")) {
			rob.setPenColor(Color.white);
		} else if(color.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		}
		drawCircle();
	}
}

public static void drawSquare() {
	rob.penDown();
	rob.setSpeed(100);
	for(int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
}
}

public static void drawTriangle() {
	rob.penDown();
	rob.setSpeed(100);
	rob.turn(60);
	for(int i = 0; i < 3; i++) {
	rob.move(100);
	rob.turn(300);
	}
}

public static void drawCircle() {
	rob.penDown();
	rob.setSpeed(100);
	for(int i= 0; i < 360; i++) {
		rob.move(1);
		rob.turn(1);
	}
}
}
