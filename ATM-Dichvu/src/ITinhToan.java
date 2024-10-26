
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
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
public interface ITinhToan extends Remote{
    public ArrayList getTK() throws RemoteException;
    public Taikhoan dangnhap(String stk, String mk) throws RemoteException;
    public void CapNhatTrangThai(String stk, String trangthai) throws RemoteException; 
    public void DoiMk(String stk, String matkhau) throws RemoteException;
    public Taikhoan getTKbySTK(String stk) throws RemoteException;
    public Long NapTien(Long sotienhientai, Long sotiencannap) throws RemoteException;
    public void CapNhatSoTien(String stk, Long sotien) throws RemoteException;
    public void ThemVaoLichSuGiaoDich(String stk, Long SoTienGiaoDich, String GhiChu) throws RemoteException;
    public Long RutTien(Long sotienhientai, Long sotiencanrut) throws RemoteException;
    public ArrayList<LichSu> HienThiLichSuGiaoDich(String stk) throws RemoteException;
    public void CapNhapSoLanDangNhapSai(String stk, int solandangnhapsai) throws RemoteException;
    public void KtraDangNhapSai(String stk) throws RemoteException;
    public Long getTongTienTrongNgay(String stk, String ngay) throws RemoteException;
//    update TaiKhoan
//set TaiKhoan.SoLanDangNhapSai = TaiKhoan.SoLanDangNhapSai + 1
//where TaiKhoan.SoTaiKhoan = '4532178952'
}
