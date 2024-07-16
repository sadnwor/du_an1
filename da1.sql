create database QLNhaHang;
go
use QLNhaHang
go
create table LoaiMonAn (
	MaLoaiMonAn nvarchar(5),
	TenLoaiMonAn nvarchar(50),
	GhiChu nvarchar(max),
	primary key (MaLoaiMonAn)
)
go
create table MonAn (
	MaMonAn nvarchar(5),
	MaLoaiMonAn nvarchar(5),
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
	MaMonAn nvarchar(5),
	SoLuong int,
	GhiChu nvarchar(max),
	primary key (MaCombo, MaMonAn),
	foreign key (MaCombo) references Combo(MaCombo),
	foreign key (MaMonAn) references MonAn(MaMonAn)
)
go
create table KhuVuc (
	MaKhuVuc nvarchar(5),
	TenKhuVuc nvarchar(50),
	ViTri nvarchar(20),
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaKhuVuc)
)
go
create table TaiKhoan (
	MaTaiKhoan nvarchar(5),
	TenTaiKhoan nvarchar(255),
	MatKhau nvarchar(50),
	primary key (MaTaiKhoan)
)
go
create table ChucVu (
	MaChucVu nvarchar(5),
	TenChucVu nvarchar(50),
	ThoiGianNhamChuc date,
	GhiChu nvarchar(max),
	primary key (MaChucVu)
)
go
create table NhanVien (
	MaNhanVien int IDENTITY(1,1),
	MaTaiKhoan nvarchar(5),
	MaChucVu nvarchar(5),
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
	MaUuDai nvarchar(5),
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
	MaKhuVuc nvarchar(5) not null,
	TenBan nvarchar(50),
	SoLuongGheNgoi int,
	TrangThai bit,
	GhiChu nvarchar(max),
	primary key (MaBan),
	foreign key (MaKhuVuc) references KhuVuc(MaKhuVuc)
)
go
create table LoaiKhachHang (
	MaLoaiKhachHang nvarchar(5),
	TenLoaiKhachHang nvarchar(50),
	primary key (MaLoaiKhachHang)
)
go
create table KhachHang (
	MaKhachHang int IDENTITY(1,1),
	MaLoaiKhachHang nvarchar(5) not null,
	HoTenKhachHang nvarchar(5) not null,
	SDT nvarchar(15),
	GhiChu nvarchar(max),
	primary key (MaKhachHang),
	foreign key (MaLoaiKhachHang) references LoaiKhachHang(MaLoaiKhachHang)
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
	MaUuDai nvarchar(5),
	MaNhanVien int,
	MaKhachHang int,
	MaBan nvarchar(5),
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
	MaMonAn nvarchar(5),
	SoLuong int,
	ThanhTien money,
	GhiChu nvarchar(max),
	primary key (MaHoaDon, MaComBo),
	foreign key (MaMonAn) references MonAn(MaMonAn),
	foreign key (MaComBo) references Combo(MaComBo),
	foreign key (MaHoaDon) references HoaDon(MaHoaDon)
)
go
