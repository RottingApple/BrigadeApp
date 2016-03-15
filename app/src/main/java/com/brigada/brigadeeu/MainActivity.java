package com.brigada.brigadeeu;

import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.backendless.Backendless;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Backendless.initApp(this,"1D36BED1-A047-2C68-FFB9-1CFA9BB85B00", "96D5EAFD-9D8C-D801-FF1B-026248765000", "v1" );
    }

    public void broadcastIntent(View view){

    }
}
