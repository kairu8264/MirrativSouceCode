package uh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import rh.p;
import rh.p1;
import vh.n;
import xh.c;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f55921b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f55922c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f55923a = new ConcurrentHashMap<>();

    public static a b() {
        if (f55922c == null) {
            synchronized (f55921b) {
                if (f55922c == null) {
                    f55922c = new a();
                }
            }
        }
        a aVar = f55922c;
        p.i(aVar);
        return aVar;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof p1);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return (!n.m() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (g(serviceConnection) && this.f55923a.containsKey(serviceConnection)) {
            try {
                e(context, this.f55923a.get(serviceConnection));
                return;
            } finally {
                this.f55923a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, i10, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection putIfAbsent = this.f55923a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean h10 = h(context, intent, serviceConnection, i10, executor);
                if (h10) {
                    return h10;
                }
                return false;
            } finally {
                this.f55923a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i10, executor);
    }
}
