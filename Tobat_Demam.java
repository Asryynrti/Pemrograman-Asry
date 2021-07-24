package tobat1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tobat_Demam extends JFrame  {
    
    JFrame jf = new JFrame ("TOBAT");
    JButton bt1 = new JButton ("Flu");
    JButton bt2 = new JButton ("Demam");
    JButton bt3 = new JButton ("Kulit");
    JButton bt4 = new JButton ("Alergi");
    JButton bt5 = new JButton ("Asma");
    JButton bt6 = new JButton ("Herbal");
    JButton bt7 = new JButton ("Mata");
    JButton bt8 = new JButton ("Anak-anak");
    JButton bt9 = new JButton ("Antibiotik");
    JButton bt10 = new JButton ("Vitamin");
    JButton bt11 = new JButton ("Vitamin2");
    JLabel J1 = new JLabel ("TOBAT");
    JLabel label1 ;
    ImageIcon img1 ;
    JLabel label2 ;
    ImageIcon img2 ;
    JLabel obat1 ;
    ImageIcon img3 ;
    JLabel obat2 ;
    ImageIcon img4 ;
    JLabel obat3 ;
    ImageIcon img5 ;
    JLabel obat4 ;
    ImageIcon img6 ;
    JLabel obat5 ;
    ImageIcon img7 ;
    JLabel obat6 ;
    ImageIcon img8 ;
    JLabel obat7 ;
    ImageIcon img9 ;
    JLabel obat8 ;
    ImageIcon img10 ;
    JLabel troli;
    ImageIcon img11;
    JLabel troli1;
    ImageIcon img12;
    JButton bt12 = new JButton ("BIOGESIC");
    JButton bt13 = new JButton ("BODREXIN");
    JButton bt14 = new JButton ("DUMIN");
    JButton bt15 = new JButton ("HUFAGESIC");
    JButton bt16 = new JButton ("INZANA");
    JButton bt17 = new JButton ("IPEOX");
    JButton bt18 = new JButton ("MAGANOL");
    JButton bt19 = new JButton ("PANADOL");
    JButton bt20 = new JButton ("PANADOL");
    
    public Tobat_Demam () {
    
        this.getContentPane ().setLayout (null);
        img1 = new ImageIcon(getClass().getResource("logo.png"));
        label1 = new JLabel(img1);
        img2 = new ImageIcon(getClass().getResource("tobat.png"));
        label2 = new JLabel(img2);
        img3 = new ImageIcon(getClass().getResource("Biogesic.png"));
        obat1 = new JLabel(img3);
        img4 = new ImageIcon(getClass().getResource("Bodrexin.png"));
        obat2 = new JLabel(img4);
        img5 = new ImageIcon(getClass().getResource("Dumin.png"));
        obat3 = new JLabel(img5);
        img6 = new ImageIcon(getClass().getResource("Hufagesic.png"));
        obat4 = new JLabel(img6);
        img7 = new ImageIcon(getClass().getResource("Inzana.png"));
        obat5 = new JLabel(img7);
        img8 = new ImageIcon(getClass().getResource("Ipeox.png"));
        obat6 = new JLabel(img8);
        img9 = new ImageIcon(getClass().getResource("Maganol.png"));
        obat7 = new JLabel(img9);
        img10 = new ImageIcon(getClass().getResource("Panadol Biru.png"));
        obat8 = new JLabel(img10);
        img11 = new ImageIcon(getClass().getResource("troli edit.png"));
        troli = new JLabel(img11);
        img12 = new ImageIcon(getClass().getResource("troli edit.png"));
        troli1 = new JLabel(img12);
        
        
        J1.setFont(new Font ("Serif", Font.BOLD,48));
        J1.setForeground(Color.red);
        J1.setBounds(20, 5, 250, 50);
        bt1.setBounds (0, 80, 100, 45);
        bt2.setBounds (100, 80, 100, 45);
        bt3.setBounds (200, 80, 100, 45);
        bt4.setBounds (300, 80, 100, 45);
        bt5.setBounds (400, 80, 100, 45);
        bt6.setBounds (500, 80, 100, 45);
        bt7.setBounds (600, 80, 100, 45);
        bt8.setBounds (700, 80, 100, 45);
        bt9.setBounds (800, 80, 100, 45);
        bt10.setBounds(900, 80, 100, 45);
        bt11.setBounds (1000, 80, 100, 45);
        label1.setBounds(200, 5, 50, 50);
        obat1.setBounds(150, 250, 115, 115);
        obat2.setBounds(350, 250, 115, 115);
        obat3.setBounds(550, 250, 115, 115);
        obat4.setBounds(750, 250, 115, 115);
        obat5.setBounds(150, 500, 115, 115);
        obat6.setBounds(350, 500, 115, 115);
        obat7.setBounds(550, 500, 115, 115);
        obat8.setBounds(750, 500, 115, 115);
        label2.setBounds(20, 5, 250, 50);
        bt12.setBounds (155, 360, 100, 40);
        bt13.setBounds (355, 360, 100, 40);
        bt14.setBounds (555, 360, 100, 40);
        bt15.setBounds (755, 360, 100, 40);
        bt16.setBounds (155, 615, 100, 40);
        bt17.setBounds (355, 615, 100, 40);
        bt18.setBounds (555, 615, 100, 40);
        bt19.setBounds (755, 615, 100, 40);
        bt20.setBounds (755, 615, 100, 40);
        troli.setBounds(900, 5, 50, 50);
        troli1.setBounds(900, 5, 50, 50);
        
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
        bt12.setBackground(Color.WHITE);
        bt13.setBackground(Color.WHITE);
        bt14.setBackground(Color.WHITE);
        bt15.setBackground(Color.WHITE);
        bt16.setBackground(Color.WHITE);
        bt17.setBackground(Color.WHITE);
        bt18.setBackground(Color.WHITE);
        bt19.setBackground(Color.WHITE);
        bt20.setBackground(Color.WHITE);
        
        
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
        
        bt12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_biogesic().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_bodrexin().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_dumin().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_hufagesicsirup().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_inzana().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_ipeox().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_maganol().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_panadolbiru().setVisible(true);
		CloseFrame();		
			}
		});
        
        bt20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new desk_demam_panadolbiru().setVisible(true);
		CloseFrame();		
			}
		});
        

        jf.add(label1);
        jf.add(J1);
        jf.add(bt1);
        jf.add(bt2);
        jf.add(bt3);
        jf.add(bt4);
        jf.add(bt5);
        jf.add(bt6);
        jf.add(bt7);
        jf.add(bt8);
        jf.add(bt9);
        jf.add(bt10);
        jf.add(bt11);
        jf.add(label1);
        jf.add(obat1);
        jf.add(obat2);
        jf.add(obat3);
        jf.add(obat4);
        jf.add(obat5);
        jf.add(obat6);
        jf.add(obat7);
        jf.add(obat8);
        jf.add(bt12);
        jf.add(bt13);
        jf.add(bt14);
        jf.add(bt15);
        jf.add(bt16);
        jf.add(bt17);
        jf.add(bt18);
        jf.add(bt19);
        jf.add(bt20);
        jf.add(troli);
        jf.add(troli1);
     
        
        jf.setVisible(true);
        jf.setSize(1000, 768);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        
    }
    
     public void CloseFrame(){
        super.dispose();
    }
    
    public static void main (String args[]){
        Tobat_Demam t = new Tobat_Demam();
        
        
        
    }

}
   
