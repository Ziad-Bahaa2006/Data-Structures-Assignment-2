public class Mavenproject6 {

    public static void main(String[] args) {

        int[][] a = {
            {10, 15, 20},
            {15, 30, 25},
            {20, 25, 40}
        };

        int n = a.length;
        int size = n * (n + 1) / 2;
        int[] oneD = new int[size];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                oneD[k++] = a[i][j];
            }
        }

        for (int x : oneD) {
            System.out.print(x + " ");
        }
    }
}