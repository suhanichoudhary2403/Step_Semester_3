import java.util.Scanner;
abstract class Plot {
    String owner;
    String shape;
    public Plot(String owner, String shape) {
        this.owner = owner;
        this.shape = shape;
    }
    public abstract double getArea();
}
class CirclePlot extends Plot {
    double radius;
    public CirclePlot(String owner, double radius) {
        super(owner, "CIRCLE");
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class RectanglePlot extends Plot {
    double length, width;
    public RectanglePlot(String owner, double length, double width) {
        super(owner, "RECTANGLE");
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
class TrianglePlot extends Plot {
    double base, height;
    public TrianglePlot(String owner, double base, double height) {
        super(owner, "TRIANGLE");
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class GardenPlotReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Plot[] plots = new Plot[n];
        double totalArea = 0;
        for (int i = 0; i < n; i++) {
            String shape = sc.next();
            String owner = sc.next();
            if (shape.equalsIgnoreCase("CIRCLE")) {
                plots[i] = new CirclePlot(owner, sc.nextDouble());
            } else if (shape.equalsIgnoreCase("RECTANGLE")) {
                plots[i] = new RectanglePlot(owner, sc.nextDouble(), sc.nextDouble());
            } else if (shape.equalsIgnoreCase("TRIANGLE")) {
                plots[i] = new TrianglePlot(owner, sc.nextDouble(), sc.nextDouble());
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%s (%s): %.2f\n", plots[i].owner, plots[i].shape, plots[i].getArea());
            totalArea += plots[i].getArea();
        }
        System.out.printf("Total Area: %.2f\n", totalArea);
        sc.close();
    }
}
