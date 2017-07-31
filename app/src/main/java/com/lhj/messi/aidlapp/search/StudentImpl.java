package com.lhj.messi.aidlapp.search;

import android.os.RemoteException;

import com.lhj.messi.aidlapp.util.Logger;

/**
 * Created by messi on 2017/7/31.
 */

public class StudentImpl extends Student.Stub {
    @Override
    public void Student(String name, String sex) throws RemoteException {
        Logger.d("你是个王八蛋"+"data-->"+name+sex);
    }
}
