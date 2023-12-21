public class BMIService {
    public static double calculate(int weight, float height) {
        double bmi = (weight) / Math.pow(height, 2);
        return bmi;
    }
}