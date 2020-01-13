package TakePicture;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class TakePicture {

	private static void saveImage(String filename,BufferedImage bufferedImage ) {
		 File outputfile = new File(filename + ".png");
		 try {
			ImageIO.write(bufferedImage, "png", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Rectangle areaRectangle = new Rectangle(toolkit.getScreenSize());
		
		BufferedImage bufferedImage = robot.createScreenCapture(areaRectangle);
		ImageProducer producer = bufferedImage.getSource();
		Image image = toolkit.createImage(producer);
		
		saveImage("prtScn",bufferedImage);
	}
	

}
