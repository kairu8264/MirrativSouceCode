package rh;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static int f51453a = 4225;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f51454b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static o1 f51455c = null;

    /* renamed from: d  reason: collision with root package name */
    public static HandlerThread f51456d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f51457e = false;

    public static int a() {
        return f51453a;
    }

    public static h b(Context context) {
        Looper mainLooper;
        synchronized (f51454b) {
            if (f51455c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f51457e) {
                    mainLooper = c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f51455c = new o1(applicationContext, mainLooper);
            }
        }
        return f51455c;
    }

    public static HandlerThread c() {
        synchronized (f51454b) {
            HandlerThread handlerThread = f51456d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f51456d = handlerThread2;
            handlerThread2.start();
            return f51456d;
        }
    }

    public abstract void d(k1 k1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new k1(str, str2, i10, z10), serviceConnection, str3);
    }

    public abstract boolean f(k1 k1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
