package Mat16th;


import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
  
public class JTableExamples { 
    // frame 
    JFrame f; 
    // Table 
    JTable j; 
  
    // Constructor 
    JTableExamples() 
    { 
        // Frame initiallization 
        f = new JFrame(); 
  
        // Frame Title 
        f.setTitle("JTable Example"); 
  
        // Data to be displayed in the JTable 
        
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true 
        f.setVisible(true); 
    } 
  
    // Driver  method 
    public static void main(String[] args) 
    { 
        new JTableExamples(); 
    } 
} 