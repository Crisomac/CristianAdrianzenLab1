package com.adri.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class SDCard implements SelfCheckCapable{
	
	private String Brand;  //  Brand of the manufacturer
	private int storagecapacity; // in Gigabytes
	
	public void storeinfo () {
		
	}
	public void deleteinfo () {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "SDCard";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}
}
