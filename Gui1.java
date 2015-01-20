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

		    
		    
		    //JLayeredPane pane = new JLayeredPane();
		    JFrame frame = new JFrame("Testing");
		    JPanel canvas1 = new JPanel();
		    JPanel canvas2 = new JPanel();
		    /*
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
		    */
		    JButton n = new JButton("N");
		    //JButton s = new JButton("S");
		    //canvas1.setPreferredSize(new Dimension(300,300));
		    //canvas1.setBorder(BorderFactory.createLineBorder(Color.blue,10));	       
		    //canvas1.add(n);
		    //pane.add(canvas1, JLayeredPane.DEFAULT_LAYER);
		   
		    canvas1.setBackground(Color.white);
		    Rectangle rect1 = new Rectangle(20, 20, 40, 40);
		    //pane.add(rect1, JLayeredPane.DEFAULT_LAYER);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.add(pane);
		    //frame.add(s);
		    canvas2.setBorder(BorderFactory.createLineBorder(Color.blue,10));
		    canvas1.add(canvas2);
		    canvas1.add(new ImageGrab());
		    frame.add(canvas1);

		    
		    //frame.add(new ImageGrab());
		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
		}
	    });

    }
}
