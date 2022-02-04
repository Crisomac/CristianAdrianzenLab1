/**
 * 
 */
package com.adri.lab1;

/**
 * IMU stands for Inertial Measurement	Unit. It allows the robot to calculate its velocity and position
 * in an area.
 * @author Cristian
 *
 */
public class Imu extends AutoMove {
	
	public void calculateposition() {  // calculate the reference position prior the execution of movements
		
	}
	public void turnleft30degrees() {  // make the robot turn 30° to the left when ToF1 has a greater
		                               // distance than the others
		
	}
	public void turnright30degrees() {  // make the robot turn 30° to the right when ToF3 has a greater
        								// distance than the others
		
	}
	public void keepforward() {  // make the vehicle keep moving forward when ToF2 distance is equal or 
								 // greater than the others
		
	}
}
