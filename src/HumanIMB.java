public class HumanIMB {

    private double weight;
    private double height;
    private double bmi;

    public HumanIMB(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new RuntimeException("Weight must be greater than zero.");
        }
        this.weight = weight;
        calculateBmi();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Height must be greater than zero.");
        }
        this.height = height;
        calculateBmi();
    }

    public double getBmi() {
        return bmi;
    }

    private void calculateBmi() {
        bmi = weight / (height * height);
    }

    public String getBmiCategory() {
        if (bmi < 18.5) {
            return "Deficit";
        }
        if (bmi < 25) {
            return "Norm";
        }
        if (bmi < 30) {
            return "Warning!";
        }
        return "Fat";
    }
}

