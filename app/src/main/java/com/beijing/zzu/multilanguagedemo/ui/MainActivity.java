package com.beijing.zzu.multilanguagedemo.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.beijing.zzu.multilanguagedemo.R;
import com.beijing.zzu.multilanguagedemo.utils.MultiLanguageUtil;

public class MainActivity extends BaseActivity {

    private TextView tvSystemLanguage;
    private TextView tvUserSelectLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.app_name);
        initView();
        setValue();
    }

    private void initView() {
        tvSystemLanguage = findViewById(R.id.tv_system_language);
        tvUserSelectLanguage = findViewById(R.id.tv_user_select);
    }


    @SuppressLint("StringFormatInvalid")
    private void setValue() {
        String string = getString(R.string.system_language,
                MultiLanguageUtil.getInstance().getSysLocale().getDisplayName());
        tvSystemLanguage.setText(string);
        //
        tvUserSelectLanguage.setText(getString(R.string.user_select_language,
                MultiLanguageUtil.getInstance().getLanguageName(this)));
    }

    public static void reStart(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public void openSettingLanguage(View view) {
        startActivity(new Intent(this,SetLanguageActivity.class));
    }
}
