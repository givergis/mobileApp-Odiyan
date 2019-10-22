package georgy.com.odiyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Lyrics1 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics1);
        TextView tv=(TextView)findViewById(R.id.t1);

        String msg="Odi Odi Odi Odiyaaa (5)\n" +
                "Enoruvan Mudiazhichingaadanu\n" +
                "Karirumbu Karimpanayaayi Aadanu\n" +
                "Kaatu Kaanaku Eeney Thottu Paadadi\n" +
                "Neettu Karimegha Pennayi Aadadi\n" +
                "\n" +
                "Enoruvan Mudiazhichingaadanu\n" +
                " Karirumbu Karimpanayaayi Aadanu\n" +
                " Kaatu Kaanaku Eeney Thottu Paadadi\n" +
                " Neettu Karimegha Pennayi Aadadi\n" +
                "\n" +
                " Vithu Molayatha Naadu Naadalla\n" +
                " Chotta Vidaraatha Thengu Thengalla\n" +
                " Chandiranillaatha Raavu Raavalla\n" +
                " Veedu Vittu Naadum Vittu Poradi\n" +
                "\n" +
                " Maaranam Cheythoru Doore Paayanu\n" +
                " Thooranamingaaruvannu Thookanu\n" +
                " Jeeraga Chempavu Njaaru Nookkanu\n" +
                " Chelaninju Nee Pathiye Pookanu\n" +
                "\n" +
                " Pacha Podiyatha Mannu Mannalla\n" +
                " (Mannalla)\n" +
                " Kachayulayatha Pennu Pennalla\n" +
                " Kutti Karayaatha Veedu Veedalla\n" +
                " (Veedalla)\n" +
                "\n" +
                " Koodu Vittu Koottam Vittu Poredi\n" +
                " (Poredi)\n" +
                " Pattilethu Maraneerin Chuzhaliyo\n" +
                " (Chuzhaliyo)\n" +
                " Neettiyathu Pananonkin Lahariyo\n" +
                " (Lahariyo)\n" +
                " Thenmmalayum Vanamalayum Chokkanu\n" +
                "\n" +
                " Cholamaramaayum Niyum Kaykanu\n" +
                " Enoruvan Mudiazhichingaadanu\n" +
                " Karirumbu Karimpanayaayi Aadanu\n" +
                " Kaatu Kaanaku Eeney Thottu Paadadi\n" +
                " Neettu Karimegha Pennayi Aadadi\n" +
                " Neettu Karimegha Pennayi Aadadi\n" +
                " Neettu Karimegha Pennayi Aadadi";
        tv.setText(msg);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
