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
public class Tour implements Serializable{
    private String maTour;
    private String tenTour;
    private String thoiGian;
    private String diaDiem;
    private String maXe;
    private String maKS;

    public Tour() {
    }

    public Tour(String maTour, String tenTour, String thoiGian, String diaDiem, String maXe, String maKS) {
        this.maTour = maTour;
        this.tenTour = tenTour;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
        this.maXe = maXe;
        this.maKS = maKS;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getMaKS() {
        return maKS;
    }

    public void setMaKS(String maKS) {
        this.maKS = maKS;
    }
    
    @Override
    public String toString() {
        return "Tour{" + "MaTour=" + maTour + ", TenTour=" + tenTour + ", ThoiGian=" + thoiGian + ", DiaDiem=" + diaDiem + ", MaXe=" + maXe + ", MaKS=" + maKS +'}';
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ArrayList<Tour> a = DocFile.Doc_Tour_Tu_File();
        
          //Tạo tour file
          ArrayList<Tour> nv = new ArrayList<>();     
          Tour t1 = new Tour("T001","Du lịch SaPa","3 ngày 2 đêm","Hà Nội","X02","KS001");
          Tour t2 = new Tour("T002","Du lịch Phú Quốc","4 ngày","TP.Hồ Chí Minh","X01","KS003");
          Tour t3 = new Tour("T003","Du lịch Đà Nẵng","7 ngày","TP.Hồ Chí Minh","X04","KS002");
          Tour t4 = new Tour("T004","Du lịch Tam Đảo","5 ngày 4 đêm","Hải Phòng","X03","KS002");
          nv.add(t1);
          nv.add(t2);
          nv.add(t3);
          nv.add(t4);
          GhiFile.ghi_Tour_Vao_File(nv);
    }
}
