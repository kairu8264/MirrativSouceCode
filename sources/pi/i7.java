package pi;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hi.ke;
import hi.pc;
import hi.sc;
import hi.zc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i7 extends f4 {

    /* renamed from: c  reason: collision with root package name */
    public g7 f47938c;

    /* renamed from: d  reason: collision with root package name */
    public c6 f47939d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<d6> f47940e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47941f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<String> f47942g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f47943h;

    /* renamed from: i  reason: collision with root package name */
    public h f47944i;

    /* renamed from: j  reason: collision with root package name */
    public int f47945j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f47946k;

    /* renamed from: l  reason: collision with root package name */
    public long f47947l;

    /* renamed from: m  reason: collision with root package name */
    public int f47948m;

    /* renamed from: n  reason: collision with root package name */
    public final pa f47949n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f47950o;

    /* renamed from: p  reason: collision with root package name */
    public final ha f47951p;

    public i7(b5 b5Var) {
        super(b5Var);
        this.f47940e = new CopyOnWriteArraySet();
        this.f47943h = new Object();
        this.f47950o = true;
        this.f47951p = new v6(this);
        this.f47942g = new AtomicReference<>();
        this.f47944i = new h(null, null);
        this.f47945j = 100;
        this.f47947l = -1L;
        this.f47948m = 100;
        this.f47946k = new AtomicLong(0L);
        this.f47949n = new pa(b5Var);
    }

    public static /* synthetic */ void d0(i7 i7Var, h hVar, int i10, long j10, boolean z10, boolean z11) {
        i7Var.f();
        i7Var.g();
        if (j10 <= i7Var.f47947l && h.l(i7Var.f47948m, i10)) {
            i7Var.f48285a.r().t().b("Dropped out-of-date consent setting, proposed settings", hVar);
            return;
        }
        g4 E = i7Var.f48285a.E();
        b5 b5Var = E.f48285a;
        E.f();
        if (E.v(i10)) {
            SharedPreferences.Editor edit = E.m().edit();
            edit.putString("consent_settings", hVar.i());
            edit.putInt("consent_source", i10);
            edit.apply();
            i7Var.f47947l = j10;
            i7Var.f47948m = i10;
            i7Var.f48285a.L().s(z10);
            if (z11) {
                i7Var.f48285a.L().S(new AtomicReference<>());
                return;
            }
            return;
        }
        i7Var.f48285a.r().t().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f48285a.a().y(new o6(this, str, str2, obj, j10));
    }

    public final void B(String str) {
        this.f47942g.set(str);
    }

    public final void C(Bundle bundle) {
        D(bundle, this.f48285a.c().currentTimeMillis());
    }

    public final void D(Bundle bundle, long j10) {
        rh.p.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MRLog.PAYLOAD_KEY_APP_ID))) {
            this.f48285a.r().v().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MRLog.PAYLOAD_KEY_APP_ID);
        rh.p.i(bundle2);
        y5.a(bundle2, MRLog.PAYLOAD_KEY_APP_ID, String.class, null);
        y5.a(bundle2, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
        y5.a(bundle2, "name", String.class, null);
        y5.a(bundle2, "value", Object.class, null);
        y5.a(bundle2, "trigger_event_name", String.class, null);
        y5.a(bundle2, "trigger_timeout", Long.class, 0L);
        y5.a(bundle2, "timed_out_event_name", String.class, null);
        y5.a(bundle2, "timed_out_event_params", Bundle.class, null);
        y5.a(bundle2, "triggered_event_name", String.class, null);
        y5.a(bundle2, "triggered_event_params", Bundle.class, null);
        y5.a(bundle2, "time_to_live", Long.class, 0L);
        y5.a(bundle2, "expired_event_name", String.class, null);
        y5.a(bundle2, "expired_event_params", Bundle.class, null);
        rh.p.e(bundle2.getString("name"));
        rh.p.e(bundle2.getString(TtmlNode.ATTR_TTS_ORIGIN));
        rh.p.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f48285a.N().n0(string) == 0) {
            if (this.f48285a.N().j0(string, obj) == 0) {
                Object n10 = this.f48285a.N().n(string, obj);
                if (n10 == null) {
                    this.f48285a.r().p().c("Unable to normalize conditional user property value", this.f48285a.C().f(string), obj);
                    return;
                }
                y5.b(bundle2, n10);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f48285a.y();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.f48285a.r().p().c("Invalid conditional user property timeout", this.f48285a.C().f(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                this.f48285a.y();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.f48285a.a().y(new q6(this, bundle2));
                    return;
                } else {
                    this.f48285a.r().p().c("Invalid conditional user property time to live", this.f48285a.C().f(string), Long.valueOf(j12));
                    return;
                }
            }
            this.f48285a.r().p().c("Invalid conditional user property value", this.f48285a.C().f(string), obj);
            return;
        }
        this.f48285a.r().p().b("Invalid conditional user property name", this.f48285a.C().f(string));
    }

    public final void E(Bundle bundle, int i10, long j10) {
        g();
        String h10 = h.h(bundle);
        if (h10 != null) {
            this.f48285a.r().w().b("Ignoring invalid consent setting", h10);
            this.f48285a.r().w().a("Valid consent values are 'granted', 'denied'");
        }
        G(h.a(bundle), i10, j10);
    }

    public final void G(h hVar, int i10, long j10) {
        boolean z10;
        boolean z11;
        h hVar2;
        boolean z12;
        g();
        if (i10 != -10 && hVar.e() == null && hVar.f() == null) {
            this.f48285a.r().w().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f47943h) {
            z10 = true;
            z11 = false;
            if (h.l(i10, this.f47945j)) {
                boolean m10 = hVar.m(this.f47944i);
                if (hVar.k() && !this.f47944i.k()) {
                    z11 = true;
                }
                h d10 = hVar.d(this.f47944i);
                this.f47944i = d10;
                this.f47945j = i10;
                hVar2 = d10;
                z12 = z11;
                z11 = m10;
            } else {
                hVar2 = hVar;
                z12 = false;
                z10 = false;
            }
        }
        if (!z10) {
            this.f48285a.r().t().b("Ignoring lower-priority consent settings, proposed settings", hVar2);
            return;
        }
        long andIncrement = this.f47946k.getAndIncrement();
        if (z11) {
            this.f47942g.set(null);
            this.f48285a.a().z(new b7(this, hVar2, j10, i10, andIncrement, z12));
        } else if (i10 != 30 && i10 != -10) {
            this.f48285a.a().y(new d7(this, hVar2, i10, andIncrement, z12));
        } else {
            this.f48285a.a().z(new c7(this, hVar2, i10, andIncrement, z12));
        }
    }

    public final void H(final Bundle bundle, final long j10) {
        sc.b();
        if (this.f48285a.y().A(null, c3.f47729u0)) {
            this.f48285a.a().z(new Runnable() { // from class: pi.j6
                @Override // java.lang.Runnable
                public final void run() {
                    i7.this.n(bundle, j10);
                }
            });
        } else {
            n(bundle, j10);
        }
    }

    public final void I(c6 c6Var) {
        c6 c6Var2;
        f();
        g();
        if (c6Var != null && c6Var != (c6Var2 = this.f47939d)) {
            rh.p.m(c6Var2 == null, "EventInterceptor already set.");
        }
        this.f47939d = c6Var;
    }

    public final void J(Boolean bool) {
        g();
        this.f48285a.a().y(new a7(this, bool));
    }

    public final void K(h hVar) {
        f();
        boolean z10 = (hVar.k() && hVar.j()) || this.f48285a.L().z();
        if (z10 != this.f48285a.n()) {
            this.f48285a.j(z10);
            g4 E = this.f48285a.E();
            b5 b5Var = E.f48285a;
            E.f();
            Boolean valueOf = E.m().contains("measurement_enabled_from_api") ? Boolean.valueOf(E.m().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                Q(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void L(String str, String str2, Object obj, boolean z10) {
        M(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", obj, true, this.f48285a.c().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            pi.b5 r3 = r6.f48285a
            pi.ia r3 = r3.N()
            int r3 = r3.n0(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            pi.b5 r7 = r6.f48285a
            pi.ia r7 = r7.N()
            java.lang.String r8 = "user property"
            boolean r9 = r7.Q(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = pi.b6.f47645a
            r10 = 0
            boolean r9 = r7.M(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            pi.b5 r9 = r7.f48285a
            r9.y()
            boolean r7 = r7.L(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            pi.b5 r0 = r6.f48285a
            pi.ia r0 = r0.N()
            pi.b5 r1 = r6.f48285a
            r1.y()
            java.lang.String r13 = r0.o(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            pi.b5 r0 = r6.f48285a
            pi.ia r8 = r0.N()
            pi.ha r9 = r6.f47951p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.z(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            pi.b5 r7 = r6.f48285a
            pi.ia r7 = r7.N()
            int r11 = r7.j0(r2, r0)
            if (r11 == 0) goto Lab
            pi.b5 r1 = r6.f48285a
            pi.ia r1 = r1.N()
            pi.b5 r7 = r6.f48285a
            r7.y()
            java.lang.String r13 = r1.o(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            pi.b5 r0 = r6.f48285a
            pi.ia r8 = r0.N()
            pi.ha r9 = r6.f47951p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.z(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            pi.b5 r3 = r6.f48285a
            pi.ia r3 = r3.N()
            java.lang.Object r5 = r3.n(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.A(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.i7.M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            rh.p.e(r9)
            rh.p.e(r10)
            r8.f()
            r8.g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            pi.b5 r10 = r8.f48285a
            pi.g4 r10 = r10.E()
            pi.e4 r10 = r10.f47833m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.b(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            pi.b5 r10 = r8.f48285a
            pi.g4 r10 = r10.E()
            pi.e4 r10 = r10.f47833m
            java.lang.String r0 = "unset"
            r10.b(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            pi.b5 r10 = r8.f48285a
            boolean r10 = r10.m()
            if (r10 != 0) goto L7e
            pi.b5 r9 = r8.f48285a
            pi.q3 r9 = r9.r()
            pi.o3 r9 = r9.u()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7e:
            pi.b5 r10 = r8.f48285a
            boolean r10 = r10.p()
            if (r10 != 0) goto L87
            return
        L87:
            pi.ea r10 = new pi.ea
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            pi.b5 r9 = r8.f48285a
            pi.w8 r9 = r9.L()
            r9.x(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.i7.N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void O(d6 d6Var) {
        g();
        rh.p.i(d6Var);
        if (this.f47940e.remove(d6Var)) {
            return;
        }
        this.f48285a.r().v().a("OnEventListener had not been registered");
    }

    /* renamed from: P */
    public final void n(Bundle bundle, long j10) {
        sc.b();
        if (this.f48285a.y().A(null, c3.f47727t0) && !TextUtils.isEmpty(this.f48285a.A().t())) {
            this.f48285a.r().w().a("Using developer consent only; google app id found");
        } else {
            E(bundle, 0, j10);
        }
    }

    public final void Q(Boolean bool, boolean z10) {
        f();
        g();
        this.f48285a.r().o().b("Setting app measurement enabled (FE)", bool);
        this.f48285a.E().q(bool);
        if (z10) {
            g4 E = this.f48285a.E();
            b5 b5Var = E.f48285a;
            E.f();
            SharedPreferences.Editor edit = E.m().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f48285a.n() || !(bool == null || bool.booleanValue())) {
            R();
        }
    }

    public final void R() {
        f();
        String a10 = this.f48285a.E().f47833m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                N("app", "_npa", null, this.f48285a.c().currentTimeMillis());
            } else {
                N("app", "_npa", Long.valueOf(true != "true".equals(a10) ? 0L : 1L), this.f48285a.c().currentTimeMillis());
            }
        }
        if (this.f48285a.m() && this.f47950o) {
            this.f48285a.r().o().a("Recording app launch after enabling measurement for the first time (FE)");
            g0();
            zc.b();
            if (this.f48285a.y().A(null, c3.f47709k0)) {
                this.f48285a.M().f48049d.a();
            }
            this.f48285a.a().y(new l6(this));
            return;
        }
        this.f48285a.r().o().a("Updating Scion state (FE)");
        this.f48285a.L().v();
    }

    public final int S(String str) {
        rh.p.e(str);
        this.f48285a.y();
        return 25;
    }

    public final Boolean T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f48285a.a().p(atomicReference, 15000L, "boolean test flag value", new s6(this, atomicReference));
    }

    public final Double U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f48285a.a().p(atomicReference, 15000L, "double test flag value", new z6(this, atomicReference));
    }

    public final Integer V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f48285a.a().p(atomicReference, 15000L, "int test flag value", new y6(this, atomicReference));
    }

    public final Long W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f48285a.a().p(atomicReference, 15000L, "long test flag value", new x6(this, atomicReference));
    }

    public final String X() {
        return this.f47942g.get();
    }

    public final String Y() {
        p7 q10 = this.f48285a.K().q();
        if (q10 != null) {
            return q10.f48128b;
        }
        return null;
    }

    public final String Z() {
        p7 q10 = this.f48285a.K().q();
        if (q10 != null) {
            return q10.f48127a;
        }
        return null;
    }

    public final String a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f48285a.a().p(atomicReference, 15000L, "String test flag value", new w6(this, atomicReference));
    }

    public final ArrayList<Bundle> b0(String str, String str2) {
        if (this.f48285a.a().B()) {
            this.f48285a.r().p().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f48285a.b();
        if (b.a()) {
            this.f48285a.r().p().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f48285a.a().p(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get conditional user properties", new t6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f48285a.r().p().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return ia.t(list);
    }

    public final Map<String, Object> c0(String str, String str2, boolean z10) {
        if (this.f48285a.a().B()) {
            this.f48285a.r().p().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f48285a.b();
        if (b.a()) {
            this.f48285a.r().p().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f48285a.a().p(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new u6(this, atomicReference, null, str, str2, z10));
        List<ea> list = (List) atomicReference.get();
        if (list == null) {
            this.f48285a.r().p().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        s.a aVar = new s.a(list.size());
        for (ea eaVar : list) {
            Object p10 = eaVar.p();
            if (p10 != null) {
                aVar.put(eaVar.f47793x, p10);
            }
        }
        return aVar;
    }

    public final void g0() {
        f();
        g();
        if (this.f48285a.p()) {
            if (this.f48285a.y().A(null, c3.f47691b0)) {
                g y10 = this.f48285a.y();
                y10.f48285a.b();
                Boolean s10 = y10.s("google_analytics_deferred_deep_link_enabled");
                if (s10 != null && s10.booleanValue()) {
                    this.f48285a.r().o().a("Deferred Deep Link feature enabled.");
                    this.f48285a.a().y(new Runnable() { // from class: pi.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            i7 i7Var = i7.this;
                            i7Var.f();
                            if (!i7Var.f48285a.E().f47838r.b()) {
                                long a10 = i7Var.f48285a.E().f47839s.a();
                                i7Var.f48285a.E().f47839s.b(1 + a10);
                                i7Var.f48285a.y();
                                if (a10 >= 5) {
                                    i7Var.f48285a.r().v().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    i7Var.f48285a.E().f47838r.a(true);
                                    return;
                                }
                                i7Var.f48285a.h();
                                return;
                            }
                            i7Var.f48285a.r().o().a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f48285a.L().O();
            this.f47950o = false;
            g4 E = this.f48285a.E();
            E.f();
            String string = E.m().getString("previous_os_version", null);
            E.f48285a.z().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = E.m().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f48285a.z().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t(TtmlNode.TEXT_EMPHASIS_AUTO, "_ou", bundle);
        }
    }

    public final void h0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f48285a.c().currentTimeMillis();
        rh.p.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f48285a.a().y(new r6(this, bundle2));
    }

    @Override // pi.f4
    public final boolean l() {
        return false;
    }

    public final void m() {
        if (!(this.f48285a.F().getApplicationContext() instanceof Application) || this.f47938c == null) {
            return;
        }
        ((Application) this.f48285a.F().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f47938c);
    }

    public final /* synthetic */ void o(Bundle bundle) {
        if (bundle == null) {
            this.f48285a.E().f47843w.b(new Bundle());
            return;
        }
        Bundle a10 = this.f48285a.E().f47843w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f48285a.N().T(obj)) {
                    this.f48285a.N().z(this.f47951p, null, 27, null, null, 0);
                }
                this.f48285a.r().w().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ia.V(str)) {
                this.f48285a.r().w().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else {
                ia N = this.f48285a.N();
                this.f48285a.y();
                if (N.N("param", str, 100, obj)) {
                    this.f48285a.N().A(a10, str, obj);
                }
            }
        }
        this.f48285a.N();
        int k10 = this.f48285a.y().k();
        if (a10.size() > k10) {
            int i10 = 0;
            for (String str2 : new TreeSet(a10.keySet())) {
                i10++;
                if (i10 > k10) {
                    a10.remove(str2);
                }
            }
            this.f48285a.N().z(this.f47951p, null, 26, null, null, 0);
            this.f48285a.r().w().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f48285a.E().f47843w.b(a10);
        this.f48285a.L().u(a10);
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f48285a.c().currentTimeMillis());
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (ia.Z(str2, "screen_view")) {
            this.f48285a.K().E(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f47939d != null && !ia.V(str2)) {
            z12 = false;
        }
        z(str3, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void s(String str, String str2, Bundle bundle, String str3) {
        b5.s();
        z(TtmlNode.TEXT_EMPHASIS_AUTO, str2, this.f48285a.c().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void t(String str, String str2, Bundle bundle) {
        f();
        u(str, str2, this.f48285a.c().currentTimeMillis(), bundle);
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        f();
        v(str, str2, j10, bundle, true, this.f47939d == null || ia.V(str2), true, null);
    }

    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        rh.p.e(str);
        rh.p.i(bundle);
        f();
        g();
        if (this.f48285a.m()) {
            List<String> u10 = this.f48285a.A().u();
            if (u10 != null && !u10.contains(str2)) {
                this.f48285a.r().o().c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f47941f) {
                this.f47941f = true;
                try {
                    if (!this.f48285a.q()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f48285a.F().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f48285a.F());
                    } catch (Exception e10) {
                        this.f48285a.r().v().b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f48285a.r().t().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f48285a.b();
                N(TtmlNode.TEXT_EMPHASIS_AUTO, "_lgclid", bundle.getString("gclid"), this.f48285a.c().currentTimeMillis());
            }
            this.f48285a.b();
            if (z10 && ia.a0(str2)) {
                this.f48285a.N().x(bundle, this.f48285a.E().f47843w.a());
            }
            if (!z12) {
                this.f48285a.b();
                if (!"_iap".equals(str2)) {
                    ia N = this.f48285a.N();
                    int i10 = 2;
                    if (N.Q("event", str2)) {
                        if (N.M("event", z5.f48403a, z5.f48404b, str2)) {
                            N.f48285a.y();
                            if (N.L("event", 40, str2)) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 13;
                        }
                    }
                    if (i10 != 0) {
                        this.f48285a.r().q().b("Invalid public event name. Event will not be logged (FE)", this.f48285a.C().d(str2));
                        ia N2 = this.f48285a.N();
                        this.f48285a.y();
                        this.f48285a.N().z(this.f47951p, null, i10, "_ev", N2.o(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            ke.b();
            if (this.f48285a.y().A(null, c3.C0)) {
                this.f48285a.b();
                p7 s10 = this.f48285a.K().s(false);
                if (s10 != null && !bundle.containsKey("_sc")) {
                    s10.f48130d = true;
                }
                ia.w(s10, bundle, z10 && !z12);
            } else {
                this.f48285a.b();
                p7 s11 = this.f48285a.K().s(false);
                if (s11 != null && !bundle.containsKey("_sc")) {
                    s11.f48130d = true;
                }
                ia.w(s11, bundle, z10 && !z12);
            }
            boolean equals = TopicConstant.PACKET_TYPE_AUDIO_MP3.equals(str);
            boolean V = ia.V(str2);
            if (!z10 || this.f47939d == null || V) {
                z13 = equals;
            } else if (!equals) {
                this.f48285a.r().o().c("Passing event to registered event handler (FE)", this.f48285a.C().d(str2), this.f48285a.C().b(bundle));
                rh.p.i(this.f47939d);
                this.f47939d.a(str, str2, bundle, j10);
                return;
            } else {
                z13 = true;
            }
            if (this.f48285a.p()) {
                int k02 = this.f48285a.N().k0(str2);
                if (k02 != 0) {
                    this.f48285a.r().q().b("Invalid event name. Event will not be logged (FE)", this.f48285a.C().d(str2));
                    ia N3 = this.f48285a.N();
                    this.f48285a.y();
                    this.f48285a.N().z(this.f47951p, str3, k02, "_ev", N3.o(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle v02 = this.f48285a.N().v0(str3, str2, bundle, vh.g.c("_o", "_sn", "_sc", "_si"), z12);
                rh.p.i(v02);
                this.f48285a.b();
                if (this.f48285a.K().s(false) != null && "_ae".equals(str2)) {
                    k9 k9Var = this.f48285a.M().f48050e;
                    long elapsedRealtime = k9Var.f48009d.f48285a.c().elapsedRealtime();
                    long j12 = elapsedRealtime - k9Var.f48007b;
                    k9Var.f48007b = elapsedRealtime;
                    if (j12 > 0) {
                        this.f48285a.N().u(v02, j12);
                    }
                }
                pc.b();
                if (this.f48285a.y().A(null, c3.f47707j0)) {
                    if (!TtmlNode.TEXT_EMPHASIS_AUTO.equals(str) && "_ssr".equals(str2)) {
                        ia N4 = this.f48285a.N();
                        String string = v02.getString("_ffr");
                        if (vh.r.a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!ia.Z(string, N4.f48285a.E().f47840t.a())) {
                            N4.f48285a.E().f47840t.b(string);
                        } else {
                            N4.f48285a.r().o().a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String a10 = this.f48285a.N().f48285a.E().f47840t.a();
                        if (!TextUtils.isEmpty(a10)) {
                            v02.putString("_ffr", a10);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(v02);
                if (this.f48285a.E().f47835o.a() > 0 && this.f48285a.E().u(j10) && this.f48285a.E().f47837q.b()) {
                    this.f48285a.r().u().a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j11 = 0;
                    N(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", null, this.f48285a.c().currentTimeMillis());
                    N(TtmlNode.TEXT_EMPHASIS_AUTO, "_sno", null, this.f48285a.c().currentTimeMillis());
                    N(TtmlNode.TEXT_EMPHASIS_AUTO, "_se", null, this.f48285a.c().currentTimeMillis());
                } else {
                    str4 = "_ae";
                    j11 = 0;
                }
                if (v02.getLong("extend_session", j11) == 1) {
                    this.f48285a.r().u().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f48285a.M().f48049d.b(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(v02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str7 = (String) arrayList2.get(i11);
                    if (str7 != null) {
                        this.f48285a.N();
                        Object obj = v02.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            v02.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.f48285a.N().u0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f48285a.L().m(new u(str6, new s(bundle3), str, j10), str3);
                    if (!z13) {
                        for (d6 d6Var : this.f47940e) {
                            d6Var.a(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                }
                this.f48285a.b();
                if (this.f48285a.K().s(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f48285a.M().f48050e.d(true, true, this.f48285a.c().elapsedRealtime());
                return;
            }
            return;
        }
        this.f48285a.r().o().a("Event not sent since app measurement is disabled");
    }

    public final void w(d6 d6Var) {
        g();
        rh.p.i(d6Var);
        if (this.f47940e.add(d6Var)) {
            return;
        }
        this.f48285a.r().v().a("OnEventListener already registered");
    }

    public final void x(long j10) {
        this.f47942g.set(null);
        this.f48285a.a().y(new p6(this, j10));
    }

    public final void y(long j10, boolean z10) {
        f();
        g();
        this.f48285a.r().o().a("Resetting analytics data (FE)");
        m9 M = this.f48285a.M();
        M.f();
        M.f48050e.a();
        boolean m10 = this.f48285a.m();
        g4 E = this.f48285a.E();
        E.f47825e.b(j10);
        if (!TextUtils.isEmpty(E.f48285a.E().f47840t.a())) {
            E.f47840t.b(null);
        }
        zc.b();
        g y10 = E.f48285a.y();
        b3<Boolean> b3Var = c3.f47709k0;
        if (y10.A(null, b3Var)) {
            E.f47835o.b(0L);
        }
        if (!E.f48285a.y().D()) {
            E.s(!m10);
        }
        E.f47841u.b(null);
        E.f47842v.b(0L);
        E.f47843w.b(null);
        if (z10) {
            this.f48285a.L().o();
        }
        zc.b();
        if (this.f48285a.y().A(null, b3Var)) {
            this.f48285a.M().f48049d.a();
        }
        this.f47950o = !m10;
    }

    public final void z(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f48285a.a().y(new n6(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }
}
