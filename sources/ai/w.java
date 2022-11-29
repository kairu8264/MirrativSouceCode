package ai;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public NetworkCapabilities f11437a;

    public w(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new v(this));
        } catch (RuntimeException unused) {
            synchronized (w.class) {
                this.f11437a = null;
            }
        }
    }

    public static w b(Context context) {
        if (context != null) {
            return new w((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities c() {
        return this.f11437a;
    }

    public final long d() {
        synchronized (w.class) {
            NetworkCapabilities networkCapabilities = this.f11437a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.f11437a.hasTransport(1)) {
                    return 1L;
                }
                if (this.f11437a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }
}
