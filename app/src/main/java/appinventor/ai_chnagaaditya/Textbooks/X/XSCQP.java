package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2020;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSC2016;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSC2017;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSC2018;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSC2019;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XSC2020;
import appinventor.ai_chnagaaditya.Textbooks.R;

public class XSCQP extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xscqp);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu_scqp);
        chipNavigationBar.setItemSelected(R.id.bottom_nav_2020, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_scqp,new XSC2020()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i){
                    case R.id.bottom_nav_2020:
                        fragment = new XSC2020();
                        break;

                    case R.id.bottom_nav_2019:
                        fragment = new XSC2019();
                        break;

                    case R.id.bottom_nav_2018:
                        fragment = new XSC2018();
                        break;

                    case R.id.bottom_nav_2017:
                        fragment = new XSC2017();
                        break;

                    case R.id.bottom_nav_2016:
                        fragment = new XSC2016();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_scqp, fragment).commit();

            }
        });



    }
}
