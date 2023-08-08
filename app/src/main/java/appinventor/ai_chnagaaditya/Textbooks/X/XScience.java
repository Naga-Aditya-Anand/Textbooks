package appinventor.ai_chnagaaditya.Textbooks.X;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import appinventor.ai_chnagaaditya.Textbooks.R;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Biology;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Chemistry;
import appinventor.ai_chnagaaditya.Textbooks.fragments_nav.Physics;

public class XScience extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xscience);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu_sci);
        chipNavigationBar.setItemSelected(R.id.bottom_nav_chem, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_sci,new Chemistry()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i){
                    case R.id.bottom_nav_chem:
                        fragment = new Chemistry();
                        break;

                    case R.id.bottom_nav_phy:
                        fragment = new Physics();
                        break;

                    case R.id.bottom_nav_bio:
                        fragment = new Biology();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatainer_sci, fragment).commit();

            }
        });



    }

}
