package com.sunlion.slidingtutorial;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Administrator on 2016/11/23 0023.
 */

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
          if(LeakCanary.isInAnalyzerProcess(this)){
              return;
          }
        LeakCanary.install(this);
    }
}
