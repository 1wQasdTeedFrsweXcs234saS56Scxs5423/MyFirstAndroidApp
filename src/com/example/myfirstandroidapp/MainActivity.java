package com.example.myfirstandroidapp;
 
import android.os.Bundle;
import org.apache.cordova.*;

 
public class MainActivity extends DroidGap {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onStart();

        
        super.loadUrl("file:///android_asset/www/index.html");

    }
    
    
    @Override
    public void onDestroy() 
    {
        super.onDestroy();       
    }    
    
}
