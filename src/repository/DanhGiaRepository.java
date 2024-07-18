/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.DanhGiaModel;
import entity.KhachHangModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class DanhGiaRepository {

    public ArrayList<DanhGiaModel> getAll() {
        String sql = """
                      SELECT [MaDanhGia]
                             ,[KhachHang].[HoTenKhachHang]
                             ,[NoiDungDanhGia]
                             ,[ThoiGian]
                             ,[LikeOrDisLike]
                         FROM [dbo].[DanhGia], [dbo].[KhachHang]
                         where [DanhGia].[MaKhachHang] = [KhachHang].[MaKhachHang]
                     """;
        ArrayList<DanhGiaModel> listDG = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangModel kh = new KhachHangModel();
                kh.setHoTenKhachHang(rs.getString(2));
                DanhGiaModel dg = new DanhGiaModel();
                dg.setMaDanhGia(rs.getInt(1));
                dg.setThoiGian(rs.getString(3));
                dg.setNoiDungDanhGia(rs.getString(4));
                dg.setLikeOrDisLike(rs.getBoolean(5));
                dg.setKhachHang(kh);
                listDG.add(dg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDG;
    }
}
