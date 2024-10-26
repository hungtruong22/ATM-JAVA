
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
public class frmChuyenKhoan extends javax.swing.JFrame {

    /**
     * Creates new form frmChuyenKhoan
     */
//    String ip = "192.168.2.23";
    ITinhToan server;
    public class XuLyBanDau extends Thread{
        public void run(){
            try {
                server = (ITinhToan) Naming.lookup("rmi://" + frmDangNhap.ip + "/TinhToan");
                String stk = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan tkhoan = server.getTKbySTK(stk);
                String Ten = tkhoan.getHoTenTaiKhoan();
                String STK = tkhoan.getSoTaiKhoan();
                lbSTK.setText(STK);
                lbhoten.setText(Ten);
                String SoTienHienTai = String.valueOf(tkhoan.getSoTien());
                lbTienHienTai.setText(SoTienHienTai);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class XuLySTKCanChuyen extends Thread{
        public void run(){
            try {
                String STKHienTai = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan TKHientai = server.getTKbySTK(STKHienTai);
                String STKCanChuyen = txtSTKCanChuyen.getText();
                if(!STKCanChuyen.isEmpty()){
                    Taikhoan TKCanChuyen = server.getTKbySTK(STKCanChuyen);
                    if(TKCanChuyen != null){
                        if(STKCanChuyen.equals(STKHienTai)){
                            JOptionPane.showMessageDialog(null, "Khong the chuyen vao tai khoan ca nhan! \nVui long nhap stk khac hop le! ");
                        }
                        else{
                            String TenSTKCanChuyen = TKCanChuyen.getHoTenTaiKhoan();
                            lbSTKCanChuyen.setText(TenSTKCanChuyen);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "STK nay khong ton tai! \n Vui long nhap mot STK khac hop le");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ban can phai dien day du thong tin!");
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class XuLyChuyenKhoan extends Thread{
        public void run(){
            try {
                String sotiencanchuyen = txtSoTienCanChuyen.getText();              
                
                Long SoTienHienTai = Long.parseLong(lbTienHienTai.getText());
                String MaPin = new String(txtMaPin.getPassword());
                String STKHienTai = frmDangNhap.tk.getSoTaiKhoan();
                Taikhoan TKHientai = server.getTKbySTK(STKHienTai);
                String STKCanChuyen = txtSTKCanChuyen.getText();
                Taikhoan TKCanChuyen = server.getTKbySTK(STKCanChuyen);
                
                if(STKCanChuyen.isEmpty() || sotiencanchuyen.isEmpty() || MaPin.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ban can phai dien day du thong tin!");
                }
                else{
                    Long SoTienCanChuyen = Long.parseLong(txtSoTienCanChuyen.getText());
                    String TenSTKCanChuyen = TKCanChuyen.getHoTenTaiKhoan();
                    if(SoTienCanChuyen < SoTienHienTai){
                        if(MaPin.equals(TKHientai.getMatKhau())){
                            server.RutTien(SoTienHienTai, SoTienCanChuyen);
                            server.CapNhatSoTien(STKHienTai, server.RutTien(SoTienHienTai, SoTienCanChuyen));
                            server.ThemVaoLichSuGiaoDich(STKHienTai, SoTienCanChuyen, "Da chuyen " + SoTienCanChuyen 
                                    + " vnd vao STK " + STKCanChuyen);

                            server.NapTien(TKCanChuyen.getSoTien(), SoTienCanChuyen);
                            server.CapNhatSoTien(STKCanChuyen, server.NapTien(TKCanChuyen.getSoTien(), SoTienCanChuyen));
                            server.ThemVaoLichSuGiaoDich(STKCanChuyen, SoTienCanChuyen, "Da nhan " + SoTienCanChuyen 
                                    + " vnd tu STK " + STKHienTai);
                            JOptionPane.showMessageDialog(null, "Chuyen tien thanh cong");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "MaPin khong dung! Vui long nhap lai ma pin");
                        }  
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "So tien can chuyen phải nho hon so tien hien co trong so du");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public frmChuyenKhoan() {
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
        lbhoten = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSTK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTienHienTai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSTKCanChuyen = new javax.swing.JTextField();
        lbSTKCanChuyen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSoTienCanChuyen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnChuyenKhoan = new javax.swing.JButton();
        txtMaPin = new javax.swing.JPasswordField();

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

        lbhoten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbhoten.setText("ht");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ho Ten:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Chuyển Khoản");

        lbSTK.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbSTK.setText("132");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("STK:");

        lbTienHienTai.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbTienHienTai.setText("vnd");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setText("vnd");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số Tiền Hiện Tại:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nhập STK cần chuyển:");

        txtSTKCanChuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSTKCanChuyenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSTKCanChuyenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSTKCanChuyenMousePressed(evt);
            }
        });
        txtSTKCanChuyen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSTKCanChuyenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSTKCanChuyenKeyTyped(evt);
            }
        });

        lbSTKCanChuyen.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbSTKCanChuyen.setForeground(new java.awt.Color(51, 51, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nhập số tiền cần chuyển:");

        txtSoTienCanChuyen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoTienCanChuyenKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nhập Mã PIN Để Xác Nhận:");

        btnChuyenKhoan.setBackground(new java.awt.Color(204, 51, 255));
        btnChuyenKhoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChuyenKhoan.setForeground(new java.awt.Color(255, 255, 255));
        btnChuyenKhoan.setText("Chuyển Khoản");
        btnChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenKhoanActionPerformed(evt);
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
                                .addGap(305, 305, 305)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMaPin)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lbTienHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtSTKCanChuyen)
                                                .addComponent(txtSoTienCanChuyen)
                                                .addComponent(lbSTKCanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 236, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnQuayLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(lbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(189, 189, 189)
                                .addComponent(lbSTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(btnChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai)
                    .addComponent(jLabel1)
                    .addComponent(lbhoten))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbSTK))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbTienHienTai)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSTKCanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSTKCanChuyen)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoTienCanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        XuLyBanDau xuly = new XuLyBanDau();
        xuly.start();
    }//GEN-LAST:event_formWindowOpened

    private void txtSTKCanChuyenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTKCanChuyenKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            XuLySTKCanChuyen xuly = new XuLySTKCanChuyen();
            xuly.start();
        } 
    }//GEN-LAST:event_txtSTKCanChuyenKeyPressed

    private void btnChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenKhoanActionPerformed
        // TODO add your handling code here:
        XuLyChuyenKhoan xuly = new XuLyChuyenKhoan();
        xuly.start();
    }//GEN-LAST:event_btnChuyenKhoanActionPerformed

    private void txtSTKCanChuyenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSTKCanChuyenMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSTKCanChuyenMouseExited

    private void txtSTKCanChuyenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSTKCanChuyenMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSTKCanChuyenMousePressed

    private void txtSTKCanChuyenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSTKCanChuyenMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSTKCanChuyenMouseEntered

    private void txtSTKCanChuyenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTKCanChuyenKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSTKCanChuyenKeyTyped

    private void txtSoTienCanChuyenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoTienCanChuyenKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSoTienCanChuyenKeyTyped

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
            java.util.logging.Logger.getLogger(frmChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChuyenKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChuyenKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenKhoan;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbSTK;
    private javax.swing.JLabel lbSTKCanChuyen;
    private javax.swing.JLabel lbTienHienTai;
    private javax.swing.JLabel lbhoten;
    private javax.swing.JPasswordField txtMaPin;
    private javax.swing.JTextField txtSTKCanChuyen;
    private javax.swing.JTextField txtSoTienCanChuyen;
    // End of variables declaration//GEN-END:variables
}
