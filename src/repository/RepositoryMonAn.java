/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.MonAn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class RepositoryMonAn {
    public ArrayList<MonAn> getAll() {
        String sql = """
                     SELECT 
                           MonAn.MaMonAn,
                           MonAn.TenMonAn,
                           LoaiMonAn.TenLoaiMonAn,
                           MonAn.TrangThai,
                           MonAn.GhiChu
                       FROM 
                           MonAn
                       JOIN 
                           LoaiMonAn ON MonAn.MaLoaiMonAn = LoaiMonAn.MaLoaiMonAn;
                     """;
        ArrayList<MonAn> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MonAn ma = new MonAn();
                ma.setMaMonAn(rs.getString(1));
                ma.setTenMonAn(rs.getString(2));
                ma.setMkMonAn(rs.getString(3));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean them(MonAn tk) {
        String sql = """
                     INSERT INTO [dbo].[MonAn]
                                  ([MaMonAn]
                                  ,[TenMonAn]
                                  ,[MatKhau])
                            VALUES
                                  (?,?,?)
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tk.getMaMonAn());
            ps.setObject(1, tk.getTenMonAn());
            ps.setObject(1, tk.getMkMonAn());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean sua(String ma, MonAn newMonAn) {
        String sql = """
                    UPDATE [dbo].[MonAn]
                        SET [MaMonAn] = ?
                           ,[TenMonAn] = ?
                           ,[MatKhau] = ?
                      WHERE MaMonAn = ?
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, newMonAn.getMaMonAn());
            ps.setObject(2, newMonAn.getTenMonAn());
            ps.setObject(3, newMonAn.getMkMonAn());
            ps.setObject(4, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean xoa(String ma) {
        String sql = """
                 DELETE FROM [dbo].[MonAn]
                       WHERE MaMonAn = ?
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

