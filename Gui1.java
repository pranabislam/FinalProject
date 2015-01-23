import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;


public class Gui1 {

    private int imageTrack = 0;

    public static void main(String[] args) {
        new Gui1();
    }
    public int getImageTrack(){
	return imageTrack;
    }
    public Gui1(int k){
	
    }
    public Gui1() {    //Constructor for setting up the GUI
        EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
		    try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		    }

		    
		    
		    //JLayeredPane pane = new JLayeredPane();
		    JFrame frame = new JFrame("Welcome to our Puzzle Game!");
		    frame.setPreferredSize( new Dimension (1200, 850));
		    frame.setLayout(new FlowLayout());
		   
		    final JPanel canvas = new JPanel(){
			    public void paintComponent(Graphics g) {
				super.paintComponent(g);
		
				Graphics2D g2d = (Graphics2D) g;
		
				//float[] dash1 = { 2f, 0f, 2f };
		
				g2d.drawLine(50, 50, 655, 50);
		
				/*	BasicStroke bs1 = new BasicStroke(1, 
					BasicStroke.CAP_BUTT, 
					BasicStroke.JOIN_ROUND, 
					1.0f, 
					dash1,
					2f);   */
				//g2d.setStroke(bs1);
				g2d.drawLine(50, 161, 655, 161);
				g2d.drawLine(50, 272, 655, 272);
				g2d.drawLine(50, 383, 655, 383);
				g2d.drawLine(50, 494, 655, 494);
				g2d.drawLine(50, 50, 50, 494);
				g2d.drawLine(201, 50, 201, 494);
				g2d.drawLine(352, 50, 352, 494);
				g2d.drawLine(503, 50, 503, 494);
				g2d.drawLine(655, 50, 655, 494);
						
			    }
			};
		    canvas.setLayout(new FlowLayout());
		   
		    

		    JButton Eiffel = new JButton("Eiffel Tower");
		    JButton Mountain = new JButton("Mountain");
		    JButton Lilies = new JButton("Lilies");
		    JButton Goose = new JButton("Goose!");
		    JButton Original = new JButton("Click for pic");
		    JButton Reset = new JButton("Reset");

		    Eiffel.addActionListener(new ActionListener() {
                     
		            public void actionPerformed(ActionEvent e) {
				imageTrack = 1;
				canvas.add(new ImageGrab());
				    // canvas.update();
				}         			    
			});

		    Mountain.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				imageTrack = 2;
				canvas.add(new ImageGrabMountain());
			    }
			});

		    Goose.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {				        imageTrack = 3;
				canvas.add(new ImageGrabGoose());
			    }
			});

		   Lilies.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				imageTrack = 4;
				canvas.add(new ImageGrabLilies());
			    }
			});

		   Original.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				new OpenImage();
			    }
			});

		   
		   Reset.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				reset();
			    }
			});

		  
		  
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		    canvas.setPreferredSize(new Dimension(880,650));
		    canvas.setBorder(BorderFactory.createLineBorder(Color.red,5));
		 
		   

		    JPanel box = new JPanel();
		    box.setPreferredSize( new Dimension( 200, 200 ) );
		    box.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		    box.add(Eiffel);
		    box.add(Mountain);
		    box.add(Lilies);
		    box.add(Goose);
		    box.add(Original);
		    box.add(Reset);
        

		    // JLabel a = new JLabel("Wecome to Puzzle solver");
		    // box.add(a);
		    

		   // canvas.add(new ImageGrab());
		    // canvas.add(box);
		    //   canvas.add(box);
		    // box.setLocation(600,400); --> LOCATION WONT SET
		    //Eiffel.setLocation(100,100);
		    frame.add(canvas);
		    frame.add(box);
		 
		   
		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
		}
	    });

    }
    public void reset(){
       
	main(new String[] {"asifi", "sdsd"});
	
	
    }
}
