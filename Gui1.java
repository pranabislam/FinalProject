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

		    JFrame frame = new JFrame("Testing");
		    JLabel canvas1 = new JLabel();
		    JLabel canvas2 = new JLabel();
		    JLabel canvas3 = new JLabel();
		    JLabel canvas4 = new JLabel();
		    JLabel canvas5 = new JLabel();
		    JLabel canvas6 = new JLabel();
		    JLabel canvas7 = new JLabel();
		    JLabel canvas8 = new JLabel();
		    JLabel canvas9 = new JLabel();
		    JLabel canvas10 = new JLabel();
		    JLabel canvas11 = new JLabel();
		    JLabel canvas12 = new JLabel();
		    JLabel canvas13 = new JLabel();
		    JLabel canvas14 = new JLabel();
		    JLabel canvas15 = new JLabel();
		    JLabel canvas16 = new JLabel();
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


