import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = new int[100], n = 0, i = 0, contPar = 0, contImPar = 0;
        Scanner input = new Scanner(System.in);
        while (n <= 0 || n > 100) {
            System.out.println("Ingrese el valor de n: ");
            n = input.nextInt();
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Ingresa el valor de nums[" + i + "]");
            nums[i] = input.nextInt();
        }
        input.close();
        for (i = 0; i <= n - 1; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    contPar++;
                }
            }
        }
        contImPar = n - contPar;
        System.out.println("La cantidad de elementos pares es: " + contPar);
        System.out.println("La cantidad de elementos impares es: " + contImPar);

    }
}
