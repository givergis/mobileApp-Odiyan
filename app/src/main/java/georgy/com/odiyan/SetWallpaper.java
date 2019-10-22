package georgy.com.odiyan;

import android.app.WallpaperManager;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;

public class SetWallpaper extends AppCompatActivity {
   RelativeLayout wallpaper_preview;
   Button set;
   String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);
        wallpaper_preview=findViewById(R.id.wallpaper_preview);
        set=(Button)findViewById(R.id.set_wall);

        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null){
                newString=null;
                }else{
                newString=extras.getString("Path_Pic");

                if(newString.equals("wall2")){
                    wallpaper_preview.setBackgroundResource(R.drawable.wal1);
                    set.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wall= WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Wallpaper Changed",Toast.LENGTH_SHORT).show();
                            try{
                                wall.setResource(+ R.drawable.wall2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                    }else{
                    wallpaper_preview.setBackgroundResource(R.drawable.wall3);
                    set.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wall= WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Wallpaper Changed",Toast.LENGTH_SHORT).show();
                            try{
                                wall.setResource(+ R.drawable.wall3);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        }
    }
}
