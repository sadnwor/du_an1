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
    private String maLoaiKhachHang;
    private String hoTenKhachHang;
    private String SDT;
    private String ghiChu;

    public KhachHangModel() {
    }

    public KhachHangModel(int maKhachHang, String maLoaiKhachHang, String hoTenKhachHang, String SDT, String ghiChu) {
        this.maKhachHang = maKhachHang;
        this.maLoaiKhachHang = maLoaiKhachHang;
        this.hoTenKhachHang = hoTenKhachHang;
        this.SDT = SDT;
        this.ghiChu = ghiChu;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaLoaiKhachHang() {
        return maLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(String maLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
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
	
}
