import javax.swing.JOptionPane;

class Code_15{
	public static void main (String args[]){
		int jumlah= 0,angka = 0;
		String deretAngka = "Deret angka : ";

		while(angka <= 50){
			angka++;
			jumlah += angka;
			deretAngka += angka+" ";
			if(jumlah > 125){
				break;
			}
		}

		deretAngka += "\nJumlah Deret Angka : "+jumlah;

		JOptionPane.showMessageDialog(null,deretAngka,"Penjumlahan deret angka",JOptionPane.INFORMATION_MESSAGE);

		//mengakhiri program GI
		System.exit(0);
	}
}