/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.NGHESY_ALBUM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NGHESY_ALBUMDAO {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public List<NGHESY_ALBUM> getAllNGHESY_ALBUM(){
        List<NGHESY_ALBUM> list=new ArrayList<>();
        String query="select * from NGHESY_ALBUM";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new NGHESY_ALBUM(rs.getString(1),
                         rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void deleteNGHESY_ALBUM(String maAlbum){
        String query="delete from NGHESY_ALBUM\n"
                        +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maAlbum);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void themNGHESY_ALBUM(String maAlbum, String maNgheSy){
        String query="insert into \n"
                +"NGHESY_ALBUM\n"
                +"values(?,?)";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maAlbum);
            ps.setString(2, maNgheSy);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public NGHESY_ALBUM getNGHESY_ALBUMID(String maAlbum){
        String query="select * from NGHESY_ALBUM\n"
                +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maAlbum);
            rs=ps.executeQuery();
            while (rs.next()) {
                return new NGHESY_ALBUM(rs.getString(1),
                        rs.getString(2)); 
                
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void updateNgheSy_Album(String maAlbum,String maNgheSy){
        String query="update NGHESY_ALBUM\n"
                +"set MaNgheSy=?\n"
                +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maNgheSy);
            ps.setString(2, maAlbum);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
}
