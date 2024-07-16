/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class ComboChiTiet {
    private int maCombo;
    private String maMonAn;
    private int soLuong;
    private String ghiChu;

    public ComboChiTiet() {
    }

    public ComboChiTiet(int maCombo, String maMonAn, int soLuong, String ghiChu) {
        this.maCombo = maCombo;
        this.maMonAn = maMonAn;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public int getMaCombo() {
        return maCombo;
    }

    public void setMaCombo(int maCombo) {
        this.maCombo = maCombo;
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
	
}
