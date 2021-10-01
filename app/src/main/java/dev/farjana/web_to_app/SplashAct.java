package dev.farjana.web_to_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import de.hdodenhof.circleimageview.CircleImageView;

public class SplashAct extends AppCompatActivity {

    CircleImageView splashImageView;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashImageView = findViewById(R.id.splashImage);


        Intent receiverIntent = getIntent();
        String searchUrl = receiverIntent.getStringExtra("Url");
        int imageId = receiverIntent.getIntExtra("ImageId", 1);

        splashImageView.setImageResource(imageId);

        handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(SplashAct.this, WebViewScreen.class);
            intent.putExtra("Url", searchUrl);
            startActivity(intent);
            finish();
        }, 3000);


    }
}