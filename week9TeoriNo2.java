import java.util.Scanner;

public class week9TeoriNo2 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-"+i+": ");
            num[i] = input27.nextInt();
        }

        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]+" ");
        }
        input27.close();
    }
}