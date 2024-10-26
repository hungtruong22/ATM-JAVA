
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public TinhToan() throws RemoteException{
        
    }

    @Override
    public ArrayList getTK() throws RemoteException {
        try {
            ArrayList ds = new ArrayList();//Tạo 1 ArrayList để chứa các sinh viên
            KetNoi.MoKetNoi();//Mở kết nối đến CSDL
            ResultSet rs = KetNoi.LayBang("TaiKhoan");//Lấy về toàn bộ bảng SinhVien
            while (rs.next())//Duyệt ResultSet để lưu sv vào ArrayList
            {
                Taikhoan tk = new Taikhoan(rs.getString("SoTaiKhoan"), rs.getString("HoTenTaiKhoan"),
                        rs.getString("MatKhau"), rs.getString("TrangThai"),
                        rs.getLong("SoTIen"), rs.getInt("SoLanDangNhapSai"));
                ds.add(tk);
            }
            KetNoi.cn.close();
            return ds;
        } catch (Exception tt) {
            System.out.print("so bi loi" + tt);
            return null;
        }
    }

    @Override
    public Taikhoan dangnhap(String stk, String mk) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "select * from TaiKhoan "
                    + "where SoTaiKhoan = ? and MatKhau = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, stk);
            cmd.setString(2, mk);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTenTaiKhoan= rs.getString("HoTenTaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String TrangThai = rs.getString("TrangThai");
                Long SoTien = rs.getLong("SoTien");
                int SoLanDangNhapSai = rs.getInt("SoLanDangNhapSai");
                return new Taikhoan(SoTaiKhoan, HoTenTaiKhoan, MatKhau, TrangThai, SoTien, SoLanDangNhapSai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public void CapNhatTrangThai(String stk , String trangthai) throws RemoteException{
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "update TaiKhoan\n" +
                        "set TaiKhoan.TrangThai = ?\n" +
                        "where TaiKhoan.SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, trangthai);
            cmd.setString(2, stk);
            cmd.executeUpdate();           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void DoiMk(String stk, String matkhau) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "update TaiKhoan\n" +
                         "set TaiKhoan.MatKhau = ?\n" +
                         "where TaiKhoan.SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, matkhau);
            cmd.setString(2, stk);
            cmd.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Taikhoan getTKbySTK(String stk) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "select *\n" +
                         "from TaiKhoan\n" +
                         "where TaiKhoan.SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, stk);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTenTaiKhoan= rs.getString("HoTenTaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String TrangThai = rs.getString("TrangThai");
                Long SoTien = rs.getLong("SoTien");
                int SoLanDangNhapSai = rs.getInt("SoLanDangNhapSai");
                return new Taikhoan(SoTaiKhoan, HoTenTaiKhoan, MatKhau, TrangThai, SoTien, SoLanDangNhapSai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long NapTien(Long sotienhientai, Long sotiencannap) throws RemoteException {
            return sotienhientai + sotiencannap;
    }

    @Override
    public void CapNhatSoTien(String stk, Long sotien) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "update TaiKhoan\n" +
                         "set TaiKhoan.SoTien = ?\n" +
                         "where TaiKhoan.SoTaiKhoan=?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setLong(1, sotien);
            cmd.setString(2, stk);
            cmd.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ThemVaoLichSuGiaoDich(String stk, Long SoTienGiaoDich, String GhiChu) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "insert into LichSu(SoTienGiaoDich, NgayGiaoDich, SoTaiKhoan, GhiChu) \n" +
                         "values(?,?,?,?)";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setLong(1, SoTienGiaoDich);
            Date n= new Date();
            SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String ngay = dd.format(n);
            Date ngaymua=dd.parse(ngay);
            cmd.setDate(2,new java.sql.Date(ngaymua.getTime()));
            cmd.setString(3, stk);
            cmd.setString(4, GhiChu);
            cmd.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long RutTien(Long sotienhientai, Long sotiencanrut) throws RemoteException {
        return sotienhientai - sotiencanrut;
    }

    @Override
    public ArrayList<LichSu> HienThiLichSuGiaoDich(String stk) throws RemoteException {
        try {
            ArrayList<LichSu> ds = new ArrayList<>();
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "select LichSu.MaGiaoDich, LichSu.SoTaiKhoan, LichSu.SoTienGiaoDich, LichSu.NgayGiaoDich, LichSu.GhiChu\n" +
                         "from LichSu\n" +
                         "where SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, stk);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                int MaGiaoDich = rs.getInt("MaGiaoDich");
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                Long SoTienGiaoDich = rs.getLong("SoTienGiaoDich");
                Date NgayGiaoDich = rs.getDate("NgayGiaoDich");
                String GhiChu = rs.getString("GhiChu");
                ds.add(new LichSu(MaGiaoDich, SoTienGiaoDich, NgayGiaoDich, SoTaiKhoan, GhiChu));               
            }
            rs.close();
            kn.cn.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void CapNhapSoLanDangNhapSai(String stk, int solandangnhapsai) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "update TaiKhoan\n" +
                         "set TaiKhoan.SoLanDangNhapSai = ?\n" +
                         "where TaiKhoan.SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setLong(1, solandangnhapsai);
            cmd.setString(2, stk);
            cmd.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void KtraDangNhapSai(String stk) throws RemoteException {
        try {
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "update TaiKhoan\n" +
                         "set TaiKhoan.SoLanDangNhapSai = TaiKhoan.SoLanDangNhapSai + 1\n" +
                         "where TaiKhoan.SoTaiKhoan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, stk);
            cmd.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long getTongTienTrongNgay(String stk, String ngay) throws RemoteException {
        long tong = 0;
        try {    
            KetNoi kn = new KetNoi();
            kn.MoKetNoi();
            String sql = "select Sum(LichSu.SoTienGiaoDich)\n" +
                         "from LichSu \n" +
                         "where LichSu.SoTaiKhoan = ? and LichSu.NgayGiaoDich = ? and LichSu.GhiChu like '%rut%'";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, stk);
//            Date n= new Date();
//            SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String Ngay = dd.format(n);
//            Date ngayrut = dd.parse(Ngay);
//            cmd.setDate(2,new java.sql.Date(ngayrut.getTime()));
            cmd.setString(2, ngay);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                Long tongtien = rs.getLong(1);
                tong = tongtien;
                return tong;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tong;
    }
    
    public static void main(String[] args) throws RemoteException{
        try {
            TinhToan t = new TinhToan();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 