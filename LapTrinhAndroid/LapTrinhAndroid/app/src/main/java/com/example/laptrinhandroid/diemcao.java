package com.example.laptrinhandroid;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class diemcao extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView font = (TextView) findViewById(R.id.Diem);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "PRISTINA.TTF");
        font.setTypeface(myTypeface);
    }
}
