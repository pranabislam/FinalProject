import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
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
import java.io.IOException;


public class OpenImageMount{
     public static void main(String[] args) {
        new OpenImageMount();
    }

    public OpenImageMount() {    //Constructor for setting up the GUI
        EventQueue.invokeLater(new Runnable() {
		@Override
	        public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
		
                JFrame frame = new JFrame("Original Picture");
		frame.setPreferredSize( new Dimension (700, 500));
		//	Gui1 j = new Gui1(1);
		/*File img;
		try{
		    if (j.getImageTrack() == 1){
			img = new File("Images/Originals/Eiffel.jpg");
			FileInputStream f = new FileInputStream(img);
			BufferedImage imgbuff = ImageIO.read(f);
			frame.add(imgbuff);
		    }
		}
		    catch (Exception e){
		    }  */

		//	frame.add();
		/*	if (j.getImageTrack() == 1){
		    frame.add(new JLabel(new ImageIcon("Images/Originals/Eiffel.jpg")));
		}
		if (j.getImageTrack() == 2){
		    frame.add(new JLabel(new ImageIcon("Images/Originals/Mountain.jpg")));
		}
		if (j.getImageTrack() == 3){
		    frame.add(new JLabel(new ImageIcon("Images/Originals/Goose.jpg")));
		}
		if (j.getImageTrack() == 4){
		    frame.add(new JLabel(new ImageIcon("Images/Originals/Lilies.jpg")));
		}

		*/
		frame.add(new JLabel(new ImageIcon("Images/Originals/Mountain.jpg")));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public BufferedImage getOG() throws IOException{
	Gui1 j = new Gui1();
	if (j.getImageTrack() == 1){
	    File img = new File("Images/Originals/Mountain.jpg");
	    FileInputStream f = new FileInputStream(img);
	    BufferedImage imgbuff = ImageIO.read(f);
	    return imgbuff;
	}
	else{
	    File img = new File("Images/Originals/Mountain.jpg");
	    FileInputStream f = new FileInputStream(img);
	    BufferedImage imgbuff = ImageIO.read(f);
	    return imgbuff;
	}
		 }
	    
    
}
