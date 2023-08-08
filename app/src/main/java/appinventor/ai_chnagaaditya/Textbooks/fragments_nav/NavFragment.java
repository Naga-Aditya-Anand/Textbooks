package appinventor.ai_chnagaaditya.Textbooks.fragments_nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import appinventor.ai_chnagaaditya.Textbooks.R;
import appinventor.ai_chnagaaditya.Textbooks.X.XEnglish;
import appinventor.ai_chnagaaditya.Textbooks.X.XHindi;
import appinventor.ai_chnagaaditya.Textbooks.X.XMaths;
import appinventor.ai_chnagaaditya.Textbooks.X.XScience;
import appinventor.ai_chnagaaditya.Textbooks.X.XSocial;
import appinventor.ai_chnagaaditya.Textbooks.X.XTelugu;


public class NavFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    static final float END_SCALE = 0.7f;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    LinearLayout contentView;



    CardView english, maths, science, social, hindi, telugu;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_nav, container, false);


        menuIcon = view.findViewById(R.id.menu_icon);
        contentView = view.findViewById(R.id.content);


        drawerLayout = view.findViewById(R.id.drawer_layout);
        navigationView = view.findViewById(R.id.navigation_view);

        naviagtionDrawer();


        english = view.findViewById(R.id.englishcard);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XEnglish.class);
                startActivity(intent);
            }
        });

        maths = view.findViewById(R.id.mathscard);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XMaths.class);
                startActivity(intent);
            }
        });

        science = view.findViewById(R.id.sciencecard);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XScience.class);
                startActivity(intent);
            }
        });

        social = view.findViewById(R.id.socialcard);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XSocial.class);
                startActivity(intent);
            }
        });

        hindi = view.findViewById(R.id.hindicard);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XHindi.class);
                startActivity(intent);
            }
        });

        telugu = view.findViewById(R.id.telugucard);
        telugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), XTelugu.class);
                startActivity(intent);
            }
        });


        return view;


    }

    private void naviagtionDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);

                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }

        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home:
                try {
                    Toast.makeText(getActivity(), "You are on Home", Toast.LENGTH_SHORT).show();
                }catch (Exception e) {
                    Toast.makeText(getActivity(), "You are on Home", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.nav_share:

                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "Handy X CBSE");
                    i.putExtra(Intent.EXTRA_TEXT, "Hey! Download the Handy X CBSE App now:- https://play.google.com/store/apps/details?id=appinventor.ai_chnagaaditya.Textbooks");
                    startActivity(Intent.createChooser(i, "Share With"));
                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Unable to Share this App", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.nav_rate:
                try {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=appinventor.ai_chnagaaditya.Textbooks");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Unable to rate this App", Toast.LENGTH_SHORT).show();
                }
                break;



        }
        return true;
    }


}
