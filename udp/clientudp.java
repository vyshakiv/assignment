//package ds; 
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.io.*;
 import java.net.*;
 import java.util.*;
 import java.awt.*;
 import javax.swing.*;
 import javax.swing.border.TitledBorder;
 
  class Client extends JFrame implements ActionListener {
   // Text area for displaying contents
   private JTextField toclient = new JTextField();
   private JTextArea display = new JTextArea();
   private JButton send = new JButton("Send");
 
   public static void main(String[] args) {
     new Client();
   }
 
     public void actionPerformed(ActionEvent e) {
     }
 
   public Client() {
 
     JPanel input = new JPanel();
     input.setLayout(new BorderLayout());
     input.setBorder(new TitledBorder("Enter Message"));
     input.add(toclient, BorderLayout.CENTER);
     input.add(send, BorderLayout.EAST);
 
     JPanel output = new JPanel();
     output.setLayout(new BorderLayout());
     output.setBorder(new TitledBorder("Conversation"));
     output.add(display, BorderLayout.CENTER);
 
     JPanel gabung = new JPanel();
     gabung.setLayout(new GridLayout(2, 1));
     gabung.add(input);
     gabung.add(output);
 
     this.getContentPane().add(gabung, BorderLayout.NORTH);
 
     setTitle("Chat Client");
     setSize(500, 300);
     setVisible(true);
 
}}
