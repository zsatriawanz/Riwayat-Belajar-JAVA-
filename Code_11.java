import javax.swing.JOptionPane;

class Code_11{
	public static void main (String args[]){
		//deklarasi variable
		String strHari,strNilai;
		int nilai;

		//input nilai unteger 1 - 7
		strNilai = JOptionPane.showInputDialog(null,"Masukkan nilai integer atara 1 -7 : \nantara 1 - 7","Intger ke Nama Hari ",JOptionPane.QUESTION_MESSAGE);

		//konvensi ke integer
		nilai = Integer.parseInt(strNilai);

		//jika nilai yang diinput salah keluar
		if(nilai < 1 || nilai > 7){
			System.exit(0);
		}

		//menginisisasi variabel strHari
		strHari = "Senin";

		//menyeleksi dengan switch
		switch(nilai){
			case 1 : strHari = "Senin";break;
			case 2 : strHari = "Selasa";break;
			case 3 : strHari = "Rabu";break;
			case 4 : strHari = "Kamis";break;
			case 5 : strHari = "Jumat";break;
			case 6 : strHari = "Sabtu";break;
			case 7 : strHari = "Minggu";break;
		}

		//menampilkan hasil
		JOptionPane.showMessageDialog(null,"Nilai Integer : "+nilai+"\nKonvensi ke Nama Hari "+strHari,"Integer Ke Nama HARI",JOptionPane.INFORMATION_MESSAGE);

		//MENGAKHIRI APLIKASI gui
		System.exit(0);
	}
}

