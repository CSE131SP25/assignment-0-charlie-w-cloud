package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.turnRight(45);
		robot.forward(200);
		robot.turnRight(45);
		robot.forward(50);
		robot.turnRight(45);
		robot.forward(75);
		robot.turnRight(90);
		robot.forward(150);
		robot.turnRight(45);
		robot.forward(100);
		robot.turnRight(135);
		robot.forward(150);
		robot.turnRight(180);
		robot.forward(153);
		robot.turnRight(45);
		robot.forward(35);
		robot.turnRight(90);
		robot.forward(300);
		robot.turnRight(35);
		robot.forward(100);
		robot.turnLeft(45);
		robot.forward(75);
		robot.turnLeft(135);
		robot.forward(50);
		robot.turnRight(125);
		robot.forward(75);
		robot.turnLeft(135);
		robot.forward(75);
		robot.turnRight(125);
		robot.forward(50);
		robot.turnLeft(135);
		robot.forward(75);
		robot.turnLeft(45);
		robot.forward(100);
		robot.turnRight(31);
		robot.forward(300);
		robot.turnLeft(90);
		robot.forward(50);
		
		
		
	}

}
