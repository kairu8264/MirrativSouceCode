package nh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import rh.v0;
import rh.w0;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static volatile w0 f43571e;

    /* renamed from: g  reason: collision with root package name */
    public static Context f43573g;

    /* renamed from: a  reason: collision with root package name */
    public static final u f43567a = new o(s.z0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b  reason: collision with root package name */
    public static final u f43568b = new p(s.z0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    public static final u f43569c = new q(s.z0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d  reason: collision with root package name */
    public static final u f43570d = new r(s.z0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f  reason: collision with root package name */
    public static final Object f43572f = new Object();

    public static g0 a(String str, s sVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, sVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [yh.a, android.os.IBinder] */
    public static g0 b(String str, boolean z10, boolean z11, boolean z12) {
        g0 d10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            rh.p.i(f43573g);
            try {
                g();
                try {
                    a0 g42 = f43571e.g4(new x(str, z10, false, yh.b.h1(f43573g), false));
                    if (g42.P()) {
                        d10 = g0.b();
                    } else {
                        String p10 = g42.p();
                        if (p10 == null) {
                            p10 = "error checking package certificate";
                        }
                        d10 = g42.S() == 4 ? g0.d(p10, new PackageManager.NameNotFoundException()) : g0.c(p10);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    d10 = g0.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                String valueOf = String.valueOf(e11.getMessage());
                d10 = g0.d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
            }
            return d10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static /* synthetic */ String c(boolean z10, String str, s sVar) throws Exception {
        String str2 = true != (!z10 && f(str, sVar, true, false).f43550a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = vh.a.b("SHA-1");
        rh.p.i(b10);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, vh.k.a(b10.digest(sVar.h1())), Boolean.valueOf(z10), "12451000.false");
    }

    public static synchronized void d(Context context) {
        synchronized (w.class) {
            if (f43573g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f43573g = context.getApplicationContext();
            }
        }
    }

    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                g();
                return f43571e.f();
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static g0 f(final String str, final s sVar, final boolean z10, boolean z11) {
        try {
            g();
            rh.p.i(f43573g);
            try {
                return f43571e.g2(new c0(str, sVar, z10, z11), yh.b.h1(f43573g.getPackageManager())) ? g0.b() : new f0(new Callable() { // from class: nh.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return w.c(z10, str, sVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return g0.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            String valueOf = String.valueOf(e11.getMessage());
            return g0.d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
        }
    }

    public static void g() throws DynamiteModule.LoadingException {
        if (f43571e != null) {
            return;
        }
        rh.p.i(f43573g);
        synchronized (f43572f) {
            if (f43571e == null) {
                f43571e = v0.s0(DynamiteModule.e(f43573g, DynamiteModule.f27232f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
