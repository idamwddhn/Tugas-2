/* NIM		  : 13020210026
   Nama	 	  : Ida Mawaddah Nur
   Hari/Tanggal	  : Kamis/16 Maret 2023
   Waktu Pengerjaan : 14:34 */


import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */
public class Konstant {

/**
* @param args 
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
		final float PHI = 3.1415f;
		float r;
		Scanner masukan=new Scanner(System.in);
	/* program */ /* baca data */

		System.out.print ("Jari-jari lingkaran =");
		r = masukan.nextFloat();
	/* Hitung dan tulis hasil */
		System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");

		System.out.print ("Akhir program \n"); 

}
}
