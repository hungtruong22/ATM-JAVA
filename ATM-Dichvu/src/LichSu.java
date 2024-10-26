
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LichSu implements Serializable{
    private int MaGiaoDich;
    private Long SoTienGiaoDich;
    private Date NgayGiaoDich;
    private String SoTaiKhoan;
    private String GhiChu;

    public LichSu() {
    }

    public LichSu(int MaGiaoDich, Long SoTienGiaoDich, Date NgayGiaoDich, String SoTaiKhoan, String GhiChu) {
        this.MaGiaoDich = MaGiaoDich;
        this.SoTienGiaoDich = SoTienGiaoDich;
        this.NgayGiaoDich = NgayGiaoDich;
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    public int getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(int MaGiaoDich) {
        this.MaGiaoDich = MaGiaoDich;
    }

    public Long getSoTienGiaoDich() {
        return SoTienGiaoDich;
    }

    public void setSoTienGiaoDich(Long SoTienGiaoDich) {
        this.SoTienGiaoDich = SoTienGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Date NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "LichSu{" + "MaGiaoDich=" + MaGiaoDich + ", SoTienGiaoDich=" + SoTienGiaoDich + ", NgayGiaoDich=" + NgayGiaoDich + ", SoTaiKhoan=" + SoTaiKhoan + ", GhiChu=" + GhiChu + '}';
    }
    
    
}
