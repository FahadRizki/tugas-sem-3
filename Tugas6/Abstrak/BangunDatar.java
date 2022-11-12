
package Tugas6.Abstrak;


public abstract class BangunDatar {
    String warna;
    
    String getWarna(){
        return warna;
    }
    
    void setWarna(String warna){
        this.warna = warna;
    }
    
    abstract float getLuas();
    
}
