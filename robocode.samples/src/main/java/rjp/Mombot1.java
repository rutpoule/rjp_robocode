package rjp;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Mombot1 - a robot by (your name here)
 */
public class Mombot1 extends Robot
{

	/**
	 * run: Mombot1's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		//setColors(Color.purple,Color.red,Color.blue); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnRadarRight(360);
			back(100);
			turnRadarRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		
		// Turn toward scanned robot
		// Bearing is relative to robot's heading
		turnRight(e.getBearing());
		fire(3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(e.getBearing());
		fire(3);
		turnRight(90);
		ahead(100);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
		if( e.getBearing() < 180 ) {
			turnLeft(90);
		} else {
			turnRight(90);			
		}
	}
	
	/**
	 * onHitRobot: What to do when you collide with another robot
	 */
   public void onHitRobot(HitRobotEvent e) {
		turnRight(e.getBearing());
		fire(3);
	}

	
}
