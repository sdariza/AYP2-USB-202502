import java.util.Scanner;

public class Method {
    Scanner input = new Scanner(System.in);
    public int validarDim(int dim) {
        while (dim <= 0 || dim > 100) {
            System.out.println("Ingresa la dim: ");
            dim = input.nextInt();
        }
        return dim;
    }

    public void leerVector(int vec[], int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese el valor del vector en la pos: " + i);
            vec[i] = input.nextInt();
        }
    }

    public void impVector(int vec[], int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.printf("%d|", vec[i]);
        }
    }

    public int ambasAsignaturas(int vec1[], int vec2[], int n, int m, int c[], int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vec1[i] == vec2[j]) {
                    c[k] = vec1[i];
                    k = k + 1;
                }
            }
        }
        return k;
    }
}
