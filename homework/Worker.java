package homework;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;


    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("sich", ThreeType.State, 25);
        double result = pensionFund.pensionCalculation(getAge(), minSalary, maxSalary);
        return result;
    }

    @Override
    public void die() {
        System.out.println("Этот чловек не дожил до пенсии");
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }


}
