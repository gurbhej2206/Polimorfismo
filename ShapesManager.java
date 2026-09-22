import java.util.Arrays;
import java.util.Comparator;

public class ShapesManager {

    public static double suma(Shape[] v) {
        double total = 0;
        for (int i = 0; i<v.length;i++) {
            total = total + v[i].area();
        }
        return total;
    }

    public static void sort(Shape[] v) {
        Arrays.sort(v);
    }

    public static void print(Shape[] v) {
        for (int i = 0; i<v.length;i++) {
            System.out.print(v[i]+"\n");
        }
    }

    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Triangle(2, 2);

        double res = suma(v);

        System.out.println("sum: " + res+"\n");

        print(v);

        sort(v);

        System.out.println("\nOrdered array:");
        print(v);
    }
}