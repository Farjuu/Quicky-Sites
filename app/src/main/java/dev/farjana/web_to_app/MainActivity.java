package dev.farjana.web_to_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
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

        GridReyclerAdapter gridReyclerAdapter = new GridReyclerAdapter(siteImagesArrayList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(gridReyclerAdapter);

    }


    // Adding site images in arraylist
    private void addSitesInArrayList() {

        siteImagesArrayList = new ArrayList<>();
        siteImagesArrayList.add(new SiteImages(R.mipmap.google2, "https://www.google.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.wikipedia, "https://www.wikipedia.org"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.yahoo, "https://www.yahoo.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.bing, "https://www.bing.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.gmail, "https://www.gmail.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.googlemeet, "https://meet.google.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.dropbox, "https://www.dropbox.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.drive, "https://www.drive.google.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.git, "https://www.github.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.fb, "https://www.facebook.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.linkin, "https://www.linkedin.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.twitter, "https://www.twitter.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.insta, "https://www.instagram.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.amazon, "https://www.amazon.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.netflix, "https://www.netflix.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.upwork, "https://www.upwork.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.fiver, "https://www.fiverr.com"));
        siteImagesArrayList.add(new SiteImages(R.mipmap.paypal, "https://www.paypal.com"));


    }


    private void initializeAll() {

        recyclerView = findViewById(R.id.siteRecycler);


    }

}