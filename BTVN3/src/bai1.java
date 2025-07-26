package Buoi_3;
import java.util.Scanner;

public class bai1 {

    // Khai báo 3 hằng số hình dạng
    public static final String square = "Square";
    public static final String triangle = "Triangle";
    public static final String circle = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập loại hình dạng (Square, Triangle, Circle): ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase(square)) {
            double side = inputDouble(sc, "Nhập độ dài cạnh hình vuông: ");
            double area = tinhSquareArea(side);
            System.out.println("Diện tích hình vuông là: " + area);
        } else if (type.equalsIgnoreCase(triangle)) {
            double base = inputDouble(sc, "Nhập độ dài đáy hình tam giác: ");
            double height = inputDouble(sc, "Nhập chiều cao hình tam giác: ");
            double area = tinhTriangleArea(base, height);
            System.out.println("Diện tích hình tam giác là: " + area);
        } else if (type.equalsIgnoreCase(circle)) {
            double radius = inputDouble(sc, "Nhập bán kính hình tròn: ");
            double area = tinhCircleArea(radius);
            System.out.println("Diện tích hình tròn là: " + area);
        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }

        sc.close();
    }

    public static double tinhSquareArea(double side) {
        return side * side;
    }

    public static double tinhTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double tinhCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double inputDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}