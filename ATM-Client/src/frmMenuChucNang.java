
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class frmMenuChucNang extends javax.swing.JFrame {
    
    /**
     * Creates new form frmMenuChucNang
     */
//    String ip = "192.168.2.23";
    public class XuLyBanDau extends Thread{
        public void run(){
            try {
                server = (ITinhToan) Naming.lookup("rmi://" + frmDangNhap.ip + "/TinhToan");
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                String Ten = tkhoan.getHoTenTaiKhoan();
                lbhoten.setText(Ten);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public frmMenuChucNang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRutTien = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();
        btnDMK = new javax.swing.JButton();
        btnNapTien = new javax.swing.JButton();
        btnLichSu = new javax.swing.JButton();
        btnChuyenTien = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbhoten = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quý Khách Vui Lòng Chọn Chức Năng");

        btnRutTien.setBackground(new java.awt.Color(102, 102, 255));
        btnRutTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRutTien.setForeground(new java.awt.Color(255, 255, 255));
        btnRutTien.setText("Rút Tiền");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        btnTraCuu.setBackground(new java.awt.Color(102, 102, 255));
        btnTraCuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTraCuu.setForeground(new java.awt.Color(255, 255, 255));
        btnTraCuu.setText("Tra Cứu Thông Tin");
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        btnDMK.setBackground(new java.awt.Color(102, 102, 255));
        btnDMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDMK.setForeground(new java.awt.Color(255, 255, 255));
        btnDMK.setText("Đổi Mật Khẩu");
        btnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDMKActionPerformed(evt);
            }
        });

        btnNapTien.setBackground(new java.awt.Color(102, 102, 255));
        btnNapTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNapTien.setForeground(new java.awt.Color(255, 255, 255));
        btnNapTien.setText("Nạp Tiền");
        btnNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienActionPerformed(evt);
            }
        });

        btnLichSu.setBackground(new java.awt.Color(102, 102, 255));
        btnLichSu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLichSu.setForeground(new java.awt.Color(255, 255, 255));
        btnLichSu.setText("Lịch Sử Giao Dịch");
        btnLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuActionPerformed(evt);
            }
        });

        btnChuyenTien.setBackground(new java.awt.Color(102, 102, 255));
        btnChuyenTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChuyenTien.setForeground(new java.awt.Color(255, 255, 255));
        btnChuyenTien.setText("Chuyển Tiền");
        btnChuyenTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenTienActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("HoTen:");

        lbhoten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbhoten.setText("ht");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(lbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChuyenTien, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbhoten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDMK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenTien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ITinhToan server;
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        try {
            server.CapNhatTrangThai(frmDangNhap.tk.getSoTaiKhoan(), "Binh thuong");
            frmDangNhap f = new frmDangNhap();
            f.setVisible(true);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        XuLyBanDau xuly = new XuLyBanDau();
        xuly.start();
    }//GEN-LAST:event_formWindowOpened

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        try {
            frmTraCuu f = new frmTraCuu();
            f.setVisible(true);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void btnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDMKActionPerformed
        // TODO add your handling code here:
        try {
            frmDoiMatKhau f = new frmDoiMatKhau();
            f.setVisible(true);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDMKActionPerformed

    private void btnNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienActionPerformed
        // TODO add your handling code here:
        frmNapTien f = new frmNapTien();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNapTienActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        // TODO add your handling code here:
        frmRutTienLuaChon f = new frmRutTienLuaChon();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btnLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuActionPerformed
        // TODO add your handling code here:
        frmLichSuGiaoDich f = new frmLichSuGiaoDich();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLichSuActionPerformed

    private void btnChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenTienActionPerformed
        // TODO add your handling code here:
        frmChuyenKhoan f = new frmChuyenKhoan();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChuyenTienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuChucNang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuChucNang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuChucNang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuChucNang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuChucNang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenTien;
    private javax.swing.JButton btnDMK;
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnNapTien;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbhoten;
    // End of variables declaration//GEN-END:variables
}
