package com.sunlion.slidingtutorial.support;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sunlion.slidingtutorial.R;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static void start(Context context){
        context.startActivity(new Intent(context,MainActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bRetry).setOnClickListener(this);
        if(savedInstanceState == null){
            replaceTutorialFragment();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bRetry:
                replaceTutorialFragment();
                break;
        }
    }

    private void replaceTutorialFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new CustomTutorialSupportFragment())
                .commit();
    }

}
