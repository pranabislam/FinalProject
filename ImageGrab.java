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

  public class ImageGrab extends JLayeredPane {

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
	    int x = rand.nextInt(1000);
            int y = 500 + rand.nextInt(20);
	    
            for (File imgFile : images) {

                try {
                    BufferedImage img = ImageIO.read(imgFile);
                    JLabel label = new JLabel(new ImageIcon(img));
                    label.setSize(label.getPreferredSize());
                    label.setLocation(x, y); 
                    MouseHandler mh  = new MouseHandler();
                    label.addMouseListener(mh);
                    label.addMouseMotionListener(mh);
                    add(label);
                    x = rand.nextInt(1000);
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
		int Compx = location.x;
		int Compy = location.y;
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 201 <= 58)&& (location.x - 201 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(193,41);
		}
		if ((location.x - 352 <= 58)&& (location.x - 352 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(341,41);
		}
		if ((location.x - 503 <= 58)&& (location.x - 503 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(491,41);
		}

		//First Row Done Snapping finished
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(41,152);
		}
		if ((location.x - 201 <= 58)&& (location.x - 201 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(192,152);
		}
		if ((location.x - 352 <= 58)&& (location.x - 352 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(343,152);
		}
		if ((location.x - 503 <= 58)&& (location.x - 503 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(492,152);
		}

		//Second Row Snapping done 
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}
		if ((location.x - 50 <= 58)&& (location.x - 50 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(41,41);
		}	
		}
        }

  }
