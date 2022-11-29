package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ai0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<ExecutorService> f1860a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Object f1861b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public String f1862c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f1863d = null;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f1864e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f1865f = new AtomicInteger(-1);

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<Object> f1866g = new AtomicReference<>(null);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Object> f1867h = new AtomicReference<>(null);

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentMap<String, Method> f1868i = new ConcurrentHashMap(9);

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReference<kr0> f1869j = new AtomicReference<>(null);

    /* renamed from: k  reason: collision with root package name */
    public final BlockingQueue<FutureTask<?>> f1870k = new ArrayBlockingQueue(20);

    /* renamed from: l  reason: collision with root package name */
    public final Object f1871l = new Object();

    public static final boolean A(Context context) {
        if (((Boolean) ft.c().c(ox.f7956c0)).booleanValue()) {
            if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) ft.c().c(ox.f7965d0)).intValue()) {
                return false;
            }
            if (((Boolean) ft.c().c(ox.f7973e0)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void B(Context context, final String str, String str2, Bundle bundle) {
        if (g(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String valueOf = String.valueOf(str2);
                uj0.d(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new yh0(str, bundle2) { // from class: ai.lh0

                    /* renamed from: a  reason: collision with root package name */
                    public final String f6562a;

                    /* renamed from: b  reason: collision with root package name */
                    public final Bundle f6563b;

                    {
                        this.f6562a = str;
                        this.f6563b = bundle2;
                    }

                    @Override // ai.yh0
                    public final void a(kr0 kr0Var) {
                        kr0Var.S0(TopicConstant.PACKET_TYPE_AUDIO_MP3, this.f6562a, this.f6563b);
                    }
                });
            } else if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f1866g, true)) {
                Method method = this.f1868i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f1868i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        a("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f1866g.get(), TopicConstant.PACKET_TYPE_AUDIO_MP3, str, bundle2);
                } catch (Exception unused2) {
                    a("logEventInternal", true);
                }
            }
        }
    }

    public final Method C(Context context, String str) {
        Method method = this.f1868i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f1868i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a(str, false);
            return null;
        }
    }

    public final void D(Context context, String str, String str2) {
        if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f1866g, true)) {
            Method method = this.f1868i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f1868i.put(str2, method);
                } catch (Exception unused) {
                    a(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f1866g.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                yg.p1.k(sb2.toString());
            } catch (Exception unused2) {
                a(str2, false);
            }
        }
    }

    public final Object E(String str, Context context) {
        if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f1866g, true)) {
            try {
                return C(context, str).invoke(this.f1866g.get(), new Object[0]);
            } catch (Exception unused) {
                a(str, true);
                return null;
            }
        }
        return null;
    }

    public final void a(String str, boolean z10) {
        if (this.f1864e.get()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 30);
        sb2.append("Invoke Firebase method ");
        sb2.append(str);
        sb2.append(" error.");
        uj0.f(sb2.toString());
        if (z10) {
            uj0.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f1864e.set(true);
        }
    }

    public final ExecutorService b() {
        ExecutorService threadPoolExecutor;
        if (this.f1860a.get() == null) {
            if (vh.e.a()) {
                threadPoolExecutor = mw2.a().c(((Integer) ft.c().c(ox.f7947b0)).intValue(), new wh0(this), 2);
            } else {
                gx<Integer> gxVar = ox.f7947b0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) ft.c().c(gxVar)).intValue(), ((Integer) ft.c().c(gxVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new wh0(this));
            }
            this.f1860a.compareAndSet(null, threadPoolExecutor);
        }
        return this.f1860a.get();
    }

    public final boolean c(Context context, String str, AtomicReference<Object> atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                a("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final void d(final String str, final yh0 yh0Var) {
        synchronized (this.f1869j) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, yh0Var, str) { // from class: ai.mh0

                /* renamed from: w  reason: collision with root package name */
                public final ai0 f6938w;

                /* renamed from: x  reason: collision with root package name */
                public final yh0 f6939x;

                /* renamed from: y  reason: collision with root package name */
                public final String f6940y;

                {
                    this.f6938w = this;
                    this.f6939x = yh0Var;
                    this.f6940y = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6938w.x(this.f6939x, this.f6940y);
                }
            }, null);
            if (this.f1869j.get() != null) {
                futureTask.run();
            } else {
                this.f1870k.offer(futureTask);
            }
        }
    }

    public final <T> T e(String str, T t10, xh0<T> xh0Var) {
        synchronized (this.f1869j) {
            if (this.f1869j.get() != null) {
                try {
                    return xh0Var.a(this.f1869j.get());
                } catch (Exception unused) {
                    a(str, false);
                }
            }
            return t10;
        }
    }

    public final boolean f() {
        synchronized (this.f1871l) {
        }
        return false;
    }

    public final boolean g(Context context) {
        if (((Boolean) ft.c().c(ox.V)).booleanValue() && !this.f1864e.get()) {
            if (((Boolean) ft.c().c(ox.f7981f0)).booleanValue()) {
                return true;
            }
            if (this.f1865f.get() == -1) {
                dt.a();
                if (!nj0.l(context, nh.g.f43544a)) {
                    dt.a();
                    if (nj0.m(context)) {
                        uj0.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f1865f.set(0);
                    }
                }
                this.f1865f.set(1);
            }
            if (this.f1865f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void h(Context context, pw pwVar) {
        bi0.d(context).b().c(pwVar);
        if (((Boolean) ft.c().c(ox.f7997h0)).booleanValue() && g(context) && A(context)) {
            synchronized (this.f1871l) {
            }
        }
    }

    public final void i(Context context, as asVar) {
        if (((Boolean) ft.c().c(ox.f7997h0)).booleanValue() && g(context) && A(context)) {
            synchronized (this.f1871l) {
            }
        }
    }

    public final void j(final Bundle bundle) {
        d("setConsent", new yh0(bundle) { // from class: ai.ih0

            /* renamed from: a  reason: collision with root package name */
            public final Bundle f5232a;

            {
                this.f5232a = bundle;
            }

            @Override // ai.yh0
            public final void a(kr0 kr0Var) {
                kr0Var.j0(this.f5232a);
            }
        });
    }

    public final void k(Context context, final String str) {
        if (g(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new yh0(str) { // from class: ai.oh0

                    /* renamed from: a  reason: collision with root package name */
                    public final String f7789a;

                    {
                        this.f7789a = str;
                    }

                    @Override // ai.yh0
                    public final void a(kr0 kr0Var) {
                        kr0Var.o0(this.f7789a);
                    }
                });
            } else {
                D(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void l(Context context, final String str) {
        if (g(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new yh0(str) { // from class: ai.ph0

                    /* renamed from: a  reason: collision with root package name */
                    public final String f8415a;

                    {
                        this.f8415a = str;
                    }

                    @Override // ai.yh0
                    public final void a(kr0 kr0Var) {
                        kr0Var.r0(this.f8415a);
                    }
                });
            } else {
                D(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String m(Context context) {
        if (g(context)) {
            if (A(context)) {
                return (String) e("getCurrentScreenNameOrScreenClass", "", qh0.f8948a);
            }
            if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f1866g, true)) {
                try {
                    String str = (String) C(context, "getCurrentScreenName").invoke(this.f1866g.get(), new Object[0]);
                    if (str == null) {
                        str = (String) C(context, "getCurrentScreenClass").invoke(this.f1866g.get(), new Object[0]);
                    }
                    return str != null ? str : "";
                } catch (Exception unused) {
                    a("getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Deprecated
    public final void n(final Context context, final String str) {
        if (g(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new yh0(context, str) { // from class: ai.rh0

                    /* renamed from: a  reason: collision with root package name */
                    public final Context f9439a;

                    /* renamed from: b  reason: collision with root package name */
                    public final String f9440b;

                    {
                        this.f9439a = context;
                        this.f9440b = str;
                    }

                    @Override // ai.yh0
                    public final void a(kr0 kr0Var) {
                        Context context2 = this.f9439a;
                        kr0Var.H4(yh.b.h1(context2), this.f9440b, context2.getPackageName());
                    }
                });
            } else if (c(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f1867h, false)) {
                Method method = this.f1868i.get("setCurrentScreen");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f1868i.put("setCurrentScreen", method);
                    } catch (Exception unused) {
                        a("setCurrentScreen", false);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f1867h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    a("setCurrentScreen", false);
                }
            }
        }
    }

    public final String o(Context context) {
        if (g(context)) {
            synchronized (this.f1861b) {
                String str = this.f1862c;
                if (str != null) {
                    return str;
                }
                if (A(context)) {
                    this.f1862c = (String) e("getGmpAppId", this.f1862c, sh0.f9835a);
                } else {
                    this.f1862c = (String) E("getGmpAppId", context);
                }
                return this.f1862c;
            }
        }
        return null;
    }

    public final String p(final Context context) {
        if (g(context)) {
            long longValue = ((Long) ft.c().c(ox.f7938a0)).longValue();
            if (A(context)) {
                try {
                    if (longValue < 0) {
                        return (String) e("getAppInstanceId", null, th0.f10307a);
                    }
                    return (String) b().submit(new Callable(this) { // from class: ai.uh0

                        /* renamed from: a  reason: collision with root package name */
                        public final ai0 f10705a;

                        {
                            this.f10705a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f10705a.z();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) E("getAppInstanceId", context);
            } else {
                try {
                    return (String) b().submit(new Callable(this, context) { // from class: ai.vh0

                        /* renamed from: a  reason: collision with root package name */
                        public final ai0 f11085a;

                        /* renamed from: b  reason: collision with root package name */
                        public final Context f11086b;

                        {
                            this.f11085a = this;
                            this.f11086b = context;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f11085a.y(this.f11086b);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String q(Context context) {
        if (g(context)) {
            if (A(context)) {
                Long l10 = (Long) e("getAdEventId", null, jh0.f5795a);
                if (l10 != null) {
                    return Long.toString(l10.longValue());
                }
                return null;
            }
            Object E = E("generateEventId", context);
            if (E != null) {
                return E.toString();
            }
            return null;
        }
        return null;
    }

    public final String r(Context context) {
        if (g(context)) {
            synchronized (this.f1861b) {
                String str = this.f1863d;
                if (str != null) {
                    return str;
                }
                if (A(context)) {
                    this.f1863d = (String) e("getAppIdOrigin", this.f1863d, kh0.f6235a);
                } else {
                    this.f1863d = "fa";
                }
                return this.f1863d;
            }
        }
        return null;
    }

    public final void s(Context context, String str) {
        B(context, "_ac", str, null);
    }

    public final void t(Context context, String str) {
        B(context, "_ai", str, null);
    }

    public final void u(Context context, String str) {
        B(context, "_aq", str, null);
    }

    public final void v(Context context, String str) {
        B(context, "_aa", str, null);
    }

    public final void w(Context context, String str, String str2, String str3, int i10) {
        if (g(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            B(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 75);
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i10);
            yg.p1.k(sb2.toString());
        }
    }

    public final /* synthetic */ void x(yh0 yh0Var, String str) {
        if (this.f1869j.get() != null) {
            try {
                yh0Var.a(this.f1869j.get());
            } catch (Exception unused) {
                a(str, false);
            }
        }
    }

    public final /* synthetic */ String y(Context context) throws Exception {
        return (String) E("getAppInstanceId", context);
    }

    public final /* synthetic */ String z() throws Exception {
        return (String) e("getAppInstanceId", null, nh0.f7328a);
    }
}
