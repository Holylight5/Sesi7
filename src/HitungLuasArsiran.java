
import com.lingkaran.Lingkaran;
import com.segitiga.SegiTiga;

public class HitungLuasArsiran {
    public static void main(String[] args) {
        double luas_arsir;
        Lingkaran l = new Lingkaran(7);
        SegiTiga s = new SegiTiga (4,3);
        
        double luas_l = l.getluaslingkaran();
        double luas_s = s.getLuasSegiTiga();
        
        luas_arsir = luas_l - luas_s;
        
        System.out.println("Luas Arsirannya adalah "+ luas_arsir);
        
    }
}
