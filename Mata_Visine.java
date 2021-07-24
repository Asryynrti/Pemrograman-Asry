package tobat1;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
	
	public class Mata_Visine extends JFrame {
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
	    JLabel J2= new  JLabel  ("VISINE");
	    JLabel J3 = new JLabel ("Indikasi Umum :");
	    JLabel J4 = new JLabel ("Komposisi : ");
	    JLabel J5 =new JLabel ("Dosis : ");
	    JLabel J6 = new JLabel ("Aturan Pakai : ");
	    JLabel J7 = new JLabel ("Perhatian : ");
	    JButton bt12 = new JButton ("TAMBAHKAN KE KERANJANG");
	    JLabel label1 ;
	    ImageIcon logo ;
	    ImageIcon img1 ;
	    JLabel obat1 ;
	    ImageIcon img2 ;
	    JLabel obat2 ;
	    JLabel label3 ;
	    ImageIcon img3 ;
	    JTextArea t1 ;
        JTextArea t2 ;
        JTextArea t3 ;
        JTextArea t4 ;
        JTextArea t5 ;
        String ambilumum ;
        String ambilkompo ;
        String ambildosis ;
        String ambilaturan ;
        String ambilperhatian ;
	    JLabel label4 ;
	    ImageIcon img4 ;
	    JLabel troli;
	    ImageIcon img11;
	    JLabel troli1;
	    ImageIcon img12;
	  
		
	public Mata_Visine() {
		this.getContentPane().setLayout(null);
		
		String sql = "SELECT * FROM projek.obat WHERE id_obat = 'oh008'";
        try {
            Connection konek = new DB_Koneksi().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                ambilumum = new String (hasil.getString("umum"));
                ambilkompo = new String (hasil.getString("kompo"));
                ambildosis = new String (hasil.getString("dosis"));
                ambilaturan = new String (hasil.getString("aturan"));
                ambilperhatian = new String (hasil.getString("warning"));
            }
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan Data", "informasi", JOptionPane.INFORMATION_MESSAGE);
        }
                    
            t1 = new JTextArea(ambilumum);
            t2 = new JTextArea(ambilkompo);
            t3 = new JTextArea(ambildosis);
            t4 = new JTextArea(ambilaturan);
            t5 = new JTextArea(ambilperhatian);
		
			J1.setFont(new Font("Serif", Font.BOLD,48));
			J1.setForeground(Color.red);
			J2.setFont(new Font("Serif", Font.BOLD,24));
			bt12.setBackground(Color.lightGray);
			img1 = new ImageIcon(getClass().getResource("Visine.png"));
			obat1 = new JLabel(img1);
		    img2 = new ImageIcon(getClass().getResource("Procold.png"));
		    obat2 = new JLabel(img2);
		    img3 = new ImageIcon(getClass().getResource("logo.png"));
			label3 = new JLabel(img3);
		    img4 = new ImageIcon(getClass().getResource("tobat.png"));
		    label4 = new JLabel(img4);
		    img11 = new ImageIcon(getClass().getResource("troli edit.png"));
	        troli = new JLabel(img11);
	        img12 = new ImageIcon(getClass().getResource("troli edit.png"));
	        troli1 = new JLabel(img12);
	
	        
	        J1.setBounds(20, 5, 250, 50);
	        bt1.setBounds (0, 60, 100, 45);
	        bt2.setBounds (100, 60, 100, 45);
	        bt3.setBounds (200, 60, 100, 45);
	        bt4.setBounds (300, 60, 100, 45);
	        bt5.setBounds (400, 60, 100, 45);
	        bt6.setBounds (500, 60, 100, 45);
	        bt7.setBounds (600, 60, 100, 45);
	        bt8.setBounds (700, 60, 100, 45);
	        bt9.setBounds (800, 60, 100, 45);
	        bt10.setBounds(900, 60, 100, 45);
	        bt11.setBounds (1000, 55, 100, 45);
	        J2.setBounds(100,150,300,50);
	        J3.setBounds(350,150,650,50);
	        J4.setBounds(350,250,650,50);
	        J5.setBounds(350,350,650,50);
	        J6.setBounds(350,450,650,50);
	        J7.setBounds(350,550,650,50);
	        bt12.setBounds(50,450,250,50);
	        obat1.setBounds(120, 250, 115, 115);
	        obat2.setBounds(120, 250, 115, 115);
	        label3.setBounds(200, 5, 50, 50);
	        label4.setBounds(20, 5, 250, 50);
	        troli.setBounds(900, 5, 50, 50);
	        troli1.setBounds(900, 5, 50, 50);
	        t1.setBounds(350,190,600,70);
            t2.setBounds(350,290,600,70);
            t3.setBounds(350,390,600,70);
            t4.setBounds(350,490,600,70);
            t5.setBounds(350,590,600,70);
	        
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
	        
	        
	        bt1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            new Tobat_Flu().setVisible(true);
	            CloseFrame();
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
	            new Tobat_Keranjang_h8
	            ().setVisible(true);
			CloseFrame();		
				}
			});
	        
	        bt12.addActionListener(new ActionListener(){
	        	public void actionPerformed(ActionEvent e){
	        		new Tobat_Keranjang_h8
		            ().setVisible(true);
	        		CloseFrame();
	        	}
	        });

	    	     
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
			jf.add(J2);
			jf.add(J3);
			jf.add(J4);
			jf.add(J5);
			jf.add(J6);
			jf.add(J7);
			jf.add(bt12);
			jf.add(obat1);
			jf.add(label3);
			jf.add(troli);
	        
	        jf.add(t1);
	        jf.add(t2);
	        jf.add(t3);
	        jf.add(t4);
	        jf.add(t5);
                jf.add(troli1);
			
			
			
			 jf.setVisible(true);
		     jf.setSize(1000, 768);
		     jf.setResizable(false);
		     jf.setLayout(null);
		     jf.setVisible(true);
		     jf.setLocationRelativeTo(null);
		     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	protected void CloseFrame() {
		super.dispose();
			}
	public static void main(String[] args) {
		Mata_Visine t = new Mata_Visine();
		
	}
}