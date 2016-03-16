package com.example.jaykayitare.rebel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {

    private String url = "http://lecrae.gobigwin.com/";
    private String urlAmazon = "http://www.amazon.com/Lecrae/e/B00QVNRK9O/ref=sr_ntt_srch_lnk_2?qid=1458120060&sr=8-2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy2);
        TextView buy = (TextView)findViewById(R.id.buyfromweb);
        TextView buyamazon = (TextView)findViewById(R.id.buyAmazon);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl(url);
            }
        });
        buyamazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl(urlAmazon);
            }
        });
    }
    private void openUrl(String url){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
}
