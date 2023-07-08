package thuviensach;

public class GiaoDien {

	public GiaoDien() {
		// TODO Auto-generated constructor stub
	}
	void line() {
		System.out.println("----------------------------------------------------------------------------------------");
	}
	
	void ThanhPhanSGK() {
		System.out.println("|   no|"
				+"    maSach|"
				+ "    donGia|"
				+ "   soLuong|"
				+ "          nhaXuatBan|"
				+ " tinhTrang|"
				+ "      thanhTien|");
		line();
	}
	
	void ThanhPhanSTK() {
		System.out.println("|   no|"
				+"    maSach|"
				+ "    donGia|"
				+ "   soLuong|"
				+ "          nhaXuatBan|"
				+ "      thue|"
				+ "      thanhTien|");
		line();
	}
	void header(String s) {
		line();
		System.out.println("\t\t\tDanh sach cua " + s);
		line();
		
	}
	
	void Guide() {
		line();
		System.out.println("nhap [0] de them demo SGK, STK vao THU VIEN\n"
						+ "nhap [1] xuat danh sach cac loai sach\n"
						+ "nhap [2] them mot sach moi vao THU VIEN\n"
						+ "nhap [3] xuat cac sach co Nha Xuat Ban X\n"
						+ "nhap [4] de ket thuc chuong trinh!");
		line();
	}

}
