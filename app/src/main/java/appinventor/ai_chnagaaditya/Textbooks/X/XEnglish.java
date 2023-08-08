package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import androidx.appcompat.widget.Toolbar;

import appinventor.ai_chnagaaditya.Textbooks.Intro;
import appinventor.ai_chnagaaditya.Textbooks.R;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.NavFragment;

public class XEnglish extends AppCompatActivity {

    LinearLayout tb, sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xenglish);

        tb = findViewById(R.id.tb);
        sr = findViewById(R.id.sr);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XEnglish.this, Intro.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(XEnglish.this, XETB.class);
                startActivity(intent);
            }
        });

        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(XEnglish.this, XSR.class);
                startActivity(intent);
            }
        });
    }
}
