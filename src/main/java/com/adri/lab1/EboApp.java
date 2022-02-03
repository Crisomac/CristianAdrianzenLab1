/**
 * 
 */
package com.adri.lab1;

/**
 * App that allows the user to interact with the robot. It serves as a remote control to move the robot 
 * arround the house. it also serves as a display to reproduce live and saved videos captured by Ebo.
 * @author Cristian
 *
 */
public class EboApp {
	
	public void surveillanceon() {  // commands the bot to entry surveillance mode. In this mode it will 
									// perform security checks every two hours. Each security check will 
									// last for two hours
	}
	public void surveillanceoff() {  // commands the bot to exit surveillance mode. In this mode it will 
									 // remail in an idle state until surveillance mode is turned on again
									 // or in manual control
	}
	public void manualcontrol() {  // bot can be moved following the owners commands. 
	}
}
