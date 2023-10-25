import java.util.Scanner;

public class week9TeoriNo4 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int[] bil = new int[8];
        int sum = 0;
        double avg;

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan nilai bilangan ke-"+i+": ");
            bil[i] = input27.nextInt();
            sum += bil[i];
        }

        avg = sum/bil.length;
        System.out.println("Rata-rata: "+avg);

        input27.close();
    }
}