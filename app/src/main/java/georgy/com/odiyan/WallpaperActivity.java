package georgy.com.odiyan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WallpaperActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(WallpaperActivity.this,SetWallpaper.class);
                String pathPic="wall2";
                i.putExtra("Path_Pic",pathPic);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(WallpaperActivity.this,SetWallpaper.class);
                String pathPic="wall3";
                i.putExtra("Path_Pic",pathPic);
                startActivity(i);
            }
        });
    }
}
