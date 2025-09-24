public class App {
    public static void main(String[] args) throws Exception {
        int vec[] = { 30, 20, 10, 5, 4, 3, 2, 1, -1 };
        int n = vec.length;// lenght es para la cantidad de elem en el vector
        int i = 0, j = 0, temp = 0;
        for (i = 0; i <= n - 2; i++) {
            for (j = 0; j <= n - i - 2; j++) {
                if (vec[j] > vec[j + 1]) {
                    temp = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = temp;
                }
            }
        }
        System.out.println("Vector ordenado ascendentemente");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(vec[i] + "|");
        }
        System.out.println();
    }
}
