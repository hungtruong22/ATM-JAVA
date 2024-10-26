
import java.rmi.Naming;
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
public class frmRutTienLuaChon extends javax.swing.JFrame {
    ITinhToan server;
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
    public class XuLy50000 extends Thread{
        public void run(){
            try {
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                long sotiencanrut = 50000;
                Long sotienhientai = tkhoan.getSoTien();
                if(sotiencanrut > 0 && sotiencanrut <= 30000000){
                    if(sotiencanrut < sotienhientai){
                        server.RutTien(sotienhientai, sotiencanrut);
                        server.CapNhatSoTien(stk, server.RutTien(sotienhientai, sotiencanrut));
                        server.ThemVaoLichSuGiaoDich(stk, sotiencanrut, "Da rut " + sotiencanrut + " vnd khoi tai khoan ca nhan");
                        JOptionPane.showMessageDialog(null, "Rut tien thanh cong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Rut tien that bai! \nSo tien can rut phai nho hon so du hien co");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chi rut duoc toi da 30.000.000 vnd mot ngay!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class XuLy100000 extends Thread{
        public void run(){
            try {
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                long sotiencanrut = 100000;
                Long sotienhientai = tkhoan.getSoTien();
               if(sotiencanrut > 0 && sotiencanrut <= 30000000){
                    if(sotiencanrut < sotienhientai){
                        server.RutTien(sotienhientai, sotiencanrut);
                        server.CapNhatSoTien(stk, server.RutTien(sotienhientai, sotiencanrut));
                        server.ThemVaoLichSuGiaoDich(stk, sotiencanrut, "Da rut " + sotiencanrut + " vnd khoi tai khoan ca nhan");
                        JOptionPane.showMessageDialog(null, "Rut tien thanh cong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Rut tien that bai! \nSo tien can rut phai nho hon so du hien co");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chi rut duoc toi da 30000000 vnd mot ngay!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class XuLy1000000 extends Thread{
        public void run(){
            try {
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                long sotiencanrut = 1000000;
                Long sotienhientai = tkhoan.getSoTien();
                if(sotiencanrut > 0 && sotiencanrut <= 30000000){
                    if(sotiencanrut < sotienhientai){
                        server.RutTien(sotienhientai, sotiencanrut);
                        server.CapNhatSoTien(stk, server.RutTien(sotienhientai, sotiencanrut));
                        server.ThemVaoLichSuGiaoDich(stk, sotiencanrut, "Da rut " + sotiencanrut + " vnd khoi tai khoan ca nhan");
                        JOptionPane.showMessageDialog(null, "Rut tien thanh cong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Rut tien that bai! \nSo tien can rut phai nho hon so du hien co");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chi rut duoc toi da 30000000 vnd mot ngay!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public class XuLy200000 extends Thread{
        public void run(){
            try {
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                long sotiencanrut = 200000;
                Long sotienhientai = tkhoan.getSoTien();
                if(sotiencanrut > 0 && sotiencanrut <= 30000000){
                    if(sotiencanrut < sotienhientai){
                        server.RutTien(sotienhientai, sotiencanrut);
                        server.CapNhatSoTien(stk, server.RutTien(sotienhientai, sotiencanrut));
                        server.ThemVaoLichSuGiaoDich(stk, sotiencanrut, "Da rut " + sotiencanrut + " vnd khoi tai khoan ca nhan");
                        JOptionPane.showMessageDialog(null, "Rut tien thanh cong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Rut tien that bai! \nSo tien can rut phai nho hon so du hien co");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chi rut duoc toi da 30000000 vnd mot ngay!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class XuLy500000 extends Thread{
        public void run(){
            try {
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                long sotiencanrut = 500000;
                Long sotienhientai = tkhoan.getSoTien();
                if(sotiencanrut > 0 && sotiencanrut <= 30000000){
                    if(sotiencanrut < sotienhientai){
                        server.RutTien(sotienhientai, sotiencanrut);
                        server.CapNhatSoTien(stk, server.RutTien(sotienhientai, sotiencanrut));
                        server.ThemVaoLichSuGiaoDich(stk, sotiencanrut, "Da rut " + sotiencanrut + " vnd khoi tai khoan ca nhan");
                        JOptionPane.showMessageDialog(null, "Rut tien thanh cong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Rut tien that bai! \nSo tien can rut phai nho hon so du hien co");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Chi rut duoc toi da 30000000 vnd mot ngay!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Creates new form frmRutTienLuaChon
     */
    public frmRutTienLuaChon() {
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

        btnQuayLai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbhoten = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn10000 = new javax.swing.JButton();
        btn100000 = new javax.swing.JButton();
        btn1000000 = new javax.swing.JButton();
        btn200000 = new javax.swing.JButton();
        btnKhac = new javax.swing.JButton();
        btn500000 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnQuayLai.setBackground(new java.awt.Color(0, 0, 255));
        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setText("<-");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ho Ten:");

        lbhoten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbhoten.setText("ht");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Rút Tiền");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Xin vui lòng lựa chọn số tiền ");

        btn10000.setBackground(java.awt.SystemColor.activeCaption);
        btn10000.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn10000.setText("50000");
        btn10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10000ActionPerformed(evt);
            }
        });

        btn100000.setBackground(java.awt.SystemColor.activeCaption);
        btn100000.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn100000.setText("100000");
        btn100000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100000ActionPerformed(evt);
            }
        });

        btn1000000.setBackground(java.awt.SystemColor.activeCaption);
        btn1000000.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1000000.setText("1000000");
        btn1000000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1000000ActionPerformed(evt);
            }
        });

        btn200000.setBackground(java.awt.SystemColor.activeCaption);
        btn200000.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn200000.setText("200000");
        btn200000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200000ActionPerformed(evt);
            }
        });

        btnKhac.setBackground(java.awt.SystemColor.activeCaption);
        btnKhac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhac.setText("Khác");
        btnKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhacActionPerformed(evt);
            }
        });

        btn500000.setBackground(java.awt.SystemColor.activeCaption);
        btn500000.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn500000.setText("500000");
        btn500000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnQuayLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(lbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1000000, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn10000, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn200000, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn100000, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn500000, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai)
                    .addComponent(jLabel1)
                    .addComponent(lbhoten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10000, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn200000, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100000, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn500000, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1000000, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        try {
            frmMenuChucNang f = new frmMenuChucNang();
            f.setVisible(true);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnQuayLaiActionPerformed
    
    private void btnKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhacActionPerformed
        // TODO add your handling code here:
        try {
            frmRutTien f = new frmRutTien();
            f.setVisible(true);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKhacActionPerformed

    private void btn10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10000ActionPerformed
        // TODO add your handling code here:
        XuLy50000 xuly = new XuLy50000();
        xuly.start();
    }//GEN-LAST:event_btn10000ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        XuLyBanDau xuly = new XuLyBanDau();
        xuly.start();
    }//GEN-LAST:event_formWindowOpened

    private void btn100000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100000ActionPerformed
        // TODO add your handling code here:
        XuLy100000 xuly = new XuLy100000();
        xuly.start();
    }//GEN-LAST:event_btn100000ActionPerformed

    private void btn1000000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1000000ActionPerformed
        // TODO add your handling code here:
        XuLy1000000 xuly = new XuLy1000000();
        xuly.start();
    }//GEN-LAST:event_btn1000000ActionPerformed

    private void btn200000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200000ActionPerformed
        // TODO add your handling code here:
        XuLy200000 xuly = new XuLy200000();
        xuly.start();
    }//GEN-LAST:event_btn200000ActionPerformed

    private void btn500000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500000ActionPerformed
        // TODO add your handling code here:
        XuLy500000 xuly = new XuLy500000();
        xuly.start();
    }//GEN-LAST:event_btn500000ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRutTienLuaChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRutTienLuaChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRutTienLuaChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRutTienLuaChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRutTienLuaChon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10000;
    private javax.swing.JButton btn100000;
    private javax.swing.JButton btn1000000;
    private javax.swing.JButton btn200000;
    private javax.swing.JButton btn500000;
    private javax.swing.JButton btnKhac;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbhoten;
    // End of variables declaration//GEN-END:variables
}
