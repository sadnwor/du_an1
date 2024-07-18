/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.JFrameTaiKhoan;
import view.jFrameKhachHang;
import view.jFrameNhanVien;
/**
 *
 * @author anhha
 */
public class Trang extends javax.swing.JFrame {

    JFrameTaiKhoan jftk = new JFrameTaiKhoan();
    jFrameKhachHang jfkh = new jFrameKhachHang();
    jFrameNhanVien jfnv = new jFrameNhanVien();
    /**
     * Creates new form Trang
     */
    public Trang() {
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

        pnMain = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        txtHoaDon = new javax.swing.JLabel();
        txtNhanVien = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JLabel();
        txtIconAd = new javax.swing.JLabel();
        txtUuDai = new javax.swing.JLabel();
        sprt2 = new javax.swing.JSeparator();
        txtDanhGia = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        txtTrangChu = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JLabel();
        txtBan = new javax.swing.JLabel();
        sprt3 = new javax.swing.JSeparator();
        txtDoiMatKhau = new javax.swing.JLabel();
        txtDangXuat = new javax.swing.JLabel();
        pnContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lí");

        pnMain.setBackground(new java.awt.Color(255, 255, 255));

        pnMenu.setBackground(new java.awt.Color(255, 153, 102));
        pnMenu.setPreferredSize(new java.awt.Dimension(170, 600));

        txtTitle.setBackground(new java.awt.Color(255, 255, 255));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(102, 51, 0));
        txtTitle.setText("DOOKKI");

        txtMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtMenu.setText("Menu");
        txtMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMenuMouseClicked(evt);
            }
        });

        txtHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        txtHoaDon.setText("Hóa Đơn");
        txtHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoaDonMouseClicked(evt);
            }
        });

        txtNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtNhanVien.setText("Nhân Viên");
        txtNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNhanVienMouseClicked(evt);
            }
        });

        txtKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        txtKhachHang.setText("Khách Hàng");
        txtKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKhachHangMouseClicked(evt);
            }
        });

        txtIconAd.setForeground(new java.awt.Color(255, 255, 255));
        txtIconAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/administrator (1).png"))); // NOI18N

        txtUuDai.setForeground(new java.awt.Color(255, 255, 255));
        txtUuDai.setText("Ưu Đãi");
        txtUuDai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUuDaiMouseClicked(evt);
            }
        });

        sprt2.setBackground(new java.awt.Color(255, 255, 255));
        sprt2.setForeground(new java.awt.Color(255, 255, 255));

        txtDanhGia.setForeground(new java.awt.Color(255, 255, 255));
        txtDanhGia.setText("Đánh Giá");
        txtDanhGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDanhGiaMouseClicked(evt);
            }
        });

        txtAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtAdmin.setText("Admin");

        txtTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        txtTrangChu.setText("Trang Chủ");
        txtTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTrangChuMouseClicked(evt);
            }
        });

        txtTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setText("Tài Khoản");
        txtTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaiKhoanMouseClicked(evt);
            }
        });

        txtBan.setForeground(new java.awt.Color(255, 255, 255));
        txtBan.setText("Bàn");
        txtBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBanMouseClicked(evt);
            }
        });

        txtDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDoiMatKhau.setForeground(new java.awt.Color(0, 102, 255));
        txtDoiMatKhau.setText("Đổi Mật Khẩu");

        txtDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDangXuat.setForeground(new java.awt.Color(255, 0, 0));
        txtDangXuat.setText("Đăng Xuất");

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprt2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sprt3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtIconAd))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtAdmin))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaiKhoan)
                            .addComponent(txtTrangChu)
                            .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenu)
                            .addComponent(txtHoaDon)
                            .addComponent(txtNhanVien)
                            .addComponent(txtKhachHang)
                            .addComponent(txtUuDai)
                            .addComponent(txtDanhGia)))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoiMatKhau)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtDangXuat))))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtTitle)))
                .addGap(40, 44, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIconAd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprt2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTrangChu)
                .addGap(18, 18, 18)
                .addComponent(txtTaiKhoan)
                .addGap(18, 18, 18)
                .addComponent(txtBan)
                .addGap(18, 18, 18)
                .addComponent(txtMenu)
                .addGap(18, 18, 18)
                .addComponent(txtHoaDon)
                .addGap(18, 18, 18)
                .addComponent(txtNhanVien)
                .addGap(18, 18, 18)
                .addComponent(txtKhachHang)
                .addGap(18, 18, 18)
                .addComponent(txtUuDai)
                .addGap(18, 18, 18)
                .addComponent(txtDanhGia)
                .addGap(63, 63, 63)
                .addComponent(sprt3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDoiMatKhau)
                .addGap(12, 12, 12)
                .addComponent(txtDangXuat)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(pnContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTrangChuMouseClicked

    }//GEN-LAST:event_txtTrangChuMouseClicked

    private void txtTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanMouseClicked
        showPanel(new JFrameTaiKhoan());
    }//GEN-LAST:event_txtTaiKhoanMouseClicked

    private void txtBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBanMouseClicked


    }//GEN-LAST:event_txtBanMouseClicked

    private void txtMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMenuMouseClicked


    }//GEN-LAST:event_txtMenuMouseClicked

    private void txtHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoaDonMouseClicked


    }//GEN-LAST:event_txtHoaDonMouseClicked

    private void txtNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNhanVienMouseClicked
        showPanel(new jFrameNhanVien());

    }//GEN-LAST:event_txtNhanVienMouseClicked

    private void txtKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKhachHangMouseClicked
        showPanel(new jFrameKhachHang());

    }//GEN-LAST:event_txtKhachHangMouseClicked

    private void txtUuDaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUuDaiMouseClicked


    }//GEN-LAST:event_txtUuDaiMouseClicked

    private void txtDanhGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDanhGiaMouseClicked


    }//GEN-LAST:event_txtDanhGiaMouseClicked

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
            java.util.logging.Logger.getLogger(Trang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JSeparator sprt2;
    private javax.swing.JSeparator sprt3;
    private javax.swing.JLabel txtAdmin;
    private javax.swing.JLabel txtBan;
    private javax.swing.JLabel txtDangXuat;
    private javax.swing.JLabel txtDanhGia;
    private javax.swing.JLabel txtDoiMatKhau;
    private javax.swing.JLabel txtHoaDon;
    private javax.swing.JLabel txtIconAd;
    private javax.swing.JLabel txtKhachHang;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtNhanVien;
    private javax.swing.JLabel txtTaiKhoan;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtTrangChu;
    private javax.swing.JLabel txtUuDai;
    // End of variables declaration//GEN-END:variables

    Color setMau(int red, int green, int blue) {
        return new Color(red, green, blue);
    }
    public JPanel node;

    private void showPanel(JFrame panel) {
       
        pnContainer.removeAll();
        pnContainer.add(panel.getContentPane(), BorderLayout.NORTH);
        pnContainer.revalidate();
        pnContainer.repaint();
    }
}
