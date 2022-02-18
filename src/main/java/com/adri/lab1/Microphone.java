/**
 * 
 */
package com.adri.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * allows the robot to sense and record sounds. on surveillance mode it can activate the bot once a sound 
 * is detected.
 * @author Cristian
 *
 */
public class Microphone extends AutoMove implements SelfCheckCapable {

	public void detectsound() {  //  activates the robot making it make a checkup round when a sound is 
								 //  detected
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Microphone";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
