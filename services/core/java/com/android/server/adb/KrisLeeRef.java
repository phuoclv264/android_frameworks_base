package com.android.server.adb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class KrisLeeRef {
    private String deviceName;
    private static KrisLeeRef _instance;

    @NonNull
    public static KrisLeeRef getInstance()
    {
        if (_instance == null)
        {
            _instance = new KrisLeeRef();
        }
        return _instance;
    }

    private KrisLeeRef() {
    }

    public void setDeviceName(@NonNull String deviceName) {
        this.deviceName = deviceName;
    }

    @Nullable
    public String getDeviceName() {
        return deviceName;
    }
}