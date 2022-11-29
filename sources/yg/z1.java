package yg;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes3.dex */
public final class z1 extends ConnectivityManager.NetworkCallback {
    public z1(d2 d2Var) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (d2.class) {
            boolean unused = d2.f61867j = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (d2.class) {
            boolean unused = d2.f61867j = false;
        }
    }
}
