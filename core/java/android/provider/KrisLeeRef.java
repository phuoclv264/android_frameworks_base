package android.provider;

import android.annotation.NonNull;
import android.annotation.Nullable;

public class KrisLeeRef {
    private String deviceName;
    private static KrisLeeRef _instance = new KrisLeeRef();

    @NonNull
    public static KrisLeeRef getInstance()
    {
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
