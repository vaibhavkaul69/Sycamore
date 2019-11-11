package sycamore;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Acer
 */
public class Calculator extends JFrame implements ActionListener
{

    JLabel operations,background_label,full_background;
    JButton addition,multiplication,subtraction,division,factorial,power,table,binary_to_decimal,decimal_to_binary,square_root,cube_root,prime_number;
    ImageIcon  background_image,feedback_icon;
   JSeparator upper_line,bottom_line,left_line,right_line,vertical_parallel_one,vertical_parallel_two,horizontal_parallel_one,horizontal_parallel_two,horizontal_parallel_three;
    
        String content2 = 
                "<html>"+
                "<body>"+
                 "<p>Any Feedback for the Developer.</p>"
                +"</body>"
                +"</html>";
      
        String content=content2;
   
    public Calculator()
    {
    setTitle("Main Menu");
    setLayout(null);


    operations=new JLabel("SYCAMORE");
    operations.setBounds(460,20,500,100);
    operations.setFont(new Font("Baskerville Old face",Font.BOLD|Font.ITALIC,70));
    operations.setBackground(Color.white);

    upper_line=new JSeparator();
    upper_line.setBounds(20,140,1310,10);
    upper_line.setForeground(Color.black);
    upper_line.setBorder(BorderFactory.createMatteBorder(5, 5,5,5, Color.white));

    left_line=new JSeparator(JSeparator.VERTICAL);
    left_line.setBounds(20,140,10,520);
    left_line.setForeground(Color.black);
    left_line.setBorder(BorderFactory.createMatteBorder(5, 5,5,5, Color.white));

    bottom_line=new JSeparator();
    bottom_line.setBounds(20,650,1320,10);
    bottom_line.setForeground(Color.black);
    bottom_line.setBorder(BorderFactory.createMatteBorder(5, 5,5,5, Color.white));

    right_line=new JSeparator(JSeparator.VERTICAL);
    right_line.setBounds(1330,140,10,520);
    right_line.setForeground(Color.black);
    right_line.setBorder(BorderFactory.createMatteBorder(5, 5,5,5, Color.white));
    
    vertical_parallel_one=new JSeparator();
    vertical_parallel_one.setBounds(470,140,10,520);
    vertical_parallel_one.setForeground(Color.white);
    vertical_parallel_one.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
    
    vertical_parallel_two=new JSeparator();
    vertical_parallel_two.setBounds(870,140,10,520);
    vertical_parallel_two.setForeground(Color.white);
    vertical_parallel_two.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
    
    horizontal_parallel_one=new JSeparator();
    horizontal_parallel_one.setBounds(20,280,1310,10);
    horizontal_parallel_one.setForeground(Color.white);
    horizontal_parallel_one.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
    
    horizontal_parallel_two=new JSeparator();
    horizontal_parallel_two.setBounds(20,400,1310,10);
    horizontal_parallel_two.setForeground(Color.white);
    horizontal_parallel_two.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
    
    horizontal_parallel_three=new JSeparator();
    horizontal_parallel_three.setBounds(20,520,1310,10);
    horizontal_parallel_three.setForeground(Color.white);
    horizontal_parallel_three.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.white));
    
    

    addition=new JButton("Addition Menu");
    addition.setBounds(180,200,200,50);
    addition.setFont(new Font("times new roman",Font.BOLD,20));
    addition.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.green));
    addition.setBackground(Color.white);
    addition.setFocusPainted(false);
    addition.addActionListener(this);
    
    multiplication=new JButton("Multiplication Menu");
    multiplication.setBounds(180,320,200,50);
    multiplication.setFont(new Font("times new roman",Font.BOLD,20));
    multiplication.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.green));
    multiplication.setBackground(Color.white);
    multiplication.addActionListener(this);
    
    subtraction=new JButton("Subraction Menu");
    subtraction.setBounds(180,440,200,50);
    subtraction.setFont(new Font("times new roman",Font.BOLD,20));
    subtraction.setBorder(BorderFactory.createMatteBorder(1, 10, 1,1, Color.green));
    subtraction.setBackground(Color.white);
    subtraction.addActionListener(this);
    
    division=new JButton("Division Menu");
    division.setBounds(180,560,200,50);
    division.setFont(new Font("times new roman",Font.BOLD,20));
    division.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.green));
    division.setBackground(Color.white);
    division.addActionListener(this);
    
    factorial=new JButton("Factorial Menu");
    factorial.setBounds(580,200,200,50);
    factorial.setFont(new Font("times new roman",Font.BOLD,20));
    factorial.setBackground(Color.white);
    factorial.setBorder(BorderFactory.createMatteBorder(1, 10, 1, 1, Color.yellow));
    factorial.addActionListener(this);
   
    
    power=new JButton("Power of a Number");
    power.setBounds(580,320,200,50);
    power.setFont(new Font("times new roman",Font.BOLD,20));
    power.setBackground(Color.white);
    power.setBorder(BorderFactory.createMatteBorder(1,10,1,1, Color.yellow));
    power.addActionListener(this);
    
    table=new JButton("Table of a Number");
    table.setBackground(Color.white);
    table.setBounds(580,440,200,50);
    table.setFont(new Font("times new roman",Font.BOLD,20));
    table.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.yellow));
    table.addActionListener(this);
    
    square_root=new JButton("Square Root of a Number");
    square_root.setBounds(580,560,200,50);
    square_root.setBackground(Color.white);
    square_root.setFont(new Font("times new roman",Font.BOLD,17));
    square_root.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.yellow));
    square_root.addActionListener(this);
    
    cube_root=new JButton("Cube Root of a Number");
    cube_root.setBounds(980,200,200,50);
    cube_root.setBackground(Color.white);
    cube_root.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.blue));
    cube_root.setFont(new Font("times new roman",Font.BOLD,18));
    cube_root.addActionListener(this);
    
    binary_to_decimal=new JButton("Convert Binary To Decimal");
    binary_to_decimal.setBounds(980,320,200,50);
    binary_to_decimal.setFont(new Font("times new roman",Font.BOLD,16));
    binary_to_decimal.setBackground(Color.white);
    binary_to_decimal.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.blue));
    binary_to_decimal.addActionListener(this);
    
    decimal_to_binary=new JButton("Convert Decimal to Binary");
    decimal_to_binary.setBounds(980,440,200,50);
    decimal_to_binary.setFont(new Font("times new roman",Font.BOLD,16));
    decimal_to_binary.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.blue));
    decimal_to_binary.setBackground(Color.white);
    decimal_to_binary.addActionListener(this);
    
    
    prime_number=new JButton("Number is Prime or Not?");
    prime_number.setBounds(980,560,200,50);
    prime_number.setFont(new Font("times new roman",Font.BOLD,16));
    prime_number.setBackground(Color.white);
    prime_number.setForeground(Color.black);
    prime_number.setBorder(BorderFactory.createMatteBorder(1,10,1,1,Color.blue));

    background_image=new ImageIcon("D:\\Java Projects\\Sycamore\\src\\sycamore\\background.jpg");
    background_label=new JLabel(background_image);
    background_label.setBounds(0,0,1366,720);



    add(operations);
    add(upper_line);
    add(left_line);
    add(right_line);
    add(bottom_line);
    add(addition);
    add(multiplication);
   add(subtraction);
    add(division);
    add(factorial);
    add(power);
    add(table);
    add(square_root);
    add(cube_root);
    add(binary_to_decimal);
    add(decimal_to_binary);
    add(prime_number);
    add(vertical_parallel_one);
    add(vertical_parallel_two);
    add(horizontal_parallel_one);
    add(horizontal_parallel_two);
    add(horizontal_parallel_three);
    add(background_label);


    }

   public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==addition)
        {
            addition add=new addition();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
add.setLocation(dim.width/3-add.getSize().width/3, dim.height/5-add.getSize().height/4);
        add.setAlwaysOnTop(true);
        add.setSize(500,500);
        add.setVisible(true);
        
        }
       
        else if(e.getSource()==multiplication)
        {
            
        }
        
        else if(e.getSource()==subtraction)
        {
            subtraction subt=new subtraction();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
subt.setLocation(dim.width/3-subt.getSize().width/3, dim.height/5-subt.getSize().height/4);
        subt.setSize(500,500);
        subt.setVisible(true);
        
        }
        
        else if(e.getSource()==division)
        {
            
        }
            
        else if(e.getSource()==factorial)
        {
            
        }
        
        else if(e.getSource()==power)
        {
            
        }
        
        else if(e.getSource()==table)
        {
            
        }
        
        else if(e.getSource()==square_root)
        {
            
        }
        
        else if(e.getSource()==cube_root)
        {
            
        }
        
        else if(e.getSource()==binary_to_decimal)
        {
            
        }
            
        else if(e.getSource()==decimal_to_binary)
        {
            
        }
        
        else if(e.getSource()==prime_number)
      {
          
      }
        
        
    }

    public static void main(String[] args)
    {
        Calculator calc=new Calculator();
        calc.setSize(1366,720);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }


}
