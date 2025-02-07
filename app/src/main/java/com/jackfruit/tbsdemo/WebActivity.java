package com.jackfruit.tbsdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class WebActivity extends BaseWebActivity {
  private FrameLayout mFl;

  public static void start(Context context) {
    Intent starter = new Intent(context, WebActivity.class);
    context.startActivity(starter);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_web);
    initView();
    setWebSettings();
    mWebSettings.setJavaScriptEnabled(true);
    // WebView加载web资源
    loadUrl("https://jx.bozrc.com:4433/player/?url=https://www.iqiyi.com/v_1nrosx2rb8k.html");
  }

  private void initView() {
    mFl = (FrameLayout) findViewById(R.id.webview);
  }

  @Override
  protected ViewGroup setWebViewContainer() {
    return mFl;
  }
}
