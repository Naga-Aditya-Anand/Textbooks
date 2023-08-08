package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import appinventor.ai_chnagaaditya.Textbooks.R;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Civics;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Economics;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Geography;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.History;

public class XSocial extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xsocial);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu_soc);
        chipNavigationBar.setItemSelected(R.id.bottom_nav_his, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_soc,new History()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i){
                    case R.id.bottom_nav_his:
                        fragment = new History();
                        break;

                    case R.id.bottom_nav_geo:
                        fragment = new Geography();
                        break;

                    case R.id.bottom_nav_civ:
                        fragment = new Civics();
                        break;

                    case R.id.bottom_nav_eco:
                        fragment = new Economics();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_soc, fragment).commit();

            }
        });



    }
}
