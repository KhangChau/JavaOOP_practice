/**
 * 
 */
package thuviensach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class ThuVien {

	/**
	 * 
	 */
	
	protected List<SachGiaoKhoa> sgk; //List sách giáo khoa
	protected List<SachThamKhao> stk; //Lít sách tham khảo
	
	protected float tongThanhTien_SGK;
	protected float tongThanhTien_STK;
	
	protected float donGia_TB_SGK;
	protected float donGia_TB_STK;
	private GiaoDien g = new GiaoDien();
	
	
	public ThuVien() {
		// TODO Auto-generated constructor stub
		this.sgk = new ArrayList<SachGiaoKhoa>();
		this.stk = new ArrayList<SachThamKhao>();
		this.tongThanhTien_SGK = -999f;
		this.tongThanhTien_STK = -999f;
		this.donGia_TB_SGK = -999f;
		this.donGia_TB_STK = -999f;
	}
	
	public List<SachGiaoKhoa> getSGK() {
		return sgk;
	}
	public List<SachThamKhao> getSTK() {
		return stk;
	}
	
	void XuatSGK() {
		g.header("SACH GIAO KHOA");
		g.ThanhPhanSGK();
		int no = 1;
		for(Sach s : this.sgk) {
			s.display(no);
			no++;
			System.out.println();
		}

		g.line();
		System.out.print("|Tong THANH TIEN: " + "                                                     ");
		System.out.printf("|%15.2f|\n", this.tongThanhTien_SGK);
		g.line();
		
		g.line();
		System.out.print("|[TBC] GIA: " + "     ");
		System.out.printf("|%10.2f|\n", this.donGia_TB_SGK);
		g.line();
	}
	void XuatSTK() {
		g.header("SACH THAM KHAO");
		g.ThanhPhanSTK();
		int no = 1;
		for(Sach s : this.stk) {
			s.display(no);
			no++;
			System.out.println();
		}

		g.line();
		System.out.print("|Tong THANH TIEN: " + "                                                     ");
		System.out.printf("|%15.2f|\n", this.tongThanhTien_STK);
		g.line();
		
		g.line();
		System.out.print("|[TBC] GIA: " + "     ");
		System.out.printf("|%10.2f|\n", this.donGia_TB_STK);
		g.line();	
	}
	
	void XuatThuVien() {
		this.TinhTongThanhtien();
		this.TinhTBC_DonGia();
		this.XuatSGK();
		this.XuatSTK();
	}
	
	void ThemSGK(SachGiaoKhoa sach) {
		this.sgk.add(sach);
	}
	void ThemSTK(SachThamKhao sach) {
		this.stk.add(sach);
	}
	
	void ThemSGK() {
		SachGiaoKhoa sach = new SachGiaoKhoa();
		sach.themSach();
		this.sgk.add(sach);
	}
	void ThemSTK() {
		SachThamKhao sach = new SachThamKhao();
		sach.themSach();
		this.stk.add(sach);
	}
	
	public void ThemSach() {
		Scanner scan = new Scanner(System.in);
		Boolean pass = true;
		
		do{
			System.out.print("them SGK[1]/ them STK[2]: ");
			String loaiSach = scan.nextLine();			
			
			switch (loaiSach) {
			case "1":
				//them SGK
				ThemSGK();
				break;
			case "2":
				//them STK
				ThemSTK();
				break;
			default:
				System.out.println("hay chi chon [1] hoac [2]!");
				pass = false;
				break;
			}
		}while(pass == false);
		System.out.println("Them sach thanh cong!");
	}
	
	void TongThanhtienSGK() {
		float tong = 0.0f;
		for(SachGiaoKhoa sach : this.sgk) {
			tong += sach.getThanhtien();
		}
		this.tongThanhTien_SGK = tong;
	}
	void TongThanhtienSTK() {
		float tong = 0.0f;
		for(SachThamKhao sach : this.stk) {
			tong += sach.getThanhtien();
		}
		this.tongThanhTien_STK = tong;
	}
	
	void TinhTongThanhtien() {
		TongThanhtienSGK();
		TongThanhtienSTK();
	}
	
	void TBC_DonGia_SGK() {
		int tong = 0;
		float num = 0.0f;
		for(SachGiaoKhoa sach : this.sgk) {
			tong += sach.getDonGia();
			num++;
		}
		this.donGia_TB_SGK = tong/num;
	}
	void TBC_DonGia_STK() {
		int tong = 0;
		float num = 0.0f;
		for(SachThamKhao sach : this.stk) {
			tong += sach.getDonGia();
			num++;
		}
		this.donGia_TB_STK = tong/num;
	}
	void TinhTBC_DonGia() {
		TBC_DonGia_SGK();
		TBC_DonGia_STK();
	}
	void timSach(String NXB) {
		GiaoDien g = new GiaoDien();
		int no = 0;
		Boolean noResult = true;
		g.header("SGK");
		g.ThanhPhanSGK();
		for(SachGiaoKhoa sach : this.sgk) {
			if(sach.getNhaXuatBan().equals(NXB)) {
				sach.display(++no);
				System.out.println();
				noResult = false;
			}
		}
		
		g.header("STK");
		g.line();
		g.ThanhPhanSGK();
		for(SachThamKhao sach : this.stk) {
			if(sach.getNhaXuatBan().equals(NXB)) {
				sach.display(++no);
				System.out.println();
				noResult = false;
			}
		}
		g.line();
		if(noResult == true) {
			System.out.println("khong tim thay sach nao co NXB la " + NXB);
		}
	}
	void timSach_theoNXB() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao ten NHA XUAT BAN cua sach ban muon tim: ");
		
		String NXB = scan.nextLine();
		GiaoDien g = new GiaoDien();
		g.header(("sach co NXB la " + NXB));
		timSach(NXB);
	}
	
	void demoThemSach() {
		SachGiaoKhoa sach = new SachGiaoKhoa();
		sach.demo();
		SachThamKhao sach2 = new SachThamKhao();
		sach2.demo();
		ThemSGK(sach);
		ThemSTK(sach2);
		System.out.println("Demo thanh cong!");
	}
	
}
