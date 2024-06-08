package android.os;

import android.content.Context;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.util.Slog;
import android.provider.Settings;

public class KrisLeeRef {
    private Context context;
    private static KrisLeeRef _instance;
    private static final String TAG = "KrisLeeRef";

    private KrisLeeRef() {
        // Private constructor to prevent instantiation
        Slog.w(TAG, "KrisLeeRef instance created");
    }

    @NonNull
    public static KrisLeeRef getInstance() {
        Slog.w(TAG, "Getting instance: " + _instance);

        if (_instance == null) {
            synchronized (KrisLeeRef.class) {
                if (_instance == null) {
                    _instance = new KrisLeeRef();
                }
            }
        }
        return _instance;
    }

    public void initialize(@NonNull Context context) {
        Slog.w(TAG, "Initialize instance: " + _instance);

        this.context = context.getApplicationContext();  // Use application context to avoid leaks
    }

    @Nullable
    public String getDeviceName() {
        String deviceName = "LineageOS";

        if (context != null) {
            deviceName = Settings.Global.getString(context.getContentResolver(),
                Settings.Global.DEVICE_NAME);
        }

        Slog.w(TAG, "Getting device name: " + deviceName);

        return deviceName;
    }

    @Nullable
    public Context getContext() {
        return context;
    }
}
