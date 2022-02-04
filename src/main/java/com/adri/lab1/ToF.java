/**
 * 
 */
package com.adri.lab1;

/**
 * Time of Flight sensor. It allows to determine the distance between an object and the robot in order
 * to avoid obstacles. For this project the bot will have 3 ToF sensors: one located in the center bellow 
 * the camera (ToF2), the other to located 45° to the left (ToF1) and the third one 45° to the right (ToF3).
 * @author Cristian
 *
 */
public class ToF extends AutoMove {
	
	public void calculatedistance() {  // calculates the distance minimum distance obtained from the
		 							   // three sensors.
		
	}
	public void selectoperation() {  //  compares the distances of the three sensors to determine which 
        							 //  of them will command the movement.
}
	public void sendresult() {  //  Send the chosen result to the IMU 
		                                
	}	
}
