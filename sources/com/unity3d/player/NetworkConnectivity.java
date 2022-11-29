package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes4.dex */
public class NetworkConnectivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private final int f28345a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f28346b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final int f28347c = 2;

    /* renamed from: d  reason: collision with root package name */
    private int f28348d;

    /* renamed from: e  reason: collision with root package name */
    private ConnectivityManager f28349e;

    /* renamed from: f  reason: collision with root package name */
    private final ConnectivityManager.NetworkCallback f28350f;

    public NetworkConnectivity(Context context) {
        this.f28348d = 0;
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.unity3d.player.NetworkConnectivity.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkConnectivity networkConnectivity;
                int i10;
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0)) {
                    networkConnectivity = NetworkConnectivity.this;
                    i10 = 1;
                } else {
                    networkConnectivity = NetworkConnectivity.this;
                    i10 = 2;
                }
                networkConnectivity.f28348d = i10;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                NetworkConnectivity.this.f28348d = 0;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                super.onUnavailable();
                NetworkConnectivity.this.f28348d = 0;
            }
        };
        this.f28350f = networkCallback;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f28349e = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
        NetworkInfo activeNetworkInfo = this.f28349e.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        this.f28348d = activeNetworkInfo.getType() != 0 ? 2 : 1;
    }

    public final int a() {
        return this.f28348d;
    }

    public final void b() {
        this.f28349e.unregisterNetworkCallback(this.f28350f);
    }
}
