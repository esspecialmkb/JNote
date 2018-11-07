/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnote;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

/**
 *
 * @author Michael B
 */
public class JNote {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("jNote Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
 
        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));
 
        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        
        //Constructor with text
        JTextField textField = new JTextField("This is a text");

        //Constructor with empty text and 20 columns
        //JTextField textField = new JTextField(20); 
        //JTextField textField = new JTextField("This is a text", 20);

        //textField.setText("This is a text");
        //textField.setColumns(20);

        frame.getContentPane().add(textField);
        //dialog.add(textField);
        //panel.add(textField);
        //applet.getContentPane().add(textField);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
