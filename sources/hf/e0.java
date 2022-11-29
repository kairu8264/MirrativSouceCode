package hf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35539a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.x f35540b;

    public e0(Context context, kf.x xVar) {
        jo.p.h(context, "context");
        jo.p.h(xVar, "userPreference");
        this.f35539a = context;
        this.f35540b = xVar;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.f35540b.T4()) && c();
    }

    public final int b() {
        Object systemService = this.f35539a.getSystemService("connectivity");
        jo.p.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? 0 : 2;
        }
        return 1;
    }

    public final boolean c() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f35539a.getSystemService("connectivity");
        jo.p.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(4);
    }

    public final boolean d() {
        return 2 == b();
    }
}
