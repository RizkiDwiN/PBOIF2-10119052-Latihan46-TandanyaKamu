package pboif2.pkg10119052.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program tandanya kamu berbasis objek
 * 
 */
public class PBOIF210119052Latihan46TandanyaKamu {
    public static int yearnow, umur;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        yearnow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearnow);
        System.out.println("masukkan tahun lahir anda :");
        age.setYearbirth( scanner.nextInt());
        System.out.println("==========hasil perhitungan umur============");
        System.out.println("tahun lahir anda: "+age.getYearbirth());
        System.out.println("hari ini tahun: "+age.getYearnow());
        System.out.println("umur kamu samapai hari ini adalah "+age.hitungUmur()+"tahun");
        System.out.println("tandanya kamu "+age.tandanyakamu(umur));
    }
    
}
