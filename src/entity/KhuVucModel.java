/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class KhuVucModel {
    private int maKhuVuc;
    private String tenKhuVuc;
    private String viTri;
    private boolean trangThai;
    private String thiChu;

    public KhuVucModel() {
    }

    public KhuVucModel(int maKhuVuc, String tenKhuVuc, String viTri, boolean trangThai, String thiChu) {
        this.maKhuVuc = maKhuVuc;
        this.tenKhuVuc = tenKhuVuc;
        this.viTri = viTri;
        this.trangThai = trangThai;
        this.thiChu = thiChu;
    }

    public int  getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(int maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    public void setTenKhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getThiChu() {
        return thiChu;
    }

    public void setThiChu(String thiChu) {
        this.thiChu = thiChu;
    }

    
    
}
