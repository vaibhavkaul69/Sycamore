/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sycamore;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Acer
 */
public class splashscreen extends JFrame 
{
    ImageIcon splash;
    JLabel background,heading,tag;
    
    public splashscreen()
    {
        setTitle("Intro Screen");
        setLayout(null);
        
        heading= new JLabel("Sycamore");
        heading.setBounds(470,290,500,100);
        heading.setForeground(Color.white);
        heading.setFont(new Font("baskerville old face",Font.BOLD,100));
        
        
        tag=new JLabel("Advancement Through Technology");
        
        
        splash=new ImageIcon("D:\\Java Projects\\Sycamore\\src\\sycamore\\wallpaper.gif");
        background=new JLabel(splash);
        background.setBounds(0,0,1366,720);
        background.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
        
        add(heading);
        add(background);
    }
    
    
    public static void main(String[] args)
    {
        splashscreen splash=new splashscreen();
        splash.setVisible(true);
        splash.setSize(1366,720);
        splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try
        {
            Thread.sleep(5000);
            splash.dispose();  
            Calculator calc=new Calculator();
        calc.setSize(1366,720);
        calc.setVisible(true);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    
}
