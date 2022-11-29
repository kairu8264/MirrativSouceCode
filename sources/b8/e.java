package b8;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import b8.c;

/* loaded from: classes.dex */
public final class e implements c {
    public final BroadcastReceiver A = new a();

    /* renamed from: w  reason: collision with root package name */
    public final Context f17076w;

    /* renamed from: x  reason: collision with root package name */
    public final c.a f17077x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f17078y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f17079z;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.f17078y;
            eVar.f17078y = eVar.a(context);
            if (z10 != e.this.f17078y) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f17078y);
                }
                e eVar2 = e.this;
                eVar2.f17077x.a(eVar2.f17078y);
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.f17076w = context.getApplicationContext();
        this.f17077x = aVar;
    }

    @SuppressLint({"MissingPermission"})
    public boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) i8.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    public final void c() {
        if (this.f17079z) {
            return;
        }
        this.f17078y = a(this.f17076w);
        try {
            this.f17076w.registerReceiver(this.A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f17079z = true;
        } catch (SecurityException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e10);
            }
        }
    }

    public final void h() {
        if (this.f17079z) {
            this.f17076w.unregisterReceiver(this.A);
            this.f17079z = false;
        }
    }

    @Override // b8.m
    public void onDestroy() {
    }

    @Override // b8.m
    public void onStart() {
        c();
    }

    @Override // b8.m
    public void onStop() {
        h();
    }
}
