
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwentyFourtyEight implements ActionListener
{
    static final int NUMBER_OF_TILES = 16;
    static final int ROW_COL = 4;
   TwentyFourtyEightTile [][] buttons = new TwentyFourtyEightTile[ROW_COL][ROW_COL];
   
   public TwentyFourtyEight()
   {
       for(int i = 0; i < ROW_COL; i++){   
       for(int j =0; j < ROW_COL; j++)
       {
           buttons[i][j] = new TwentyFourtyEightTile();
       }
    }
       JFrame frame = new JFrame();
       // 4 x 4 gameboard
       frame.setLayout(new GridLayout(4,1)); 
       JPanel [] panels = new JPanel[ROW_COL];
       
     
       for(int i = 0; i < ROW_COL ; i++)
       {
           panels[i] = new JPanel();
           panels[i].setLayout(new GridLayout(1,4));
           for( int j = 0; j < 4; j++)
           {
               panels[i].add(buttons[i][j]);
              
           }
           frame.add(panels[i]);
        }
        randomTile();
        randomTile();
        frame.setSize(600,600);
        frame.setVisible(true);
   }
   
   public static void main (String[] args)
   {
        TwentyFourtyEight game = new TwentyFourtyEight();
   }
   
   public void resetGame()
   {
       for(int i = 0; i< ROW_COL; i++)
            {
                for(int j = 0; j< ROW_COL; j++)
                    {
                        buttons[i][j].resetTile();
                        }
        }
        randomTile();
        randomTile();
    }
    public void randomTile()
    {
        boolean flag = false;
        int row;
        int col;
        double twoFour;
        while(flag == false)
        {
            row = (int) (Math.random()*ROW_COL);
            col = (int) (Math.random()*ROW_COL);
            twoFour = (Math.random());
            if(buttons[row][col].getText().equals("-"))
            {
                if(twoFour > .5)
                buttons[row][col].setText("4");
                buttons[row][col].setText("2");
                flag= true;
            }
            
        }
    }
    @Override
   public void actionPerformed(ActionEvent e)
   {
   }
}
