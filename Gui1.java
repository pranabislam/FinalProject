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
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;


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

		    
		    
		    JLayeredPane pane = new JLayeredPane();
		    JFrame frame = new JFrame("Testing");
		    JPanel canvas1 = new JPanel();
		    JPanel canvas2 = new JPanel();
		    JPanel canvas3 = new JPanel();
		    JPanel canvas4 = new JPanel();
		    JPanel canvas5 = new JPanel();
		    JPanel canvas6 = new JPanel();		   
		    JPanel canvas7 = new JPanel();
		    JPanel canvas8 = new JPanel();
		    JPanel canvas9 = new JPanel();
		    JPanel canvas10 = new JPanel();
		    JPanel canvas11 = new JPanel();
		    JPanel canvas12 = new JPanel();
		    JPanel canvas13 = new JPanel();
		    JPanel canvas14 = new JPanel();
		    JPanel canvas15 = new JPanel();
		    JPanel canvas16 = new JPanel();
		    canvas1.setPreferredSize(new Dimension(300,300));
		    canvas1.setBorder(BorderFactory.createLineBorder(Color.blue,10));	       
		    pane.add(canvas1, JLayeredPane.DEFAULT_LAYER);
		   
		    
		    Rectangle rect1 = new Rectangle(20, 20, 40, 40);
		    // pane.add(rect1, JLayeredPane.DEFAULT_LAYER);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.add(new ImageGrab());
		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
		}
	    });

    }
}
	//pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	/*	pane.setLayout(new FlowLayout());
		b1 = new JButton("Click me");
		pane.add(b1);
		b2 = new JButton("exit");  
		pane.add(b2);

		label = new JLabel("The Label:");
		pane.add(label);

		text = new JTextArea();
		text.setColumns(40);
		text.setRows(5);
		text.setBorder(BorderFactory.createLineBorder(Color.red,2));
		pane.add(text);
	*/

	//	pane.add(canvas);

	/*	BufferedImage myPicture = null;
		try {
		myPicture = ImageIO.read(new File("Images/Eiffel.jpg"));
		} catch(Exception e)
		{ System.out.println("no file or something error");
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		//pane.add(picLabel);
		canvas.add(picLabel);

		pane.add(canvas);

		/* public void loadImages(File directory) throws IOException {
		File[] imageFiles = directory.listFiles(fileNameFilter);
		BufferedImage[] images = new BufferedImage[imageFiles.length];
		model.removeAllElements();
		for (int ii=0; ii<images.length; ii++) {
		model.addElement(ImageIO.read(imageFiles[ii]));
		}
		} */

	/*
	  pane.add(new JButton("button 0"));
	  JPanel buttongrid = new JPanel();
	  buttongrid.setLayout(new GridLayout(3,3));
	  buttongrid.add(new JButton("button 0"));
	  buttongrid.add(new JButton("button 1"));
	  buttongrid.add(new JButton("button 2"));
	  buttongrid.add(new JButton("button 3"));
	  buttongrid.add(new JButton("button 4"));
	  pane.add(buttongrid);
	*/

	//Image img = new ImageIcon(this.getClass().getResource("/Eiffel.jpg")).getImage();

	/*	BufferedImage myPicture = null;
		try {
		myPicture = ImageIO.read(new File("Images/Eiffel.jpg"));
		} catch(Exception e)
		{ System.out.println("no file or something error");
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		pane.add(picLabel);
	*/


