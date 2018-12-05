/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import database.database;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.model_transaksi;
import view.laporan;

/**
 *
 * @author Administrator
 */
public class laporan_kontroler implements MouseListener {
    private laporan gui;
    private database db = new database();
    private ResultSet rs=null;
    private String nama;
    private ArrayList<model_transaksi> daftartransaksi = new ArrayList<model_transaksi>();
    public laporan_kontroler(String nama){
        db.konek();
        getpesananfromdb();
        gui = new pesanan();
        gui.tampilpesanan(daftarpesanan);
        gui.setVisible(true);
        gui.addlistener(this);
        this.nama=nama;
    }
    public void gettransaksifromdb(){
        daftartransaksi = new ArrayList<model_transaksi>();
        String command ="select harga from menu where id_menu in (select id_menu from detiltransaksi where id_transaksi="+y+")";
        try {
            rs = db.getdata(command);
            while (rs.next()){
                int id = rs.getInt("id_menu");
                String nama = rs.getString("nama");
                double harga = rs.getDouble("harga");
                String status = rs.getString("status");
                daftarpesanan.add(new model_menu(id,nama,status,harga));
            }
        } catch (Exception e) {
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        gui.dispose();
        new mainmanager_kontroler(nama);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
