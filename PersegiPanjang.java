
package bangundatar;

public class PersegiPanjang extends BangunDatar{
    double panjang, lebar;
    
    @Override
    double luas(){
        System.out.print("Masukkan p : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan l : ");
        lebar = input.nextDouble();
        return panjang * lebar ;
    }
     
    @Override
    double keliling(){
        return 2 * ( panjang + lebar);
    }
    
}
