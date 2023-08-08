package appinventor.ai_chnagaaditya.Textbooks.fragments_nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import appinventor.ai_chnagaaditya.Textbooks.Intro;
import appinventor.ai_chnagaaditya.Textbooks.R;


public class Biology extends Fragment {

    LinearLayout ch1, ch2, ch3, ch4, ch5, ch6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_biology, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Intro.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        ch1 = view.findViewById(R.id.ch1);
        ch2 = view.findViewById(R.id.ch2);
        ch3 = view.findViewById(R.id.ch3);
        ch4 = view.findViewById(R.id.ch4);
        ch5 = view.findViewById(R.id.ch5);
        ch6 = view.findViewById(R.id.ch6);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123809/jesc106.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123749/jesc107.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123742/jesc108.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123730/jesc109.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123610/jesc115.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://d2cyt36b7wnvt9.cloudfront.net/exams/wp-content/uploads/2019/08/08123558/jesc116.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return view;





    }





}
