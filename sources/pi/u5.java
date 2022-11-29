package pi;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.gms.internal.measurement.zzd;
import hi.be;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class u5 extends f3 {

    /* renamed from: w  reason: collision with root package name */
    public final ba f48261w;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f48262x;

    /* renamed from: y  reason: collision with root package name */
    public String f48263y;

    public u5(ba baVar, String str) {
        rh.p.i(baVar);
        this.f48261w = baVar;
        this.f48263y = null;
    }

    public final void B4(u uVar, na naVar) {
        if (!this.f48261w.Z().t(naVar.f48080w)) {
            z0(uVar, naVar);
            return;
        }
        this.f48261w.r().u().b("EES config found for", naVar.f48080w);
        t4 Z = this.f48261w.Z();
        String str = naVar.f48080w;
        be.b();
        hi.c1 c1Var = null;
        if (Z.f48285a.y().A(null, c3.f47731v0) && !TextUtils.isEmpty(str)) {
            c1Var = Z.f48230i.get(str);
        }
        if (c1Var != null) {
            try {
                Map<String, Object> K = this.f48261w.f0().K(uVar.f48251x.S(), true);
                String a10 = z5.a(uVar.f48250w);
                if (a10 == null) {
                    a10 = uVar.f48250w;
                }
                if (c1Var.e(new hi.b(a10, uVar.f48253z, K))) {
                    if (c1Var.g()) {
                        this.f48261w.r().u().b("EES edited event", uVar.f48250w);
                        z0(this.f48261w.f0().A(c1Var.a().b()), naVar);
                    } else {
                        z0(uVar, naVar);
                    }
                    if (c1Var.f()) {
                        for (hi.b bVar : c1Var.a().c()) {
                            this.f48261w.r().u().b("EES logging created event", bVar.d());
                            z0(this.f48261w.f0().A(bVar), naVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f48261w.r().p().c("EES error. appId, eventName", naVar.f48081x, uVar.f48250w);
            }
            this.f48261w.r().u().b("EES was not applied to event", uVar.f48250w);
            z0(uVar, naVar);
            return;
        }
        this.f48261w.r().u().b("EES not loaded for", naVar.f48080w);
        z0(uVar, naVar);
    }

    @Override // pi.g3
    public final void C4(c cVar) {
        rh.p.i(cVar);
        rh.p.i(cVar.f47682y);
        rh.p.e(cVar.f47680w);
        s0(cVar.f47680w, true);
        D5(new e5(this, new c(cVar)));
    }

    @Override // pi.g3
    public final void C5(na naVar) {
        Q5(naVar, false);
        D5(new s5(this, naVar));
    }

    public final void D5(Runnable runnable) {
        rh.p.i(runnable);
        if (this.f48261w.a().B()) {
            runnable.run();
        } else {
            this.f48261w.a().y(runnable);
        }
    }

    @Override // pi.g3
    public final List<ea> H3(String str, String str2, String str3, boolean z10) {
        s0(str, true);
        try {
            List<ga> list = (List) this.f48261w.a().q(new h5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z10 || !ia.V(gaVar.f47881c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().c("Failed to get user properties as. appId", q3.y(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // pi.g3
    public final void J2(final Bundle bundle, na naVar) {
        Q5(naVar, false);
        final String str = naVar.f48080w;
        rh.p.i(str);
        D5(new Runnable() { // from class: pi.c5
            @Override // java.lang.Runnable
            public final void run() {
                u5.this.k5(str, bundle);
            }
        });
    }

    public final void Q5(na naVar, boolean z10) {
        rh.p.i(naVar);
        rh.p.e(naVar.f48080w);
        s0(naVar.f48080w, false);
        this.f48261w.g0().K(naVar.f48081x, naVar.M, naVar.Q);
    }

    @Override // pi.g3
    public final void R4(ea eaVar, na naVar) {
        rh.p.i(eaVar);
        Q5(naVar, false);
        D5(new q5(this, eaVar, naVar));
    }

    @Override // pi.g3
    public final void T2(c cVar, na naVar) {
        rh.p.i(cVar);
        rh.p.i(cVar.f47682y);
        Q5(naVar, false);
        c cVar2 = new c(cVar);
        cVar2.f47680w = naVar.f48080w;
        D5(new d5(this, cVar2, naVar));
    }

    @Override // pi.g3
    public final List<c> W3(String str, String str2, String str3) {
        s0(str, true);
        try {
            return (List) this.f48261w.a().q(new j5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // pi.g3
    public final List<ea> Z0(String str, String str2, boolean z10, na naVar) {
        Q5(naVar, false);
        String str3 = naVar.f48080w;
        rh.p.i(str3);
        try {
            List<ga> list = (List) this.f48261w.a().q(new f5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z10 || !ia.V(gaVar.f47881c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().c("Failed to query user properties. appId", q3.y(naVar.f48080w), e10);
            return Collections.emptyList();
        }
    }

    @Override // pi.g3
    public final void Z1(long j10, String str, String str2, String str3) {
        D5(new t5(this, str2, str3, str, j10));
    }

    @Override // pi.g3
    public final List<ea> f1(na naVar, boolean z10) {
        Q5(naVar, false);
        String str = naVar.f48080w;
        rh.p.i(str);
        try {
            List<ga> list = (List) this.f48261w.a().q(new r5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z10 || !ia.V(gaVar.f47881c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().c("Failed to get user properties. appId", q3.y(naVar.f48080w), e10);
            return null;
        }
    }

    public final u h1(u uVar, na naVar) {
        s sVar;
        if ("_cmp".equals(uVar.f48250w) && (sVar = uVar.f48251x) != null && sVar.p() != 0) {
            String w02 = uVar.f48251x.w0("_cis");
            if ("referrer broadcast".equals(w02) || "referrer API".equals(w02)) {
                this.f48261w.r().t().b("Event has been filtered ", uVar.toString());
                return new u("_cmpx", uVar.f48251x, uVar.f48252y, uVar.f48253z);
            }
        }
        return uVar;
    }

    @Override // pi.g3
    public final void i5(na naVar) {
        rh.p.e(naVar.f48080w);
        s0(naVar.f48080w, false);
        D5(new k5(this, naVar));
    }

    @Override // pi.g3
    public final byte[] j4(u uVar, String str) {
        rh.p.e(str);
        rh.p.i(uVar);
        s0(str, true);
        this.f48261w.r().o().b("Log and bundle. event", this.f48261w.W().d(uVar.f48250w));
        long a10 = this.f48261w.c().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f48261w.a().s(new p5(this, uVar, str)).get();
            if (bArr == null) {
                this.f48261w.r().p().b("Log and bundle returned null. appId", q3.y(str));
                bArr = new byte[0];
            }
            this.f48261w.r().o().d("Log and bundle processed. event, size, time_ms", this.f48261w.W().d(uVar.f48250w), Integer.valueOf(bArr.length), Long.valueOf((this.f48261w.c().a() / 1000000) - a10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().d("Failed to log and bundle. appId, event, error", q3.y(str), this.f48261w.W().d(uVar.f48250w), e10);
            return null;
        }
    }

    public final /* synthetic */ void k5(String str, Bundle bundle) {
        k V = this.f48261w.V();
        V.f();
        V.g();
        byte[] e10 = V.f48179b.f0().B(new p(V.f48285a, "", str, "dep", 0L, 0L, bundle)).e();
        V.f48285a.r().u().c("Saving default event parameters, appId, data size", V.f48285a.C().d(str), Integer.valueOf(e10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, str);
        contentValues.put("parameters", e10);
        try {
            if (V.R().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                V.f48285a.r().p().b("Failed to insert default event parameters (got -1). appId", q3.y(str));
            }
        } catch (SQLiteException e11) {
            V.f48285a.r().p().c("Error storing default event parameters. appId", q3.y(str), e11);
        }
    }

    @Override // pi.g3
    public final String m2(na naVar) {
        Q5(naVar, false);
        return this.f48261w.i0(naVar);
    }

    @Override // pi.g3
    public final void n4(na naVar) {
        rh.p.e(naVar.f48080w);
        rh.p.i(naVar.R);
        m5 m5Var = new m5(this, naVar);
        rh.p.i(m5Var);
        if (this.f48261w.a().B()) {
            m5Var.run();
        } else {
            this.f48261w.a().z(m5Var);
        }
    }

    @Override // pi.g3
    public final void p3(na naVar) {
        Q5(naVar, false);
        D5(new l5(this, naVar));
    }

    @Override // pi.g3
    public final void r1(u uVar, na naVar) {
        rh.p.i(uVar);
        Q5(naVar, false);
        D5(new n5(this, uVar, naVar));
    }

    public final void s0(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f48262x == null) {
                        if (!"com.google.android.gms".equals(this.f48263y) && !vh.s.a(this.f48261w.F(), Binder.getCallingUid()) && !nh.h.a(this.f48261w.F()).c(Binder.getCallingUid())) {
                            z11 = false;
                            this.f48262x = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.f48262x = Boolean.valueOf(z11);
                    }
                    if (this.f48262x.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f48261w.r().p().b("Measurement Service called with invalid calling package. appId", q3.y(str));
                    throw e10;
                }
            }
            if (this.f48263y == null && nh.g.j(this.f48261w.F(), Binder.getCallingUid(), str)) {
                this.f48263y = str;
            }
            if (str.equals(this.f48263y)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f48261w.r().p().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // pi.g3
    public final void v4(u uVar, String str, String str2) {
        rh.p.i(uVar);
        rh.p.e(str);
        s0(str, true);
        D5(new o5(this, uVar, str));
    }

    @Override // pi.g3
    public final List<c> x3(String str, String str2, na naVar) {
        Q5(naVar, false);
        String str3 = naVar.f48080w;
        rh.p.i(str3);
        try {
            return (List) this.f48261w.a().q(new i5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f48261w.r().p().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void z0(u uVar, na naVar) {
        this.f48261w.d();
        this.f48261w.g(uVar, naVar);
    }
}
