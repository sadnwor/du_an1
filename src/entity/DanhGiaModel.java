/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class DanhGiaModel {
    private int maDanhGia;
    private int maKhachHang;
    private String noiDungDanhGia;
    private String thoiGian;
    private boolean LikeOrDisLike;

    public DanhGiaModel() {
    }

    public DanhGiaModel(int maDanhGia, int maKhachHang, String noiDungDanhGia, String thoiGian, boolean LikeOrDisLike) {
        this.maDanhGia = maDanhGia;
        this.maKhachHang = maKhachHang;
        this.noiDungDanhGia = noiDungDanhGia;
        this.thoiGian = thoiGian;
        this.LikeOrDisLike = LikeOrDisLike;
    }

    public int getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(int maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNoiDungDanhGia() {
        return noiDungDanhGia;
    }

    public void setNoiDungDanhGia(String noiDungDanhGia) {
        this.noiDungDanhGia = noiDungDanhGia;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public boolean isLikeOrDisLike() {
        return LikeOrDisLike;
    }

    public void setLikeOrDisLike(boolean LikeOrDisLike) {
        this.LikeOrDisLike = LikeOrDisLike;
    }
     
    
	
}
