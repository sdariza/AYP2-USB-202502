import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[1000]; // Entero nums[1000]
        int sum = 0, i, n = 0;
        float prom = 0;
        while (n <= 0 || n > 1000) {// NOT(n>=1 AND n<=1000)
            System.out.println("Debes ingresar un n entre 1 y 1000");
            n = input.nextInt();
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.printf("Ingrese la nums[%d]", i);
            nums[i] = input.nextInt();
        }
        for (i = 0; i <= n - 1; i++) {
            sum = sum + nums[i];
        }
        prom = sum / n;
        System.out.println("El promedio calculado es: " + prom);
        System.out.println("Los datos procesados son:");
        for (i = 0; i <= n - 1; i++) {
            System.out.printf("%d|", nums[i]);
        }
        System.out.println("");
        input.close();
    }
}
