create database QLNhaHang;
go
use QLNhaHang
go
create table LoaiMonAn (
	MaLoaiMonAn int IDENTITY(1,1),
	TenLoaiMonAn nvarchar(50),
	GhiChu nvarchar(max),
	primary key (MaLoaiMonAn)
)
go

create table MonAn (
	MaMonAn int IDENTITY(1,1),
	MaLoaiMonAn int,
	TenMonAn nvarchar(255),
	GhiChu nvarchar(max),
	TrangThai bit,
	primary key (MaMonAn),
	foreign key (MaLoaiMonAn) references LoaiMonAn(MaLoaiMonAn)
)
go

create table Combo (
	MaCombo int IDENTITY(1,1),
	TenCombo nvarchar(255),
	GiaTien money,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaCombo)
)
go

create table ComboChiTiet (
	MaCombo int,
	MaMonAn int,
	SoLuong int,
	GhiChu nvarchar(max),
	primary key (MaCombo, MaMonAn),
	foreign key (MaCombo) references Combo(MaCombo),
	foreign key (MaMonAn) references MonAn(MaMonAn)
)
go

create table KhuVuc (
	MaKhuVuc int IDENTITY(1,1),
	TenKhuVuc nvarchar(50),
	ViTri nvarchar(20),
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaKhuVuc)
)
go

create table TaiKhoan (
	MaTaiKhoan int IDENTITY(1,1),
	TenTaiKhoan nvarchar(255),
	MatKhau nvarchar(50),
	primary key (MaTaiKhoan)
)
go

create table ChucVu (
	MaChucVu int IDENTITY(1,1),
	TenChucVu nvarchar(50),
	ThoiGianNhamChuc date,
	GhiChu nvarchar(max),
	primary key (MaChucVu)
)
go

create table NhanVien (
	MaNhanVien int IDENTITY(1,1),
	MaTaiKhoan int,
	MaChucVu int,
	HoTenNhanVien nvarchar(255),
	Email nvarchar(50),
	DiaChi nvarchar(255),
	GioiTinh bit,
	SDT nvarchar(15),
	NgaySinh date,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaNhanVien),
	foreign key (MaChucVu) references ChucVu(MaChucVu),
	foreign key (MaTaiKhoan) references TaiKhoan(MaTaiKhoan)
)
go

create table UuDai (
	MaUuDai int IDENTITY(1,1),
	TenUuDai nvarchar(255),
	ThoiGianBatDauUuDai date,	
	ThoiGianKetThucUuDai date,
	PhanTramUuDai float,
	SoLuong int,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaUuDai)
)
go

create table Ban (
	MaBan int IDENTITY(1,1),
	MaKhuVuc int,
	TenBan nvarchar(50),
	SoLuongGheNgoi int,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaBan),
	foreign key (MaKhuVuc) references KhuVuc(MaKhuVuc)
)
go
create table KhachHang (
	MaKhachHang int IDENTITY(1,1),
	HoTenKhachHang nvarchar(255),
	SDT nvarchar(15),
	GhiChu nvarchar(max),
	primary key (MaKhachHang)
)
go

create table DanhGia (
	MaDanhGia int IDENTITY(1,1),
	MaKhachHang int,
	NoiDungDanhGia nvarchar(max),
	ThoiGian date,
	LikeOrDisLike bit,
	primary key (MaDanhGia),
	foreign key (MaKhachHang) references KhachHang(MaKhachHang)
)
go

create table HoaDon (
	MaHoaDon int IDENTITY(1,1),
	MaUuDai int,
	MaNhanVien int,
	MaKhachHang int,
	MaBan int,
	ThoiGian date,
	TienGiam money,
	TongTien money,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaHoaDon),
	foreign key (MaUuDai) references UuDai(MaUuDai),
	foreign key (MaKhachHang) references KhachHang(MaKhachHang),
	foreign key (MaNhanVien) references NhanVien(MaNhanVien),
	foreign key (MaBan) references Ban(MaBan)
)
go

create table HoaDonChiTiet (
	MaHoaDon int,
	MaComBo int,
	MaMonAn int,
	SoLuong int,
	ThanhTien money,
	GhiChu nvarchar(max),
	primary key (MaHoaDon, MaComBo),
	foreign key (MaMonAn) references MonAn(MaMonAn),
	foreign key (MaComBo) references Combo(MaComBo),
	foreign key (MaHoaDon) references HoaDon(MaHoaDon)
)
go

-- Insert into LoaiMonAn
insert into LoaiMonAn (TenLoaiMonAn, GhiChu) values 
('Khai Vị', 'Món khai vị'),
('Món Chính', 'Món ăn chính'),
('Tráng Miệng', 'Món tráng miệng');
go

-- Insert into MonAn
insert into MonAn (MaLoaiMonAn, TenMonAn, GhiChu, TrangThai) values 
(1, 'Gỏi Cuốn', 'Gỏi cuốn tôm thịt', 1),
(2, 'Cơm Tấm', 'Cơm tấm sườn bì chả', 1),
(3, 'Chè Đậu Xanh', 'Chè đậu xanh nước cốt dừa', 1);
go

