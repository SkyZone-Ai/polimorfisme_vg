
package contohPolimorfisme;


public class main {
    
    
    public static void main(String[] args){
        BangunDatar bangunDatar = new BangunDatar();
        persegi Persegi = new persegi(4);
        segitiga Segitiga = new segitiga(6,3);
        lingkaran Lingkaran = new lingkaran(50);
        
       bangunDatar.luas();
       bangunDatar.keliling();
       
        System.out.println("Luas persegi : " + Persegi.luas());
        System.out.println("Keliling persegi : " + Persegi.keliling());
        System.out.println("Luas segitiga : " + Segitiga.luas());
        System.out.println("Luas lingkaran : " + Lingkaran.luas());
        System.out.println("Keliling lingkaran : " + Lingkaran.keliling());
    }
}
