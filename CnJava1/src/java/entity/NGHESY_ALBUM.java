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
public class NGHESY_ALBUM {
    private String MaAlbum,MaNgheSy;

    public NGHESY_ALBUM() {
    }

    public NGHESY_ALBUM(String MaAlbum, String MaNgheSy) {
        this.MaAlbum = MaAlbum;
        this.MaNgheSy = MaNgheSy;
    }

    public String getMaAlbum() {
        return MaAlbum;
    }

    public void setMaAlbum(String MaAlbum) {
        this.MaAlbum = MaAlbum;
    }

    public String getMaNgheSy() {
        return MaNgheSy;
    }

    public void setMaNgheSy(String MaNgheSy) {
        this.MaNgheSy = MaNgheSy;
    }

    @Override
    public String toString() {
        return "NGHESY_ALBUM{" + "MaAlbum=" + MaAlbum + ", MaNgheSy=" + MaNgheSy + '}';
    }
    
}
