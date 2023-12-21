public class Main {
    public static void main(String[] args) {
        BMIService index = new BMIService();
        int bmi = (int) index.calculate(98, 1.87F);
        System.out.println(bmi);
    }
}
