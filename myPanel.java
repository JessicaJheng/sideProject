import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.drawLine(0,0,getWidth(),getHeight());


        g.fillRect(0,0, getWidth(),getHeight());

    }
}
