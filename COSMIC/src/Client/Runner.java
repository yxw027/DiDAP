package Client;

import java.io.FileNotFoundException;

import java.io.IOException;

import Function.ColorEdit;
import Function.Format;
import GUI.Window;
import Image.ImageArrEdit;
import MacroProcess.Slide;

public class Runner {

	public static void main(String[] args) throws IOException {

		System.out.println("start");
		test();
	}
	
	public static void test() throws IOException {
		FrameProcess.Master.findMine("bigpapa.png", true);
//		FrameProcess.Master.findMine("sonar3.png", true);
	}
	
	public static void slide() throws IOException {
		
		String file = "bigpapa.png";
		
		MacroProcess.Master.findMine(file);
	}
	
	public static void image() throws IOException {
		
		int[][] arr = new int[][] {{-2}};
		
		Window.create("Image", "sonar2.png", arr, 1, 1);
	}
}
