package com.quantum.gogagaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        toolbar=findViewById( R.id. toolbar );
        toolbar.setTitle( "Profile Setting" );
        toolbar.setTitleTextColor( Color.parseColor( "#F36D34") );



    }
}