-- Insert into Combo
insert into Combo (TenCombo, GiaTien, TrangThai, GhiChu) values 
('Combo Gia Đình', 300000, 1, 'Combo cho 4 người'),
('Combo Trưa', 150000, 1, 'Combo ăn trưa cho 2 người'),
('Combo Tiệc', 500000, 1, 'Combo tiệc 6 người');
go

-- Insert into ComboChiTiet
insert into ComboChiTiet (MaCombo, MaMonAn, SoLuong, GhiChu) values 
(1, 1, 4, 'Phục vụ 4 người'),
(1, 2, 4, 'Phục vụ 4 người'),
(2, 2, 2, 'Phục vụ 2 người');
go

-- Insert into KhuVuc
insert into KhuVuc (TenKhuVuc, ViTri, TrangThai, GhiChu) values 
('Khu A', 'Tầng 1', 1, 'Khu vực tầng 1'),
('Khu B', 'Tầng 2', 1, 'Khu vực tầng 2'),
('Khu C', 'Sân Thượng', 1, 'Khu vực sân thượng');
go

-- Insert into TaiKhoan
insert into TaiKhoan (TenTaiKhoan, MatKhau) values 
('nguyenvana', 'password123'),
('lethib', 'password123'),
('tranvanc', 'password123');
go

-- Insert into ChucVu
insert into ChucVu (TenChucVu, ThoiGianNhamChuc, GhiChu) values 
('Quản Lý', '2023-01-01', 'Chức vụ quản lý'),
('Nhân Viên', '2023-02-01', 'Chức vụ nhân viên phục vụ'),
('Đầu Bếp', '2023-03-01', 'Chức vụ đầu bếp');
go

-- Insert into NhanVien
insert into NhanVien (MaTaiKhoan, MaChucVu, HoTenNhanVien, Email, DiaChi, GioiTinh, SDT, NgaySinh, TrangThai, GhiChu) values 
(1, 1, 'Nguyễn Văn A', 'nguyenvana@example.com', '123 Đường ABC', 1, '0912345678', '1990-01-01', 1, 'Quản lý nhà hàng'),
(2, 2, 'Lê Thị B', 'lethib@example.com', '456 Đường DEF', 0, '0923456789', '1992-02-02', 1, 'Nhân viên phục vụ'),
(3, 3, 'Trần Văn C', 'tranvanc@example.com', '789 Đường GHI', 1, '0934567890', '1994-03-03', 1, 'Đầu bếp chính');
go

-- Insert into UuDai
insert into UuDai (TenUuDai, ThoiGianBatDauUuDai, ThoiGianKetThucUuDai, PhanTramUuDai, SoLuong, TrangThai, GhiChu) values 
('Giảm giá 10%', '2024-01-01', '2024-01-31', 10, 100, 1, 'Khuyến mãi đầu năm'),
('Giảm giá 20%', '2024-02-01', '2024-02-28', 20, 50, 1, 'Khuyến mãi tháng 2'),
('Giảm giá 30%', '2024-03-01', '2024-03-31', 30, 30, 1, 'Khuyến mãi tháng 3');
go

-- Insert into Ban
insert into Ban (MaKhuVuc, TenBan, SoLuongGheNgoi, TrangThai, GhiChu) values 
(1, 'Bàn 1', 4, 1, 'Bàn ở khu A'),
(2, 'Bàn 2', 6, 1, 'Bàn ở khu B'),
(3, 'Bàn 3', 2, 1, 'Bàn ở khu C');
go

-- Insert into KhachHang
insert into KhachHang (HoTenKhachHang, SDT, GhiChu) values 
('Nguyễn Thị D', '0945678901', 'Khách hàng thường xuyên'),
('Trần Văn E', '0956789012', 'Khách hàng VIP'),
('Lê Thị F', '0967890123', 'Khách hàng mới');
go

-- Insert into DanhGia
insert into DanhGia (MaKhachHang, NoiDungDanhGia, ThoiGian, LikeOrDisLike) values 
(1, 'Món ăn ngon, phục vụ tốt', '2024-01-01', 1),
(2, 'Không gian đẹp, món ăn tuyệt vời', '2024-01-02', 1),
(3, 'Giá cả hợp lý', '2024-01-03', 1);
go

-- Insert into HoaDon
insert into HoaDon (MaUuDai, MaNhanVien, MaKhachHang, MaBan, ThoiGian, TienGiam, TongTien, TrangThai, GhiChu) values 
(1, 1, 1, 1, '2024-01-01', 30000, 270000, 1, 'Hóa đơn thanh toán bằng tiền mặt'),
(2, 2, 2, 2, '2024-01-02', 60000, 240000, 1, 'Hóa đơn thanh toán bằng thẻ tín dụng'),
(3, 3, 3, 3, '2024-01-03', 90000, 210000, 1, 'Hóa đơn thanh toán qua ví điện tử');
go

-- Insert into HoaDonChiTiet
insert into HoaDonChiTiet (MaHoaDon, MaCombo, MaMonAn, SoLuong, ThanhTien, GhiChu) values 
(1, 1, 1, 2, 200000, '2 phần gỏi cuốn'),
(2, 2, 2, 1, 100000, '1 phần cơm tấm'),
(3, 3, 3, 3, 300000, '3 phần chè đậu xanh');
go
