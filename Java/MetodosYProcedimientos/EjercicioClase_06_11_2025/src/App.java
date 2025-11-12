
public class App {
    
    public static void main(String[] args) throws Exception {
        int A[][] = new int[100][100], B[][] = new int[100][100], vec[] = new int [100*100], n,m,k=0;
        Method myMethod = new Method();
        System.out.println("Ingresa el valor de las filas de A");
        n = myMethod.validarDim(0);
        System.out.println("Ingresa el valor de las columnas de A");
        m = myMethod.validarDim(0);
        myMethod.leerMatriz(A, n, m);
        myMethod.leerMatriz(B, n, m);
        int sumarDiagonalA = myMethod.sumarDiagonal(A, n); 
        int sumarDiagonalB = myMethod.sumarDiagonal(B, n);
        int sumarElemsA = myMethod.sumarElems(A, n, m);
        int sumasElemsB = myMethod.sumarElems(B, n, m);
        int sumDiags = sumarDiagonalA + sumarDiagonalB;
        int sumarElems = sumarElemsA + sumasElemsB;
        if (sumarElems > sumDiags) {
            System.out.println("AT(ABT)B");
        }else{
            k = myMethod.generarVector(A, B, vec, sumarDiagonalB, sumarElems, k);
            myMethod.imprVector(vec, k);
        }
    }
}
