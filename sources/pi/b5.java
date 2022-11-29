package pi;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hi.pc;
import hi.sc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b5 implements x5 {
    public static volatile b5 H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final long G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f47619a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47620b;

    /* renamed from: c  reason: collision with root package name */
    public final String f47621c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47622d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f47623e;

    /* renamed from: f  reason: collision with root package name */
    public final b f47624f;

    /* renamed from: g  reason: collision with root package name */
    public final g f47625g;

    /* renamed from: h  reason: collision with root package name */
    public final g4 f47626h;

    /* renamed from: i  reason: collision with root package name */
    public final q3 f47627i;

    /* renamed from: j  reason: collision with root package name */
    public final y4 f47628j;

    /* renamed from: k  reason: collision with root package name */
    public final m9 f47629k;

    /* renamed from: l  reason: collision with root package name */
    public final ia f47630l;

    /* renamed from: m  reason: collision with root package name */
    public final l3 f47631m;

    /* renamed from: n  reason: collision with root package name */
    public final vh.f f47632n;

    /* renamed from: o  reason: collision with root package name */
    public final w7 f47633o;

    /* renamed from: p  reason: collision with root package name */
    public final i7 f47634p;

    /* renamed from: q  reason: collision with root package name */
    public final d2 f47635q;

    /* renamed from: r  reason: collision with root package name */
    public final m7 f47636r;

    /* renamed from: s  reason: collision with root package name */
    public final String f47637s;

    /* renamed from: t  reason: collision with root package name */
    public j3 f47638t;

    /* renamed from: u  reason: collision with root package name */
    public w8 f47639u;

    /* renamed from: v  reason: collision with root package name */
    public o f47640v;

    /* renamed from: w  reason: collision with root package name */
    public h3 f47641w;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f47643y;

    /* renamed from: z  reason: collision with root package name */
    public long f47644z;

    /* renamed from: x  reason: collision with root package name */
    public boolean f47642x = false;
    public final AtomicInteger F = new AtomicInteger(0);

    public b5(f6 f6Var) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z10 = false;
        rh.p.i(f6Var);
        b bVar = new b(f6Var.f47804a);
        this.f47624f = bVar;
        z2.f48396a = bVar;
        Context context = f6Var.f47804a;
        this.f47619a = context;
        this.f47620b = f6Var.f47805b;
        this.f47621c = f6Var.f47806c;
        this.f47622d = f6Var.f47807d;
        this.f47623e = f6Var.f47811h;
        this.A = f6Var.f47808e;
        this.f47637s = f6Var.f47813j;
        this.D = true;
        hi.o1 o1Var = f6Var.f47810g;
        if (o1Var != null && (bundle = o1Var.C) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = o1Var.C.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        hi.q6.d(context);
        vh.f b10 = vh.i.b();
        this.f47632n = b10;
        Long l10 = f6Var.f47812i;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = b10.currentTimeMillis();
        }
        this.G = currentTimeMillis;
        this.f47625g = new g(this);
        g4 g4Var = new g4(this);
        g4Var.j();
        this.f47626h = g4Var;
        q3 q3Var = new q3(this);
        q3Var.j();
        this.f47627i = q3Var;
        ia iaVar = new ia(this);
        iaVar.j();
        this.f47630l = iaVar;
        this.f47631m = new l3(new e6(f6Var, this));
        this.f47635q = new d2(this);
        w7 w7Var = new w7(this);
        w7Var.h();
        this.f47633o = w7Var;
        i7 i7Var = new i7(this);
        i7Var.h();
        this.f47634p = i7Var;
        m9 m9Var = new m9(this);
        m9Var.h();
        this.f47629k = m9Var;
        m7 m7Var = new m7(this);
        m7Var.j();
        this.f47636r = m7Var;
        y4 y4Var = new y4(this);
        y4Var.j();
        this.f47628j = y4Var;
        hi.o1 o1Var2 = f6Var.f47810g;
        z10 = (o1Var2 == null || o1Var2.f35890x == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            i7 I = I();
            if (I.f48285a.f47619a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f48285a.f47619a.getApplicationContext();
                if (I.f47938c == null) {
                    I.f47938c = new g7(I, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(I.f47938c);
                    application.registerActivityLifecycleCallbacks(I.f47938c);
                    I.f48285a.r().u().a("Registered activity lifecycle callback");
                }
            }
        } else {
            r().v().a("Application context is not an Application");
        }
        y4Var.y(new a5(this, f6Var));
    }

    public static b5 H(Context context, hi.o1 o1Var, Long l10) {
        Bundle bundle;
        if (o1Var != null && (o1Var.A == null || o1Var.B == null)) {
            o1Var = new hi.o1(o1Var.f35889w, o1Var.f35890x, o1Var.f35891y, o1Var.f35892z, null, null, o1Var.C, null);
        }
        rh.p.i(context);
        rh.p.i(context.getApplicationContext());
        if (H == null) {
            synchronized (b5.class) {
                if (H == null) {
                    H = new b5(new f6(context, o1Var, l10));
                }
            }
        } else if (o1Var != null && (bundle = o1Var.C) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            rh.p.i(H);
            H.A = Boolean.valueOf(o1Var.C.getBoolean("dataCollectionDefaultEnabled"));
        }
        rh.p.i(H);
        return H;
    }

    public static /* bridge */ /* synthetic */ void d(b5 b5Var, f6 f6Var) {
        b5Var.a().f();
        b5Var.f47625g.v();
        o oVar = new o(b5Var);
        oVar.j();
        b5Var.f47640v = oVar;
        h3 h3Var = new h3(b5Var, f6Var.f47809f);
        h3Var.h();
        b5Var.f47641w = h3Var;
        j3 j3Var = new j3(b5Var);
        j3Var.h();
        b5Var.f47638t = j3Var;
        w8 w8Var = new w8(b5Var);
        w8Var.h();
        b5Var.f47639u = w8Var;
        b5Var.f47630l.k();
        b5Var.f47626h.k();
        b5Var.f47641w.i();
        o3 t10 = b5Var.r().t();
        b5Var.f47625g.o();
        t10.b("App measurement initialized, version", 46000L);
        b5Var.r().t().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q10 = h3Var.q();
        if (TextUtils.isEmpty(b5Var.f47620b)) {
            if (b5Var.N().S(q10)) {
                b5Var.r().t().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                o3 t11 = b5Var.r().t();
                String valueOf = String.valueOf(q10);
                t11.a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        b5Var.r().o().a("Debug-level message logging enabled");
        if (b5Var.E != b5Var.F.get()) {
            b5Var.r().p().c("Not all components initialized", Integer.valueOf(b5Var.E), Integer.valueOf(b5Var.F.get()));
        }
        b5Var.f47642x = true;
    }

    public static final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void t(v5 v5Var) {
        if (v5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void u(f4 f4Var) {
        if (f4Var != null) {
            if (!f4Var.k()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f4Var.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void v(w5 w5Var) {
        if (w5Var != null) {
            if (!w5Var.l()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w5Var.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final h3 A() {
        u(this.f47641w);
        return this.f47641w;
    }

    @Pure
    public final j3 B() {
        u(this.f47638t);
        return this.f47638t;
    }

    @Pure
    public final l3 C() {
        return this.f47631m;
    }

    public final q3 D() {
        q3 q3Var = this.f47627i;
        if (q3Var == null || !q3Var.l()) {
            return null;
        }
        return this.f47627i;
    }

    @Pure
    public final g4 E() {
        t(this.f47626h);
        return this.f47626h;
    }

    @Override // pi.x5
    @Pure
    public final Context F() {
        return this.f47619a;
    }

    @SideEffectFree
    public final y4 G() {
        return this.f47628j;
    }

    @Pure
    public final i7 I() {
        u(this.f47634p);
        return this.f47634p;
    }

    @Pure
    public final m7 J() {
        v(this.f47636r);
        return this.f47636r;
    }

    @Pure
    public final w7 K() {
        u(this.f47633o);
        return this.f47633o;
    }

    @Pure
    public final w8 L() {
        u(this.f47639u);
        return this.f47639u;
    }

    @Pure
    public final m9 M() {
        u(this.f47629k);
        return this.f47629k;
    }

    @Pure
    public final ia N() {
        t(this.f47630l);
        return this.f47630l;
    }

    @Pure
    public final String O() {
        return this.f47620b;
    }

    @Pure
    public final String P() {
        return this.f47621c;
    }

    @Pure
    public final String Q() {
        return this.f47622d;
    }

    @Pure
    public final String R() {
        return this.f47637s;
    }

    @Override // pi.x5
    @Pure
    public final y4 a() {
        v(this.f47628j);
        return this.f47628j;
    }

    @Override // pi.x5
    @Pure
    public final b b() {
        return this.f47624f;
    }

    @Override // pi.x5
    @Pure
    public final vh.f c() {
        return this.f47632n;
    }

    public final void e() {
        this.F.incrementAndGet();
    }

    public final /* synthetic */ void f(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            r().v().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
        }
        if (th2 == null) {
            E().f47838r.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString(Referer.DEEPLINK, "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        r().o().a("Deferred Deep Link is empty.");
                        return;
                    }
                    ia N = N();
                    b5 b5Var = N.f48285a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = N.f48285a.f47619a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f47634p.t(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmp", bundle);
                        ia N2 = N();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = N2.f48285a.f47619a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString(Referer.DEEPLINK, optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                N2.f48285a.f47619a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            N2.f48285a.r().p().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                    r().v().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    r().p().b("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            r().o().a("Deferred Deep Link response empty.");
            return;
        }
        r().v().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
    }

    public final void g() {
        this.E++;
    }

    public final void h() {
        a().f();
        v(J());
        String q10 = A().q();
        Pair<String, Boolean> n10 = E().n(q10);
        if (this.f47625g.z() && !((Boolean) n10.second).booleanValue() && !TextUtils.isEmpty((CharSequence) n10.first)) {
            m7 J = J();
            J.i();
            ConnectivityManager connectivityManager = (ConnectivityManager) J.f48285a.f47619a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                ia N = N();
                A().f48285a.f47625g.o();
                URL p10 = N.p(46000L, q10, (String) n10.first, E().f47839s.a() - 1);
                if (p10 != null) {
                    m7 J2 = J();
                    z4 z4Var = new z4(this);
                    J2.f();
                    J2.i();
                    rh.p.i(p10);
                    rh.p.i(z4Var);
                    J2.f48285a.a().x(new l7(J2, q10, p10, null, null, z4Var, null));
                    return;
                }
                return;
            }
            r().v().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        r().o().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    public final void i(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void j(boolean z10) {
        a().f();
        this.D = z10;
    }

    public final void k(hi.o1 o1Var) {
        h hVar;
        a().f();
        h o10 = E().o();
        g4 E = E();
        b5 b5Var = E.f48285a;
        E.f();
        int i10 = 100;
        int i11 = E.m().getInt("consent_source", 100);
        g gVar = this.f47625g;
        b5 b5Var2 = gVar.f48285a;
        Boolean s10 = gVar.s("google_analytics_default_allow_ad_storage");
        g gVar2 = this.f47625g;
        b5 b5Var3 = gVar2.f48285a;
        Boolean s11 = gVar2.s("google_analytics_default_allow_analytics_storage");
        if ((s10 != null || s11 != null) && E().v(-10)) {
            hVar = new h(s10, s11);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(A().t()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                I().G(h.f47884c, -10, this.G);
            } else {
                sc.b();
                if ((!this.f47625g.A(null, c3.f47727t0) || TextUtils.isEmpty(A().t())) && o1Var != null && o1Var.C != null && E().v(30)) {
                    hVar = h.a(o1Var.C);
                    if (!hVar.equals(h.f47884c)) {
                        i10 = 30;
                    }
                }
            }
            hVar = null;
        }
        if (hVar != null) {
            I().G(hVar, i10, this.G);
            o10 = hVar;
        }
        I().K(o10);
        if (E().f47825e.a() == 0) {
            r().u().b("Persisting first open", Long.valueOf(this.G));
            E().f47825e.b(this.G);
        }
        I().f47949n.c();
        if (!p()) {
            if (m()) {
                if (!N().R("android.permission.INTERNET")) {
                    r().p().a("App is missing INTERNET permission");
                }
                if (!N().R("android.permission.ACCESS_NETWORK_STATE")) {
                    r().p().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!xh.c.a(this.f47619a).g() && !this.f47625g.G()) {
                    if (!ia.X(this.f47619a)) {
                        r().p().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!ia.Y(this.f47619a, false)) {
                        r().p().a("AppMeasurementService not registered/enabled");
                    }
                }
                r().p().a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(A().t()) || !TextUtils.isEmpty(A().p())) {
                ia N = N();
                String t10 = A().t();
                g4 E2 = E();
                E2.f();
                String string = E2.m().getString("gmp_app_id", null);
                String p10 = A().p();
                g4 E3 = E();
                E3.f();
                if (N.b0(t10, string, p10, E3.m().getString("admob_app_id", null))) {
                    r().t().a("Rechecking which service to use due to a GMP App Id change");
                    g4 E4 = E();
                    E4.f();
                    Boolean p11 = E4.p();
                    SharedPreferences.Editor edit = E4.m().edit();
                    edit.clear();
                    edit.apply();
                    if (p11 != null) {
                        E4.q(p11);
                    }
                    B().o();
                    this.f47639u.Q();
                    this.f47639u.P();
                    E().f47825e.b(this.G);
                    E().f47827g.b(null);
                }
                g4 E5 = E();
                String t11 = A().t();
                E5.f();
                SharedPreferences.Editor edit2 = E5.m().edit();
                edit2.putString("gmp_app_id", t11);
                edit2.apply();
                g4 E6 = E();
                String p12 = A().p();
                E6.f();
                SharedPreferences.Editor edit3 = E6.m().edit();
                edit3.putString("admob_app_id", p12);
                edit3.apply();
            }
            if (!E().o().k()) {
                E().f47827g.b(null);
            }
            I().B(E().f47827g.a());
            pc.b();
            if (this.f47625g.A(null, c3.f47707j0)) {
                try {
                    N().f48285a.f47619a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(E().f47840t.a())) {
                        r().v().a("Remote config removed with active feature rollouts");
                        E().f47840t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(A().t()) || !TextUtils.isEmpty(A().p())) {
                boolean m10 = m();
                if (!E().t() && !this.f47625g.D()) {
                    E().s(!m10);
                }
                if (m10) {
                    I().g0();
                }
                M().f48049d.a();
                L().S(new AtomicReference<>());
                L().u(E().f47843w.a());
            }
        }
        E().f47834n.a(true);
    }

    public final boolean l() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean m() {
        return w() == 0;
    }

    public final boolean n() {
        a().f();
        return this.D;
    }

    @Pure
    public final boolean o() {
        return TextUtils.isEmpty(this.f47620b);
    }

    public final boolean p() {
        if (this.f47642x) {
            a().f();
            Boolean bool = this.f47643y;
            if (bool == null || this.f47644z == 0 || (!bool.booleanValue() && Math.abs(this.f47632n.elapsedRealtime() - this.f47644z) > 1000)) {
                this.f47644z = this.f47632n.elapsedRealtime();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(N().R("android.permission.INTERNET") && N().R("android.permission.ACCESS_NETWORK_STATE") && (xh.c.a(this.f47619a).g() || this.f47625g.G() || (ia.X(this.f47619a) && ia.Y(this.f47619a, false))));
                this.f47643y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!N().K(A().t(), A().p(), A().s()) && TextUtils.isEmpty(A().p())) {
                        z10 = false;
                    }
                    this.f47643y = Boolean.valueOf(z10);
                }
            }
            return this.f47643y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean q() {
        return this.f47623e;
    }

    @Override // pi.x5
    @Pure
    public final q3 r() {
        v(this.f47627i);
        return this.f47627i;
    }

    public final int w() {
        a().f();
        if (this.f47625g.D()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool == null || !bool.booleanValue()) {
            a().f();
            if (this.D) {
                Boolean p10 = E().p();
                if (p10 != null) {
                    return p10.booleanValue() ? 0 : 3;
                }
                g gVar = this.f47625g;
                b bVar = gVar.f48285a.f47624f;
                Boolean s10 = gVar.s("firebase_analytics_collection_enabled");
                if (s10 != null) {
                    return s10.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f47625g.A(null, c3.U) || this.A == null || this.A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Pure
    public final d2 x() {
        d2 d2Var = this.f47635q;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final g y() {
        return this.f47625g;
    }

    @Pure
    public final o z() {
        v(this.f47640v);
        return this.f47640v;
    }
}
