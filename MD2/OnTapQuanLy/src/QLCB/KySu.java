package QLCB;

public class KySu extends CanBo {
    private String trainingIndustry;

    public KySu() {
    }

    public KySu(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public KySu(String name, int age, String gender, String address, String trainingIndustry) {
        super(name, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "KySu: " + super.toString() + "Nganh dao tao: '" + trainingIndustry + '\'' + "";
    }
}
