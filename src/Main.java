//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Area of the circle is " + area(5.0));
        System.out.println("Area of the circle is " + area(-1));
        System.out.println("Area of the circle is " + area(5.0, 4.0));
        System.out.println("Area of the circle is " + area(-1.0, 4.0));
    }

    public static double area(double radius) {

        if (radius < 0) {

            return -1.0d;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {

            return -1.0d;
        }
        return x * y;
    }
}