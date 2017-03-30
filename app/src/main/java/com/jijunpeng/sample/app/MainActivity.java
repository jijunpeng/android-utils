package com.jijunpeng.sample.app;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jijunpeng.androidutils.library.AppUtil;
import com.jijunpeng.androidutils.library.ViewUtil;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        text.setText("");
        //version name
        addText("VersionnName: " + AppUtil.getVersionName(this));
        //version code
        addText("VersionCode: " + AppUtil.getVersionCode(this));
        //screen width & height
        Point point = AppUtil.getScreenSize(this);
        addText("Width & Height: " + point.x + " & " + point.y);

        //status bar height
        addText("Status bar height: " + AppUtil.getStatusBarHeight(this));

        addText("Text View Parent: " + ViewUtil.getParentView(text));
        addText("IMEI: " + AppUtil.getDeviceIMEI(this, "999999999"));
    }

    private void addText(String string) {
        text.append("\n");
        text.append(string);
    }
}
