/**
 * 
 */
package com.adri.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * Robot that allows users to monitor their homes while they are away. The robot can be controlled using
 * the mobile APP. It can as well be programmed to conduct inspections of different areas of the house. Ebo
 * can also activate itself if it senses movement or perceives loud sounds. The robot can take pictures
 * and videos. Users can also see live videos of the house using the app.
 * @author Cristian
 *
 */
public class Ebo implements GenericComponent {

	private String model;
	private String serialnumber;
	private boolean connectivity;	// true or false when connectivity is enabled in the robot
	private Microphone myMicrophone;
	private Infrared myInfrared;
	private Speaker mySpeaker;
	private Camera myCamera;
	private SDCard mySdcard;
	/**
	 * @param args
	 */
	public Ebo() {
		myMicrophone = new Microphone();
		myInfrared = new Infrared();
		mySpeaker = new Speaker();
		myCamera = new Camera();
		mySdcard = new SDCard();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! I am here to guard your home, no need to worry, just go and have fun ;)"); // Print a message
	}
	public void connecttoapp() {    // connects the robot to the APP to interact with the user
		
	}
	public void surveillance() { 	// make the robot enter the surveillance mode

	}
	public void manualcontrol () {	// make the robot enter manual control mode
	
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Ebo Security Robot";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myMicrophone, myInfrared, mySpeaker, myCamera, mySdcard); // add all your sub components
		return internalComponents;
	}
}
