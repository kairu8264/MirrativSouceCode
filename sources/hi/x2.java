package hi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: j  reason: collision with root package name */
    public static volatile x2 f36057j;

    /* renamed from: a  reason: collision with root package name */
    public final String f36058a;

    /* renamed from: b  reason: collision with root package name */
    public final vh.f f36059b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f36060c;

    /* renamed from: d  reason: collision with root package name */
    public final oi.a f36061d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Pair<pi.d6, n2>> f36062e;

    /* renamed from: f  reason: collision with root package name */
    public int f36063f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36064g;

    /* renamed from: h  reason: collision with root package name */
    public final String f36065h;

    /* renamed from: i  reason: collision with root package name */
    public volatile f1 f36066i;

    public x2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && n(str2, str3)) {
            this.f36058a = str;
        } else {
            this.f36058a = "FA";
        }
        this.f36059b = vh.i.b();
        this.f36060c = z0.a().a(new g2(this), 1);
        this.f36061d = new oi.a(this);
        this.f36062e = new ArrayList();
        try {
            if (pi.o7.c(context, "google_app_id", pi.u4.a(context)) != null && !j()) {
                this.f36065h = null;
                this.f36064g = true;
                Log.w(this.f36058a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (n(str2, str3)) {
            this.f36065h = str2;
        } else {
            this.f36065h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f36058a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f36058a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m(new v1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f36058a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new w2(this));
        }
    }

    public static final boolean j() {
        return true;
    }

    public static final boolean n(String str, String str2) {
        return (str2 == null || str == null || j()) ? false : true;
    }

    public static x2 u(Context context, String str, String str2, String str3, Bundle bundle) {
        rh.p.i(context);
        if (f36057j == null) {
            synchronized (x2.class) {
                if (f36057j == null) {
                    f36057j = new x2(context, str, str2, str3, bundle);
                }
            }
        }
        return f36057j;
    }

    public final String A() {
        b1 b1Var = new b1();
        m(new y1(this, b1Var));
        return b1Var.z0(500L);
    }

    public final List<Bundle> B(String str, String str2) {
        b1 b1Var = new b1();
        m(new s1(this, str, str2, b1Var));
        List<Bundle> list = (List) b1.h1(b1Var.s0(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> C(String str, String str2, boolean z10) {
        b1 b1Var = new b1();
        m(new d2(this, str, str2, z10, b1Var));
        Bundle s02 = b1Var.s0(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        if (s02 != null && s02.size() != 0) {
            HashMap hashMap = new HashMap(s02.size());
            for (String str3 : s02.keySet()) {
                Object obj = s02.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void G(String str) {
        m(new w1(this, str));
    }

    public final void H(String str, String str2, Bundle bundle) {
        m(new r1(this, str, str2, bundle));
    }

    public final void I(String str) {
        m(new x1(this, str));
    }

    public final void J(String str, Bundle bundle) {
        l(null, str, bundle, false, true, null);
    }

    public final void K(String str, String str2, Bundle bundle) {
        l(str, str2, bundle, true, true, null);
    }

    public final void a(int i10, String str, Object obj, Object obj2, Object obj3) {
        m(new e2(this, false, 5, str, obj, null, null));
    }

    public final void b(pi.d6 d6Var) {
        rh.p.i(d6Var);
        synchronized (this.f36062e) {
            for (int i10 = 0; i10 < this.f36062e.size(); i10++) {
                if (d6Var.equals(this.f36062e.get(i10).first)) {
                    Log.w(this.f36058a, "OnEventListener already registered.");
                    return;
                }
            }
            n2 n2Var = new n2(d6Var);
            this.f36062e.add(new Pair<>(d6Var, n2Var));
            if (this.f36066i != null) {
                try {
                    this.f36066i.registerOnMeasurementEventListener(n2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f36058a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m(new j2(this, n2Var));
        }
    }

    public final void c(Bundle bundle) {
        m(new q1(this, bundle));
    }

    public final void d(Bundle bundle) {
        m(new u1(this, bundle));
    }

    public final void e(Activity activity, String str, String str2) {
        m(new t1(this, activity, str, str2));
    }

    public final void f(boolean z10) {
        m(new i2(this, z10));
    }

    public final void g(String str, String str2, Object obj, boolean z10) {
        m(new l2(this, str, str2, obj, z10));
    }

    public final void k(Exception exc, boolean z10, boolean z11) {
        this.f36064g |= z10;
        if (z10) {
            Log.w(this.f36058a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f36058a, "Error with data collection. Data lost.", exc);
    }

    public final void l(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m(new k2(this, l10, str, str2, bundle, z10, z11));
    }

    public final void m(m2 m2Var) {
        this.f36060c.execute(m2Var);
    }

    public final int o(String str) {
        b1 b1Var = new b1();
        m(new h2(this, str, b1Var));
        Integer num = (Integer) b1.h1(b1Var.s0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long p() {
        b1 b1Var = new b1();
        m(new a2(this, b1Var));
        Long l10 = (Long) b1.h1(b1Var.s0(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f36059b.currentTimeMillis()).nextLong();
            int i10 = this.f36063f + 1;
            this.f36063f = i10;
            return nextLong + i10;
        }
        return l10.longValue();
    }

    public final Bundle q(Bundle bundle, boolean z10) {
        b1 b1Var = new b1();
        m(new f2(this, bundle, b1Var));
        if (z10) {
            return b1Var.s0(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        return null;
    }

    public final oi.a r() {
        return this.f36061d;
    }

    public final f1 t(Context context, boolean z10) {
        try {
            return e1.asInterface(DynamiteModule.e(context, DynamiteModule.f27231e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            k(e10, true, false);
            return null;
        }
    }

    public final String w() {
        return this.f36065h;
    }

    public final String x() {
        b1 b1Var = new b1();
        m(new z1(this, b1Var));
        return b1Var.z0(50L);
    }

    public final String y() {
        b1 b1Var = new b1();
        m(new c2(this, b1Var));
        return b1Var.z0(500L);
    }

    public final String z() {
        b1 b1Var = new b1();
        m(new b2(this, b1Var));
        return b1Var.z0(500L);
    }
}
