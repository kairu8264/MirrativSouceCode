package ai;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class pd0 implements rd0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f8377f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static rd0 f8378g;

    /* renamed from: h  reason: collision with root package name */
    public static rd0 f8379h;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8381b;

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f8383d;

    /* renamed from: e  reason: collision with root package name */
    public final zj0 f8384e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8380a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<Thread, Boolean> f8382c = new WeakHashMap<>();

    public pd0(Context context, zj0 zj0Var) {
        mw2.a();
        this.f8383d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f8381b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8384e = zj0Var;
    }

    public static rd0 c(Context context) {
        synchronized (f8377f) {
            if (f8378g == null) {
                if (kz.f6412e.e().booleanValue()) {
                    if (!((Boolean) ft.c().c(ox.f8146z5)).booleanValue()) {
                        f8378g = new pd0(context, zj0.p());
                    }
                }
                f8378g = new qd0();
            }
        }
        return f8378g;
    }

    public static rd0 d(Context context, zj0 zj0Var) {
        synchronized (f8377f) {
            if (f8379h == null) {
                if (kz.f6412e.e().booleanValue()) {
                    if (!((Boolean) ft.c().c(ox.f8146z5)).booleanValue()) {
                        pd0 pd0Var = new pd0(context, zj0Var);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (pd0Var.f8380a) {
                                pd0Var.f8382c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new od0(pd0Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new nd0(pd0Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f8379h = pd0Var;
                    }
                }
                f8379h = new qd0();
            }
        }
        return f8379h;
    }

    @Override // ai.rd0
    public final void a(Throwable th2, String str, float f10) {
        boolean z10;
        String str2;
        if (nj0.g(th2) == null) {
            return;
        }
        String name = th2.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        ug3.c(th2, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d10 = f10;
        double random = Math.random();
        int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
        if (random < d10) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z10 = xh.c.a(this.f8381b).g();
            } catch (Throwable th3) {
                uj0.d("Error fetching instant app info", th3);
                z10 = false;
            }
            try {
                str2 = this.f8381b.getPackageName();
            } catch (Throwable unused) {
                uj0.f("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps-report-exception").appendQueryParameter(LogBase.OS, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                sb2.append(str3);
                sb2.append(" ");
                sb2.append(str4);
                str4 = sb2.toString();
            }
            arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f8384e.f13013w).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", ox.c())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "407425155").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(kz.f6410c.e())).appendQueryParameter("gmscv", String.valueOf(nh.e.f().a(this.f8381b))).appendQueryParameter("lite", true != this.f8384e.A ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).toString());
            for (final String str5 : arrayList) {
                final yj0 yj0Var = new yj0(null);
                this.f8383d.execute(new Runnable(yj0Var, str5) { // from class: ai.md0

                    /* renamed from: w  reason: collision with root package name */
                    public final yj0 f6885w;

                    /* renamed from: x  reason: collision with root package name */
                    public final String f6886x;

                    {
                        this.f6885w = yj0Var;
                        this.f6886x = str5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6885w.v(this.f6886x);
                    }
                });
            }
        }
    }

    @Override // ai.rd0
    public final void b(Throwable th2, String str) {
        a(th2, str, 1.0f);
    }

    public final void e(Thread thread, Throwable th2) {
        StackTraceElement[] stackTrace;
        if (th2 != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z10 |= nj0.h(stackTraceElement.getClassName());
                    z11 |= pd0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z10 || z11) {
                return;
            }
            a(th2, "", 1.0f);
        }
    }
}
