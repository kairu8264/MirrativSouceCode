package com.mirrativ.llstream.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.p;

/* loaded from: classes4.dex */
public final class NetworkMonitor {
    private final Set<ConnectivityManager.NetworkCallback> callbacks;

    /* renamed from: cm  reason: collision with root package name */
    private final ConnectivityManager f28250cm;
    private final Context context;
    private ConnectivityManager.NetworkCallback networkCallback;

    public NetworkMonitor(Context context) {
        p.h(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("connectivity");
        p.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f28250cm = (ConnectivityManager) systemService;
        this.callbacks = new LinkedHashSet();
    }

    public final Context getContext() {
        return this.context;
    }

    public final void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        p.h(networkCallback, "networkCallback");
        this.callbacks.add(networkCallback);
        this.f28250cm.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).build(), networkCallback);
        this.networkCallback = networkCallback;
    }

    public final void unregisterAllNetworkCallbacks() {
        for (ConnectivityManager.NetworkCallback networkCallback : this.callbacks) {
            unregisterNetworkCallback(networkCallback);
        }
    }

    public final void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        p.h(networkCallback, "networkCallback");
        this.f28250cm.unregisterNetworkCallback(networkCallback);
        this.callbacks.remove(networkCallback);
    }
}
