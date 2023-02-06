package com.example.junk1;

import static android.widget.Toast.makeText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button bt_p,bt_n;
    ImageView iv;
    boolean flag;
    int images[] = {R.drawable._1, R.drawable._2,R.drawable._3,R.drawable._4};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "App just created ";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = makeText(context, text, duration);
        toast.show();
        iv = (ImageView) findViewById(R.id.img);
        bt_p = (Button) findViewById(R.id.button_previous);
        bt_n = (Button) findViewById(R.id.button_next);
        flag = true;
        bt_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = (i-1) % images.length;
                if(i<0)
                    i += images.length;
                iv.setImageResource(images[i]);
            }
        });
        bt_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = (i+1) % images.length;
                iv.setImageResource(images[i]);
            }
        });
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://amazon.com");
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
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

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ACTIVITY PAUSED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ACTIVITY STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ACTIVITY DESTROYED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "ACTIVITY RESTART", Toast.LENGTH_SHORT).show();
    }
}
