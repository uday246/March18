package Mat16th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class JFrameExample {  
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        JLabel label = new JLabel("Giants");  
        label.setBounds(50, 20, 100, 30);
        JTextField giantScore= new JTextField(10);
        giantScore.setBounds(50, 60, 100, 30);
        
        JLabel giantScoreLable = new JLabel("0");  
        giantScoreLable.setBounds(110, 100, 100, 30);
        
        JLabel giantScoreHeader = new JLabel("Score : ");  
        giantScoreHeader.setBounds(50, 100, 100, 30);
        
        
        giantScore.addKeyListener(new ChangeEventsGiants(giantScoreLable));
        // This is using to update the team score when ever user enters the new score in the text field
        
        JLabel visitorLabel = new JLabel("Visitors");  
        visitorLabel.setBounds(350, 20, 100, 30);
        JTextField visitorScore= new JTextField(10);
        visitorScore.setBounds(350, 60, 100, 30);
        JLabel visitorScoreLable = new JLabel("0");  
        visitorScoreLable.setBounds(400, 100, 100, 30);
        
        JLabel VisitorScoreHeader = new JLabel("Score : ");  
        VisitorScoreHeader.setBounds(350, 100, 100, 30);
        
        visitorScore.addKeyListener(new ChangeEventsVisitors(visitorScoreLable));
        
     // This is using to update the team score when ever user enters the new score in the text field
        // passing these values to set the score label from other class
        
        
        JButton button = new JButton();  
        button.setText("Who Won?");  
        button.setBounds(170, 150, 120, 20);
        JLabel result = new JLabel();  
        result.setBounds(170, 180, 180, 20);
        button.addActionListener(new ShowResult(visitorScoreLable, giantScoreLable, result));
     // on click of the button we should announce the results based on the scores of both teams
        
        panel.add(label);  
        panel.add(giantScore);
        panel.add(giantScoreLable);
        panel.add(giantScoreHeader);
        panel.add(visitorLabel);  
        panel.add(visitorScore);
        panel.add(visitorScoreLable);
        panel.add(VisitorScoreHeader);
        panel.add(button);  
        panel.add(result);
        frame.add(panel);  
        
        frame.setSize(600, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
class ShowResult implements ActionListener{
JLabel visitorScoreLable,giantScoreLable,result;


	public ShowResult(JLabel aVisitorScoreLable, JLabel aGiantScoreLable, JLabel aResult) {
	super();
	visitorScoreLable = aVisitorScoreLable;
	giantScoreLable = aGiantScoreLable;
	result = aResult;
}


	@Override
	public void actionPerformed(ActionEvent aE) {
		int visitorScore = Integer.parseInt(visitorScoreLable.getText());
		int giantsScore  = Integer.parseInt(giantScoreLable.getText());
		if(visitorScore>giantsScore){
			result.setText("Visitors won the match");
		}
		else if(visitorScore<giantsScore){
			result.setText("Giants won the match");
		}
		else{
			result.setText("Match draw");
		}
	}
	
}
//this class will handle the onchange events for Giants score
class ChangeEventsGiants extends KeyAdapter{
	JLabel label;
	
	public ChangeEventsGiants(JLabel aLabel) {
		super();
		label = aLabel;
	}

	public void keyReleased(KeyEvent e) {
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
        //if use enters invalid input than it will throw exception so in that case we should not update the score
        try{
        if(Integer.parseInt(text)>=0)
        label.setText(text);
        }catch(Exception ex){System.out.println(ex);}
    }
}
// this class will handle the onchange events for visitors score
class ChangeEventsVisitors extends KeyAdapter{
	JLabel label;
	
	
	public ChangeEventsVisitors(JLabel aLabel) {
		super();
		label = aLabel;
	}


	public void keyReleased(KeyEvent e) {
		  JTextField textField = (JTextField) e.getSource();
	        String text = textField.getText();
	        //if use enters invalid input than it will throw exception so in that case we should not update the score
	        try{
	        if(Integer.parseInt(text)>=0)
	        label.setText(text);
	        }catch(Exception ex){System.out.println(ex);}
    }
}