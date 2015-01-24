import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.event.*;
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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D; 


public class Gui1 {

   
    public static void main(String[] args) {
        new Gui1();
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

		    
		    
		    final JFrame frame = new JFrame("Welcome to our Puzzle Game!");
		    frame.setPreferredSize( new Dimension (1200, 850));
		    frame.setLayout(new FlowLayout());
		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
        
		    final JPanel canvas = new JPanel(){
			    public void paintComponent(Graphics g) {
				super.paintComponent(g);
		
				Graphics2D g2d = (Graphics2D) g;
		
				//Draws the grid on canvas
				g2d.drawLine(50, 50, 654, 50);
				g2d.drawLine(50, 161, 654, 161);
				g2d.drawLine(50, 272, 654, 272);
				g2d.drawLine(50, 383, 654, 383);
				g2d.drawLine(50, 494, 654, 494);
				g2d.drawLine(50, 50, 50, 494);
				g2d.drawLine(201, 50, 201, 494);
				g2d.drawLine(352, 50, 352, 494);
				g2d.drawLine(503, 50, 503, 494);
				g2d.drawLine(654, 50, 654, 494);
						
			    }
			};
		    canvas.setLayout(new FlowLayout());
		   
		    

		    JButton Eiffel = new JButton("Eiffel Tower");
		    JButton Mountain = new JButton("Mountain");
		    JButton Lilies = new JButton("Lilies");
		    JButton Goose = new JButton("Goose!");
		    JButton Reset = new JButton("Reset");

		    //When each button is pushed, canvas grabs the ImageGrab for that photo and opens a new window with original (not split) image for reference. 

		    Eiffel.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
		        	canvas.add(new ImageGrab());
				
				OpenImage eif = new OpenImage();
				frame.setVisible(true);
				}         			    
			});

		    Mountain.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				
				OpenImageMount mount = new OpenImageMount();
				canvas.add(new ImageGrabMountain());
				frame.setVisible(true);
			    }
			});

		    Goose.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				
				OpenImageGoose goose = new OpenImageGoose();
				canvas.add(new ImageGrabGoose());
				frame.setVisible(true);
			    }
			});

		   Lilies.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				
				OpenImageLilies lil = new OpenImageLilies();
				canvas.add(new ImageGrabLilies());
				frame.setVisible(true);
			    }
			});

		   //Resets the canvas
		   Reset.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        canvas.removeAll();
				canvas.repaint();
			    }
			});

		  
		  
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		    canvas.setPreferredSize(new Dimension(880,700));
		    canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
		 
		    JLabel title = new JLabel("COoked GoOse");
		    title.setFont(new Font("Serif", Font.PLAIN, 25));
		   
		    JLabel message = new JLabel("<html>Click one of the following<br>buttons as your puzzle.<br> Try and add the picture to <br>the grid so they match the<br> original photo! And when you're<br> done, you can press reset and<br> try the other puzzles! A pop up <br> will indicate if you have won <br> Have fun!</html>");

		    JPanel box = new JPanel();
		    box.setPreferredSize( new Dimension( 250, 290 ) );
		    box.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		    box.add(title);
		    box.add(Reset);
		    box.add(message);
		    box.add(Eiffel);
		    box.add(Mountain);
		    box.add(Lilies);
		    box.add(Goose);
        
		    frame.add(canvas);
		    frame.add(box);
		}
	    });

    }
   

}
