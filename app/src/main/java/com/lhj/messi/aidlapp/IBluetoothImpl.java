package com.lhj.messi.aidlapp;

import android.os.RemoteException;

import com.lhj.messi.aidlapp.search.Student;
import com.lhj.messi.aidlapp.util.Logger;

/**
 * Created by messi on 2017/7/31.
 */

public class IBluetoothImpl extends IBluetooth.Stub{

    private IBluetoothImpl(){};

    private static IBluetoothImpl iBluetooth  = null;

    public static IBluetoothImpl getInstance(){
        if (iBluetooth ==null){
            synchronized (IBluetoothImpl.class){
                if (iBluetooth ==null){
                    iBluetooth = new IBluetoothImpl();
                }
            }
        }
        return iBluetooth;
    }

    @Override
    public void callBluetoothApi(Student student) throws RemoteException {
        Logger.d("你是个王八蛋"+"IBluetoothImpl");
        student.Student("liuhuajian","是个大帅哥");
    }
}
