package pi;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class w7 extends f4 {

    /* renamed from: c  reason: collision with root package name */
    public volatile p7 f48309c;

    /* renamed from: d  reason: collision with root package name */
    public volatile p7 f48310d;

    /* renamed from: e  reason: collision with root package name */
    public p7 f48311e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Activity, p7> f48312f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f48313g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f48314h;

    /* renamed from: i  reason: collision with root package name */
    public volatile p7 f48315i;

    /* renamed from: j  reason: collision with root package name */
    public p7 f48316j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f48317k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f48318l;

    /* renamed from: m  reason: collision with root package name */
    public p7 f48319m;

    /* renamed from: n  reason: collision with root package name */
    public String f48320n;

    public w7(b5 b5Var) {
        super(b5Var);
        this.f48318l = new Object();
        this.f48312f = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ void w(w7 w7Var, Bundle bundle, p7 p7Var, p7 p7Var2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        w7Var.n(p7Var, p7Var2, j10, true, w7Var.f48285a.N().v0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f48318l) {
            this.f48317k = false;
            this.f48314h = true;
        }
        long elapsedRealtime = this.f48285a.c().elapsedRealtime();
        if (!this.f48285a.y().C()) {
            this.f48309c = null;
            this.f48285a.a().y(new t7(this, elapsedRealtime));
            return;
        }
        p7 H = H(activity);
        this.f48310d = this.f48309c;
        this.f48309c = null;
        this.f48285a.a().y(new u7(this, H, elapsedRealtime));
    }

    public final void B(Activity activity) {
        synchronized (this.f48318l) {
            this.f48317k = true;
            if (activity != this.f48313g) {
                synchronized (this.f48318l) {
                    this.f48313g = activity;
                    this.f48314h = false;
                }
                if (this.f48285a.y().C()) {
                    this.f48315i = null;
                    this.f48285a.a().y(new v7(this));
                }
            }
        }
        if (!this.f48285a.y().C()) {
            this.f48309c = this.f48315i;
            this.f48285a.a().y(new s7(this));
            return;
        }
        m(activity, H(activity), false);
        d2 x10 = this.f48285a.x();
        x10.f48285a.a().y(new c1(x10, x10.f48285a.c().elapsedRealtime()));
    }

    public final void C(Activity activity, Bundle bundle) {
        p7 p7Var;
        if (!this.f48285a.y().C() || bundle == null || (p7Var = this.f48312f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(TtmlNode.ATTR_ID, p7Var.f48129c);
        bundle2.putString("name", p7Var.f48127a);
        bundle2.putString("referrer_name", p7Var.f48128b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            pi.b5 r0 = r3.f48285a
            pi.g r0 = r0.y()
            boolean r0 = r0.C()
            if (r0 != 0) goto L1c
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            pi.p7 r0 = r3.f48309c
            if (r0 != 0) goto L30
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map<android.app.Activity, pi.p7> r1 = r3.f48312f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.t(r6, r1)
        L54:
            java.lang.String r1 = r0.f48128b
            boolean r1 = pi.ia.Z(r1, r6)
            java.lang.String r0 = r0.f48127a
            boolean r0 = pi.ia.Z(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            pi.b5 r1 = r3.f48285a
            r1.y()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            pi.b5 r1 = r3.f48285a
            r1.y()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            pi.b5 r4 = r3.f48285a
            pi.q3 r4 = r4.r()
            pi.o3 r4 = r4.w()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            pi.b5 r0 = r3.f48285a
            pi.q3 r0 = r0.r()
            pi.o3 r0 = r0.u()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            pi.p7 r0 = new pi.p7
            pi.b5 r1 = r3.f48285a
            pi.ia r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, pi.p7> r5 = r3.f48312f
            r5.put(r4, r0)
            r5 = 1
            r3.m(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.w7.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.w7.E(android.os.Bundle, long):void");
    }

    public final void G(String str, p7 p7Var) {
        f();
        synchronized (this) {
            String str2 = this.f48320n;
            if (str2 == null || str2.equals(str) || p7Var != null) {
                this.f48320n = str;
                this.f48319m = p7Var;
            }
        }
    }

    public final p7 H(Activity activity) {
        rh.p.i(activity);
        p7 p7Var = this.f48312f.get(activity);
        if (p7Var == null) {
            p7 p7Var2 = new p7(null, t(activity.getClass(), "Activity"), this.f48285a.N().r0());
            this.f48312f.put(activity, p7Var2);
            p7Var = p7Var2;
        }
        return this.f48315i != null ? this.f48315i : p7Var;
    }

    @Override // pi.f4
    public final boolean l() {
        return false;
    }

    public final void m(Activity activity, p7 p7Var, boolean z10) {
        p7 p7Var2;
        p7 p7Var3 = this.f48309c == null ? this.f48310d : this.f48309c;
        if (p7Var.f48128b == null) {
            p7Var2 = new p7(p7Var.f48127a, activity != null ? t(activity.getClass(), "Activity") : null, p7Var.f48129c, p7Var.f48131e, p7Var.f48132f);
        } else {
            p7Var2 = p7Var;
        }
        this.f48310d = this.f48309c;
        this.f48309c = p7Var2;
        this.f48285a.a().y(new r7(this, p7Var2, p7Var3, this.f48285a.c().elapsedRealtime(), z10));
    }

    public final void n(p7 p7Var, p7 p7Var2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        long j12;
        f();
        boolean z11 = false;
        boolean z12 = (p7Var2 != null && p7Var2.f48129c == p7Var.f48129c && ia.Z(p7Var2.f48128b, p7Var.f48128b) && ia.Z(p7Var2.f48127a, p7Var.f48127a)) ? false : true;
        if (z10 && this.f48311e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            ia.w(p7Var, bundle3, true);
            if (p7Var2 != null) {
                String str = p7Var2.f48127a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = p7Var2.f48128b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", p7Var2.f48129c);
            }
            if (z11) {
                k9 k9Var = this.f48285a.M().f48050e;
                long j13 = j10 - k9Var.f48007b;
                k9Var.f48007b = j10;
                if (j13 > 0) {
                    this.f48285a.N().u(bundle3, j13);
                }
            }
            if (!this.f48285a.y().C()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != p7Var.f48131e ? TtmlNode.TEXT_EMPHASIS_AUTO : "app";
            long currentTimeMillis = this.f48285a.c().currentTimeMillis();
            if (p7Var.f48131e) {
                j11 = currentTimeMillis;
                long j14 = p7Var.f48132f;
                if (j14 != 0) {
                    j12 = j14;
                    this.f48285a.I().u(str3, "_vs", j12, bundle3);
                }
            } else {
                j11 = currentTimeMillis;
            }
            j12 = j11;
            this.f48285a.I().u(str3, "_vs", j12, bundle3);
        }
        if (z11) {
            o(this.f48311e, true, j10);
        }
        this.f48311e = p7Var;
        if (p7Var.f48131e) {
            this.f48316j = p7Var;
        }
        this.f48285a.L().t(p7Var);
    }

    public final void o(p7 p7Var, boolean z10, long j10) {
        this.f48285a.x().l(this.f48285a.c().elapsedRealtime());
        if (!this.f48285a.M().f48050e.d(p7Var != null && p7Var.f48130d, z10, j10) || p7Var == null) {
            return;
        }
        p7Var.f48130d = false;
    }

    public final p7 q() {
        return this.f48309c;
    }

    public final p7 s(boolean z10) {
        g();
        f();
        if (z10) {
            p7 p7Var = this.f48311e;
            return p7Var != null ? p7Var : this.f48316j;
        }
        return this.f48311e;
    }

    public final String t(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f48285a.y();
        if (length2 > 100) {
            this.f48285a.y();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f48285a.y().C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f48312f.put(activity, new p7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(TtmlNode.ATTR_ID)));
    }

    public final void z(Activity activity) {
        synchronized (this.f48318l) {
            if (activity == this.f48313g) {
                this.f48313g = null;
            }
        }
        if (this.f48285a.y().C()) {
            this.f48312f.remove(activity);
        }
    }
}
