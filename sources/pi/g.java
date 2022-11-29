package pi;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class g extends v5 {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f47816b;

    /* renamed from: c  reason: collision with root package name */
    public f f47817c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f47818d;

    public g(b5 b5Var) {
        super(b5Var);
        this.f47817c = e.f47772a;
    }

    public static final long I() {
        return c3.f47696e.a(null).longValue();
    }

    public static final long g() {
        return c3.E.a(null).longValue();
    }

    public final boolean A(String str, b3<Boolean> b3Var) {
        boolean parseBoolean;
        if (str == null) {
            return b3Var.a(null).booleanValue();
        }
        String d10 = this.f47817c.d(str, b3Var.b());
        if (!TextUtils.isEmpty(d10)) {
            if (this.f48285a.y().A(null, c3.D0)) {
                parseBoolean = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(d10);
            } else {
                parseBoolean = Boolean.parseBoolean(d10);
            }
            return b3Var.a(Boolean.valueOf(parseBoolean)).booleanValue();
        }
        return b3Var.a(null).booleanValue();
    }

    public final boolean B(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.f47817c.d(str, "gaia_collection_enabled"));
    }

    public final boolean C() {
        Boolean s10 = s("google_analytics_automatic_screen_reporting_enabled");
        return s10 == null || s10.booleanValue();
    }

    public final boolean D() {
        this.f48285a.b();
        Boolean s10 = s("firebase_analytics_collection_deactivated");
        return s10 != null && s10.booleanValue();
    }

    public final boolean E(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.f47817c.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G() {
        if (this.f47816b == null) {
            Boolean s10 = s("app_measurement_lite");
            this.f47816b = s10;
            if (s10 == null) {
                this.f47816b = Boolean.FALSE;
            }
        }
        return this.f47816b.booleanValue() || !this.f48285a.q();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean H() {
        if (this.f47818d == null) {
            synchronized (this) {
                if (this.f47818d == null) {
                    ApplicationInfo applicationInfo = this.f48285a.F().getApplicationInfo();
                    String a10 = vh.p.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(a10)) {
                            z10 = true;
                        }
                        this.f47818d = Boolean.valueOf(z10);
                    }
                    if (this.f47818d == null) {
                        this.f47818d = Boolean.TRUE;
                        this.f48285a.r().p().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f47818d.booleanValue();
    }

    public final String h(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            rh.p.i(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f48285a.r().p().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f48285a.r().p().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f48285a.r().p().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f48285a.r().p().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final double i(String str, b3<Double> b3Var) {
        if (str == null) {
            return b3Var.a(null).doubleValue();
        }
        String d10 = this.f47817c.d(str, b3Var.b());
        if (TextUtils.isEmpty(d10)) {
            return b3Var.a(null).doubleValue();
        }
        try {
            return b3Var.a(Double.valueOf(Double.parseDouble(d10))).doubleValue();
        } catch (NumberFormatException unused) {
            return b3Var.a(null).doubleValue();
        }
    }

    public final int j(String str) {
        return n(str, c3.I, 500, 2000);
    }

    public final int k() {
        ia N = this.f48285a.N();
        Boolean J = N.f48285a.L().J();
        if (N.o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int l(String str) {
        return n(str, c3.J, 25, 100);
    }

    public final int m(String str, b3<Integer> b3Var) {
        if (str == null) {
            return b3Var.a(null).intValue();
        }
        String d10 = this.f47817c.d(str, b3Var.b());
        if (TextUtils.isEmpty(d10)) {
            return b3Var.a(null).intValue();
        }
        try {
            return b3Var.a(Integer.valueOf(Integer.parseInt(d10))).intValue();
        } catch (NumberFormatException unused) {
            return b3Var.a(null).intValue();
        }
    }

    public final int n(String str, b3<Integer> b3Var, int i10, int i11) {
        return Math.max(Math.min(m(str, b3Var), i11), i10);
    }

    public final long o() {
        this.f48285a.b();
        return 46000L;
    }

    public final long p(String str, b3<Long> b3Var) {
        if (str == null) {
            return b3Var.a(null).longValue();
        }
        String d10 = this.f47817c.d(str, b3Var.b());
        if (TextUtils.isEmpty(d10)) {
            return b3Var.a(null).longValue();
        }
        try {
            return b3Var.a(Long.valueOf(Long.parseLong(d10))).longValue();
        } catch (NumberFormatException unused) {
            return b3Var.a(null).longValue();
        }
    }

    public final Bundle q() {
        try {
            if (this.f48285a.F().getPackageManager() == null) {
                this.f48285a.r().p().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = xh.c.a(this.f48285a.F()).c(this.f48285a.F().getPackageName(), 128);
            if (c10 == null) {
                this.f48285a.r().p().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f48285a.r().p().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean s(String str) {
        rh.p.e(str);
        Bundle q10 = q();
        if (q10 == null) {
            this.f48285a.r().p().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (q10.containsKey(str)) {
            return Boolean.valueOf(q10.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String t() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String u() {
        return h("debug.deferred.deeplink", "");
    }

    public final String v() {
        this.f48285a.b();
        return "FA";
    }

    public final String w(String str, b3<String> b3Var) {
        if (str == null) {
            return b3Var.a(null);
        }
        return b3Var.a(this.f47817c.d(str, b3Var.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> x(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            rh.p.e(r4)
            android.os.Bundle r0 = r3.q()
            r1 = 0
            if (r0 != 0) goto L1d
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.p()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            pi.b5 r0 = r3.f48285a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.F()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            pi.b5 r0 = r3.f48285a
            pi.q3 r0 = r0.r()
            pi.o3 r0 = r0.p()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.g.x(java.lang.String):java.util.List");
    }

    public final void y(f fVar) {
        this.f47817c = fVar;
    }

    public final boolean z() {
        Boolean s10 = s("google_analytics_adid_collection_enabled");
        return s10 == null || s10.booleanValue();
    }
}
