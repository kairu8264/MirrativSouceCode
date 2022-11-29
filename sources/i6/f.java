package i6;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import i6.d;
import jo.p;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f36355a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f36356b;

    /* renamed from: c  reason: collision with root package name */
    public final a f36357c;

    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f.this.d(network, false);
        }
    }

    public f(ConnectivityManager connectivityManager, d.a aVar) {
        this.f36355a = connectivityManager;
        this.f36356b = aVar;
        a aVar2 = new a();
        this.f36357c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    @Override // i6.d
    public boolean a() {
        Network[] allNetworks = this.f36355a.getAllNetworks();
        int length = allNetworks.length;
        int i10 = 0;
        while (i10 < length) {
            Network network = allNetworks[i10];
            i10++;
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f36355a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z10) {
        boolean c10;
        Network[] allNetworks = this.f36355a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            i10++;
            if (p.c(network2, network)) {
                c10 = z10;
                continue;
            } else {
                c10 = c(network2);
                continue;
            }
            if (c10) {
                z11 = true;
                break;
            }
        }
        this.f36356b.a(z11);
    }

    @Override // i6.d
    public void shutdown() {
        this.f36355a.unregisterNetworkCallback(this.f36357c);
    }
}
