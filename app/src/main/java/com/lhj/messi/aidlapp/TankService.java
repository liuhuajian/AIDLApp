package com.lhj.messi.aidlapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TankService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return IBluetoothImpl.getInstance();
    }
}
