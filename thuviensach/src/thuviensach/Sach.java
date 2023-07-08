/**
 * 
 */
package thuviensach;

import java.util.Scanner;

/**
 * 
 */

public  class Sach {

	/**
	 * 
	 */
	protected String maSach;
	protected int donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	
	public Sach() {
		// TODO Auto-generated constructor stub
		this.maSach = "";
		this.donGia = -1;
		this.soLuong = -1;
		this.nhaXuatBan = "";		
	}
	
	public Sach(String maSach, int donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}
	
	void display(int no) {
		System.out.printf("|%5d|"
						+"%10s|"
						+ "%10d|"
						+ "%10d|"
						+ "%20s|",
				no, this.maSach, this.donGia, 
				this.soLuong, this.nhaXuatBan);
	}
	void demo() {
		this.setDonGia(1000);
		this.setMaSach("12xz");
		this.setNhaXuatBan("Kim Dong");
		this.setSoLuong(10);
	}
	
	void themSach() {
		Scanner scan = new Scanner(System.in);
		

		System.out.print("nhap vao MA SACH: ");
		setMaSach(scan.nextLine());
		
		System.out.print("nhap vao DON GIA [Integer]: ");
		setDonGia(scan.nextInt());
		scan.nextLine();
		
		System.out.print("nhap vao SO LUONG: ");
		setSoLuong(scan.nextInt());
		scan.nextLine();
		
		System.out.print("nhap vao NHA XUAT BAN: ");
		setNhaXuatBan(scan.nextLine());		
	}
	
	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

}
