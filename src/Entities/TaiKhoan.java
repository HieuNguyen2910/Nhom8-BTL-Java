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
public class TaiKhoan implements Serializable{
    private String MaTaiKhoan;
    private String MatKhau;
    private String VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String MaTaiKhoan, String MatKhau, String VaiTro) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaTaiKhoan=" + MaTaiKhoan + ", MatKhau=" + MatKhau + ", VaiTro=" + VaiTro + '}';
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        //ArrayList<TaiKhoan> listTK = DocFile.Doc_TaiKhoan_Tu_File();
        
          //Tạo file tài khoản
          ArrayList<TaiKhoan> s = new ArrayList<>();     
          TaiKhoan tk0 = new TaiKhoan("admin","1111","Admin");
          TaiKhoan tk1 = new TaiKhoan("admin1","123456","Admin");
          TaiKhoan tk2 = new TaiKhoan("admin2","123456","Admin");
          TaiKhoan tk3 = new TaiKhoan("admin3","123456","Admin");
          TaiKhoan tk4 = new TaiKhoan("admin4","123456","Admin");
          TaiKhoan tk5 = new TaiKhoan("user1","123456","User");
          TaiKhoan tk6 = new TaiKhoan("user2","123456","User");
          TaiKhoan tk7 = new TaiKhoan("user3","123456","User");
          s.add(tk0);
          s.add(tk1);
          s.add(tk2);
          s.add(tk3);
          s.add(tk4);
          s.add(tk5);
          s.add(tk6);
          s.add(tk7);
          
          GhiFile.ghi_TaiKhoan_Vao_File(s);
    }
}
