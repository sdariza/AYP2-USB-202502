import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = 0, contDiv = 0, i;
        System.out.println("Este algoritmo es para determinar si un número es primo o no");
        while (n <= 1 || (n > 2 && n % 2 == 0)) {
            System.out.println("Por favor debes ingresar un número entero");
            n = input.nextInt();
        }
        input.close();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                contDiv = contDiv + 1;
            }
        }
        if (contDiv == 2)
            System.out.printf("El número %d es primo", n);
        else
            System.out.printf("El número %d NO es primo", n);
    }
}
