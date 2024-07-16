/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class ChucVuModel {
    private String maChucVu;
    private String tenChucVu;
    private String thoiGianNhamChuc;
    private String ghiChu;

    public ChucVuModel() {
    }

    public ChucVuModel(String maChucVu, String tenChucVu, String thoiGianNhamChuc, String ghiChu) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.thoiGianNhamChuc = thoiGianNhamChuc;
        this.ghiChu = ghiChu;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getThoiGianNhamChuc() {
        return thoiGianNhamChuc;
    }

    public void setThoiGianNhamChuc(String thoiGianNhamChuc) {
        this.thoiGianNhamChuc = thoiGianNhamChuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
