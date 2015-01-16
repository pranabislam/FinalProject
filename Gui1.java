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


public class Gui1 extends JFrame implements MouseListener, MouseMotionListener  {

    private JButton b1,b2;
    //    private Container pane;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;
    private int mouseX = 0;
    private int mouseY = 0;
    public int x = 0;
    public int y = 0;
    private boolean drag = false;

    public Gui1(){
				
	setTitle("My First Gui");
	setSize(900,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

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

	canvas = new JPanel();
	this.add(canvas);

	canvas.setSize(new Dimension(600,600));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	canvas.setLocation(10,10);
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

    }

    public Dimension getPreferredSize() {
	return new Dimension(300, 300);
    }

    public void imageAdder(int n, String name){
	BufferedImage myPic = null;
	for (int i = 0; i <= n; i++){
	    try {
		myPic = ImageIO.read(new File("Images/" + name + i + ".jpg"));
	    } catch (Exception e){
		System.out.println("no file man cmon");
	    }
	    JLabel picLabel = new JLabel(new ImageIcon(myPic));
	    picLabel.setSize(picLabel.getPreferredSize());
	    picLabel.setLocation(x, y);
	    MouseHandler mousy = new MouseHandler();
	    picLabel.addMouseListener(mousy);
	    picLabel.addMouseMotionListener(mousy);
	    canvas.add(picLabel);
	    x += 25;
	    y += 25;
	    
	}}
				
       @Override
     public void mousePressed(MouseEvent e) {
	   if (e.getSource() == label) { //why did you write == label? isn't it picLabel?
	       drag = true;
	   }
       }

        @Override
     public void mouseReleased(MouseEvent e) {
	    drag = false;
	}

         @Override
	 public void mouseDragged(MouseEvent e) {
	     if (drag == true) {
		 mouseX = e.getX();
		 mouseY = e.getY();
		 JComponent jc = (JComponent)e.getSource();
		 jc.setLocation(jc.getX()+e.getX(), jc.getY()+e.getY());
	     }
	 }


public void mouseMoved(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mouseClicked(MouseEvent e) {}
    






    /*
      Mouse clicker methods
      click on image
      drag image
      place image
      snap image
      image on the side 
      reset
      
    */
		public static void main(String[] args) {
		    Gui1 f = new Gui1();
		    f.imageAdder(3, "img");
		    f.setVisible(true);
				
		}
}
