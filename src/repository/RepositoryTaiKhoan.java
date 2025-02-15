/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBConnect;
import entity.TaiKhoanModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anhha
 */
public class RepositoryTaiKhoan {

    public ArrayList<TaiKhoanModel> getAll() {
        String sql = """
                     SELECT [MaTaiKhoan]
                           ,[TenTaiKhoan]
                           ,[MatKhau]
                       FROM [dbo].[TaiKhoan]
                     """;
        ArrayList<TaiKhoanModel> list = new ArrayList<>();
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoanModel tk = new TaiKhoanModel();
                tk.setMaTaiKhoan(rs.getString(1));
                tk.setTenTaiKhoan(rs.getString(2));
                tk.setMkTaiKhoan(rs.getString(3));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean them(TaiKhoanModel tk) {
        String sql = """
                     INSERT INTO [dbo].[TaiKhoan]
                                  ([MaTaiKhoan]
                                  ,[TenTaiKhoan]
                                  ,[MatKhau])
                            VALUES
                                  (?,?,?)
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tk.getMaTaiKhoan());
            ps.setObject(2, tk.getTenTaiKhoan());
            ps.setObject(3, tk.getMkTaiKhoan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean sua(String ma, TaiKhoanModel newTaiKhoan) {
        String sql = """
                    UPDATE [dbo].[TaiKhoan]
                        SET [MaTaiKhoan] = ?
                           ,[TenTaiKhoan] = ?
                           ,[MatKhau] = ?
                      WHERE MaTaiKhoan = ?
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, newTaiKhoan.getMaTaiKhoan());
            ps.setObject(2, newTaiKhoan.getTenTaiKhoan());
            ps.setObject(3, newTaiKhoan.getMkTaiKhoan());
            ps.setObject(4, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean xoa(String ma) {
        String sql = """
                 DELETE FROM [dbo].[TaiKhoan]
                       WHERE MaTaiKhoan = ?
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
