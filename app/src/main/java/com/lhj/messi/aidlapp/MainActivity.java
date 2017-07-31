package com.lhj.messi.aidlapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lhj.messi.aidlapp.search.Student;
import com.lhj.messi.aidlapp.search.StudentImpl;
import com.lhj.messi.aidlapp.util.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        intent.setClass(this,TankService.class);
        bindService(intent,connection, Context.BIND_AUTO_CREATE);
    }

    public void btnClick(View view) {
        Logger.d("你是个王八蛋");
        if (iBluetoothService !=null){
            try {
                iBluetoothService.callBluetoothApi(new StudentImpl());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private IBluetooth iBluetoothService;
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            iBluetoothService = IBluetooth.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
}
