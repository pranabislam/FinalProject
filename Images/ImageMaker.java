    import javax.imageio.ImageIO;  
    import java.awt.image.BufferedImage;  
    import java.io.*;  
    import java.awt.*;


public class ImageMaker {
    Random r = new Random();
    //boiler plate haahahh
   
    public static void main(String[] args) throws IOException {  
	
        File a = new File("Originals/Eiffel.jpg"); // Make a file object with downloaded image 
        FileInputStream f = new FileInputStream(a);  
        BufferedImage image = ImageIO.read(f); //reading the image file  
  
        int rows = 4; //Constructor to come to generalize algorithm  
        int cols = 4;  
        int pieces = rows * cols;  
  
        int piecesWidth = image.getWidth() / cols; // determines the chunk width and height  
        int piecesHeight = image.getHeight() / rows;  
        int count = 0;  
        BufferedImage imgs[] = new BufferedImage[pieces]; //Image array to hold image chunks  
        for (int x = 0; x < rows; x++) {  
            for (int y = 0; y < cols; y++) {  
                //Initialize the image array with image chunks  
                imgs[count] = new BufferedImage(piecesWidth, piecesHeight, image.getType());  
  
                // draws the image chunk  
                Graphics2D gr = imgs[count++].createGraphics();  
                gr.drawImage(image, 0, 0, piecesWidth, piecesHeight, piecesWidth * y, piecesHeight * x, piecesWidth * y + piecesWidth, piecesHeight * x + piecesHeight, null);  
                gr.dispose();  
            }  
        }    
        //writing mini images into image files  
        for (int i = 0; i < imgs.length; i++) {  
            ImageIO.write(imgs[i], "jpg", new File("img" + i + ".jpg"));  
        }  
        System.out.println("Mini images created");  
    }  
}  
