import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Program rata-rata nilai
 */
public class Latihan21 {
   public static void main(String[] args) {
        int i;
        float rata2, nilai,jumlah;
        i=1;
        jumlah=0;
       System.out.print("Masukan Banyaknya Mahasiswa :" );
       int mahasiswa = new Scanner(System.in).nextInt();
       while (i<=mahasiswa) {
        System.out.print("Nilai Mahasiswa Ke-"+i+" = " );
        nilai = new Scanner(System.in).nextFloat();
        jumlah += nilai;
        i++;
        
       }

       rata2 = jumlah/mahasiswa;
       System.out.print("Nilai Rata-rata Mahasiswa = " + rata2 );
   }
}
