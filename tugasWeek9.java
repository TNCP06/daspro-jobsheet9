import java.util.Scanner;

public class tugasWeek9 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int total = 0;
        double avg;

        System.out.print("Masukkan banyak elemen array: ");
        byte x = input27.nextByte();
        int[] nilai = new int[x];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai elemen "+i+": ");
            nilai[i] = input27.nextInt();
            total += nilai[i];
        }

        int biggest = 0, least = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (biggest < nilai[i]) {
                biggest = nilai[i];
            } else {
                least = nilai[i];
            }
        }

        avg = total/nilai.length;
        System.out.println("Nilai tertinggi: "+biggest);
        System.out.println("Nilai terendah: "+least);
        System.out.println("Nilai rata-rata: "+avg);
        
        input27.close();
    }
}