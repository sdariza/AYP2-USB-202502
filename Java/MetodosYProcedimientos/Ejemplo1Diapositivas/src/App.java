public class App {
    int n, m, apy2[] = new int[100], cal1[] = new int[100];
    int ambas[] = new int[100], k = 0;

    public static void main(String[] args) throws Exception {
        App myApp = new App();
        Method myMethod = new Method();
        myApp.n = myMethod.validarDim(0);
        myApp.m = myMethod.validarDim(0);
        myMethod.leerVector(myApp.apy2, myApp.n);
        myMethod.impVector(myApp.apy2, myApp.n);
        myMethod.leerVector(myApp.cal1, myApp.m);
        myApp.k = myMethod.ambasAsignaturas(myApp.apy2, myApp.cal1, myApp.n, myApp.m, myApp.ambas, myApp.k);
        myMethod.impVector(myApp.ambas, myApp.k);
        System.out.println(myApp.k);
    }
}
