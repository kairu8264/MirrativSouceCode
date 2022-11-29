package ai;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ms1 implements us1, wr1 {

    /* renamed from: a  reason: collision with root package name */
    public final ts1 f7021a;

    /* renamed from: b  reason: collision with root package name */
    public final vs1 f7022b;

    /* renamed from: c  reason: collision with root package name */
    public final xr1 f7023c;

    /* renamed from: d  reason: collision with root package name */
    public final gs1 f7024d;

    /* renamed from: e  reason: collision with root package name */
    public final vr1 f7025e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7026f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7032l;

    /* renamed from: m  reason: collision with root package name */
    public int f7033m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7034n;

    /* renamed from: h  reason: collision with root package name */
    public String f7028h = "{}";

    /* renamed from: i  reason: collision with root package name */
    public String f7029i = "";

    /* renamed from: j  reason: collision with root package name */
    public long f7030j = Long.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public hs1 f7031k = hs1.NONE;

    /* renamed from: o  reason: collision with root package name */
    public ls1 f7035o = ls1.UNKNOWN;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, List<zr1>> f7027g = new HashMap();

    public ms1(ts1 ts1Var, vs1 vs1Var, xr1 xr1Var, Context context, zj0 zj0Var, gs1 gs1Var) {
        this.f7021a = ts1Var;
        this.f7022b = vs1Var;
        this.f7023c = xr1Var;
        this.f7025e = new vr1(context);
        this.f7026f = zj0Var.f13013w;
        this.f7024d = gs1Var;
        wg.t.n().a(this);
    }

    public final void a() {
        if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue()) {
            if (((Boolean) ft.c().c(ox.E6)).booleanValue() && wg.t.h().p().Q()) {
                r();
                return;
            }
            String I = wg.t.h().p().I();
            if (TextUtils.isEmpty(I)) {
                return;
            }
            try {
                if (new JSONObject(I).optBoolean("isTestMode", false)) {
                    r();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f7034n
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.r()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f7032l
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.s()
            return
        L15:
            boolean r2 = r1.n()
            if (r2 != 0) goto L1e
            r1.t()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ms1.b(boolean):void");
    }

    public final void c(boolean z10) {
        if (!this.f7034n && z10) {
            r();
        }
        o(z10, true);
    }

    public final synchronized boolean d() {
        return this.f7032l;
    }

    public final void e(hs1 hs1Var) {
        p(hs1Var, true);
    }

    public final hs1 f() {
        return this.f7031k;
    }

    public final synchronized String g() {
        if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && n()) {
            if (this.f7030j < wg.t.k().currentTimeMillis() / 1000) {
                this.f7028h = "{}";
                this.f7030j = Long.MAX_VALUE;
                return "";
            } else if (this.f7028h.equals("{}")) {
                return "";
            } else {
                return this.f7028h;
            }
        }
        return "";
    }

    public final synchronized String h() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f7032l);
            jSONObject.put("gesture", this.f7031k);
            if (this.f7030j > wg.t.k().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.f7028h);
                jSONObject.put("networkExtrasExpirationSecs", this.f7030j);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void i(String str, long j10) {
        this.f7028h = str;
        this.f7030j = j10;
        u();
    }

    public final synchronized void j(String str, zr1 zr1Var) {
        if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && n()) {
            if (this.f7033m >= ((Integer) ft.c().c(ox.f8083r6)).intValue()) {
                uj0.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f7027g.containsKey(str)) {
                this.f7027g.put(str, new ArrayList());
            }
            this.f7033m++;
            this.f7027g.get(str).add(zr1Var);
        }
    }

    public final synchronized void k(cv cvVar, ls1 ls1Var) {
        if (!n()) {
            try {
                cvVar.x0(tm2.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                uj0.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) ft.c().c(ox.f8067p6)).booleanValue()) {
            try {
                cvVar.x0(tm2.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                uj0.f("Ad inspector had an internal error.");
                return;
            }
        }
        this.f7035o = ls1Var;
        this.f7021a.e(cvVar, new s30(this));
        return;
    }

    public final synchronized void l(String str) {
        this.f7029i = str;
    }

    public final synchronized JSONObject m() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f7026f);
            jSONObject.put("adapters", this.f7024d.b());
            if (this.f7030j < wg.t.k().currentTimeMillis() / 1000) {
                this.f7028h = "{}";
            }
            jSONObject.put("networkExtras", this.f7028h);
            jSONObject.put("adSlots", q());
            jSONObject.put("appInfo", this.f7025e.a());
            String d10 = wg.t.h().p().n().d();
            if (!TextUtils.isEmpty(d10)) {
                jSONObject.put("cld", new JSONObject(d10));
            }
            if (((Boolean) ft.c().c(ox.F6)).booleanValue() && !TextUtils.isEmpty(this.f7029i)) {
                String valueOf = String.valueOf(this.f7029i);
                uj0.a(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.f7029i));
            }
            if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
                jSONObject.put("openAction", this.f7035o);
                jSONObject.put("gesture", this.f7031k);
            }
        } catch (JSONException e10) {
            wg.t.h().l(e10, "Inspector.toJson");
            uj0.g("Ad inspector encountered an error", e10);
        }
        return jSONObject;
    }

    public final synchronized boolean n() {
        if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
            return this.f7032l || wg.t.n().k();
        }
        return this.f7032l;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void o(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f7032l     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.f7032l = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            ai.gx<java.lang.Boolean> r2 = ai.ox.E6     // Catch: java.lang.Throwable -> L3d
            ai.mx r0 = ai.ft.c()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.c(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            yg.a0 r2 = wg.t.n()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.s()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.n()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.t()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.u()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ms1.o(boolean, boolean):void");
    }

    public final synchronized void p(hs1 hs1Var, boolean z10) {
        if (this.f7031k == hs1Var) {
            return;
        }
        if (n()) {
            t();
        }
        this.f7031k = hs1Var;
        if (n()) {
            s();
        }
        if (z10) {
            u();
        }
    }

    public final synchronized JSONObject q() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<zr1>> entry : this.f7027g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zr1 zr1Var : entry.getValue()) {
                if (zr1Var.a()) {
                    jSONArray.put(zr1Var.b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    public final void r() {
        this.f7034n = true;
        this.f7024d.a();
        this.f7021a.a(this);
        this.f7022b.a(this);
        this.f7023c.a(this);
        v(wg.t.h().p().I());
    }

    public final synchronized void s() {
        hs1 hs1Var = hs1.NONE;
        int ordinal = this.f7031k.ordinal();
        if (ordinal == 1) {
            this.f7022b.b();
        } else if (ordinal != 2) {
        } else {
            this.f7023c.b();
        }
    }

    public final synchronized void t() {
        hs1 hs1Var = hs1.NONE;
        int ordinal = this.f7031k.ordinal();
        if (ordinal == 1) {
            this.f7022b.c();
        } else if (ordinal != 2) {
        } else {
            this.f7023c.c();
        }
    }

    public final void u() {
        wg.t.h().p().v(h());
    }

    public final synchronized void v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            o(jSONObject.optBoolean("isTestMode", false), false);
            p(hs1.a(jSONObject.optString("gesture", "NONE")), false);
            this.f7028h = jSONObject.optString("networkExtras", "{}");
            this.f7030j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
