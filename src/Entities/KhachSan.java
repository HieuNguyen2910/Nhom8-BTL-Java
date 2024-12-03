package Entities;

import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class KhachSan implements Serializable{
    private String maKS;
    private String tenKS;
    private String diaDiem;

    public KhachSan() {
    }

    public KhachSan(String maKS, String tenKS, String diaDiem) {
        this.maKS = maKS;
        this.tenKS = tenKS;
        this.diaDiem = diaDiem;
    }

    public String getMaKS() {
        return maKS;
    }

    public void setMaKS(String maKS) {
        this.maKS = maKS;
    }

    public String getTenKS() {
        return tenKS;
    }

    public void setTenKS(String tenKS) {
        this.tenKS = tenKS;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
    @Override
    public String toString() {
        return "KhachSan{" + "MaKS=" + maKS + ", TenKS=" + tenKS + ", DiaDiem=" + diaDiem + '}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ArrayList<KhachSan> a = DocFile.Doc_KhachSan_Tu_File();
        
          //Tạo khách sạn file
          ArrayList<KhachSan> s = new ArrayList<>();     
          KhachSan ks1 = new KhachSan("KS001","Hải Âu","Phú Quốc");
          KhachSan ks2 = new KhachSan("KS002","ViPhu","Tam Đảo");
          KhachSan ks3 = new KhachSan("KS003","Hung Chan","Đà Nẵng");
          KhachSan ks4 = new KhachSan("KS004","SunShine","Đà Lạt");
          s.add(ks1);
          s.add(ks2);
          s.add(ks3);
          s.add(ks4);
          GhiFile.ghi_KhachSan_Vao_File(s);
    }
}
