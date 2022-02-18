/**
 * 
 */
package com.adri.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * Sensor that allows the robot to sense movement inside the house and thus activating it to perform a 
 * security check of the house.
 * @author Cristian
 *
 */
public class Infrared extends AutoMove implements SelfCheckCapable{

	public void detectmotion() { // perform a security check when motion is detected
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Infrared";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.4);
	}
}
