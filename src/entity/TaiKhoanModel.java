/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author anhha
 */
public class TaiKhoanModel {

    private int maTaiKhoan;
    private String tenTaiKhoan;
    private String mkTaiKhoan;

    public TaiKhoanModel() {
    }

    public TaiKhoanModel(int maTaiKhoan, String tenTaiKhoan, String mkTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.mkTaiKhoan = mkTaiKhoan;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMkTaiKhoan() {
        return mkTaiKhoan;
    }

    public void setMkTaiKhoan(String mkTaiKhoan) {
        this.mkTaiKhoan = mkTaiKhoan;
    }

}
