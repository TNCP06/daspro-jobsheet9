import java.util.Scanner;

public class week9TeoriNo1 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int[] x = new int[60];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-"+i+": ");
            x[i] = input27.nextInt();
        }

        input27.close();
    }
}