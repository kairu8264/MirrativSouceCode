package pi;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import hi.af;
import hi.be;
import hi.cf;
import hi.df;
import hi.gc;
import hi.ub;
import hi.ud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class t4 extends r9 implements f {

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Map<String, String>> f48225d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f48226e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f48227f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, hi.w3> f48228g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f48229h;

    /* renamed from: i  reason: collision with root package name */
    public final s.f<String, hi.c1> f48230i;

    /* renamed from: j  reason: collision with root package name */
    public final af f48231j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f48232k;

    public t4(ba baVar) {
        super(baVar);
        this.f48225d = new s.a();
        this.f48226e = new s.a();
        this.f48227f = new s.a();
        this.f48228g = new s.a();
        this.f48232k = new s.a();
        this.f48229h = new s.a();
        this.f48230i = new q4(this, 20);
        this.f48231j = new r4(this);
    }

    public static final Map<String, String> D(hi.w3 w3Var) {
        s.a aVar = new s.a();
        if (w3Var != null) {
            for (hi.y3 y3Var : w3Var.B()) {
                aVar.put(y3Var.s(), y3Var.t());
            }
        }
        return aVar;
    }

    public static /* bridge */ /* synthetic */ hi.c1 l(t4 t4Var, String str) {
        t4Var.g();
        rh.p.e(str);
        be.b();
        if (t4Var.f48285a.y().A(null, c3.f47731v0) && t4Var.t(str)) {
            if (t4Var.f48228g.containsKey(str) && t4Var.f48228g.get(str) != null) {
                t4Var.C(str, t4Var.f48228g.get(str));
            } else {
                t4Var.B(str);
            }
            return t4Var.f48230i.snapshot().get(str);
        }
        return null;
    }

    public final void A(String str, hi.v3 v3Var) {
        s.a aVar = new s.a();
        s.a aVar2 = new s.a();
        s.a aVar3 = new s.a();
        if (v3Var != null) {
            for (int i10 = 0; i10 < v3Var.o(); i10++) {
                hi.s3 l10 = v3Var.q(i10).l();
                if (TextUtils.isEmpty(l10.r())) {
                    this.f48285a.r().v().a("EventConfig contained null event name");
                } else {
                    String r10 = l10.r();
                    String b10 = z5.b(l10.r());
                    if (!TextUtils.isEmpty(b10)) {
                        l10.q(b10);
                        v3Var.s(i10, l10);
                    }
                    gc.b();
                    g y10 = this.f48285a.y();
                    b3<Boolean> b3Var = c3.E0;
                    if (!y10.A(null, b3Var)) {
                        aVar.put(r10, Boolean.valueOf(l10.s()));
                    } else if (l10.u() && l10.s()) {
                        aVar.put(r10, Boolean.TRUE);
                    }
                    gc.b();
                    if (!this.f48285a.y().A(null, b3Var)) {
                        aVar2.put(l10.r(), Boolean.valueOf(l10.t()));
                    } else if (l10.v() && l10.t()) {
                        aVar2.put(l10.r(), Boolean.TRUE);
                    }
                    if (l10.w()) {
                        if (l10.o() >= 2 && l10.o() <= 65535) {
                            aVar3.put(l10.r(), Integer.valueOf(l10.o()));
                        } else {
                            this.f48285a.r().v().c("Invalid sampling rate. Event name, sample rate", l10.r(), Integer.valueOf(l10.o()));
                        }
                    }
                }
            }
        }
        this.f48226e.put(str, aVar);
        this.f48227f.put(str, aVar2);
        this.f48229h.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x011b */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.t4.B(java.lang.String):void");
    }

    public final void C(final String str, hi.w3 w3Var) {
        if (w3Var.r() != 0) {
            this.f48285a.r().u().b("EES programs found", Integer.valueOf(w3Var.r()));
            hi.j5 j5Var = w3Var.A().get(0);
            try {
                hi.c1 c1Var = new hi.c1();
                c1Var.d("internal.remoteConfig", new Callable() { // from class: pi.n4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new ub("internal.remoteConfig", new s4(t4.this, str));
                    }
                });
                c1Var.d("internal.appMetadata", new Callable() { // from class: pi.p4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final t4 t4Var = t4.this;
                        final String str2 = str;
                        return new df("internal.appMetadata", new Callable() { // from class: pi.o4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                t4 t4Var2 = t4.this;
                                String str3 = str2;
                                g5 T = t4Var2.f48179b.V().T(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                t4Var2.f48285a.y().o();
                                hashMap.put("gmp_version", 46000L);
                                if (T != null) {
                                    String h02 = T.h0();
                                    if (h02 != null) {
                                        hashMap.put("app_version", h02);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(T.M()));
                                    hashMap.put("dynamite_version", Long.valueOf(T.V()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c1Var.d("internal.logger", new Callable() { // from class: pi.m4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new cf(t4.this.f48231j);
                    }
                });
                c1Var.c(j5Var);
                this.f48230i.put(str, c1Var);
                this.f48285a.r().u().c("EES program loaded for appId, activities", str, Integer.valueOf(j5Var.r().r()));
                for (hi.h5 h5Var : j5Var.r().u()) {
                    this.f48285a.r().u().b("EES program activity", h5Var.s());
                }
                return;
            } catch (zzd unused) {
                this.f48285a.r().p().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f48230i.remove(str);
    }

    @Override // pi.f
    public final String d(String str, String str2) {
        f();
        B(str);
        Map<String, String> map = this.f48225d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // pi.r9
    public final boolean j() {
        return false;
    }

    public final int k(String str, String str2) {
        Integer num;
        f();
        B(str);
        Map<String, Integer> map = this.f48229h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final hi.w3 m(String str) {
        g();
        f();
        rh.p.e(str);
        B(str);
        return this.f48228g.get(str);
    }

    public final String n(String str) {
        f();
        return this.f48232k.get(str);
    }

    public final void p(String str) {
        f();
        this.f48232k.put(str, null);
    }

    public final void q(String str) {
        f();
        this.f48228g.remove(str);
    }

    public final boolean s(String str) {
        f();
        hi.w3 m10 = m(str);
        if (m10 == null) {
            return false;
        }
        return m10.E();
    }

    public final boolean t(String str) {
        hi.w3 w3Var;
        be.b();
        return (!this.f48285a.y().A(null, c3.f47731v0) || TextUtils.isEmpty(str) || (w3Var = this.f48228g.get(str)) == null || w3Var.r() == 0) ? false : true;
    }

    public final boolean u(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(d(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        f();
        B(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f48227f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean w(String str, String str2) {
        Boolean bool;
        f();
        B(str);
        if (u(str) && ia.V(str2)) {
            return true;
        }
        if (x(str) && ia.W(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f48226e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean x(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(d(str, "measurement.upload.blacklist_public"));
    }

    public final boolean y(String str, byte[] bArr, String str2) {
        g();
        f();
        rh.p.e(str);
        hi.v3 l10 = z(str, bArr).l();
        if (l10 == null) {
            return false;
        }
        A(str, l10);
        be.b();
        if (this.f48285a.y().A(null, c3.f47731v0)) {
            C(str, l10.h());
        }
        this.f48228g.put(str, l10.h());
        this.f48232k.put(str, str2);
        this.f48225d.put(str, D(l10.h()));
        this.f48179b.V().m(str, new ArrayList(l10.t()));
        try {
            l10.r();
            bArr = l10.h().e();
        } catch (RuntimeException e10) {
            this.f48285a.r().v().c("Unable to serialize reduced-size config. Storing full config instead. appId", q3.y(str), e10);
        }
        ud.b();
        if (this.f48285a.y().A(null, c3.f47725s0)) {
            this.f48179b.V().q(str, bArr, str2);
        } else {
            this.f48179b.V().q(str, bArr, null);
        }
        this.f48228g.put(str, l10.h());
        return true;
    }

    public final hi.w3 z(String str, byte[] bArr) {
        if (bArr == null) {
            return hi.w3.x();
        }
        try {
            hi.w3 h10 = ((hi.v3) da.C(hi.w3.v(), bArr)).h();
            this.f48285a.r().u().c("Parsed config. version, gmp_app_id", h10.G() ? Long.valueOf(h10.t()) : null, h10.F() ? h10.y() : null);
            return h10;
        } catch (zzkh e10) {
            this.f48285a.r().v().c("Unable to merge remote config. appId", q3.y(str), e10);
            return hi.w3.x();
        } catch (RuntimeException e11) {
            this.f48285a.r().v().c("Unable to merge remote config. appId", q3.y(str), e11);
            return hi.w3.x();
        }
    }
}
