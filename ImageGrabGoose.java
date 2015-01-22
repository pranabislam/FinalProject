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

  public class ImageGrabGoose extends JLayeredPane {

        public ImageGrabGoose() {
            File[] images = new File("Images/SplitsGoose").listFiles(new FileFilter() {
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
	    int x = 30 + rand.nextInt(650);
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
                    x = 30 + rand.nextInt(650);
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
		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(210,41);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(360,41);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(512,41);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 50 <= 58) && (location.y - 50 >=-58)){
		    component.setLocation(663,41);
		}

		//^^First Row Done Snapping finished

		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(210,152);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(360,152);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(512,152);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 161 <= 58) && (location.y - 161 >=-58)){
		    component.setLocation(663,152);
		}

		//^^Second Row Snapping done 

		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(210,263);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(360,263);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(512,263);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 272 <= 58) && (location.y - 272 >=-58)){
		    component.setLocation(663,263);
		}

		    //^^third row

		if ((location.x - 220 <= 58)&& (location.x - 220 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(210,374);
		}
		if ((location.x - 371 <= 58)&& (location.x - 371 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(360,374);
		}
		if ((location.x - 522 <= 58)&& (location.x - 522 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(512,374);
		}
		if ((location.x - 673 <= 58)&& (location.x - 673 >=-58)&&(location.y - 383 <= 58) && (location.y - 383 >=-58)){
		    component.setLocation(663,374);
		}
        

	
}
        }

  }
