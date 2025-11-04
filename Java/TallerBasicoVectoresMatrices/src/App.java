import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int vectorPuntoUno[] = new int[100];
        System.out.println("Ingresa el número del enunciado: ");
        int numeroEnunciado = input.nextInt();
        if (numeroEnunciado == 1) {
            System.out.println("Ingrese el valor de n: ");
            int n = input.nextInt();
            for (int i = 0; i <= n - 1; i++) {
                vectorPuntoUno[i] = i;
            }
            System.out.println("El vector generado es:");
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(vectorPuntoUno[i] + "|");
            }
            System.out.println();
        } else if (numeroEnunciado == 2) {
            int vectorPuntoDos[] = new int[100];
            int n;
            vectorPuntoDos[0] = 1;
            System.out.println("Ingresa el valor de n: ");
            n = input.nextInt();
            for (int i = 1; i <= n - 1; i++) {
                vectorPuntoDos[i] = vectorPuntoDos[i - 1] * 2;
            }
            System.out.println("El vector generado es:");
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(vectorPuntoDos[i] + "|");
            }
            System.out.println();
        } else if (numeroEnunciado == 3) {
            int vectorPuntoTres[] = new int[100];
            int n;
            System.out.println("Ingresa el valor de n: ");
            n = input.nextInt();
            for (int i = 0; i <= n - 1; i++) {
                vectorPuntoTres[i] = 2 * i + 1;
            }
            System.out.println("El vector generado es:");
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(vectorPuntoTres[i] + "|");
            }
            System.out.println();
        } else if (numeroEnunciado == 4) {
            int vectorPuntoCuatro[] = new int[100];
            int n;
            System.out.println("Ingresa el valor de n: ");
            n = input.nextInt();
            vectorPuntoCuatro[0] = 1;
            for (int i = 1; i <= n - 1; i++) {
                vectorPuntoCuatro[i] = vectorPuntoCuatro[i - 1] * i;
            }
            System.out.println("El vector generado es:");
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(vectorPuntoCuatro[i] + "|");
            }
            System.out.println();
        } else if (numeroEnunciado == 5) {
            int A[][] = new int[100][100];
            System.out.println("Ingres el valor de n: ");
            int n = input.nextInt();
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j <= n - 1; j++) {
                    A[i][j] = (int) Math.pow(2, n * i + j);
                }
            }
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j <= n - 1; j++) {
                    System.out.print(A[i][j]+"|");
                }
                System.out.println();
            }
            System.out.println();
        }
        input.close();
    }
}