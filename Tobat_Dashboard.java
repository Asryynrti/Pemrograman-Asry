package tobat1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tobat_Dashboard extends JFrame {
    
    JFrame f = new JFrame ("TOBAT");
    JButton bt1 = new JButton ("Flu");
    JButton bt2 = new JButton ("Demam");
    JButton bt3 = new JButton ("Kulit");
    JButton bt4 = new JButton ("Alergi");
    JButton bt5 = new JButton ("Asma");
    JButton bt6 = new JButton ("Herbal");
    JButton bt7 = new JButton ("Mata");
    JButton bt8 = new JButton ("Anak - Anak");
    JButton bt9 = new JButton ("Antibiotik");
    JButton bt10 = new JButton ("Vitamin");
    JButton bt11 = new JButton ("Vitamin");
    JLabel J1 = new JLabel ("TOBAT");
    JLabel label1 ;
    ImageIcon img1 ;
    JLabel label2 ;
    ImageIcon img2 ;
    
    public Tobat_Dashboard () {
        this.getContentPane().setLayout(null);
        img1 = new ImageIcon(getClass().getResource("logo.png"));
        label1 = new JLabel(img1);
        img2 = new ImageIcon(getClass().getResource("tobat.png"));
        label2 = new JLabel(img2);
        J1.setFont(new Font ("Serif", Font.BOLD,48));
        J1.setForeground(Color.black);
        J1.setBounds(20, 20, 250, 50);
        bt1.setBounds (55, 250, 155, 45);
        bt2.setBounds (300, 250, 155, 45);
        bt3.setBounds (550, 250, 155, 45);
        bt4.setBounds (790, 250, 155, 45);
        bt5.setBounds (55, 425, 155, 45);
        bt6.setBounds (300, 425, 155, 45);
        bt7.setBounds (550, 425, 155, 45);
        bt8.setBounds (790, 425, 155, 45);
        bt9.setBounds (55, 600, 155, 45);
        bt10.setBounds(300, 600, 155, 45);
        bt11.setBounds(300, 600, 155, 45);
        label1.setBounds(200, 20, 50, 50);
        label2.setBounds(20, 5, 250, 50);
        
        bt1.setBackground(Color.WHITE);
        bt2.setBackground(Color.WHITE);
        bt3.setBackground(Color.WHITE);
        bt4.setBackground(Color.WHITE);
        bt5.setBackground(Color.WHITE);
        bt6.setBackground(Color.WHITE);
        bt7.setBackground(Color.WHITE);
        bt8.setBackground(Color.WHITE);
        bt9.setBackground(Color.WHITE);
        bt10.setBackground(Color.WHITE);
        bt11.setBackground(Color.WHITE);
        
        
        
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            CloseFrame();
            new Tobat_Flu().setVisible(true);
				
			}
		});
        
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
                new Tobat_Demam().setVisible(true);
				
			}
		});
        
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Kulit().setVisible(true);
				
			}
		});
        
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Alergi().setVisible(true);
				
			}
		});
        
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Asma().setVisible(true);
				
			}
		});
        
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Herbal().setVisible(true);
				
			}
		});
        
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Mata().setVisible(true);
				
			}
		});
        
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Anak().setVisible(true);
				
			}
		});
        
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloseFrame();
            new Tobat_Antibiotik().setVisible(true);
				
			}
		});
        bt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new Tobat_Vitamin().setVisible(true);
		CloseFrame();		
			}
		});
        
        f.add(label1);
        f.add(J1);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);
        f.add(bt5);
        f.add(bt6);
        f.add(bt7);
        f.add(bt8);
        f.add(bt9);
        f.add(bt10);
        f.add(bt11);
        
        
        f.setVisible(true);
        f.setSize(1000, 768);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void CloseFrame(){
        super.dispose();
    }
    
    public static void main (String args[]){
        Tobat_Dashboard t = new Tobat_Dashboard();
       
        
        
        
    }
}
