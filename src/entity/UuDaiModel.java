/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class UuDaiModel {
    private int maUuDai;
    private String tenUuDai;
    private String thoiGianBatDauUuDai;
    private String thoiGianKetThucUuDai;
    private  double phanTramUuDai;
    private int soLuong;
    private boolean trangThai;
    private String ghiChu;

    public UuDaiModel() {
    }

    public UuDaiModel(int maUuDai, String tenUuDai, String thoiGianBatDauUuDai, String thoiGianKetThucUuDai, double phanTramUuDai, int soLuong, boolean trangThai, String ghiChu) {
        this.maUuDai = maUuDai;
        this.tenUuDai = tenUuDai;
        this.thoiGianBatDauUuDai = thoiGianBatDauUuDai;
        this.thoiGianKetThucUuDai = thoiGianKetThucUuDai;
        this.phanTramUuDai = phanTramUuDai;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public int getMaUuDai() {
        return maUuDai;
    }

    public void setMaUuDai(int maUuDai) {
        this.maUuDai = maUuDai;
    }

    public String getTenUuDai() {
        return tenUuDai;
    }

    public void setTenUuDai(String tenUuDai) {
        this.tenUuDai = tenUuDai;
    }

    public String getThoiGianBatDauUuDai() {
        return thoiGianBatDauUuDai;
    }

    public void setThoiGianBatDauUuDai(String thoiGianBatDauUuDai) {
        this.thoiGianBatDauUuDai = thoiGianBatDauUuDai;
    }

    public String getThoiGianKetThucUuDai() {
        return thoiGianKetThucUuDai;
    }

    public void setThoiGianKetThucUuDai(String thoiGianKetThucUuDai) {
        this.thoiGianKetThucUuDai = thoiGianKetThucUuDai;
    }

    public double getPhanTramUuDai() {
        return phanTramUuDai;
    }

    public void setPhanTramUuDai(double phanTramUuDai) {
        this.phanTramUuDai = phanTramUuDai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
	
    
}
