import javax.swing.JOptionPane;

class Code_14{
	public static void main (String args[]){

		String asterik ="";
		for(int x = 1;x<=7;x++){
			//pernyataan for bersarang
			for(int y = 0;y < x;y++){
				asterik +="* ";
			}
			asterik+="\n";
		}
		JOptionPane.showMessageDialog(null,asterik,"Gambar Segitiga siku - siku",JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}