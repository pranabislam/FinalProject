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

		    
		    
		    //JLayeredPane pane = new JLayeredPane();
		    JFrame frame = new JFrame("Testing");
		    frame.setPreferredSize( new Dimension (1200, 800));
		    frame.setLayout(new FlowLayout());
		    JPanel canvas = new JPanel(){
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

		    /* JPanel grid1 = new JPanel();		    
		    JPanel grid2 = new JPanel();
		    JPanel grid3 = new JPanel();
		    JPanel grid4 = new JPanel();
		    JPanel grid5 = new JPanel();		   
		    JPanel grid6 = new JPanel();
		    JPanel grid7 = new JPanel();
		    JPanel grid8 = new JPanel();
		    JPanel grid9 = new JPanel();
		    JPanel grid10 = new JPanel();
		    JPanel grid11 = new JPanel();
		    JPanel grid12 = new JPanel();
		    JPanel grid13 = new JPanel();
		    JPanel grid14 = new JPanel();
		    JPanel grid15 = new JPanel();
		    JPanel grid16 = new JPanel();  */
		    //JComponent grid1 = new JComponent();
		    

		    JButton n = new JButton("N");
		    //JButton s = new JButton("S");
		    //canvas1.setPreferredSize(new Dimension(300,300));
		    //canvas1.setBorder(BorderFactory.createLineBorder(Color.blue,10));	       
		    //canvas1.add(n);
		    //pane.add(canvas1, JLayeredPane.DEFAULT_LAYER);
		   
		    // canvas.setBackground(Color.white);
		    //canvas.setOpaque(false);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.add(pane);
		    //frame.add(s);
		    canvas.setBorder(BorderFactory.createLineBorder(Color.red,5));
		    //grid1.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    /* grid2.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid3.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid4.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid5.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid6.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid7.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid8.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid9.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid10.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid11.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid12.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid13.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid14.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid15.setBorder(BorderFactory.createLineBorder(Color.blue,7));
		    grid16.setBorder(BorderFactory.createLineBorder(Color.blue,7));   */
		    
		    
		    // pane.setPreferredSize(new Dimension(1200,800));
		    // grid1.setPreferredSize(new Dimension(50,50));
		    //canvas.add(new ImageGrab());
		    /*   canvas.add(grid1);
		    canvas.add(grid2);
		    canvas.add(grid3);
		    canvas.add(grid4);
		    canvas.add(grid5);
		    canvas.add(grid6);
		    canvas.add(grid7);
		    canvas.add(grid8);
		    canvas.add(grid9);
		    canvas.add(grid10);
		    canvas.add(grid11);
		    canvas.add(grid12);
		    canvas.add(grid13);
		    canvas.add(grid14);
		    canvas.add(grid15);
		    canvas.add(grid16);
		    */


		    JPanel box = new JPanel();
		    box.setPreferredSize( new Dimension( 200, 50 ) );
		    box.setBorder(BorderFactory.createLineBorder(Color.blue,2));


		    JLabel a = new JLabel("Wecome to Puzzle solver");
		    box.add(a);

		    canvas.add(new ImageGrab());
		    canvas.add(box);
		    //  box.setLocation(600,400); --> LOCATION WONT SET

		    frame.add(canvas);
		    
		    

		    // pane.add(grid1);
		    /*  pane.add(grid2);
		    pane.add(grid3);
		    pane.add(grid4); */
		    
		    // pane.add(new ImageGrab());
		    // pane.add(new ImageGrab(), JLayeredPane.DEFAULT_LAYER);
		    // frame.add(pane);
		    
		    //frame.add(new ImageGrab());
		   
		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
		}
	    });

    }
}
