package Mar15th;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Dimensions{
	int height;
	int width;
	public Dimensions(int aHeight, int aWidth) {
		super();
		height = aHeight;
		width = aWidth;
	}
	
}
public class DrawPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Point> points;
    ArrayList<Dimensions> dim;
int x1,y1;
    public DrawPanel() {
        setPoints(new ArrayList<Point>());
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            	x1 =e.getX();
            	y1 = e.getY();
                getPoints().add(new Point(e.getX(), e.getY()));
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            	
                
            }
            
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.red);
        int i=0;
        for (Point point : getPoints()) {
            g2.fillOval(point.x, point.y, dim.get(i).width, dim.get(i).height);
            i++;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new DrawPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);
                frame.setVisible(true);
            }
        });
    }

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> aPoints) {
		points = aPoints;
	}

}