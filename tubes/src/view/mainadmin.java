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
public class mainadmin extends javax.swing.JFrame {

    /**
     * Creates new form mainadmin
     */
    public mainadmin(String a) {
        initComponents();
        user.setText(a);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
    }
    
    public JLabel getExit() {
        return exit;
    }

    public JLabel getmenu() {
        return menu;
    }
    
    public JLabel getpegawai() {
        return pegawai;
    }
    public JLabel getcustomer() {
        return customer;
    }
    public void addlistener(MouseListener e){
        exit.addMouseListener(e);
        menu.addMouseListener(e);
        pegawai.addMouseListener(e);
        customer.addMouseListener(e);
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
        customer = new javax.swing.JLabel();
        pegawai = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(583, 450));
        jPanel1.setLayout(null);

        customer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        customer.setForeground(new java.awt.Color(255, 255, 0));
        customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah pegawai.png"))); // NOI18N
        customer.setText("CUSTOMER");
        customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(customer);
        customer.setBounds(180, 260, 200, 50);

        pegawai.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pegawai.setForeground(new java.awt.Color(255, 255, 0));
        pegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pegawai.png"))); // NOI18N
        pegawai.setText("PEGAWAI");
        pegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(pegawai);
        pegawai.setBounds(180, 200, 190, 50);

        menu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 0));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah makanan.png"))); // NOI18N
        menu.setText("MENU");
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(menu);
        menu.setBounds(190, 130, 170, 50);

        user.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(51, 204, 0));
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon.png"))); // NOI18N
        jPanel1.add(user);
        user.setBounds(10, 13, 213, 48);

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 204, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout.png"))); // NOI18N
        exit.setText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(exit);
        exit.setBounds(446, 13, 112, 35);

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
    private javax.swing.JLabel customer;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel pegawai;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
