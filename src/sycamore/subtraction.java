/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sycamore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Acer
 */
public class subtraction extends JFrame implements ActionListener
{

    public void actionPerformed(ActionEvent ae)
    {

    }
    
    public static void main(String[] args)
    {
        subtraction subt=new subtraction();
        subt.setSize(500,500);
        subt.setVisible(true);
        subt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
