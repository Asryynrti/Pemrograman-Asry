package tobat1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.serial.SerialBlob;
import javax.xml.crypto.Data;



public class Tobat_Keranjang_d4 extends JFrame {
    
    JLabel j1 = new JLabel ("TOBAT");
    JLabel j2 = new JLabel ("Keranjang Belanja Anda");
    JTextArea t1 = new JTextArea ("");
    JTextArea t2 = new JTextArea ("NAMA BARANG");
    JTextArea t3 = new JTextArea ("JUMLAH");
    JTextArea t4 = new JTextArea ("TOTAL");
    JTextArea t5 = new JTextArea ("");
    JTextArea t6 ;
    JTextArea t7 ;
    JTextArea t8 = new JTextArea ("TOTAL BELANJA ");
    JTextArea t9 = new JTextArea ("");
    JTextArea t10 = new JTextArea ("");
    JTextArea t11 = new JTextArea ("");
    JLabel label1 ;
    ImageIcon img1 ;
    JLabel label2 ;
    ImageIcon img2 ;
    JLabel troli;
    ImageIcon img11;
    JLabel troli1;
    ImageIcon img12;
    JButton jb = new JButton ("HOME");
    JButton jb1 = new JButton ("HOME");
    JButton jb2 = new JButton ("BELI");
    JButton jb3 = new JButton ("BELI");
    ImageIcon ambilgambar;
    String ambilnama;
    String ambilharga;

    JFrame jf = new JFrame ("TOBAT");
    
    public Tobat_Keranjang_d4 () {
        this.getContentPane().setLayout (null);
        
        String sql = "SELECT * FROM projek.obat WHERE id_obat = 'od004'";
    try {
        Connection konek = new DB_Koneksi().getConnection();
                Statement stat = konek.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()) {
                    
                    ambilnama = new String (hasil.getString("nm_obat"));
                    ambilharga = new String (hasil.getString("harga"));
                }
                konek.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "GAGAL Menampilkan Data", "informasi", JOptionPane.INFORMATION_MESSAGE);
            }
       
    
        img1 = new ImageIcon(getClass().getResource("logo.png"));
        label1 = new JLabel(img1);
        img2 = new ImageIcon(getClass().getResource("tobat.png"));
        label2 = new JLabel(img2);
        img11 = new ImageIcon(getClass().getResource("troli edit.png"));
        troli = new JLabel(img11);
        img12 = new ImageIcon(getClass().getResource("troli edit.png"));
        troli1 = new JLabel(img12);
        t5 = 
        t6 = new JTextArea(ambilnama);
        t7 = new JTextArea(ambilharga);
        
        j1.setFont(new Font ("Serif", Font.BOLD,48));
        j1.setForeground(Color.red);
        j1.setBounds(20, 5, 250, 50);
        j2.setFont(new Font("Serif", Font.BOLD,25));
        j2.setBounds(354, 75, 450, 50);
        t1.setBounds(20, 200, 300, 450);
        t2.setBounds(325, 200, 170, 20);
        t3.setBounds(500, 200, 170, 20);
        t4.setBounds(675, 200, 170, 20);
        t5.setBounds(500, 225, 170, 400);
        t6.setBounds(325, 225, 170, 400);
        t7.setBounds(675, 225, 170, 400);
        t8.setBounds(325, 630, 345, 20);
        t9.setBounds(500, 630, 170, 20);
        t10.setBounds(675, 630, 170, 20);
        t11.setBounds(675, 630, 170, 20);
        label1.setBounds(200, 5, 50, 50);
        label2.setBounds(20, 5, 250, 50);
	troli.setBounds(900, 5, 50, 50);
        troli1.setBounds(900, 5, 50, 50);
        jb.setBounds(250, 660, 100, 30);
        jb1.setBounds(250, 660, 100, 30);
        jb2.setBounds(600, 660, 100, 30);
        jb3.setBounds(600, 660, 100, 30);
        jb.setBackground(Color.LIGHT_GRAY);
        jb1.setBackground(Color.LIGHT_GRAY);
        jb2.setBackground(Color.LIGHT_GRAY);
        jb3.setBackground(Color.LIGHT_GRAY);

        jb.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		new Tobat_Dashboard
	            ().setVisible(true);
        		CloseFrame();
        	}
        });
        
        jb1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		new Tobat_Dashboard
	            ().setVisible(true);
        		CloseFrame();
        	}
        });
        
	jb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(Tobat_Keranjang_d4.this, "Pesanan sudah terdata. Silakan melakukan pembayaran di kasir. Terimakasih.");
			System.exit(0);
			}
		});

	jb3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(Tobat_Keranjang_d4.this, "Pesanan sudah terdata. Silakan melakukan pembayaran di kasir. Terimakasih.");
			System.exit(0);
			}
		});
        
        jf.add(j1);
        jf.add(j2);
        jf.add(t1);
        jf.add(t2);
        jf.add(t3);
        jf.add(t4);
        jf.add(t5);
        jf.add(t6);
        jf.add(t7);
        jf.add(t8);
        jf.add(t10);
        jf.add(t11);
        jf.add(label1);
        
        jf.add(troli);
        jf.add(troli1);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
       
        
        jf.setVisible(true);
        jf.setSize(1000, 768);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    protected void CloseFrame() {
		// TODO Auto-generated method stub
		
	}

	public static void main (String args[]) {
        Tobat_Keranjang_d4 t = new Tobat_Keranjang_d4();
    }
}