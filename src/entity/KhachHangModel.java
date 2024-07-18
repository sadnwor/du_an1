/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class KhachHangModel {
    private int maKhachHang;
    private String hoTenKhachHang;
    private String SDT;
    private String ghiChu;

    public KhachHangModel() {
    }

    public KhachHangModel(int maKhachHang, String hoTenKhachHang, String SDT, String ghiChu) {
        this.maKhachHang = maKhachHang;
        this.hoTenKhachHang = hoTenKhachHang;
        this.SDT = SDT;
        this.ghiChu = ghiChu;
    }

    public KhachHangModel(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

  
    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "KhachHangModel{" + "maKhachHang=" + maKhachHang + ", hoTenKhachHang=" + hoTenKhachHang + ", SDT=" + SDT + ", ghiChu=" + ghiChu + '}';
    }

}
