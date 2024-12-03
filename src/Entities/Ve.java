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
public class Ve implements Serializable {

    private String maVe;  
    private String tenUser;
    private String maTour;
    private String maNV;  
    private String thoiGian;
    private double giaVe;

    public Ve() {
    }

    public Ve(String maVe, String tenUser, String maTour, String maNV, String thoiGian, double giaVe) {
        this.maVe = maVe;
        this.thoiGian = thoiGian;
        this.giaVe = giaVe;
        this.tenUser = tenUser;
        this.maTour = maTour;
        this.maNV = maNV;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    @Override
    public String toString() {
        return "Ve{" + "MaVe=" + maVe + ", TenUser=" + tenUser + ", MaTour=" + maTour + ", MaNV=" + maNV + ", ThoiGian=" + thoiGian + ", GiaVe=" + giaVe + '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Ve> a = DocFile.Doc_Ve_Tu_File();

//          //Tạo vé file
          ArrayList<Ve> nv = new ArrayList<>();     
          Ve v1 = new Ve("V001","user01","T001","NV01","10/01/2023",30000);
          Ve v2 = new Ve("V002","user02","T002","NV02","2/06/2024",40000);
          Ve v3 = new Ve("V003","user03","T003","NV03","8/10/2024",50000);
          Ve v4 = new Ve("V004","user04","T004","NV04","4/11/2023",60000);
          nv.add(v1);
          nv.add(v2);
          nv.add(v3);
          nv.add(v4);
          GhiFile.ghi_Ve_Vao_File(nv);
    }
}
