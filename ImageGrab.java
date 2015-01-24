import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Random;
import javax.swing.JOptionPane;


  public class ImageGrab extends JLayeredPane {
    boolean img0c = false;
    boolean img1c = false;
    boolean img2c = false;
    boolean img3c = false;
    boolean img4c = false;
    boolean img5c = false;
    boolean img6c = false;
    boolean img7c = false;
    boolean img8c = false;
    boolean img9c = false;
    boolean img10c = false;
    boolean img11c = false;
    boolean img12c = false;
    boolean img13c = false;
    boolean img14c = false;
    boolean img15c = false;

        public ImageGrab() {
            File[] images = new File("Images/Splits").listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String name = pathname.getName().toLowerCase();
                    return name.endsWith(".png") || 
                                    name.endsWith(".jpg") || 
                                    name.endsWith(".bmp") ||
                                    name.endsWith(".gif");
                }
            });


	    Random rand = new Random();
	    int x = 200 + rand.nextInt(650);
            int y = 500 + rand.nextInt(20);
	    
            for (File imgFile : images) {

                try {
                    BufferedImage img = ImageIO.read(imgFile);
                    JLabel label = new JLabel(new ImageIcon(img));

		String labelName = imgFile + "";
		String helpName = "";
		String nameGet = "";
		int count = 0;
		labelName = labelName.substring(14);
	        
	       	label.setName(labelName.split("\\.")[0]);
	       
		label.setSize(label.getPreferredSize());
		label.setLocation(x, y); 
		MouseHandler mh  = new MouseHandler();
		label.addMouseListener(mh);
		label.addMouseMotionListener(mh);
		add(label);
		x = 200 + rand.nextInt(650);
		y = 500 + rand.nextInt(20);
                } catch (IOException exp) {
                    exp.printStackTrace();
                }

            }

        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1200, 800);
        }

        public class MouseHandler extends MouseAdapter {

            private Point offset;

            @Override
            public void mousePressed(MouseEvent e) {
                JLabel label = (JLabel) e.getComponent();
                moveToFront(label);
                offset = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getPoint().x - offset.x;
                int y = e.getPoint().y - offset.y;
                Component component = e.getComponent();
                Point location = component.getLocation();
                location.x += x;
                location.y += y;
                component.setLocation(location);
		
            }
	   
public void mouseReleased(MouseEvent e) {
		Component component = e.getComponent();
		Point location = component.getLocation();
		
	//first row of snapping
		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(211,44);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(362,44);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(513,44);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(664,44);
		}

		//second row of snapping
		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(211,155);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(362,155);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(513,155);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(664,155);
		}

		//third row of snapping
		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(211,266);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(362,266);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(513,266);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(664,266);
		}

		//fourt row of snapping
		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(211,377);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(362,377);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(513,377);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(664,377);
		}

	    //checks if img0 is in the right location
	    if(component.getName().equals("img0"))
		if(component.getLocation().x == 211 && component.getLocation().y == 44)
		    img0c = true;
		else
		    img0c = false;
	    //checks if img1 is in the right location
	    if(component.getName().equals("img1"))
		if( component.getLocation().x == 362 && component.getLocation().y == 44) 
		    img1c = true;
		else
		    img1c = false;
	    //checks if img2 is in the right location
	    if(component.getName().equals("img2"))
		if(component.getLocation().x == 513 && component.getLocation().y == 44) 
		    img2c = true;
		else
		    img2c = false;
	    //checks if img3 is in the right location
	    if(component.getName().equals("img3"))
		if(component.getLocation().x == 664 && component.getLocation().y == 44) 
		    img3c = true;
		else
		    img3c = false;


	    //checks if img4 is in the right location
	    if(component.getName().equals("img4"))
		if(component.getLocation().x == 211 && component.getLocation().y == 155) 
		    img4c = true;
		else
		    img4c = false;
	    //checks if img5 is in the right location
	    if(component.getName().equals("img5"))
		if(component.getLocation().x == 362 && component.getLocation().y == 155) 
		    img5c = true;
		else
		    img5c = false;
	    //checks if img6 is in the right location
	    if(component.getName().equals("img6"))
		if(component.getLocation().x == 513 && component.getLocation().y == 155) 
		    img6c = true;
		else
		    img6c = false;
	    //checks if img7 is in the right location
	    if(component.getName().equals("img7"))
		if(component.getLocation().x == 664 && component.getLocation().y == 155) 
		    img7c = true;
		else
		    img7c = false;


	    //checks if img8 is in the right location
	    if(component.getName().equals("img8"))
		if(component.getLocation().x == 211 && component.getLocation().y == 266) 
		    img8c = true;
		else
		    img8c = false;
	    //checks if img9 is in the right location
	    if(component.getName().equals("img9"))
		if(component.getLocation().x == 362 && component.getLocation().y == 266) 
		    img9c = true;
		else
		    img9c = false;
	    //checks if img10 is in the right location
	    if(component.getName().equals("img10"))
		if(component.getLocation().x == 513 && component.getLocation().y == 266) 
		    img10c = true;
		else
		    img10c = false;
	    //checks if img11 is in the right location
	    if(component.getName().equals("img11"))
		if(component.getLocation().x == 664 && component.getLocation().y == 266) 
		    img11c = true;
		else
		    img11c = false;


	    //checks if img12 is in the right location
	    if(component.getName().equals("img12"))
		if(component.getLocation().x == 211 && component.getLocation().y == 377) 
		    img12c = true;
		else
		    img12c = false;
	    //checks if img13 is in the right location
	    if(component.getName().equals("img13"))
		if(component.getLocation().x == 362 && component.getLocation().y == 377) 
		    img13c = true;
		else
		    img13c = false;
	    //checks if img14 is in the right location
	    if(component.getName().equals("img14"))
		if(component.getLocation().x == 513 && component.getLocation().y == 377) 
		    img14c = true;
		else
		    img14c = false;
	    //checks if img15 is in the right location
	    if(component.getName().equals("img15"))
		if(component.getLocation().x == 664 && component.getLocation().y == 377) 
		    img15c = true;
		else
		    img15c = false;
	    //check win condition
	    if(img0c && img1c && img2c && img3c && img4c && img5c && img6c && img7c && img8c && img9c && img10c && img11c && img12c && img13c && img14c && img15c)

		JOptionPane.showMessageDialog(null, "YOU WIN");  
	

}
	}
  }

  
