package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import appinventor.ai_chnagaaditya.Textbooks.Intro;
import appinventor.ai_chnagaaditya.Textbooks.R;

public class XHindi extends AppCompatActivity {

    LinearLayout rd, pt, nd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xhindi);

        rd = findViewById(R.id.tb);
        pt = findViewById(R.id.poetry);
        nd = findViewById(R.id.nd);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XHindi.this, Intro.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(XHindi.this, Reader.class);
                startActivity(intent);
            }
        });

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(XHindi.this, Poetry.class);
                startActivity(intent);

            }
        });

        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(XHindi.this, Nondetail.class);
                startActivity(intent);
            }
        });
    }
}
