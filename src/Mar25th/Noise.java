package Mar25th;

import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;

// noise class
public class Noise extends JPanel {
        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        // wave path
        GeneralPath wave;

        // constructor
        public Noise() {
                Dimension d = getPreferredSize();
                d.width = 30000;
                setPreferredSize(d);
        }

        // paint component
        protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                if (wave == null)
                        initWave();
                g2.setPaint(Color.blue);
                g2.draw(wave);
        }

        private void initWave() {
                // create the wave line
                float w = getWidth();
                float h = getHeight();
                
                float approxCycles = w / (2 * 100);
                // calculate dx to just fit wave into totalWidth (w-1)
                float dx = (w - 1) / (int) Math.round(2 * approxCycles);
                float dy = h / 4; // 100 for a wave height of 200
                float step = 2 * dx;
                int steps = (int) (w / step);
                wave = new GeneralPath();
                float x = 0, y = h / 2;
                wave.moveTo(x, y);
                for (int j = 0; j < steps; j++) {
                        wave.lineTo(x, y - dy);
                        x += dx;
                        wave.lineTo(x, y - dy);
                        wave.lineTo(x, y + dy);
                        x += dx;
                        wave.lineTo(x, y + dy);
                        wave.lineTo(x, y);
                }
                // check fit
                // float total = steps*2*dx;
                // System.out.printf("steps = %d\nw-total = %.1f\n", steps, w-total);
        }

        // main method
        public static void main(String[] args) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.getContentPane().add(new JScrollPane(new Noise()));
                f.setTitle("Square wave.");
                // frame size
                f.setSize(1400, 400);
                // frame location
                f.setLocation(200, 200);
                f.setVisible(true);
        }
}