package p6;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public int f45902a = 3000;

    /* renamed from: b  reason: collision with root package name */
    public int f45903b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f45904c;

    /* renamed from: d  reason: collision with root package name */
    public z f45905d;

    /* renamed from: e  reason: collision with root package name */
    public Object f45906e;

    /* renamed from: f  reason: collision with root package name */
    public Context f45907f;

    /* renamed from: g  reason: collision with root package name */
    public r6.j f45908g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f45909h;

    /* renamed from: i  reason: collision with root package name */
    public Object f45910i;

    /* renamed from: j  reason: collision with root package name */
    public r6.f f45911j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f45913w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Method f45914x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object[] f45915y;

        public b(Object obj, Method method, Object[] objArr) {
            this.f45913w = obj;
            this.f45914x = method;
            this.f45915y = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d0.this.p(this.f45913w, this.f45914x, this.f45915y);
            } catch (Throwable th2) {
                d0.this.f45905d.c("invoke error (%s) thrown by (%s)", th2.getMessage(), th2.getClass().getCanonicalName());
            }
        }
    }

    public d0(Context context, f0 f0Var) {
        z h10 = k.h();
        this.f45905d = h10;
        this.f45910i = d(context, f0Var, h10);
        this.f45907f = context;
        this.f45904c = new AtomicBoolean(true);
        this.f45903b = 0;
        this.f45908g = new r6.j(new a(), "InstallReferrer");
        this.f45909h = f0Var;
        this.f45911j = new r6.d("InstallReferrer");
    }

    public final void c() {
        Object obj = this.f45906e;
        if (obj == null) {
            return;
        }
        try {
            u0.i(obj, "endConnection", null, new Object[0]);
            this.f45905d.d("Install Referrer API connection closed", new Object[0]);
        } catch (Exception e10) {
            this.f45905d.c("closeReferrerClient error (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
        }
        this.f45906e = null;
    }

    public final Object d(Context context, f0 f0Var, z zVar) {
        return u0.c("com.adjust.sdk.play.InstallReferrer", new Class[]{Context.class, f0.class, z.class}, context, f0Var, zVar);
    }

    public final Object e(Context context) {
        try {
            return u0.i(u0.k("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", null, new Object[0]);
        } catch (ClassNotFoundException e10) {
            this.f45905d.b("InstallReferrer not integrated in project (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
            return null;
        } catch (Exception e11) {
            this.f45905d.c("createInstallReferrerClient error (%s) from (%s)", e11.getMessage(), e11.getClass().getCanonicalName());
            return null;
        }
    }

    public final Object f(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException unused) {
            this.f45905d.c("InstallReferrer proxy violating parameter restrictions", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            this.f45905d.c("Null argument passed to InstallReferrer proxy", new Object[0]);
            return null;
        }
    }

    public final Boolean g(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((Boolean) u0.i(obj, "getGooglePlayInstantParam", null, new Object[0])).booleanValue());
        } catch (Exception unused) {
            return null;
        }
    }

    public final long h(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) u0.i(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e10) {
            this.f45905d.c("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
            return -1L;
        }
    }

    public final long i(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) u0.i(obj, "getInstallBeginTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        this.f45911j.submit(new b(obj, method, objArr));
        return null;
    }

    public final Object j() {
        Object obj = this.f45906e;
        if (obj == null) {
            return null;
        }
        try {
            return u0.i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e10) {
            this.f45905d.c("getInstallReferrer error (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
            return null;
        }
    }

    public final Class k() {
        return InstallReferrerStateListener.class;
    }

    public final long l(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) u0.i(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e10) {
            this.f45905d.c("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
            return -1L;
        }
    }

    public final long m(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) u0.i(obj, "getReferrerClickTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String n(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) u0.i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e10) {
            this.f45905d.c("getStringInstallReferrer error (%s) thrown by (%s)", e10.getMessage(), e10.getClass().getCanonicalName());
            return null;
        }
    }

    public final String o(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) u0.i(obj, "getInstallVersion", null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object p(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method == null) {
            this.f45905d.c("InstallReferrer invoke method null", new Object[0]);
            return null;
        }
        String name = method.getName();
        if (name == null) {
            this.f45905d.c("InstallReferrer invoke method name null", new Object[0]);
            return null;
        }
        this.f45905d.d("InstallReferrer invoke method name: %s", name);
        if (objArr == null) {
            this.f45905d.b("InstallReferrer invoke args null", new Object[0]);
            objArr = new Object[0];
        }
        for (Object obj2 : objArr) {
            this.f45905d.d("InstallReferrer invoke arg: %s", obj2);
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                this.f45905d.c("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", Integer.valueOf(objArr.length));
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Integer)) {
                this.f45905d.c("InstallReferrer invoke onInstallReferrerSetupFinished arg not int", new Object[0]);
                return null;
            }
            Integer num = (Integer) obj3;
            if (num == null) {
                this.f45905d.c("InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null", new Object[0]);
                return null;
            }
            q(num.intValue());
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            this.f45905d.d("Connection to install referrer service was lost. Retrying ...", new Object[0]);
            r();
        }
        return null;
    }

    public final void q(int i10) {
        boolean z10 = true;
        if (i10 != -1) {
            if (i10 == 0) {
                try {
                    Object j10 = j();
                    String n10 = n(j10);
                    long l10 = l(j10);
                    long h10 = h(j10);
                    this.f45905d.d("installReferrer: %s, clickTime: %d, installBeginTime: %d", n10, Long.valueOf(l10), Long.valueOf(h10));
                    String o10 = o(j10);
                    long m10 = m(j10);
                    long i11 = i(j10);
                    Boolean g10 = g(j10);
                    this.f45905d.d("installVersion: %s, clickTimeServer: %d, installBeginServer: %d, googlePlayInstant: %b", o10, Long.valueOf(m10), Long.valueOf(i11), g10);
                    this.f45905d.d("Install Referrer read successfully. Closing connection", new Object[0]);
                    this.f45909h.a(new t0(n10, l10, h10, m10, i11, o10, g10), "google");
                } catch (Exception e10) {
                    this.f45905d.b("Couldn't get install referrer from client (%s). Retrying...", e10.getMessage());
                }
            } else if (i10 == 1) {
                this.f45905d.d("Could not initiate connection to the Install Referrer service. Retrying...", new Object[0]);
            } else if (i10 == 2) {
                this.f45905d.d("Install Referrer API not supported by the installed Play Store app. Closing connection", new Object[0]);
            } else if (i10 != 3) {
                this.f45905d.d("Unexpected response code of install referrer response: %d. Closing connection", Integer.valueOf(i10));
            } else {
                this.f45905d.d("Install Referrer API general errors caused by incorrect usage. Retrying...", new Object[0]);
            }
            z10 = false;
        } else {
            this.f45905d.d("Play Store service is not connected now. Retrying...", new Object[0]);
        }
        if (z10) {
            r();
            return;
        }
        this.f45904c.set(false);
        c();
    }

    public final void r() {
        if (!this.f45904c.get()) {
            this.f45905d.d("Should not try to read Install referrer", new Object[0]);
            c();
        } else if (this.f45903b + 1 > 2) {
            this.f45905d.d("Limit number of retry of %d for install referrer surpassed", 2);
        } else {
            long g10 = this.f45908g.g();
            if (g10 > 0) {
                this.f45905d.d("Already waiting to retry to read install referrer in %d milliseconds", Long.valueOf(g10));
                return;
            }
            int i10 = this.f45903b + 1;
            this.f45903b = i10;
            this.f45905d.d("Retry number %d to connect to install referrer API", Integer.valueOf(i10));
            this.f45908g.h(this.f45902a);
        }
    }

    public void s() {
        Class k10;
        Object f10;
        Object obj = this.f45910i;
        if (obj != null) {
            try {
                u0.i(obj, "startConnection", null, new Object[0]);
                return;
            } catch (Exception e10) {
                this.f45905d.c("Call to Play startConnection error: %s", e10.getMessage());
            }
        }
        if (k.s()) {
            c();
            if (!this.f45904c.get()) {
                this.f45905d.d("Should not try to read Install referrer", new Object[0]);
                return;
            }
            Context context = this.f45907f;
            if (context == null) {
                return;
            }
            Object e11 = e(context);
            this.f45906e = e11;
            if (e11 == null || (k10 = k()) == null || (f10 = f(k10)) == null) {
                return;
            }
            t(k10, f10);
        }
    }

    public final void t(Class cls, Object obj) {
        try {
            u0.i(this.f45906e, "startConnection", new Class[]{cls}, obj);
        } catch (InvocationTargetException e10) {
            if (c1.E(e10)) {
                this.f45905d.c("InstallReferrer encountered an InvocationTargetException %s", c1.z(e10));
            }
        } catch (Exception e11) {
            this.f45905d.c("startConnection error (%s) thrown by (%s)", e11.getMessage(), e11.getClass().getCanonicalName());
        }
    }
}
