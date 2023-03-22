/* NIM		  : 13020210026
   Nama	 	  : Ida Mawaddah Nur
   Hari/Tanggal	  : Kamis/16 Maret 2023
   Waktu Pengerjaan : 14:40 */


import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {

/**
* @param args
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int a, b;
	Scanner masukan=new Scanner(System.in);
	/* Program */
	System.out.print ("Maksimum dua bilangan : \n"); 
	System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
 

	a=masukan.nextInt();
	b=masukan.nextInt();
	System.out.println ("Ke dua bilangan :  a = "+ a+" b = "+b);
	if (a >= b){
		System.out.println ("Nilai a yang maksimum  "+ a);
	}else /* a > b */{
		System.out.println ("Nilai b yang maksimum: "+ b); 
	}
}

}

