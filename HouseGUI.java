/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hossa
 */
public class HouseGUI extends JPanel{

    @Override
    protected void paintComponent(Graphics d) {
        super.paintComponent(d); //To change body of generated methods, choose Tools | Templates.
        
        
        // House
        d.setColor(Color.BLUE);
        d.fillRect(2, 210, 300, 300);
        
        //Up Rectangle
        d.setColor(Color.RED);
        d.fillPolygon(new int []{1,150,300}, new int[]{210,1,210},3);
        
        // Window
        d.setColor(Color.BLACK);
        d.fillRect(40, 250, 50, 50);
        
        // Door
        d.setColor(Color.yellow);
        d.fillRect(215, 310, 50, 200);
        
        
    }
    
    
    
}
