

public class MouseHandler{
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
}
