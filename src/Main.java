import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input first angle");
            double a = scanner.nextDouble();
            System.out.println("Input second angle");
            double b = scanner.nextDouble();
            System.out.println("Input third angle");
            double c = scanner.nextDouble();
            try {
                checkTriangleEdges(a,b,c);
            } catch (TriangleEdgesException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("You have to input a number");
        }
    }

    public static void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || c + b <= a) {
            throw new TriangleEdgesException("Error: Triangle is illegal");
        } else {
            System.out.println("This triangle is legal");
        }
    }
}
