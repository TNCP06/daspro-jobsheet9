import java.util.Scanner;

public class week9TeoriNo3 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli"
                        ,"Agustus","September","Oktober","November","Desember"};

        System.out.print("Masukkan Bulan ke-");
        byte x = input27.nextByte();
        System.out.println("Bulan ke-"+x+" adalah bulan "+bulan[x-1]);

        input27.close();
    }
}