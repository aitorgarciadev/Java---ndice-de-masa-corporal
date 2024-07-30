package java.dev.aitor;

public class BMI {

    public static double calculateBMI(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
