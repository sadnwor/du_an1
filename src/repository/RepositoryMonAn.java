/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.MonAnModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class RepositoryMonAn {

    public ArrayList<MonAnModel> getAll() {
        String sql = """
                     SELECT [MaMonAn]
                           ,[MaLoaiMonAn]
                           ,[TenMonAn]
                           ,[GhiChu]
                           ,[TrangThai]
                       FROM [dbo].[MonAn]
                     """;
        ArrayList<MonAnModel> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonAnModel ma = new MonAnModel();
                ma.setMaMonAn(rs.getString(1));
                ma.setMaLoaiMonAn(rs.getString(2));
                ma.setTenMonAn(rs.getString(3));
                ma.setGhiChuMonAn(rs.getString(4));
                ma.setTrangThaiMonAn(rs.getBoolean(5));
                list.add(ma);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean them(MonAnModel ma) {
        String sql = """
                     INSERT INTO [dbo].[MonAn]
                                ([MaMonAn]
                                ,[MaLoaiMonAn]
                                ,[TenMonAn]
                                ,[GhiChu]
                                ,[TrangThai])
                          VALUES
                                (?,?,?,?,?)
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma.getMaMonAn());
            ps.setObject(2, ma.getMaLoaiMonAn());
            ps.setObject(3, ma.getTenMonAn());
            ps.setObject(4, ma.getGhiChuMonAn());
            ps.setObject(5, ma.getTrangThaiMonAn());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean sua(String ma, MonAnModel newMonAn) {
        String sql = """
                    UPDATE [dbo].[MonAn]
                       SET [MaMonAn] = ?
                          ,[MaLoaiMonAn] = ?
                          ,[TenMonAn] = ?
                          ,[GhiChu] = ?
                          ,[TrangThai] = ?
                     FROM [dbo].[MonAn] ma
                     JOIN [dbo].[LoaiMonAn] lma ON ma.MaLoaiMonAn = lma.MaLoaiMonAn
                     WHERE ma.MaMonAn = ?
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, newMonAn.getMaMonAn());
            ps.setObject(2, newMonAn.getMaLoaiMonAn());
            ps.setObject(3, newMonAn.getTenMonAn());
            ps.setObject(4, newMonAn.getGhiChuMonAn());
            ps.setObject(5, newMonAn.getTrangThaiMonAn());
            ps.setObject(6, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoa(String ma) {
        String sql = """
                 DELETE ma
                    FROM [dbo].[MonAn] ma
                    JOIN [dbo].[LoaiMonAn] lma ON ma.MaLoaiMonAn = lma.MaLoaiMonAn
                    WHERE ma.MaMonAn = ?
                 """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
