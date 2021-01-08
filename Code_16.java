import javax.swing.JOptionPane;

class Code_16{
	public static void main(String args[]){
		//deklarasi variabel
		String tampil="";
		int hasil;

		//perulangan for

		for(int x = 1;x<=10;x++){
			hasil = hitungKuadrat(x);
			tampil += "Kuadrat dari "+x+" adalah "+hasil+"\n";
		}
		//akhir perulangan for
		JOptionPane.showMessageDialog(null,tampil,"Mencari Kuadrat",JOptionPane.INFORMATION_MESSAGE);
	}//AKHIR BLOK METODA MAIN

	//deklarasi metoda cari kuadrat
	public static int hitungKuadrat(int nilai){
		int nilaiKuadrat;
		nilaiKuadrat = nilai*nilai;
		return nilaiKuadrat;
	}//akhir block carikuadrat
}//akhir main