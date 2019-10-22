package georgy.com.odiyan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LyricsActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
        btn1=(Button)findViewById(R.id.lyrics1);
        btn2=(Button)findViewById(R.id.lyrics2);
        btn3=(Button)findViewById(R.id.lyrics3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LyricsActivity.this,Lyrics1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LyricsActivity.this,Lyrics2.class);
                startActivity(i);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LyricsActivity.this,Lyrics3.class);
                startActivity(i);
            }
        });


    }
}
