//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for(int i = 0; i < 10; i++) {
		String color = JOptionPane.showInputDialog("What color (in the rainbow) would you like the robot to draw? If you don't care, don't put anything in.");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("Red")) {
			r2d2.setPenColor(Color.RED);
		} else if (color.equals("Orange")) {
			r2d2.setPenColor(Color.ORANGE);
		} else if (color.equals("Yellow")) {
			r2d2.setPenColor(Color.YELLOW);
		} else if (color.equals("Green")) {
			r2d2.setPenColor(Color.GREEN);
		} else if (color.equals("BLUE")) {
			r2d2.setPenColor(Color.BLUE);
		} else if (color.equals("Pink")) {
			r2d2.setPenColor(Color.PINK);
		
		// 6. If the user doesn’t enter anything, choose a random color
		} else if (color.equals("")){
			r2d2.setRandomPenColor();
		}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		
		// 4. Set the pen width to 10
r2d2.setPenWidth(10);
r2d2.setSpeed(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for(int a = 0; a< 4; a++) {
		r2d2.penDown();
		r2d2.move(100);
		r2d2.turn(90);
		}
		}
	}
}
