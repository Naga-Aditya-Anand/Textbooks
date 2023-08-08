package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2020;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSS2016;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSS2017;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSS2018;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSS2019;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSS2020;
import appinventor.ai_chnagaaditya.Textbooks.R;

public class XSSQP extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xssqp);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu_ssqp);
        chipNavigationBar.setItemSelected(R.id.bottom_nav_2020, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_ssqp,new XSS2020()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i){
                    case R.id.bottom_nav_2020:
                        fragment = new XSS2020();
                        break;

                    case R.id.bottom_nav_2019:
                        fragment = new XSS2019();
                        break;

                    case R.id.bottom_nav_2018:
                        fragment = new XSS2018();
                        break;

                    case R.id.bottom_nav_2017:
                        fragment = new XSS2017();
                        break;

                    case R.id.bottom_nav_2016:
                        fragment = new XSS2016();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_ssqp, fragment).commit();

            }
        });



    }
}
