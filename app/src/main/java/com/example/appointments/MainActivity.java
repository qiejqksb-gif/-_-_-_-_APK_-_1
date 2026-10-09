package com.example.appointments;
import android.app.*; import android.os.*; import android.webkit.*; import android.view.*;
public class MainActivity extends Activity {
 public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); w.getSettings().setJavaScriptEnabled(true); w.getSettings().setDomStorageEnabled(true); w.setLayoutParams(new ViewGroup.LayoutParams(-1,-1)); w.loadUrl("file:///android_asset/app.html"); setContentView(w);}
}