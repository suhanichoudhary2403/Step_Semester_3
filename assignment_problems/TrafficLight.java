import java.util.Scanner;
class TrafficLight {
    private final String id;
    private String color;
    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }
    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
        System.out.println(color);
    }
    public String getColor() {
        return color;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Traffic Light ID: ");
        String id = sc.next();
        TrafficLight t = new TrafficLight(id);
        System.out.println("Initial color: " + t.getColor());
        System.out.print("Trigger transition 1: ");
        t.next();
        System.out.print("Trigger transition 2: ");
        t.next();
        System.out.print("Trigger transition 3: ");
        t.next();
        sc.close();
    }
}
