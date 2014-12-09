import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotExp {
    
    public static void main(String[] args) {
        
        try {
            
            Robot robot = new Robot();
            // Capture the screen shot of the area of the screen defined by the rectangle
            BufferedImage bi=robot.createScreenCapture(new Rectangle(800,600));
            ImageIO.write(bi, "jpg", new File("/home/breno/imageTest.jpg"));
            
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
