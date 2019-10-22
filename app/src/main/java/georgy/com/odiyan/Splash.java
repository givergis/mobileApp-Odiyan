package georgy.com.odiyan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    MediaPlayer mpl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        MediaPlayer mpl = MediaPlayer.create(Splash.this,R.raw.odiyanbgm);
        mpl.start();

        Handler handler=new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(Splash.this,OdiyanMainActivity.class));
                finish();
            }
        },9500 );
    }
    @Override
    protected void onPause() {
        super.onPause();
        mpl.release();
    }
}
