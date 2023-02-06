package com.example.junk2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ImageView iv;
    int images[]={R.drawable._1,R.drawable._2};
    WebView wv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context=getApplicationContext();
        iv=(ImageView) findViewById(R.id.imge);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        wv=(WebView) findViewById(R.id.web);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=(i-1)%images.length;
                //if(i<0) i+=images.length;
                iv.setImageResource(images[i]);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=(i+1)%images.length;
                iv.setImageResource(images[i]);
            }
        });
        wv.loadUrl("https://stackoverflow.com/questions/73463000/playing-an-asset-with-audioplayers-package-in-flutter#:~:text=First%20create%20an%20instance%20of,setSource%20method.");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        Toast.makeText(this, "ACTIVITY CREATED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "ACTIVITY RESTARTED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ACTIVITY DESTROYED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ACTIVITY STOPPED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ACTIVITY PAUSED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ACTIVITY STARTED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ACTIVITY RESUMED", Toast.LENGTH_SHORT).show();
    }
}
