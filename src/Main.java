import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Main {

	Vector<Data> Data = new Vector<>();

	void showDatakaryawans() {
		for (int i = 0; i < Data.size(); i++) {
			System.out.println((i + 1));
			System.out.println(Data.get(i).kode);
			System.out.println(Data.get(i).nama);
			System.out.println(Data.get(i).harga);
			System.out.println(Data.get(i).stok);
			System.out.println("");

		}
	}

	public Main() {
		int choose = 0;
		Scanner scan = new Scanner(System.in);

		Random g = new Random();
		String alphabet = "PD-123";
		for (int j = 0; j < 5; j++) {
			System.out.println(alphabet.charAt(j));
		}

		do {
			System.out.println("1.Input Data menu ");
			System.out.println("2.View data menu ");
			System.out.println("3.Update data menu ");
			System.out.println("4.Delete data Menu ");

			System.out.println(">>");
			choose = scan.nextInt();
			scan.nextLine();

			if (choose == 1) {
				String kode = "";
				String Nama = "";
				int Harga = 0;
				int Stok = 0;
			

				do {
					System.out.println("Input kode: ");
					kode = scan.nextLine();
				} while ((kode.length() < 5));

				do {
					System.out.println("Input Nama barang : ");
					Nama = scan.nextLine();
				} while ((Nama.length() < 4 || Nama.length() > 20 || Nama.split(" ").length < 2));

				do {System.out.println("Input harga  : ");
				Harga = scan.nextInt();
			}while (Harga < 0 || Harga > 100000);
					
				do {
					System.out.println("Input Stok : ");
					Stok = scan.nextInt();
				} while (Stok < 0 || Stok > 100000);

			
				Data d = new Data();
				d.kode = kode;
				d.nama = Nama;
				d.harga = Harga;
				d.stok = Stok;

				Data.add(d);

			} else if (choose == 2) {
				if (Data.isEmpty()) {
					System.out.println("no data!");

				} else {
					showData();
				}

			} else if (choose == 3) {
				if (Data.isEmpty()) {
					System.out.println("Tidak terupdate");
				} else {
					showDatakaryawans();
					int to_be_update = 0;

					do {
						System.out.println("Input Data yang ingin diupdate [1-" + Data.size() + "]: ");

						try {
							to_be_update = scan.nextInt();

						} catch (Exception j) {
							System.out.println("Input must be numeric");
						}
						scan.nextLine();
					} while (to_be_update < 1 || to_be_update > Data.size());
				}
				String nama = "" ;
				int harga = 0;
				int stok = 0;
				

				do {
					System.out.println("Input Nama barang  [ >=3 ]: ");
					nama = scan.nextLine();
				} while (nama.length() >= 3 == false);

				do {
					System.out.println("Input Harga: ");
					harga = scan.nextInt();
				}  while (harga < 0 || harga > 100000);

				do {
					System.out.println("Input Stok ");
					stok = scan.nextInt();
				} while (stok < 0 || stok > 100000);

				Data Data = new Data();
				showData();


			}else if (choose == 4) {
				if (Data.isEmpty()) {
					System.out.println("No data!");
				} else {
					showData();
					int to_be_delete = 0;

					do {
						System.out.println("Input Data yang ingin dihapus" + "[ 1- "
								+ Data.size() + "] [0 to cancel]: ");
						to_be_delete = scan.nextInt();
						scan.nextLine();
					} while (to_be_delete < 0 || to_be_delete > Data.size());
					if (to_be_delete != 0) {
						Data.remove(to_be_delete - 1);
					}
				}
			}

		} while (choose != 5);

	}
	private void showData() {
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
