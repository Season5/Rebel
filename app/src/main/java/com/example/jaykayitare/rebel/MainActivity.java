package com.example.jaykayitare.rebel;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.jaykayitare.rebel.fragment.AudioFragment;
import com.example.jaykayitare.rebel.fragment.ContentFragment;

import java.util.ArrayList;
import java.util.List;

import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;
import yalantis.com.sidemenu.interfaces.Resourceble;
import yalantis.com.sidemenu.interfaces.ScreenShotable;
import yalantis.com.sidemenu.model.SlideMenuItem;
import yalantis.com.sidemenu.util.ViewAnimator;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    Button about, buy, audio, video;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = (Button)findViewById(R.id.aboutbutton);
        buy = (Button)findViewById(R.id.buybutton);
        audio = (Button)findViewById(R.id.audiobutton);
        video = (Button)findViewById(R.id.videobutton);

        about.setOnClickListener(this);
        buy.setOnClickListener(this);
        audio.setOnClickListener(this);
        video.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buybutton:
                intent = new Intent(this, BuyActivity.class);
                startActivity(intent);
                break;
            case R.id.aboutbutton:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.videobutton:
                intent = new Intent(this, YouTubeActivity.class);
                startActivity(intent);
                break;
            case R.id.audiobutton:
                intent = new Intent(this, AudioActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}