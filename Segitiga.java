
package bangundatar;

public class Segitiga extends BangunDatar{
    double alas, tinggi;
    
    double luas(){
        System.out.print("Masukkan a : ");
        alas = input.nextDouble();
        System.out.print("Masukkan t : ");
        tinggi = input.nextDouble();
        return alas * tinggi * 1/2  ;
    }
    
}
