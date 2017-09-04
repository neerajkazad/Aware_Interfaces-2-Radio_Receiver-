package com.ai.beans;

public class HighFrequencyReceiver implements IReceiver {

	private int frequency;

	public void tune(int frequency) {
		this.frequency = frequency;

	}

	public void info() {
		System.out.println("HighFrequency transmeeting at frequency: " + frequency);
	}

}
