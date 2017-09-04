package com.ai.beans;

public class LowFrequencyReceiver implements IReceiver {

	private int frequency;
	public void tune(int frequency) {
		this.frequency = frequency;
	}

	public void info() {
		System.out.println("LowFrequency transmeeting at frequency: "+frequency);
	}

}
