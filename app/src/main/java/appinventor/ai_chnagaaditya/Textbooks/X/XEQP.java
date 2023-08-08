package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2016;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2017;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2018;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2019;
import appinventor.ai_chnagaaditya.Textbooks.Qpaper_fragments.XE2020;
import appinventor.ai_chnagaaditya.Textbooks.R;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Civics;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Economics;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Geography;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.History;

public class XEQP extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xeqp);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu_qp);
        chipNavigationBar.setItemSelected(R.id.bottom_nav_2020, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_qp,new XE2020()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i){
                    case R.id.bottom_nav_2020:
                        fragment = new XE2020();
                        break;

                    case R.id.bottom_nav_2019:
                        fragment = new XE2019();
                        break;

                    case R.id.bottom_nav_2018:
                        fragment = new XE2018();
                        break;

                    case R.id.bottom_nav_2017:
                        fragment = new XE2017();
                        break;

                    case R.id.bottom_nav_2016:
                        fragment = new XE2016();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_qp, fragment).commit();

            }
        });



    }
}
