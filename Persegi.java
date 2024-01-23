
package bangundatar;

public class Persegi extends BangunDatar{
    
    double sisi;
    
    @Override
    double luas(){System.out.print("Masukkan s : ");
        sisi = input.nextDouble();
        return sisi * sisi  ;
    }
     
    @Override
    double keliling(){
        return 4 * sisi;
    }
    
}
