// IBluetooth.aidl
package com.lhj.messi.aidlapp;
import com.lhj.messi.aidlapp.search.Student;
// Declare any non-default types here with import statements

interface IBluetooth {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void callBluetoothApi(Student student);
}
