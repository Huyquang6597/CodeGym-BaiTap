package QLCB;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien() {
    }

    public NhanVien(String work) {
        this.job = work;
    }

    public NhanVien(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.job = work;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "Cong viec: '" + job + '\'' + '}';
    }
}
