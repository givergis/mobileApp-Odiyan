package georgy.com.odiyan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OdiyanMainActivity extends AppCompatActivity {
    Button game,wallpaper,lyrics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odiyan_main);

        game =(Button) findViewById(R.id.button4);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(OdiyanMainActivity.this,PuzzleActivity.class);
                startActivity(i);
            }
        });
        wallpaper=(Button) findViewById(R.id.button);
        wallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OdiyanMainActivity.this,WallpaperActivity.class);
                startActivity(i);
            }
        });
        lyrics=(Button) findViewById(R.id.button2);
        lyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OdiyanMainActivity.this,LyricsActivity.class);
                startActivity(i);
            }
        });
    }


}
