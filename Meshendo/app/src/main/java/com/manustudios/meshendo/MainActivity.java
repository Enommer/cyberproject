package com.manustudios.meshendo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ramimartin.multibluetooth.activity.BluetoothActivity;

public class MainActivity extends BluetoothActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

