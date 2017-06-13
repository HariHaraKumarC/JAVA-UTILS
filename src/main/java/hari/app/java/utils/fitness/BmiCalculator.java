package hari.app.java.utils.fitness;

/**
 * Created by HariHaraKumar.C on 6/12/2017.
 */
public class BmiCalculator {
    private double height;
    private double weight;
    private double bmi;
    private String category;

    //BMI Range
    private static final String SEVERE_THINNESS="Severe Thinness";
    private static final String MODERATE_THINNESS="Moderate Thinness";
    private static final String MILD_THINNESS="Mild Thinness";
    private static final String NORMAL="Normal";
    private static final String OVER_WEIGHT="Over Weight";
    private static final String OBESE_CLASS_1="Obese Class 1";
    private static final String OBESE_CLASS_2="Obese Class 2";
    private static final String OBESE_CLASS_3="Obese Class 3";

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    // Calculates Body Mass Index: Formula: BMI=weight/height^2 kg/m^2
    public void calculateBMI() {
        this.bmi = this.weight/Math.pow(this.height,2);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        double bmi=this.bmi;
        if(bmi < 16){
            this.category = SEVERE_THINNESS;
        }else if(bmi > 16 && bmi < 17){
            this.category = MODERATE_THINNESS;
        }else if(bmi > 17 && bmi < 18.5){
            this.category = MILD_THINNESS;
        }else if(bmi > 18.5 && bmi < 25){
            this.category = NORMAL;
        }else if(bmi > 25 && bmi < 30){
            this.category = OVER_WEIGHT;
        }else if(bmi > 30 && bmi < 35){
            this.category = OBESE_CLASS_1;
        }else if(bmi > 35 && bmi < 40){
            this.category = OBESE_CLASS_2;
        }else if(bmi > 40){
            this.category = OBESE_CLASS_3;
        }
    }

    @Override
    public String toString() {
        return ("Body Mass Index for the height "+ this.height+ " and weight "+ this.weight+ " = "+ this.bmi + " ; BMI Range = "+ this.category );
    }
}
