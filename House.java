/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import javax.swing.*    ;

/**
 *
 * @author Hossa
 */
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    JFrame HouseGUI = new JFrame();
    HouseGUI Draw = new HouseGUI();
    
    HouseGUI.setSize(320,550);
    HouseGUI.setTitle("House");
    HouseGUI.setVisible(true);
    HouseGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    HouseGUI.setLocationRelativeTo(null);
    
    
    
    HouseGUI.add(Draw);
    }
    }
    

