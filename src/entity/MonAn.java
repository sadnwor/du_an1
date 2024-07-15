/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author anhha
 */
public class MonAn {

    private String maMonAn;
    private String tenMonAn;
    private String loaiMonAn;
    private String trangThaiMonAn;
    private String ghiChuMonAn;

    public MonAn() {
    }

    public MonAn(String maMonAn, String tenMonAn, String loaiMonAn, String trangThaiMonAn, String ghiChuMonAn) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.loaiMonAn = loaiMonAn;
        this.trangThaiMonAn = trangThaiMonAn;
        this.ghiChuMonAn = ghiChuMonAn;
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getLoaiMonAn() {
        return loaiMonAn;
    }

    public void setLoaiMonAn(String loaiMonAn) {
        this.loaiMonAn = loaiMonAn;
    }

    public String getTrangThaiMonAn() {
        return trangThaiMonAn;
    }

    public void setTrangThaiMonAn(String trangThaiMonAn) {
        this.trangThaiMonAn = trangThaiMonAn;
    }

    public String getGhiChuMonAn() {
        return ghiChuMonAn;
    }

    public void setGhiChuMonAn(String ghiChuMonAn) {
        this.ghiChuMonAn = ghiChuMonAn;
    }

}
