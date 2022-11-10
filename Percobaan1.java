import java.util.Scanner;

public class Percobaan1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int bil;

		System.out.println("Masukkan Angka : ");
		bil = input.nextInt();

		//perintah dirubah
		
		String output=(bil%2==0) ?"Bilangan Genap" : "Bilangan Ganjil";
		System.out.println(output);
		
		// perintah Asli

		//if (bil%2 == 0){
			//System.out.println("Bilangan Genap");
		//} else{
		//	System.out.println("Bilangan Ganjil");
		//}
	}
}