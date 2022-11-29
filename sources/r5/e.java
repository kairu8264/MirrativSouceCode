package r5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import k5.j;

/* loaded from: classes.dex */
public class e extends d<p5.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f49756j = j.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f49757g;

    /* renamed from: h  reason: collision with root package name */
    public b f49758h;

    /* renamed from: i  reason: collision with root package name */
    public a f49759i;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(e.f49756j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(e.f49756j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(e.f49756j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, w5.a aVar) {
        super(context, aVar);
        this.f49757g = (ConnectivityManager) this.f49750b.getSystemService("connectivity");
        if (j()) {
            this.f49758h = new b();
        } else {
            this.f49759i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // r5.d
    public void e() {
        if (j()) {
            try {
                j.c().a(f49756j, "Registering network callback", new Throwable[0]);
                this.f49757g.registerDefaultNetworkCallback(this.f49758h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                j.c().b(f49756j, "Received exception while registering network callback", e10);
                return;
            }
        }
        j.c().a(f49756j, "Registering broadcast receiver", new Throwable[0]);
        this.f49750b.registerReceiver(this.f49759i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // r5.d
    public void f() {
        if (j()) {
            try {
                j.c().a(f49756j, "Unregistering network callback", new Throwable[0]);
                this.f49757g.unregisterNetworkCallback(this.f49758h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                j.c().b(f49756j, "Received exception while unregistering network callback", e10);
                return;
            }
        }
        j.c().a(f49756j, "Unregistering broadcast receiver", new Throwable[0]);
        this.f49750b.unregisterReceiver(this.f49759i);
    }

    public p5.b g() {
        NetworkInfo activeNetworkInfo = this.f49757g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = j3.a.a(this.f49757g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new p5.b(z11, i10, a10, z10);
    }

    @Override // r5.d
    /* renamed from: h */
    public p5.b b() {
        return g();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f49757g.getNetworkCapabilities(this.f49757g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            j.c().b(f49756j, "Unable to validate active network", e10);
            return false;
        }
    }
}
