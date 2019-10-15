package Mat18th;
import java.awt.Color; // class for Colors
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.geom.GeneralPath; // combinations of lines and curves

import javax.swing.JComponent;

/**
   A component that draws a Picture by Phill Conrad
   
   @author Phill Conrad 
   @version for CS10, S09, UCSB, 04/29/2009
   
*/

// Your class should "extend JComponent
// This is "inheritance", which we'll start readina about in Chapter 10
// It means that PhillsPictureComponent "is a" JComponent
//   that is, a special type of JComponent that is for a specific purpose

public class PhillsPictureComponent extends JComponent
{  

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The paintComponent method is always required if you want
     * any graphics to appear in your JComponent.    
     * 
     * There is a paintComponent
     * method that is created for you in the JComponent class, but it
     * doesn't do what we want, so we have to "override" that method with
     * our own method.  
     * 
     * This overriding is typical when inheritance is used.
     * In inheritance, you take something that is a "basic" version of
     * what you want, then you "trick it out" with your own custom features.
     * Sort of a "pimp my Java class" kind of thing.
     */
    
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D--we always do this.
      // See sections 2.12, p. 60-61 for an explanation
      
      Graphics2D g2 = (Graphics2D) g;

      // Draw a coffee cup.
      
      GeneralPath leftSide = new GeneralPath();
      
       // left side of cup
       leftSide.moveTo(200,400);
       leftSide.lineTo(160,360);
       leftSide.lineTo(130,300);
       leftSide.lineTo(100,200);
       leftSide.lineTo(100,100);
     
       // NOTE: AS OF 05/06/09, this isn't working yet
       // the way I hoped it would...  I'm still working out why..
       
       // We are trying here to see if we can create the right side
       // of the cup by copying the left side, and doing a 
       // "flip across the x axis".   We first have to translate to the
       // origin, flip, and then translate back...
       
        AffineTransform af = new AffineTransform();
      
        af.translate(-100,-100);
        af.scale(-1.0, 1.0);
        af.translate(-700,100);
       
        Shape rightSide = leftSide.createTransformedShape(af);
        
       GeneralPath topAndBottom = new GeneralPath();
       
       topAndBottom.moveTo(100,100);
       topAndBottom.lineTo(500,100); // top of cup
        
       topAndBottom.moveTo(200,400);
       topAndBottom.lineTo(400,400); // bottom of cup


       g2.draw(leftSide);
       
       g2.setColor(Color.RED);
       g2.draw(rightSide);
       
       g2.setColor(Color.BLUE);
       g2.draw(topAndBottom);
       
       
       g2.drawString("A coffee cup, by Phill Conrad", 20,20);
    
    }

        
  
}