/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class BanModel {
    private  int maBan;
    private String maKhuVuc;
    private String tenBan;
    private  int soLuongGheNgoi;
    private boolean trangThai;
    private String ghiChu;

    public BanModel() {
    }

    public BanModel(int maBan, String maKhuVuc, String tenBan, int soLuongGheNgoi, boolean trangThai, String ghiChu) {
        this.maBan = maBan;
        this.maKhuVuc = maKhuVuc;
        this.tenBan = tenBan;
        this.soLuongGheNgoi = soLuongGheNgoi;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public String getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(String maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public int getSoLuongGheNgoi() {
        return soLuongGheNgoi;
    }

    public void setSoLuongGheNgoi(int soLuongGheNgoi) {
        this.soLuongGheNgoi = soLuongGheNgoi;
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
