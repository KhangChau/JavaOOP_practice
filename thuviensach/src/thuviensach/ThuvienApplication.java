/**
 * 
 */
package thuviensach;

import java.util.Scanner;

/**
 * 
 */
public class ThuvienApplication {

	/**
	 * 
	 */
	public ThuvienApplication() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SachGiaoKhoa sach = new SachGiaoKhoa();
//		sach.demo();
//		SachThamKhao sach2 = new SachThamKhao();
//		sach2.demo();
//		
//		SachGiaoKhoa sach3 = new SachGiaoKhoa("adu", 130, 20, "Tuoi Tre", TinhTrang.MOI);
//		SachThamKhao sach4 = new SachThamKhao("vad1", 329, 14, "Vach Dich", 221);
//		
//		ThuVien thuVien = new ThuVien();
//		thuVien.ThemSGK(sach);
//		thuVien.ThemSTK(sach2);
//		thuVien.ThemSGK(sach3);
//		thuVien.ThemSTK(sach4);
//		thuVien.XuatThuVien();
//		thuVien.timSach_theoNXB();
		
		//thuVien.ThemSach();
		//thuVien.XuatThuVien();
		Boolean stop = false;
		GiaoDien g = new GiaoDien();
		ThuVien thuVien = new ThuVien();
		do {
			g.Guide();
			Scanner scan = new Scanner(System.in);
			System.out.print("moi ban nhap: ");
			String choice = scan.nextLine();
			switch (choice) {
			case "0":
				thuVien.demoThemSach();
				break;
			case "1":
				thuVien.XuatThuVien();
				break;
			case "2":
				thuVien.ThemSach();
				break;
			case "3":
				thuVien.timSach_theoNXB();
				break;
			case "4":
				stop = true;
				System.out.println("Ket thuc chuong trinh!");
				break;
			default:
				System.out.println("BAN NHAP SAI CU PHAP!\nNhap lai di!");
				break;
			}
		}while(stop == false);
	}

}
