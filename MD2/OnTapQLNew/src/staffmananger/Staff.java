package staffmananger;

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

    public String getType() {
        if (isType()) {
            return "Full-time";
        } else {
            return "Part-time";
        }
    }

    public boolean isType() {
        return type;
    }

    public String getStatus() {
        if (isStatus()) {
            return "Dang lam";
        } else {
            return "Da nghi";
        }
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isStatus() {
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
                ", Loai: '" + getType() + '\'' +
                ", Hien trang: '" + getStatus() + '\'' +
                ", Luong: " + salary +
                '}';
    }
}
