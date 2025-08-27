import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int vec[] = new int[10000], n = 0, i, x;
        boolean encontrado = false;
        while (n <= 0 || n > 10000) {
            System.out.println("Ingrese un número entre 1 y 10000");
            n = input.nextInt();
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.printf("Ingrese el valor de vec[%d]", i);
            vec[i] = input.nextInt();
        }
        i = 0;
        System.out.println("Ingrese el valor a buscar: ");
        x = input.nextInt();
        input.close();
        while (!encontrado && i <= n) {
            if (vec[i] == x) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            System.out.println("Sí lo encontré");
        } else {
            System.out.println("No lo encontré");
        }
    }
}
