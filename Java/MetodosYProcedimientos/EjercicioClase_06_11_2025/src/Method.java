import java.util.Scanner;

public class Method {
    Scanner input = new Scanner(System.in);
    public int validarDim(int dim){
        while (dim <= 0 || dim > 100) {
            System.out.println("Ingrese un valor válido: ");
            dim = input.nextInt();
        }
        return dim;
    }
    /**
     * This method read a matrix with ...
     * 
     * @param M      is the name of the matrix
     * @param nFilas is the number of rows
     * @param mCols  is the number of cols
     */
    public void leerMatriz(int M[][], int nFilas, int mCols) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mCols; j++) {
                System.out.println("Ingrese la pos: " + i + ", " + j);
                M[i][j] = input.nextInt();
            }
        }
    }

    public void impMatriz(int M[][], int nFilas, int mCols) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mCols; j++) {
                System.out.print(M[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int sumarDiagonal(int M[][], int nFilas) {
        int sum = 0;
        for (int i = 0; i < nFilas; i++) {
            sum = sum + M[i][i];
        }
        return sum;
    }

    public int sumarElems(int M[][], int nFilas, int mCols) {
        int sum = 0;
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mCols; j++) {
                sum = sum + M[i][i];
            }
        }
        return sum;
    }

    public void transpose(int M[][], int nFilas, int mCols, int MT[][]) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mCols; j++) {
                MT[j][i] = M[i][j];
            }
        }
    }

    public void multiplicarMatrices(int M1[][], int M2[][], int nFilas1, int mCols, int mCols2, int M3[][]) {
        for (int i = 0; i < nFilas1; i++) {
            for (int j = 0; j < mCols2; j++) {
                for (int k = 0; k < mCols; k++) {
                    M3[i][j] = M3[i][j] + M1[i][k] * M2[k][j];
                }
            }
        }
    }
    public boolean isPrime(int num){
        if(num % 2 == 0 && num != 2)
            return false;
        int cont = 0;
        for (int div = 1; div <= num; div++) {
            if (num % div == 0) {
                cont++;
            }
        }
        return cont <= 2;
    }

    public boolean search(int vec[], int dim, int x){
        int i = 0;
        while (i <= dim -1) {
            if(vec[i] == x)
                return true;
            else
                i++;
        }
        return false;
    }

    public int generarVector(int A[][], int B[][], int vec[], int n, int m, int k ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(isPrime(A[i][j])){
                    if(!search(vec, k,A[i][j])){
                        vec[k] = A[i][j];
                        k++;
                    }
                }
                if(isPrime(B[i][j])){
                    if(!search(vec, k,B[i][j])){
                        vec[k] = B[i][j];
                        k++;
                    }
                }
            }
        }
        return k;
    }
    public void imprVector(int vec[], int dim){
        for (int i = 0; i < dim; i++) {
            System.out.print(vec[i]+"|");
        }
        System.out.println();
    }
}
