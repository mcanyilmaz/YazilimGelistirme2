/**
 * Created by Casper on 14.3.2017.
 */


import edu.tr.medipol.Hesap;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class HesapTest {
    @Test
    public void bolmeIslemi(){

        Hesap hesaplama = new Hesap();

        int sonuc = hesaplama.Bolme(10,5);
        assertTrue(sonuc == 2);
    }

    @Test
    public void bolmeIslemi2(){

        Hesap hesaplama = new Hesap();

        int sonuc2 = hesaplama.Bolme(100,25);
        assertTrue(sonuc2 == 4);


    }


}
