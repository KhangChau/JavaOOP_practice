/**
 * 
 */
package thuviensach;

import java.util.Scanner;

/**
 * 
 */
public class SachThamKhao extends Sach {

	/**
	 * 
	 */
	protected int thue;
	protected float thanhTien;
	
	public SachThamKhao() {
		// TODO Auto-generated constructor stub
		super();
		this.thue = -1;
		this.thanhTien = -1f;
	}
	
	//Tính thành tiền
	void TinhThanhTien() {
		this.thanhTien = this.soLuong * this.donGia  + this.thue;
	}
	
	public SachThamKhao(String maSach, int donGia, int soLuong, String nhaXuatBan, int thue) {
		super(maSach, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
		this.TinhThanhTien();
	}
	
	@Override
	void display(int no) {
		super.display(no);
		System.out.printf("%10d|", this.thue);
		System.out.printf("%15.2f|", this.thanhTien);
	}
	
	@Override
	void demo() {
		super.demo();
		this.setThue(153);
		this.TinhThanhTien();
	}
	
	@Override
	void themSach() {
		super.themSach();
		
		System.out.print("nhap vao THUE: ");
		Scanner scan = new Scanner(System.in);
		setThue(scan.nextInt()); 
			
		TinhThanhTien();		
	}
	
	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}
	
	public float getThanhtien() {
		return this.thanhTien;
	}
}
