/**
 * 
 */
package com.adri.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * Allows the user to speak to someone remotely through the robot using the APP.
 * @author Cristian
 *
 */
public class Speaker extends Active implements SelfCheckCapable{
	
	public void playsound() {
		
	}
	public void volumeup() {
		
	}
	public void volumedown() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Speaker";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}

}
