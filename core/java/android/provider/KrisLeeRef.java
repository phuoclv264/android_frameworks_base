package android.provider;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.util.Slog;

public class KrisLeeRef {
    private String deviceName;
    private static final String TAG = "KrisLeeRef";
    private static final KrisLeeRef _instance = new KrisLeeRef();

    @NonNull
    public static KrisLeeRef getInstance() {
        Slog.w(TAG, "Getting instance: " + _instance);

        if (_instance == null) {
            _instance = new KrisLeeRef();
        }
        return _instance;
    }

    private KrisLeeRef() {
        Slog.w(TAG, "KrisLeeRef instance created");
    }

    public void setDeviceName(@NonNull String deviceName) {
        Slog.w(TAG, "Setting device name: " + deviceName);
        this.deviceName = deviceName;
    }

    @Nullable
    public String getDeviceName() {
        Slog.w(TAG, "Getting device name: " + deviceName);
        return deviceName;
    }
}
