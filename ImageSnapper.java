import java.awt.Point;

public class ImageSnapper{
    
    Point[] points = new Point[100];
    public ImageSnapper(){
	
    Point p1 = new Point(10, 10);
    points[1] = p1;
    /* points[2] = new Point(40, 10);
    points[3] = new Point(70, 10);
    points[4] = new Point(100, 10);
    */
    }
    public String toString(){
	String ans = "";
	ans += points[1].getX()+ ","  + points[1].getY();
	return ans;
    }
    
    public Point[] getPoints(){
	return points;
    }

    public static void main(String[] args){
	ImageSnapper i = new ImageSnapper();
	System.out.println(i);
    }
}
