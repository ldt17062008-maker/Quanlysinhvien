public class Student {
    String maSV;
    String hoTen;
    String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public void hienThi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
    }

    // Hàm tìm kiếm theo mã SV (Cho Bài 3)
    public boolean timKiemTheoMa(String maCanTim) {
        return this.maSV.equals(maCanTim);
    }
}