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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class o0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final long f30714w;

    /* renamed from: x  reason: collision with root package name */
    public final PowerManager.WakeLock f30715x;

    /* renamed from: y  reason: collision with root package name */
    public final FirebaseMessaging f30716y;

    /* renamed from: z  reason: collision with root package name */
    public ExecutorService f30717z = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wh.a("firebase-iid-executor"));

    /* loaded from: classes4.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public o0 f30718a;

        public a(o0 o0Var) {
            this.f30718a = o0Var;
        }

        public void a() {
            if (o0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f30718a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            o0 o0Var = this.f30718a;
            if (o0Var != null && o0Var.d()) {
                if (o0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f30718a.f30716y.d(this.f30718a, 0L);
                this.f30718a.b().unregisterReceiver(this);
                this.f30718a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public o0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f30716y = firebaseMessaging;
        this.f30714w = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f30715x = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public Context b() {
        return this.f30716y.e();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        try {
            if (this.f30716y.c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            if (a0.f(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb2.toString());
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (l0.b().e(b())) {
            this.f30715x.acquire();
        }
        try {
            try {
                this.f30716y.u(true);
                if (!this.f30716y.n()) {
                    this.f30716y.u(false);
                    if (!l0.b().e(b())) {
                        return;
                    }
                } else if (l0.b().d(b()) && !d()) {
                    new a(this).a();
                    if (!l0.b().e(b())) {
                        return;
                    }
                } else {
                    if (e()) {
                        this.f30716y.u(false);
                    } else {
                        this.f30716y.x(this.f30714w);
                    }
                    if (!l0.b().e(b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb2.toString());
                this.f30716y.u(false);
                if (!l0.b().e(b())) {
                    return;
                }
            }
            this.f30715x.release();
        } catch (Throwable th2) {
            if (l0.b().e(b())) {
                this.f30715x.release();
            }
            throw th2;
        }
    }
}
