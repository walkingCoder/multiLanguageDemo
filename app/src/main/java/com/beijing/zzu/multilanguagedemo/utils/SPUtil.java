package com.beijing.zzu.multilanguagedemo.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author jiayk
 * @date 2019/11/13
 */
public class SPUtil {
    private static final String SHARED_PATH = "app_multi_language_info";
    private static SPUtil helper;
    private SharedPreferences sharedPreferences;


    private SPUtil(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PATH, Context.MODE_PRIVATE);
    }

    public static SPUtil getInstance(Context context) {
        if (helper == null) {
            helper = new SPUtil(context);
        }
        return helper;
    }

    public  void putInt(String key, int value) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public  int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }


    public  void putString(String key, String value) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(key, value);
        edit.apply();
    }


    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }


    public  void putBoolean(String key, boolean value) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(key, value);
        edit.apply();
    }


    public  boolean getBoolean(String key, boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    public  int getInt(String key, int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    public  void remove(String key) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(key);
        edit.apply();
    }
}
