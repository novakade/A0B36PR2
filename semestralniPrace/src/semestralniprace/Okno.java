/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralniprace;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Adéla Nováková
 */
public class Okno extends JFrame{
    public Okno(){
        super("Piškvorky");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container kon = getContentPane();
        kon.setBackground(Color.white);
    }
}
