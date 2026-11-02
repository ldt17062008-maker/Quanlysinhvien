public class Student {
    // Khai báo các thuộc tính theo đề bài
    String maSV;
    String hoTen;
    String ngaySinh;

    // Tạo hàm khởi tạo (Constructor)
    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    // Hàm hiển thị thông tin
    public void hienThi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
    }
}