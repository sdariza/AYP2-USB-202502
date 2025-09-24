import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Generar la secuencia
         * 0,1,2,3,4,5,...,n-1
         */
        int n = 3;
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(i + ",");
        }
        int m = 3;
        System.out.println("");
        /* Para generar: (0,0),(0,1),(0,2),(1,0),(1,1),(1,2),(2,0),(2,1),(2,2) */
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.printf("(%d,%d),", i, j);
            }
            System.out.println();
        }
        // Lectura de una matriz de n_filas con m_columnas
        // Supongamos n_filas = 5 y m_columnas = 5
        n = 0;
        m = 0;
        Scanner input = new Scanner(System.in);
        int A[][] = new int[100][100];
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.printf("Ingrese el valor en A(%d,%d),", i, j);
                A[i][j] = input.nextInt();
            }
            System.out.println();
        }
        input.close();
        System.out.println("Los valores de A son:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.printf("%d|", A[i][j]);
            }
            System.out.println();
        }

        /*genera una matriz cuadrada con la secuencia de los
         * números naturales
         */
        n = 5;
        int cont = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                A[i][j] = cont + 1;
                cont = A[i][j];
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.printf("%d|", A[i][j]);
            }
            System.out.println();
        }
    }
}
