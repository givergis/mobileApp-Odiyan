package georgy.com.odiyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Lyrics2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics2);
        TextView tv=(TextView)findViewById(R.id.t1);

        String msg="Kondoram Kondoram\n" +
                "Kaitholappaaya Kondoram…\n" +
                "Kondovam Kondovam \n" +
                "Andhaylan Kaavil Kondovaam… \n" +
                "\n" +
                "Pullanikaadum Kaanam… \n" +
                "Vellambalpoovum Nullam… \n" +
                "Maanodum Mettil Kondovam… \n" +
                "Pennee… \n" +
                "\n" +
                "Kondoram Kondoram \n" +
                "Kaitholappaaya Kondoram… \n" +
                "\n" +
                "Odi Marayana Rakaatt… \n" +
                "Pana Meleyoroonjaal \n" +
                "Nizhaluklaalathililakum \n" +
                "Mudiyaattam Kandaa… \n" +
                "\n" +
                "Thirayuzhiyana Maanath \n" +
                "Nirapaathira Nerath \n" +
                "Mukilukalaal Pirakevarum \n" +
                "Maankoottam Kanda… \n" +
                "\n" +
                "Paalakalil Kaamam Pookkum\n" +
                "Dhanumaasanilaavum Chutti \n" +
                "Aalathoor Kaavil Kondovaam \n" +
                "Penne… \n" +
                "\n" +
                "Kondoram Kondoram \n" +
                "Kaitholappaaya Kondoram… \n" +
                "Thannare Thannare \n" +
                "Thannare Thannathannaare… \n" +
                "\n" +
                "Ee Mazhapozhiyana Nerath \n" +
                "Oru Chembila Marayath \n" +
                "Cherumanikal Vithariyidum \n" +
                "Kuliraadaan Pokam… \n" +
                "\n" +
                "Kaliyilakana Kaattath \n" +
                "Nadavazhiyude Orath \n" +
                "Mulayariyil Telimayezhum \n" +
                "Nin Kaaladi Kande \n" +
                "\n" +
                "Vaavalukal Theninu Paayum \n" +
                "Malavaazhathoppum Keri \n" +
                "Alanalloor Malayil Kondovam \n" +
                "Ponne \n" +
                "\n" +
                "Vannolam…Vannolam \n" +
                "Nee Chayum Koottil Vannolam… \n" +
                "Ninnolam Ninnolam \n" +
                "Nin Maaril Chaari Ninnolam \n" +
                "\n" +
                "Pullanikaadum Kanaam… \n" +
                "Vellambalpoovum Nullam \n" +
                "Therottam Kanaan \n" +
                "Vannolam…Aaa… \n" +
                "Penne… \n" +
                "\n" +
                "Kondoram Kondoram \n" +
                "Kaitholappaaya Kondoram… \n" +
                "Ninnolam Ninnolam \n" +
                "Nin Maaril Chaari Ninnolam\n" +
                "\n";
        tv.setText(msg);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
