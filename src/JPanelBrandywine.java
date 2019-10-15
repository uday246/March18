
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JPanelBrandywine extends JPanel implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel jlBrandywine, jlInstruct1, jlInstruct2;
JButton jbBack, jbPlayer1, jbPlayer2, jbPlayer3, jbPlayer4, jbPlayer5, jbPlayer6;
JButton jbPlayer7, jbPlayer8, jbPlayer9, jbPlayer10, jbPlayer11, jbPlayer12, currButton, jbCampusScore;
String theme;
Integer clickCount, campusScore;

public JPanelBrandywine (String infTheme) {
super();
setLayout(null);

theme = infTheme;
JLabel jlBrandywine = new JLabel("Brandywine");
jlBrandywine.setBounds(new Rectangle(300, 20, 220, 20));
add(jlBrandywine);

campusScore = 0;
clickCount = 0;

jbCampusScore = new JButton("Score: " + campusScore);
jbCampusScore.setBounds(new Rectangle(300, 100, 120, 40));
add(jbCampusScore);

if ("football".equals(theme)) {
jlInstruct1 = new JLabel("Click the 4 PSU football questions.");
jlInstruct1.setBounds(new Rectangle(250,60,400,30));
add(jlInstruct1);

jlInstruct2 = new JLabel("Correct answers will turn green when selected.");
jlInstruct2.setBounds(new Rectangle(200,60,400,20));
add(jlInstruct2);

jbPlayer1 = new JButton("What is the nickname for Penn State's football team? Nittany Lions");
jbPlayer1.setBounds(new Rectangle(50, 200, 250, 40));
jbPlayer1.addActionListener(this);
add(jbPlayer1);

jbPlayer2 = new JButton("Who was the quarter-back of Penn State's 1986 National Championship football team? John Shaffer");
jbPlayer2.setBounds(new Rectangle(400, 210,280, 60));
jbPlayer2.addActionListener(this);
add(jbPlayer2);

}

if (theme == "programming") {

jlInstruct1 = new JLabel("Click the 4 programming questions.");
jlInstruct1.setBounds(new Rectangle(600,100,300,20));
add(jlInstruct1);
jlInstruct2 = new JLabel("Correct answers will turn green when selected.");
jlInstruct2.setBounds(new Rectangle(500,80,300,80));
add(jlInstruct2);

jbPlayer1 = new JButton("Who is the creator of the JavaScript scripting language? Brendan Eich");
jbPlayer1.setBounds(new Rectangle(30, 130, 150, 40));
jbPlayer1.addActionListener(this);
add(jbPlayer1);

jbPlayer2 = new JButton("What is the most complicated language? C++");
jbPlayer2.setBounds(new Rectangle(30, 190,150, 40));
jbPlayer2.addActionListener(this);
add(jbPlayer2);

}

if (theme == "math") {

jlInstruct1 = new JLabel("Click the 4 correct (Calculus) math problems.");
jlInstruct1.setBounds(new Rectangle(250,40,200,20));
add(jlInstruct1);

jlInstruct2 = new JLabel("Correct answers will turn green when selected.");
jlInstruct2.setBounds(new Rectangle(200,60,400,20));
add(jlInstruct2); 

jbPlayer1 = new JButton("d2/dx2 [ x3 ]=6x");
jbPlayer1.setBounds(new Rectangle(30, 130, 150, 40));
jbPlayer1.addActionListener(this);
add(jbPlayer1);

jbPlayer2 = new JButton("d3/dx3 [ 1 ]=0");
jbPlayer2.setBounds(new Rectangle(30, 190,150, 40));
jbPlayer2.addActionListener(this);
add(jbPlayer2);

}

jbBack = new JButton("Back");
jbBack.setBounds(new Rectangle(270, 270, 100, 40));
add(jbBack);
}
@Override
public void paintComponent(Graphics g) {
super.paintComponent(g);
Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
g.drawImage(myImage, 0, 0, this);
}
@Override
public void actionPerformed(ActionEvent event) {
Object obj = event.getSource();
if (clickCount >= 7) {
}
else {
if (obj != jbPlayer2 && obj != jbPlayer4 && obj != jbPlayer6 && obj != jbPlayer8 && obj != jbPlayer12) {
}
else {
currButton = (JButton) obj;
currButton.setBackground(Color.GREEN);
campusScore = campusScore + 1;
clickCount = clickCount + 1;
jbCampusScore.setText("Score: " + campusScore);
}
if (obj != jbPlayer1 && obj != jbPlayer3 && obj != jbPlayer5 && obj != jbPlayer7 && obj != jbPlayer9 && obj != jbPlayer11) {
}
else {
currButton = (JButton) obj;
currButton.setBackground(Color.RED);
clickCount = clickCount + 1;
}
}

if (clickCount != 6) {
}
else {
JOptionPane.showMessageDialog(null,"Game Over");
jbCampusScore.setText("Score: " + campusScore);
}
}
}