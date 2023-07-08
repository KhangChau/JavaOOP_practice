/**
 * 
 */
package thuviensach;

import java.util.Scanner;

/**
 * 
 */
public class SachGiaoKhoa extends Sach {

	/**
	 * 
	 */
	protected TinhTrang tinhTrang;
	protected float thanhTien;
	
	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
		super();
		this.tinhTrang = null;
		this.thanhTien = -1f;
	}
	
	//Tính thành tiền
	void TinhThanhTien() {
		if(this.tinhTrang == TinhTrang.MOI) {
			this.thanhTien = this.soLuong * this.donGia;
		} 
		else if(this.tinhTrang == TinhTrang.CU) {
			this.thanhTien = this.soLuong * this.donGia * 50 / 100;
		}
	}
	
	public SachGiaoKhoa(String maSach, int donGia, int soLuong, String nhaXuatBan, TinhTrang tinhTrang) {
		super(maSach, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
		this.TinhThanhTien();
	}
	
	@Override
	void display(int no) {
		super.display(no);
		System.out.printf("%10s|", this.tinhTrang);
		System.out.printf("%15.2f|", this.thanhTien);
	}
	
	@Override
	void demo() {
		super.demo();
		this.setTinhTrang(TinhTrang.CU);
		this.TinhThanhTien();
	}
	
	@Override
	void themSach() {
		super.themSach();
		
		
		Boolean pass = true;
		
		do {
			System.out.print("nhap vao TINH TRANG [moi]/[cu]: ");
			Scanner scan = new Scanner(System.in);
			String temp = scan.nextLine();
			
			if(temp.equals("moi") 
					|| temp.equals("MOI")
					|| temp.equals("Moi")) {
				setTinhTrang(TinhTrang.MOI);
				pass = true;
			}
			else if(temp.equals("cu") 
					|| temp.equals("CU")
					|| temp.equals("Cu")) { 
				setTinhTrang(TinhTrang.CU);
				pass = true;
			}
			else {
				System.out.println("vui long nhap lai TINH TRANG!");
				pass = false;
			}	
		} while(pass == false);
		TinhThanhTien();		
	}
	
	public TinhTrang getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(TinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public float getThanhtien() {
		return this.thanhTien;
	}
}
