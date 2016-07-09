import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Controller
{
   JButton [] buttons = new JButton [5];
   public Controller()
   {
        buttons[0] = new JButton("Up");
        buttons[1] = new JButton("Left");
        buttons[2] = new JButton("Reset");
        buttons[3] = new JButton("Right");
        buttons[4] = new JButton("Down");
        
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3,1));
        
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1,1));
        top.add(buttons[0]);
        
        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(1,3));
        middle.add(buttons[1]);
        middle.add(buttons[2]);
        middle.add(buttons[3]);
        
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,1));
        bottom.add(buttons[4]);
       
        frame.add(top);
        frame.add(middle);
        frame.add(bottom);
        
        frame.setSize(300,300);
        frame.setVisible(true);
   }
   
   public static void main(String[] args)
   {
       Controller c = new Controller();
   }
   
   public void reset()
   {
       int reply = JOptionPane.showConfirmDialog(null,
        "Would you like to reset the game",
        "2048",
        JOptionPane.YES_NO_OPTION);
        
    if( reply == JOptionPane.YES_OPTION)
        {
          
            
        }
        
   }
    
   public void Up()
   {
   } 
   
   public void Left()
   {
   }
   
   public void Right()
   {
   }
   
   public void Down()
   {
   }
}
