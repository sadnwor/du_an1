/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.KhachHangModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class KhachHangRepository {

    public ArrayList<KhachHangModel> getAll() {
        String sql = """
                     SELECT [MaKhachHang]
                           ,[HoTenKhachHang]
                           ,[SDT]
                           ,[GhiChu]
                       FROM [dbo].[KhachHang]
                     """;
        ArrayList<KhachHangModel> listKH = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangModel kh = new KhachHangModel();
                kh.setMaKhachHang(rs.getInt(1));
                kh.setHoTenKhachHang(rs.getString(2));
                kh.setSDT(rs.getString(3));
                kh.setGhiChu(rs.getString(4));
                listKH.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }
}
