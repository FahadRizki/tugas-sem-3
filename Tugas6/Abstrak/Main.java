
package Tugas6.Abstrak;


public class Main {
     public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(5,5);
        BangunDatar lingkaran = new Lingkaran(60);
        
        System.out.println("Luas dari bangun datar segitiga: " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar lingkaran: " + lingkaran.getLuas());
    }
}
