package appinventor.ai_chnagaaditya.Textbooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {


    private static int SPLASH_SCREEN = 1500;



    Animation topAnim, sideAnim, bottomAnim, fadein;
    ImageView logo;
    TextView slogan, caution;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        sideAnim = AnimationUtils.loadAnimation(this, R.anim.right_to_left_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo = findViewById(R.id.imageView);
        slogan = findViewById(R.id.textView);
        caution = findViewById(R.id.textView2);

        logo.setAnimation(fadein);
        slogan.setAnimation(fadein);
        caution.setAnimation(fadein);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Intro.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);


    }


}
