package com.jijunpeng.sample.app;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jijunpeng.androidutils.library.AppUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        text.append("\n");
        text.append("VersionnName: " + AppUtil.getVersionName(this));
        text.append("\n");
        text.append("VersionCode: " + AppUtil.getVersionCode(this));
        text.append("\n");
        Point point = AppUtil.getScreenSize(this);
        text.append("Width & Height: " + point.x + " & " + point.y);
    }
}
