package georgy.com.odiyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Lyrics3 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics3);
        TextView tv=(TextView)findViewById(R.id.t1);

        String msg="Maanam thudukkanu neram velukkanu\n" +
                "Kaanaan kothikkanu kannil\n" +
                "Thooval virikkanu kooval vilikkanu\n" +
                "Kaanaan thudikkanu neril...\n" +
                "\n" +
                "Njananinja pottu pole chonnirikkanu\n" +
                "Dhoore mele vannu ninna soory thevaru\n" +
                "Aattu notta minnumaala polirikkanu\n" +
                "Paathiraavin maarilulla ponnu thinkalu\n" +
                "\n" +
                "Kanavolikkanu nenjilu\n" +
                "Erul nirakkanu enthinu...\n" +
                "\n" +
                "Maanam thudukkanu neram velukkanu\n" +
                "Kaanaan kothikkanu kannil\n" +
                "Thooval virikkanu kooval vilikkanu\n" +
                "Kaanaan thudikkanu neril...\n" +
                "\n" +
                "Oodi oodi vanna paikkidaavu meyyil muttanu\n" +
                "Oottu monthakal kalambi ocha vekkanu\n" +
                "Paalu pole naalakathu veyilu thoovanu\n" +
                "Padi kadannu vanna paattu chaari nikkanu\n" +
                "\n" +
                "Ema mizhikkanu kannilu\n" +
                "Kari parathanu enthinu...\n" +
                "\n" +
                "Maanam thudukkanu neram velukkanu\n" +
                "Kaanaan kothikkanu kannil\n" +
                "Thooval virikkanu kooval vilikkanu\n" +
                "Kaanaan thudikkanu neril...";
        tv.setText(msg);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
