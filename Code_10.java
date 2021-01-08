import javax.swing.*;

class Code_10{
	public static void main (String args[]){
		//deklarasi variable
		String strNilai,strGenapGanjil;
		int nilai;

		//Input nilai strNilai dari kotak dialog input
		strNilai = JOptionPane.showInputDialog(null,"Masukkan nilai integer","Genap atau Ganjil",JOptionPane.QUESTION_MESSAGE);

		//Mengkonvensi nilai string keinteger
		nilai = Integer.parseInt(strNilai);

		//Menentukan apakah genap atau ganjil
		if(nilai %2==0){
			strGenapGanjil = "Bilangan Genap";
		}else{
			strGenapGanjil = "Bilangan Ganjil";
		}

		//Menampilkan hasil dari di kotak dialog pesan
		JOptionPane.showMessageDialog(null,"Nilai"+nilai+" adalah "+strGenapGanjil,"Genap atau Ganjil",JOptionPane.INFORMATION_MESSAGE);

		//Mengakhiri aplikasi GUI
		System.exit(0);
	}
}

