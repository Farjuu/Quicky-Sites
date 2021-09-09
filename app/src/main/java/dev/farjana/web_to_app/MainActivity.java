package dev.farjana.web_to_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<SiteImages> siteImagesArrayList;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeAll();
        addSitesInArrayList();
        createGridview();


    }

    private void createGridview() {

        GridReyclerAdapter gridReyclerAdapter = new GridReyclerAdapter(siteImagesArrayList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(gridReyclerAdapter);

    }


    // Adding site images in arraylist
    private void addSitesInArrayList() {

        siteImagesArrayList = new ArrayList<>();
        siteImagesArrayList.add(new SiteImages(R.mipmap.google,"https://www.google.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.wikipedia,"https://www.wikipedia.org"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.gmail,"https://www.gmail.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.dropbox,"https://www.dropbox.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.fb,"https://www.facebook.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.youtube,"https://www.youtube.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.linkin,"https://www.linkedin.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.twitter,"https://www.twitter.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.insta,"https://www.instagram.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.snapchat,"https://www.snapchat.com/"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.whatsapp,"https://www.whatsapp.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.github,"https://www.github.com"));



    }



    private void search() {


            Intent intent = new Intent(getApplicationContext(), WebViewScreen.class);
            intent.putExtra("urlText","www.google.com");
            startActivity(intent);

    }

    private void initializeAll() {

        recyclerView = findViewById(R.id.siteRecycler);


    }

}