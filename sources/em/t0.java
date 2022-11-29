package em;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes4.dex */
public class t0 implements Runnable {
    public static final Object B = new Object();
    public static Boolean C;
    public static Boolean D;
    public final long A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f30751w;

    /* renamed from: x  reason: collision with root package name */
    public final e0 f30752x;

    /* renamed from: y  reason: collision with root package name */
    public final PowerManager.WakeLock f30753y;

    /* renamed from: z  reason: collision with root package name */
    public final s0 f30754z;

    /* loaded from: classes4.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public t0 f30755a;

        public a(t0 t0Var) {
            this.f30755a = t0Var;
        }

        public void a() {
            if (t0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            t0.this.f30751w.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            t0 t0Var = this.f30755a;
            if (t0Var == null) {
                return;
            }
            if (t0Var.i()) {
                if (t0.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f30755a.f30754z.k(this.f30755a, 0L);
                context.unregisterReceiver(this);
                this.f30755a = null;
            }
        }
    }

    public t0(s0 s0Var, Context context, e0 e0Var, long j10) {
        this.f30754z = s0Var;
        this.f30751w = context;
        this.A = j10;
        this.f30752x = e0Var;
        this.f30753y = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (B) {
            Boolean bool = D;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            D = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (z10 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z10;
        }
        Log.d("FirebaseMessaging", e(str));
        return false;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (B) {
            Boolean bool = C;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            C = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f30751w.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f30751w)) {
            this.f30753y.acquire(com.google.firebase.messaging.a.f27999a);
        }
        try {
            try {
                this.f30754z.l(true);
                if (!this.f30752x.g()) {
                    this.f30754z.l(false);
                    if (h(this.f30751w)) {
                        try {
                            this.f30753y.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (f(this.f30751w) && !i()) {
                    new a(this).a();
                    if (h(this.f30751w)) {
                        try {
                            this.f30753y.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f30754z.o()) {
                        this.f30754z.l(false);
                    } else {
                        this.f30754z.p(this.A);
                    }
                    if (h(this.f30751w)) {
                        try {
                            this.f30753y.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f30754z.l(false);
                if (h(this.f30751w)) {
                    try {
                        this.f30753y.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th2) {
            if (h(this.f30751w)) {
                try {
                    this.f30753y.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
