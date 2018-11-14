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
import view.order;

/**
 *
 * @author Administrator
 */
public class pesansekarang_kontroler implements MouseListener{

    private order gui;
    private database db = new database();
    private ResultSet rs=null;
    private String nama;
    public pesansekarang_kontroler(String nama){
        db.konek();
        gui = new order();
        gui.setVisible(true);
        gui.addlistener(this);
        this.nama=nama;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source=e.getSource();
        if(source.equals(gui.getExit())){
            gui.dispose();
            new main_kontroler(nama);
        }else{
            gui.dispose();
            new main_kontroler(nama);
        }

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
