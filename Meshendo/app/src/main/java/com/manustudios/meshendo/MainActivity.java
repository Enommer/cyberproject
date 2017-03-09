package com.manustudios.meshendo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ramimartin.multibluetooth.activity.BluetoothActivity;
import com.ramimartin.multibluetooth.bluetooth.mananger.BluetoothManager;


public class MainActivity extends BluetoothActivity{

    private Button serverBtn;
    private Button clientBtn;
    private Button clientConnectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serverBtn = (Button) findViewById(R.id.serverBtn);
        serverBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("Emanuel", "Server started");
//                Log.d("Emanuel", BluetoothAdapter.getDefaultAdapter().getAddress());
                setTimeDiscoverable(BluetoothManager.BLUETOOTH_TIME_DICOVERY_3600_SEC);
                selectServerMode();
                scanAllBluetoothDevice();
//                createClient(mServerAddressMac);
            }
        });
    }

    @Override
    public int myNbrClientMax() {
        return 7;
    }

    @Override
    public void onBluetoothStartDiscovery() {
    }

    @Override
    public void onBluetoothDeviceFound(BluetoothDevice device) {
    }

    @Override
    public void onClientConnectionSuccess() {
    }

    @Override
    public void onClientConnectionFail() {
    }

    @Override
    public void onServeurConnectionSuccess() {
    }

    @Override
    public void onServeurConnectionFail() {
    }

    @Override
    public void onBluetoothCommunicator(String messageReceive) {
    }

    @Override
    public void onBluetoothNotAviable() {
    }

}

