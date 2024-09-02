public class MathConstants {
    public static final double PI = Math.PI;
    public static final double E = Math.E;
    public static <T extends Number> double negativeValue(T value) {
        return -Math.abs(value.doubleValue());
    }

    public static void main(String[] args) {
        System.out.println("Константа PI: " + PI);
        System.out.println("Константа E: " + E);
        System.out.println("Отрицательное значение 5: " + negativeValue(5));
        System.out.println("Отрицательное значение -10: " + negativeValue(-10));
        System.out.println("Отрицательное значение 0.5: " + negativeValue(0.5));
    }
}
