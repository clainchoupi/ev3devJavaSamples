package lego2java;

import java.io.File;
import java.io.IOException;

import ev3dev.actuators.Sound;
import ev3dev.utils.JarResource;
import lejos.utility.Delay;

public class Sample1 {

	//Configuration
	private static int MAX_VOLUME = 100;
	private static String filePath = "R2D2.wav";
	private final static int ONE_SECOND = 1000;

	private static final int FREQ1	= 300;
	private static final int FREQ2 = 400;
	private static final int variation = 10;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Pierre");

		Sound sound = Sound.getInstance();

		sound.setVolume(MAX_VOLUME);
		System.out.println("Volume: " + sound.getVolume());

		try {
			JarResource.export(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file = new File(filePath);
		sound.playSample(file);

		sound.playSample(file, 50);
		sound.playSample(file, 100);
		sound.playSample(file, 50);
		sound.playSample(file, 100);

		sound.beep();
		sound.twoBeeps();

		Delay.msDelay(ONE_SECOND);

		for(int i = FREQ1; i <= FREQ2; i += variation) {
			sound.playTone(i, 500, 100);
		}

		int volume = 0;
		for(int i = FREQ1; i <= FREQ2; i += variation) {
			volume += variation;
			sound.playTone(i, 500, volume);
		}

		sound.playTone(300, 500);
	}
}
