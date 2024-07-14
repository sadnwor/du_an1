/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author anhha
 */
public class TaiKhoan {

    private String maTaiKhoan;
    private String tenTaiKhoan;
    private String mkTaiKhoan;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTaiKhoan, String tenTaiKhoan, String mkTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.mkTaiKhoan = mkTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
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
