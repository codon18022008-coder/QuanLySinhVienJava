package javaapplication1;

import java.util.ArrayList;

// Khai báo lớp SinhVien
class SinhVien {
    String maSV;
    String hoTen;
    double diemTB;

    // Constructor có kiểm tra điều kiện điểm trung bình (0 đến 10)
    SinhVien(String maSV, String hoTen, double diemTB) {
        if (diemTB < 0 || diemTB > 10) {
            throw new IllegalArgumentException("Diem trung binh phai tu 0 den 10");
        }
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Phương thức hiển thị thông tin
    void hienThi() {
        System.out.println(maSV + " - " + hoTen + " - " + diemTB);
    }
}

// Lớp chính trùng với tên file JavaApplication1.java
public class JavaApplication1 {

    public static void main(String[] args) {
        // Tạo danh sách lưu trữ 3 sinh viên mẫu
        ArrayList<SinhVien> ds = new ArrayList<>();
        ds.add(new SinhVien("SV01", "Nguyen An", 8.0));
        ds.add(new SinhVien("SV02", "Tran Binh", 7.5));
        ds.add(new SinhVien("SV03", "Le Chi", 9.0));

        System.out.println("=== DANH SÁCH SINH VIÊN ===");
        // Duyệt và hiển thị danh sách
        for (SinhVien sv : ds) {
            sv.hienThi();
        }
    }
}