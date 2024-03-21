import java.util.Scanner;

public class TamGiacNe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap do dai canh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhap do dai canh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhap do dai canh c: ");
            double c = scanner.nextDouble();
            checkgTriCanhtGiac(a,b,c);
            System.out.println("Tam giac hop le.");
        } catch (IllegalTriangleException e) {
            System.err.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unknown Error"+ e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkgTriCanhtGiac(double a,double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Do dai canh phai lon hon 0.");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai.");
        }
    }
}
