/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class menupegawai extends javax.swing.JFrame {

    /**
     * Creates new form menupegawai
     */
    public menupegawai() {
        initComponents();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
    }
    public void addlistener(MouseListener e){
        exit.addMouseListener(e);
        tambahpegawai.addMouseListener(e);
        lihatpegawai.addMouseListener(e);
        hapuspegawai.addMouseListener(e);
    }
    public JLabel getexit(){
        return exit;
    }
    public JLabel gettambahpegawai(){
        return tambahpegawai;
    }
    public JLabel gethapuspegawai(){
        return hapuspegawai;
    }
    public JLabel getlihatpegawai(){
        return lihatpegawai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lihatpegawai = new javax.swing.JLabel();
        tambahpegawai = new javax.swing.JLabel();
        hapuspegawai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(583, 450));
        jPanel1.setLayout(null);

        lihatpegawai.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lihatpegawai.setForeground(new java.awt.Color(255, 255, 0));
        lihatpegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pegawai.png"))); // NOI18N
        lihatpegawai.setText("LIHAT PEGAWAI");
        lihatpegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lihatpegawai);
        lihatpegawai.setBounds(170, 110, 270, 50);

        tambahpegawai.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tambahpegawai.setForeground(new java.awt.Color(255, 255, 0));
        tambahpegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kurangpegawai.png"))); // NOI18N
        tambahpegawai.setText("TAMBAH PEGAWAI");
        tambahpegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tambahpegawai);
        tambahpegawai.setBounds(170, 175, 290, 50);

        hapuspegawai.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hapuspegawai.setForeground(new java.awt.Color(255, 255, 0));
        hapuspegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah pegawai1.png"))); // NOI18N
        hapuspegawai.setText("HAPUS PEGAWAI");
        hapuspegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(hapuspegawai);
        hapuspegawai.setBounds(170, 245, 270, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("PEGAWAI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 50, 140, 30);

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back1.png"))); // NOI18N
        exit.setText("kembali");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(exit);
        exit.setBounds(10, 10, 160, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/backgroundmain.jpg"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(583, 390));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 583, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hapuspegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lihatpegawai;
    private javax.swing.JLabel tambahpegawai;
    // End of variables declaration//GEN-END:variables
}
