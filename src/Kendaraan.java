
public class Kendaraan {
    //abstract termasuk class
    //cara menggunakan abstract harus pake extends
    
    String merk;//abstract diperbolehkan mendefinisikan variabel tanpa nilai
    private int tahun;//abstract diperbolehkan menggunkan modifier private
    protected String warna;//abstract diperbolehkan menggunakan modifier protected
    
    abstract void infoKendaraan();//method yang menggunakan keyword abstract hanya dituliskan header method
    
    //abstract memperbolehkan method dengan implementasi program
    void printKendaraan(){
        
    }
}
