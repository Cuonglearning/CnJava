/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class ALBUM {
    private String MaAlbum,TenAlbum,MaLoaiAlbum,ThoiLuong,DaoDien,NhaSanXuat;
    private String NamSanXuat;
    private String ChuDe,NgayPhatHanh;
    private String DonGia;
    private String GhiChu;

    public ALBUM() {
    }

    @Override
    public String toString() {
        return "ALBUM{" + "MaAlbum=" + MaAlbum + ", TenAlbum=" + TenAlbum + ", MaLoaiAlbum=" + MaLoaiAlbum + ", ThoiLuong=" + ThoiLuong + ", DaoDien=" + DaoDien + ", NhaSanXuat=" + NhaSanXuat + ", NamSanXuat=" + NamSanXuat + ", ChuDe=" + ChuDe + ", NgayPhatHanh=" + NgayPhatHanh + ", DonGia=" + DonGia + ", GhiChu=" + GhiChu + '}';
    }

    public String getMaAlbum() {
        return MaAlbum;
    }

    public void setMaAlbum(String MaAlbum) {
        this.MaAlbum = MaAlbum;
    }

    public String getTenAlbum() {
        return TenAlbum;
    }

    public void setTenAlbum(String TenAlbum) {
        this.TenAlbum = TenAlbum;
    }

    public String getMaLoaiAlbum() {
        return MaLoaiAlbum;
    }

    public void setMaLoaiAlbum(String MaLoaiAlbum) {
        this.MaLoaiAlbum = MaLoaiAlbum;
    }

    public String getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(String ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String DaoDien) {
        this.DaoDien = DaoDien;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public String getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(String NamSanXuat) {
        this.NamSanXuat = NamSanXuat;
    }

    public String getChuDe() {
        return ChuDe;
    }

    public void setChuDe(String ChuDe) {
        this.ChuDe = ChuDe;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public ALBUM(String MaAlbum, String TenAlbum, String MaLoaiAlbum, String ThoiLuong, String DaoDien, String NhaSanXuat, String NamSanXuat, String ChuDe, String NgayPhatHanh, String DonGia, String GhiChu) {
        this.MaAlbum = MaAlbum;
        this.TenAlbum = TenAlbum;
        this.MaLoaiAlbum = MaLoaiAlbum;
        this.ThoiLuong = ThoiLuong;
        this.DaoDien = DaoDien;
        this.NhaSanXuat = NhaSanXuat;
        this.NamSanXuat = NamSanXuat;
        this.ChuDe = ChuDe;
        this.NgayPhatHanh = NgayPhatHanh;
        this.DonGia = DonGia;
        this.GhiChu = GhiChu;
    }

}