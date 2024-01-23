
package bangundatar;
public class Main {
    
    public static void main(String[] args) {
        //Buat Objek
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 100 ;
        
        Persegi persegi = new Persegi();
        persegi.sisi = 3 ;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10 ;
        persegiPanjang.lebar = 4 ;
        
        Segitiga segitiga = new Segitiga ();
        segitiga.alas = 10 ; 
        segitiga.tinggi = 12 ; 
        
        System.out.println("Luas Lingkaran \t\t: "+lingkaran.luas());
        System.out.println("Keliling Lingkaran \t: "+lingkaran.keliling()+"\n");
        
        System.out.println("Luas Persegi\t\t: "+persegi.luas());
        System.out.println("Keliling Persegi\t: "+persegi.keliling()+"\n");
        
        System.out.println("Luas Persegi Panjang\t\t: "+persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang\t: "+persegiPanjang.keliling()+"\n");
        
        System.out.println("Luas Segitiga\t\t: "+segitiga.luas());
//        System.out.println("Keliling Segitiga\t: "+persegiPanjang.keliling());
        
        
    }
    
}
