import javax.swing.JOptionPane;

class Code_06
{
	public static void main(String args[])
	{
		//membuat variabel constanta
		final double PHI = 3.14159;

		//membuat variabel rumus
		int jari2;
		double luas;

		//memberi nilai awal
		jari2 = 7;

		luas = PHI * jari2 * jari2;

		JOptionPane.showMessageDialog(null,"Jari - jari lingkaran : "+jari2+"\nLuas Lingkaran = "+luas,"Menghitung Luas",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
