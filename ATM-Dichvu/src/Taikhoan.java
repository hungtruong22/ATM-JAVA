
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Taikhoan implements Serializable{
    private String SoTaiKhoan;
    private String HoTenTaiKhoan;
    private String MatKhau;
    private String TrangThai;
    private Long SoTien;
    private int SoLanDangNhapSai;

    public Taikhoan() {
    }

    public Taikhoan(String SoTaiKhoan, String HoTenTaiKhoan, String MatKhau, String TrangThai, Long SoTien , int SoLanDangNhapSai) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTenTaiKhoan = HoTenTaiKhoan;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
        this.SoTien = SoTien;
        this.SoLanDangNhapSai = SoLanDangNhapSai;
    }

    public Taikhoan(String SoTaiKhoan, int SoLanDangNhapSai) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.SoLanDangNhapSai = SoLanDangNhapSai;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoTenTaiKhoan() {
        return HoTenTaiKhoan;
    }

    public void setHoTenTaiKhoan(String HoTenTaiKhoan) {
        this.HoTenTaiKhoan = HoTenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Long getSoTien() {
        return SoTien;
    }

    public void setSoTien(Long SoTien) {
        this.SoTien = SoTien;
    }

    public int getSoLanDangNhapSai() {
        return SoLanDangNhapSai;
    }

    public void setSoLanDangNhapSai(int SoLanDangNhapSai) {
        this.SoLanDangNhapSai = SoLanDangNhapSai;
    }

    @Override
    public String toString() {
        return "Taikhoan{" + "SoTaiKhoan=" + SoTaiKhoan + ", HoTenTaiKhoan=" + HoTenTaiKhoan + ", MatKhau=" + MatKhau + ", TrangThai=" + TrangThai + ", SoTien=" + SoTien + ", SoLanDangNhapSai=" + SoLanDangNhapSai + '}';
    }
    

    
}
