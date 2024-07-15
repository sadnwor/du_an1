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
    private String maLoaiMonAn;
    private String tenMonAn;
    private String trangThaiMonAn;
    private String ghiChuMonAn;

    public MonAn() {
    }

    public MonAn(String maMonAn, String maLoaiMonAn, String tenMonAn, String trangThaiMonAn, String ghiChuMonAn) {
        this.maMonAn = maMonAn;
        this.maLoaiMonAn = maLoaiMonAn;
        this.tenMonAn = tenMonAn;
        this.trangThaiMonAn = trangThaiMonAn;
        this.ghiChuMonAn = ghiChuMonAn;
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getMaLoaiMonAn() {
        return maLoaiMonAn;
    }

    public void setMaLoaiMonAn(String maLoaiMonAn) {
        this.maLoaiMonAn = maLoaiMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
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
