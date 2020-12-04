//RPL Kel.12
//Belum Lengkap
import java.util.*;

public class OnlineShop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		String nama = "";
		String alamat = "";
		String noHP= "";
		int pilihPem = 0;
		int pilihJ = 0;
		int pilihP = 0;
		String pilihS = "";
		int pilihB = 0;
		long harga = 0;
		long total = 0;
		String lanjut = "";
		String text = "";

		System.out.println("**********************************************");
		System.out.println("\tSelamat Datang di Toko Kel12");
		System.out.println("**********************************************");

		System.out.println("Pilih Kategori Pakaian");
		System.out.println("1. Pakaian Wanita");
		System.out.println("2. Pakaian Laki-Laki");
		System.out.print("Masukkan Kode: ");
		int pilihK = input.nextInt();
		if(pilihK == 1){
			System.out.println("Pilih Brand");
			System.out.println("1. Zara");
			System.out.println("2. H&M");
			System.out.print("Masukkan Kode: ");
			pilihB = input.nextInt();

			if(pilihB == 1){
				System.out.println("");
				System.out.println("Pilih Produk");
				System.out.println("1. Meanswear Shirt");
				System.out.println("2. Paperbag Elastic Jeans");
				System.out.println("3. Cropped Top");
				System.out.print("Masukkan Kode: ");
				pilihP = input.nextInt();
				switch(pilihP){
					case 1:
					   harga = 150000;
					   break;
					case 2:
					   harga = 200000;
					   break;
					case 3: 
					   harga = 100000;
					   break;
				}
				System.out.println("");
				System.out.print("Masukkan Size(XL/L/M/S): ");
				pilihS = input.next();
				System.out.println("");
				System.out.print("Jumlah: ");
				pilihJ = input.nextInt();
				total +=(pilihJ*harga);
			}else if(pilihB == 2){
				System.out.println("");
				System.out.println("Pilih Produk");
				System.out.println("1. Alpaca Blend Sweater");
				System.out.println("2. Hoodie");
				System.out.println("3. Mom High Ankle Jeans");
				System.out.print("Masukkan Kode: ");
				pilihP = input.nextInt();
				switch(pilihP){
					case 1:
					   harga = 110000;
					   break;
					case 2:
					   harga = 100000;
					   break;
					case 3: 
					   harga = 150000;
				}
				System.out.println("");
				System.out.print("Masukkan Size(XL/L/M/S): ");
				pilihS = input.next();
				System.out.println("");
				System.out.print("Jumlah: ");
				pilihJ = input.nextInt();
				total +=(pilihJ*harga);
			}else{
				System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
			}
			
		}else if(pilihK == 2){
			System.out.println("Pilih Brand");
			System.out.println("1. Crocodile");
			System.out.println("2. Cardinal");
			System.out.print("Masukkan Kode: ");
			pilihB = input.nextInt();
			System.out.println("");
			if(pilihB == 1){
				System.out.println("Pilih Produk");
				System.out.println("1. Dale Ivory (Shirt)");
				System.out.println("2. Sloe Black (1 set)");
				System.out.println("3. Clas Gray (T-Shirt)");
				System.out.print("Masukkan Kode: ");
				pilihP = input.nextInt();
				switch(pilihP){
					case 1:
					   harga = 200000;
					   break;
					case 2:
					   harga = 100000;
					   break;
					case 3: 
					   harga = 150000;
					   break;
				}
				System.out.println("");
				System.out.print("Masukkan Size(XL/L/M/S): ");
				pilihS = input.next();
				System.out.print("Jumlah: ");
				pilihJ = input.nextInt();
				total +=(pilihJ*harga);
			}else if(pilihB == 2){
				System.out.println("Pilih Produk");
				System.out.println("1. Jeans Skinny");
				System.out.println("2. Jeans Jacket");
				System.out.println("3. Jeans Kemeja");
				System.out.print("Masukkan Kode: ");
				pilihP = input.nextInt();
				switch(pilihP){
					case 1:
					   harga = 300000;
					   break;
					case 2:
					   harga = 250000;
					   break;
					case 3: 
					   harga = 150000;
				}System.out.println("");
				System.out.print("Masukkan Size(XL/L/M/S): ");
				pilihS = input.next();
				System.out.println("");
				System.out.print("Jumlah: ");
				pilihJ = input.nextInt();
				total +=(pilihJ*harga);
			}else{
				System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
			}
		}
		System.out.println("");
		System.out.println("Masukkan Data Diri:");
		System.out.print("Nama: ");
		nama = input1.nextLine();
		System.out.print("No.Hp: ");
		noHP = input.next();
		System.out.print("Alamat: ");
		alamat =input1.nextLine();

		System.out.println("Jasa Pengiriman: J&T");
		System.out.println("");
		System.out.println("Pilih Jenis Pembayaran");
		System.out.println("1. ATM");
		System.out.println("2. VA");
		do{
			System.out.print("Masukkan Kode: ");
			pilihPem = input.nextInt();
			if (!(pilihPem == 1 ||pilihPem == 2)) {
				System.out.println("Maaf Kode Yang Anda Masukkan Salah. Silahkan Ulangi Kembali!");
			}
		}while(!(pilihPem == 1 ||pilihPem == 2));
		switch(pilihPem){
			case 1:
			text = "Lakukan Pembayaran Ke Rekening 0264146096/ a.n Kel.12 Bank BNI";
			break;
			case 2:
			text ="Lakukan Pembayaran Ke Virtual Account 123456/ a.n Kel.12 Bank BNI";
		}
	
		System.out.println("");
		System.out.println("Struk Pembayaran");
		System.out.println("Nama: " + nama);
		System.out.println("No. Hp: " + noHP);
		System.out.println("Alamat: " + alamat);
		System.out.println("Jumlah Barang: " + pilihJ);
		System.out.println("Total Pembayaran: " + total);

		System.out.println("");
		System.out.println(text);
		System.out.println("Silahkan lanjutkan pembayaran paling lambat 1*24 jam, jika lebih dari waktu yang ditentukan makan pesanan akan tercancel.");
		System.out.println("Terimaksih, Sudah Berbelanja.Semoga Hari Anda Menyenangkan ^-^");

	}

}