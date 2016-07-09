import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwentyFourtyEightTile extends JButton
{
    private int myNumber;
    public TwentyFourtyEightTile()
    {
        super("-");
        setBackground(Color.WHITE);
    }
    public int getInt()
    {
        return myNumber;
    }
    public void setNumber(int i)
    {
    }
    public void resetTile()
    {
        setText("-");
    }
    
    
}
