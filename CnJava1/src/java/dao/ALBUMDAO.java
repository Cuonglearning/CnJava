/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.ALBUM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ALBUMDAO {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public List<ALBUM> getAllALBUM(){
        List<ALBUM> list=new ArrayList<>();
        String query="select * from ALBUM";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new ALBUM(rs.getString(1),
                         rs.getString(2),
                         rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void deleteALBUM(String maAlbum){
        String query="delete from ALBUM\n"
                        +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maAlbum);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void themALBUM(String MaAlbum, String TenAlbum, String MaLoaiAlbum, String ThoiLuong, String DaoDien, String NhaSanXuat, String NamSanXuat, String ChuDe, String NgayPhatHanh, String DonGia, String GhiChu){
        String query="insert into \n"
                +"ALBUM\n"
                +"values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, MaAlbum);
            ps.setString(2, TenAlbum);
            ps.setString(3, MaLoaiAlbum);
            ps.setString(4, ThoiLuong);
            ps.setString(5, DaoDien);
            ps.setString(6, NhaSanXuat);
            ps.setString(7, NamSanXuat);
            ps.setString(8, ChuDe);
            ps.setString(9, NgayPhatHanh);
            ps.setString(10, DonGia);
            ps.setString(11, GhiChu);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public ALBUM getALBUMID(String maAlbum){
        String query="select * from ALBUM\n"
                +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, maAlbum);
            rs=ps.executeQuery();
            while (rs.next()) {
                return new ALBUM(rs.getString(1),
                         rs.getString(2),
                         rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)); 
                
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void updateAlbum(String MaAlbum, String TenAlbum, String MaLoaiAlbum, String ThoiLuong, String DaoDien, String NhaSanXuat, String NamSanXuat, String ChuDe, String NgayPhatHanh, String DonGia, String GhiChu){
        String query="update ALBUM\n"
                +"set TenAlbum=?,\n"
                +"set MaLoaiAlbum=?,\n"
                +"set ThoiLuong=?,\n"
                +"set DaoDien=?,\n"
                +"set NhaSanXuat=?,\n"
                +"set NamSanXuat=?,\n"
                +"set ChuDe=?,\n"
                +"set NgayPhatHanh=?,\n"
                +"set DonGia=?,\n"
                +"set GhiChu=?\n"
                +"where MaAlbum=?";
        try {
            conn=new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1, TenAlbum);
            ps.setString(2, MaLoaiAlbum);
            ps.setString(3, ThoiLuong);
            ps.setString(4, DaoDien);
            ps.setString(5, NhaSanXuat);
            ps.setString(6, NamSanXuat);
            ps.setString(7, ChuDe);
            ps.setString(8, NgayPhatHanh);
            ps.setString(9, DonGia);
            ps.setString(10, GhiChu);
            ps.setString(11, MaAlbum);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
}
