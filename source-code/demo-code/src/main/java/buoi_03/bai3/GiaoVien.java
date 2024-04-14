package buoi_03.bai3;

import java.sql.Date;

public class GiaoVien {
    private int id;
    private String maGV;
    private String tenGV;
    private Date ngaySinh;
    private String diaChi;
    private int soNamKinhNghiem;

    public GiaoVien() {
    }

    public GiaoVien(int id, String maGV, String tenGV, Date ngaySinh, String diaChi, int soNamKinhNghiem) {
        this.id = id;
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
}
