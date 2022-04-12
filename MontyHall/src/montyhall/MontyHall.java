package montyhall;

import javax.swing.JLabel;

import java.util.Random;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MontyHall 
{

  
    public static void main(String[] args)
    {
     Object[] YOURROOM = {"1","2","3"};
    ImageIcon door = new ImageIcon("door.JPG"); 
    String reasonWhy = (String) JOptionPane.showInputDialog
    (null,"Pick a door",
     null,JOptionPane.QUESTION_MESSAGE, door, YOURROOM, null );
           
         if(reasonWhy=="1")
        {
        Random rand = new Random();
        int r = rand.nextInt((3-2)+1)+2;
        
        
        
        
        
            if(r==3)
            {
            Object[] two = {"1","2"};
            ImageIcon bedroom = new ImageIcon("door.JPG"); 
            String reason = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 3\nWould you like to switch to door 2 or stay with door 1?",
             null,JOptionPane.QUESTION_MESSAGE, bedroom, two, null );
             
            int secondchoice = rand.nextInt((2-1)+1)+1;
            if(secondchoice==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
                JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
             
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            }
            
            
            
            if(r==2)
            {
            Object[] three = {"1","3"};
            ImageIcon bedrooma = new ImageIcon("door.JPG"); 
            String reasona = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 2\nWould you like to switch to door 3 or stay with door 1?",
             null,JOptionPane.QUESTION_MESSAGE, bedrooma, three, null );
             
            int Ra = rand.nextInt((2-1)+1)+1;
            if(Ra==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
                 JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            }
                
            }
            
            
            
            
            
            
            if(reasonWhy=="2")
        {
        Random randa = new Random();
        int ra = randa.nextInt((2-1)+1)+1;
        
        
        
        
        
            if(ra==2)
            {
            Object[] two = {"1","3"};
            ImageIcon bedroom = new ImageIcon("door.JPG"); 
            String reason = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 3\nWould you like to switch to door 1 or stay with door 2?",
             null,JOptionPane.QUESTION_MESSAGE, bedroom, two, null );
             
            int secondchoice = randa.nextInt((2-1)+1)+1;
            if(secondchoice==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
                 JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
             
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            }
            
            
            
            if(ra==1)
            {
            Object[] three = {"1","3"};
            ImageIcon bedrooma = new ImageIcon("door.JPG"); 
            String reasona = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 1\nWould you like to switch to door 3 or stay with door 2?",
             null,JOptionPane.QUESTION_MESSAGE, bedrooma, three, null );
             
            int Ra = randa.nextInt((2-1)+1)+1;
            if(Ra==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
                JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
             
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            }
                
            }
           if(reasonWhy=="3")
        {
        Random randb = new Random();
        int rb = randb.nextInt((2-1)+1)+1;
        
        
        
        
        
            if(rb==1)
            {
            Object[] two = {"1","2"};
            ImageIcon bedroom = new ImageIcon("door.JPG"); 
            String reason = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 1\nWould you like to switch to door 2 or stay with door 3?",
             null,JOptionPane.QUESTION_MESSAGE, bedroom, two, null );
             
            int secondchoice = randb.nextInt((2-1)+1)+1;
            if(secondchoice==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
                 JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
             
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            }
            
            
            
            if(rb==2)
            {
            Object[] three = {"1","3"};
            ImageIcon bedrooma = new ImageIcon("door.JPG"); 
            String reasona = (String) JOptionPane.showInputDialog
            (null,"There was a goat behind door 2\nWould you like to switch to door 1 or stay with door 3?",
             null,JOptionPane.QUESTION_MESSAGE, bedrooma, three, null );
             
            int Ra = randb.nextInt((2-1)+1)+1;
            if(Ra==1)
            {
                ImageIcon car = new ImageIcon("car.JPG"); 
               JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a car!", car, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
             
             
            } else {
                ImageIcon goat = new ImageIcon("goat.JPG"); 
                  JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Congratulations! You won a goat!", goat, JLabel.LEFT),
                        "Hello", JOptionPane.PLAIN_MESSAGE);
            }
            
                
            }
        }
    }
    }

