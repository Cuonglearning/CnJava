package a;

import dao.NGHESY_ALBUMDAO;
import entity.NGHESY_ALBUM;
import java.util.List;

public class as{
    public static void main(String[] args) {
        NGHESY_ALBUMDAO dao=new NGHESY_ALBUMDAO();
        NGHESY_ALBUM s=dao.getNGHESY_ALBUMID("A034");
        System.out.println(s);
    }
}