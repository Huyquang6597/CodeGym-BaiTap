package StaffMananger;

public class Staff {
    private String name;
    private boolean type;
    private boolean status;
    private long salary;

    public Staff() {
    }

    public Staff(String name, boolean type, boolean status, long salary) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nhan vien: " +
                "Ten: '" + name + '\'' +
                ", Loai: '" + type + '\'' +
                ", Hien trang: '" + status + '\'' +
                ", Luong: " + salary +
                '}';
    }
}
