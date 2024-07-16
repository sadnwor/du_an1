/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class ComboModel {
    private int maCombo;
    private String tenCombo;
    private Double giaTien;
    private boolean trangThai;
    private  String ghiChu;

    public ComboModel() {
    }

    public ComboModel(int maCombo, String tenCombo, Double giaTien, boolean trangThai, String ghiChu) {
        this.maCombo = maCombo;
        this.tenCombo = tenCombo;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public int getMaCombo() {
        return maCombo;
    }

    public void setMaCombo(int maCombo) {
        this.maCombo = maCombo;
    }

    public String getTenCombo() {
        return tenCombo;
    }

    public void setTenCombo(String tenCombo) {
        this.tenCombo = tenCombo;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
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
