import javax.swing.JOptionPane;
import java.text.DecimalFormat;


class Code_12{
	public static void main(String args[]){

		//deklarasi variabel
		int jmlPelajaran,perulangan;
		String strJmlPelajaran,strNilai;
		double nilai,jml,rata2;

		//Memberikan nilai awal ke variabel
		perulangan = 1;
		jml = 0;

		//input jumlah siswa

		strJmlPelajaran = JOptionPane.showInputDialog(null,"Masukkan Jumlah Pelajaran : ","Jumlah Pelajaran",JOptionPane.QUESTION_MESSAGE);


		//KONVERSI KE INTEGER
		jmlPelajaran = Integer.parseInt(strJmlPelajaran);
		if(jmlPelajaran <1){
			System.exit(0);
		}

		//input nilai siswa
		while(perulangan <= jmlPelajaran){
			strNilai = JOptionPane.showInputDialog(null,"Masukkan nilai pelajaran ke "+perulangan,"Nilai Pelajaran",JOptionPane.INFORMATION_MESSAGE);

			//konvensi nilai
			nilai = Double.parseDouble(strNilai);
			jml += nilai;
			perulangan++;
		}//akhiri peryataan while

		//membuat objekuntuk memformat angka
		DecimalFormat duaAngka = new DecimalFormat("0.00");

		rata2 = jml/jmlPelajaran;

		JOptionPane.showMessageDialog(null,"Jumlah pelajran : "+jmlPelajaran+"\nTotal nilai pelajaran : "+duaAngka.format(jml)+"\nNilai rata-rata : "+duaAngka.format(rata2),"Nilai Rata-rata Siswa",JOptionPane.INFORMATION_MESSAGE);

		//MENGAKHIRI PROGRAM
		System.exit(0);

	}
}
