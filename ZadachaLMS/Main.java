package ZadachaLMS;

import static ZadachaLMS.Circle.calculateArea;
import static ZadachaLMS.Circle.calculateCircumference;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        double area1 = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("Площадь окружности с радиусом " + radius + " равна " + area1);
        System.out.println("Длина окружности с радиусом " + radius + " равна " + circumference);
    }


}
