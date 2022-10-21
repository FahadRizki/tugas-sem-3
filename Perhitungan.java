
package TugasSem3;


public class Perhitungan {
     public int tambah(int x, int y) {
        return x + y;
    }

    public float tambah(float x, float y){
        return x + y;
    }

    public double tambah(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        Perhitungan per = new Perhitungan();

        System.out.println(per.tambah(25, 25));
        System.out.println(per.tambah(5.8, 12.4));
        System.out.println(per.tambah(8.24,556));
    }

    private static class Pertambahan {

        public Pertambahan() {
        }
    }
    
}
