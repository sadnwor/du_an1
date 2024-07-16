/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class LoaiMonAnModel {
    private String maLoaiMonAn;
    private String tenLoaiMonAn;
    private String ghiChu;

    public LoaiMonAnModel() {
    }

    public LoaiMonAnModel(String maLoaiMonAn, String tenLoaiMonAn, String ghiChu) {
        this.maLoaiMonAn = maLoaiMonAn;
        this.tenLoaiMonAn = tenLoaiMonAn;
        this.ghiChu = ghiChu;
    }

    public String getMaLoaiMonAn() {
        return maLoaiMonAn;
    }

    public void setMaLoaiMonAn(String maLoaiMonAn) {
        this.maLoaiMonAn = maLoaiMonAn;
    }

    public String getTenLoaiMonAn() {
        return tenLoaiMonAn;
    }

    public void setTenLoaiMonAn(String tenLoaiMonAn) {
        this.tenLoaiMonAn = tenLoaiMonAn;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
	
}
