import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas calificaciones se usaran?");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Calificación 1");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Calificacion 2");
        double b = sc.nextDouble();
        double bc = a + b;
        System.out.println("Su promedio es de: "+ bc /c);9
    }
}
