import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Code_13{
	public static void main (String args[]){

		//deklarasi variabel
		int data, perulangan = 0,jumlah = 0;
		double rata2;

		//Input data sampai nilai input 0;
		do{
			//input data selanjutnya
			String strData = JOptionPane.showInputDialog(null,"Masukkan nilai siswa(integer)"+"\nInput program berakhir jika input 0","Nilai Siswa",JOptionPane.QUESTION_MESSAGE);

			data = Integer.parseInt(strData);
			jumlah+=data;
			if(data != 0){
				perulangan +=1;
			}

		}while(data != 0);

		//membuat objek dari kelas Decimal Format
		DecimalFormat duaAngka = new DecimalFormat("0.00");

		rata2 = (double) jumlah /perulangan;

		//menampilkan hasil
		JOptionPane.showMessageDialog(null,"Jumlah Nilai Diimput : "+perulangan+"\nTotal nilai diinpt :"+jumlah+"\nNilai rata-rata :"+duaAngka.format(rata2),"Nilai rata-rata",JOptionPane.INFORMATION_MESSAGE);

		//MENGAKHIRI PROGRAM GUI
		System.exit(0);
	}
}