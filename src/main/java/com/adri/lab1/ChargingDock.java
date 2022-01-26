/**
 * 
 */
package com.adri.lab1;

/**
 * device used to recharge the robots battery
 * @author Cristian
 *
 */
public class ChargingDock extends Battery {

		private int voltage;  // describes the voltage of the battery
		private double current; // indicates the current of operation of the module, expressed in mA
		
		public void startcharge() {  // starts the charging process once the robot is placed 
			                         // in the dock station
			
		}
		
		public void stopcharge() {  // stops the charging process when the battery is full
			
		}
}

