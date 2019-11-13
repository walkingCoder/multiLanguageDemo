package com.beijing.zzu.multilanguagedemo;

import android.app.Application;
import android.content.res.Configuration;

import com.beijing.zzu.multilanguagedemo.utils.MultiLanguageUtil;


/**
 * @author jiayk
 * @date 2019/11/13
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiLanguageUtil.init(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

}
