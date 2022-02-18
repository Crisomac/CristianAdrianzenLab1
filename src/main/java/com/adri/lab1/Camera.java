package com.adri.lab1;

import edu.fiu.jit.SelfCheckCapable;

public class Camera extends Sensor implements SelfCheckCapable{
	
	private String resolution; // expresed in megapixels
	private int fps; // expresed in fraims per second
	
	public void recordvideo() {  // records video for either live streaming or to save in the SD Card
	}
	public void takepicture() {  // takes a picture when required by the user
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}
