
package bangundatar;

public class Lingkaran extends BangunDatar{
    
    double r ;
    
    @Override
    double luas(){
        System.out.print("Masukkan r : ");
        r = input.nextDouble();
        return Math.PI * r + r  ;
    }
     
    @Override
    double keliling(){
        return 2 * Math.PI * r ;
    }
    
}
