import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalLulus = 0, totalTidakLulus = 0;
        double rata2, rata2TidakLulus;
        int counter = 0, counter2 = 0;
        byte x;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        x = input.nextByte();
        int[] nilaiMhs = new int[x];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                counter++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                counter2++;
            }
        }

        rata2 = totalLulus/counter;
        rata2TidakLulus = totalTidakLulus/counter2;
        System.out.println("Rata-rata nilai lulus = "+rata2);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
        System.out.println("Banyaknya mahasiswa yang lulus(nilai > 70): "+counter);

        input.close();
    }
}