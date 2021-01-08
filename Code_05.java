public class Code_05{

   public static void main(String[] args) {

      // Deklarasi dan memberi nilai awal ke variabel
      int x = 20, y = 10;
      boolean nilaiBoolean = false;

      // Deklarasi variabel
      int nilaiEkspresiSatu, nilaiEkspresiTiga, nilaiEkspresiEmpat;
      boolean nilaiEkspresiDua;

      // Memberi nilai ke variabel dengan ekspresi Java
      nilaiEkspresiSatu = 5 + x * 2 - x / 2 + (y - 2);
      nilaiEkspresiDua = !nilaiBoolean;
      nilaiEkspresiTiga = ++x - --y;
      nilaiEkspresiEmpat = 40 + x * y + 25;

      // Menampilkan nilai variabel hasil dari evaluasi ekspresi
      System.out.println();
      System.out.println("nilaiEkspresiSatu = " + nilaiEkspresiSatu);
      System.out.println("nilaiEkspresiDua = " + nilaiEkspresiDua);
      System.out.println("nilaiEkspresiTiga = " + nilaiEkspresiTiga);
      System.out.println("nilaiEkspresiEmpat = " + nilaiEkspresiEmpat);
   }
}
