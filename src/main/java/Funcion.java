import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos enteros");
        System.out.println(greater(leer.nextInt(), leer.nextInt()));
    }

    public static boolean greater(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }
}
