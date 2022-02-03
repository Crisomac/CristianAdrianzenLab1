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
public class ToF extends Sensor {
	
	public void calculatedistance() {  // calculates the distance minimum distance obtained from the
		 							   // three sensors
		
	}
	public void turnleft30() {  // gives the order to turn left 30° when the calculateddistance is 5 inches
		                        // or less, and the distance of ToF1 is greater than the distance of ToF2 and
		                        // ToF3. After turning the bot will keep going forward.
	}
	public void turnright30() {  // gives the order to turn right 30° when the calculateddistance is 5 inches
                                 // or less, and the distance of ToF3 is greater than the distance of ToF1 and
        					     // ToF2. After turning the bot will keep going forward.
	}
	public void keepforward() {  // gives the order to keep going forward when the calculateddistance is
						         // greater than 5 inchesor less.
	}	
}
